import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import org.jooq.meta.jaxb.Logging

plugins {
    id("org.springframework.boot") version "3.2.5"
    id("io.spring.dependency-management") version "1.1.4"
    kotlin("jvm") version "1.9.22"
    kotlin("plugin.spring") version "1.4.32"

    // flywayMigrate Task
    // ПРОБУЕМ РАЗНЫЕ ВЕРСИИ на совместимость
    // https://plugins.gradle.org/plugin/org.flywaydb.flyway/10.8.1
    id("org.flywaydb.flyway") version "9.22.3"

    // gradle-jooq-plugin - Plugin для генерации СМОТРИМ СОВМЕСТИМОСТЬ
    // https://github.com/etiennestuder/gradle-jooq-plugin?tab=readme-ov-file#compatibility
    id("nu.studer.jooq") version "9.0"
    //id("org.jooq.jooq-codegen-gradle") version "3.19.5"
}

group = "org.gulash"
version = "0.0.1-SNAPSHOT"

java {
    sourceCompatibility = JavaVersion.VERSION_17
}

repositories {
    mavenCentral()
    mavenLocal()
}

// Добавляем вторую папку Source(где код лежит) Куда будет генерить jOOQ
// https://docs.gradle.org/current/dsl/org.gradle.api.tasks.SourceSet.html
sourceSets {
    main {
        kotlin {
            srcDirs(srcDirs.map { it.path }, "src/main/jooq", "src/main/jooq2" )
        }
    }
}

dependencies {
    // jOOQ генерация
    jooqGenerator("org.postgresql:postgresql")
    implementation("org.springframework.boot:spring-boot-starter-jooq")
    implementation("org.springframework.retry:spring-retry") // для возможности @Retryable
    implementation("org.springframework.boot:spring-boot-starter-data-jpa") // для возможности Pagination

    // Для использования coroutines
    // Starting from jOOQ 3.17, the jooq-kotlin-coroutines extension module allows for bridging between the reactive streams API and the coroutine APIs.
    // https://www.jooq.org/doc/3.18/manual/sql-building/kotlin-sql-building/kotlin-coroutines/
    implementation("org.jooq:jooq-kotlin-coroutines:${dependencyManagement.importedProperties.get("jooq.version")}")
    //implementation("org.jooq:jooq-kotlin-coroutines:3.19.6")

    // Доп опции чисто для Kotlin
    // jOOQ-kotlin is a maven module used for leveraging some advanced Kotlin features for those users that wish to use jOOQ with Kotlin.
    // https://www.jooq.org/doc/3.18/manual/sql-building/kotlin-sql-building/
    implementation("org.jooq:jooq-kotlin")
    //implementation("org.jooq:jooq-kotlin:3.19.6")

    /*jooqGenerator("org.jooq:jooq-meta:3.18.1")
    jooqGenerator("org.jooq:jooq-codegen:3.18.1")
    jooqGenerator("org.jooq:jooq-postgres-extensions:3.18.1")*/

    // для Validation annotation - isValidationAnnotations = true
    implementation("jakarta.validation:jakarta.validation-api:3.0.2")

    // flyway зависимости
    implementation("org.flywaydb:flyway-core")

    // драйвера
    implementation("org.postgresql:postgresql")
}

// flywayMigrate Task. Настройки аналогичны как в application.properties
flyway {
    url = "jdbc:postgresql://localhost:5432/testbd"
    user = "postgres"
    password = "postgres"
    baselineOnMigrate = true
    locations = arrayOf("filesystem:db/migration/dev/postgresql")
}


val schemaVersion by extra { "1" }

