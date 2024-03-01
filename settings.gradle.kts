rootProject.name = "jooq-prg"

includeBuild("non-safety-sql")

// Порядок с учётом зависимостей
includeBuild("jooq-source")
includeBuild("jooq-object-sql")
