import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    // не увернен нужно ли
    id("application")
    id("org.springframework.boot") version "3.2.3"
    id("io.spring.dependency-management") version "1.1.4"
    kotlin("jvm") version "1.9.22"
    kotlin("plugin.spring") version "1.9.22"

    // flywayMigrate Task
    // ПРОБУЕМ РАЗНЫЕ ВЕРСИИ на совместимость
    // https://plugins.gradle.org/plugin/org.flywaydb.flyway/10.8.1
    id("org.flywaydb.flyway") version "9.22.3"

    // Plugin для генерации СМОТРИМ СОВМЕСТИМОСТЬ
    // https://github.com/etiennestuder/gradle-jooq-plugin?tab=readme-ov-file#compatibility
    id("nu.studer.jooq") version "9.0"
}

group = "org.gulash"
version = "0.0.1-SNAPSHOT"

java {
    sourceCompatibility = JavaVersion.VERSION_17
}

// не уверен нужно ли
application {
    mainClass.value("org.gulash.jooqbook.NonSafetySqlApplication")
}

repositories {
    mavenCentral()
}

dependencies {
    // jOOQ зависимости
    implementation("org.springframework.boot:spring-boot-starter-jooq")

    // flyway зависимости
    implementation("org.flywaydb:flyway-core")

    implementation("org.jetbrains.kotlin:kotlin-reflect")

    // драйвера
    runtimeOnly("org.postgresql:postgresql")

    testImplementation("org.springframework.boot:spring-boot-starter-test")
}

// Вот тут не уверен, что надо
jooq {
    //version.set("3.15.5")  // if omitted, then the default is used
    edition.set(nu.studer.gradle.jooq.JooqEdition.OSS)  // jOOQ Open-Source is the default (can be omitted)
}

// flywayMigrate Task. Настройки аналогичны как в application.properties
flyway {
    url = "jdbc:postgresql://localhost:5432/testbd"
    user = "postgres"
    password = "postgres"
    baselineOnMigrate = true
    locations = arrayOf("classpath:/db/migration/dev/postgresql")
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs += "-Xjsr305=strict"
        jvmTarget = "17"
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}