// Task-a настройки плагина. В Gradle Task появляется пункт jooq-generateJooq
jooq {
    // Нужная версия плагина
    //  https://github.com/etiennestuder/gradle-jooq-plugin?tab=readme-ov-file#synchronizing-the-jooq-version-between-the-spring-boot-gradle-plugin-and-the-jooq-gradle-plugin
    version.set(project.dependencyManagement.importedProperties.get("jooq.version")) // if omitted, then the default is used
    edition.set(nu.studer.gradle.jooq.JooqEdition.OSS)  // jOOQ Open-Source is the default (can be omitted)

    configurations {
        create("main") {  // name of the jOOQ configuration
            generateSchemaSourceOnCompilation.set(true)  // default (can be omitted)

            jooqConfiguration.apply {
                logging = Logging.WARN

                jdbc.apply {
                    // Configure the database connection here
                    driver = "org.postgresql.Driver"
                    url = "jdbc:postgresql://localhost:5432/testbd"
                    user ="postgres"
                    password = "postgres"
                    //isAutoCommit = false // для Lazy Fetch Postgress
                }

                generator.apply {
                    // Defaults to org.jooq.codegen.JavaGenerator
                    name = "org.jooq.codegen.KotlinGenerator"

                    database.apply {
                        // The database type. The format here is:
                        // org.jooq.meta.[database].[database]Database
                        name = "org.jooq.meta.postgres.PostgresDatabase"

                        // The database schema (or in the absence of schema support, in your RDBMS this
                        // can be the owner, user, database name) to be generated. This cannot be combined with the <schemata/> element.
                        // If <inputSchema/> is missing then all schemas will be considered.
                        inputSchema = "public"

                        // All elements that are generated from your schema
                        // (A Java regular expression. Use the pipe to separate several expressions)
                        // Watch out for case-sensitivity. Depending on your database, this might be important!
                        // You can create case-insensitive regular expressions using this syntax: (?i:expr).
                        // Whitespace is ignored and comments are possible.
                        includes = ".*"

                        // All elements that are excluded from your schema
                        // (A Java regular expression. Use the pipe to separate several expressions).
                        // Excludes match before includes, i.e. excludes have a higher priority.
                        excludes = """
                                  flyway_schema_history | akeys | avals | defined | manager
                                  """

                        // Schema version provider
                        schemaVersionProvider = "SELECT MAX(\"version\") FROM \"flyway_schema_history\""

                        // Give enough time to jOOQ to trigger the queries needed for generating sources
                        // (default is 5 seconds)
                        logSlowQueriesAfterSeconds = 20
                    }

                    generate.apply {
                        isDeprecated = false
                        isRecords = true
                        isPojos = true // POJO objects
                        isPojosAsKotlinDataClasses = true // Pojo как Data class-ы
                        isDaos = true // DAO objects
                        isUdts = true // UDT like create type ...
                        isGeneratedAnnotation = true
                        isImmutableInterfaces = true // DTO objects  We can use these interfaces for mapping results sets exactly as we do with closed projections
                        isPojosAsKotlinDataClasses = true
                        isKotlinNotNullPojoAttributes = true
                        isKotlinNotNullRecordAttributes = true
                        isKotlinNotNullInterfaceAttributes = true
                        isValidationAnnotations = true
                        isComments = true
                        isCommentsOnColumns = true
                        isCommentsOnTables = true
                        isSpringAnnotations = true
                        isIndexes = false
                        isKeys = false
                        isRoutines = false
                        isImplicitJoinPathsToOne = true
                        isImplicitJoinPathsToMany = true
                    }

                    // Где будет лежать результат генерации + настройки
                    target.apply {
                        packageName = "jooq.generated"
                        directory = "src/main/jooq" // Конечная папка будет SourceRoot т.к. это указали в sourceSet
                    }
                }
            }
        }
    }
}

// Configure jOOQ task such that it only executes when something has changed
// that potentially affects the generated JOOQ sources:
// - the jOOQ configuration has changed (Jdbc, Generator, Strategy, etc.)
// - the classpath used to execute the jOOQ generation tool has changed
//   (jOOQ library, database driver, strategy classes, etc.)
// - the schema files from which the schema is generated and which is
//   used by jOOQ to generate the sources have changed (scripts added, modified, etc.)
tasks.named<nu.studer.gradle.jooq.JooqGenerate>("generateJooq") {
    // ensure database schema has been prepared by Flyway before generating the jOOQ sources
    dependsOn("flywayMigrate")

    // declare Flyway migration scripts as inputs on the jOOQ task
    inputs.files(fileTree("db/migration/dev/postgresql"))
        .withPropertyName("migrations")
        .withPathSensitivity(PathSensitivity.RELATIVE)

    // make jOOQ task participate in incremental builds and build caching
    //  false(default) - Disable cache check to force run Gradle Task - jooq-generateJooq
    //  true - Enable cache check to use incremental builds
    allInputsDeclared.set(false)

    outputs.cacheIf { true }
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs = listOf("-Xjsr305=strict")
        jvmTarget = "17"
    }
}