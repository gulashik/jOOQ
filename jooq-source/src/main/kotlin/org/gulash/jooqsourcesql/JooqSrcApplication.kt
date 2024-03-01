package org.gulash.jooqsourcesql


import jooq.generated.tables.pojos.Product
import jooq.generated.tables.references.PRODUCT
import org.jooq.DSLContext
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan


fun main(args: Array<String>) {
    runApplication<JooqSrcApplication>(*args)
}

@SpringBootApplication
@ComponentScan(basePackages = ["jooq.generated.tables.daos", "org.gulash.jooqsourcesql"])
class JooqSrcApplication(
    // Получаем jOOQ контекст
    private val dslContext: DSLContext,
) : CommandLineRunner {
    override fun run(vararg args: String?) {

        val products: List<Product> = dslContext
            .selectFrom(PRODUCT)
            .fetchInto(Product::class.java)

        products.forEach(::println)
    }
}
