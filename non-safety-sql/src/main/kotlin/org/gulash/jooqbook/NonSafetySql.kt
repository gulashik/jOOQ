package org.gulash.jooqbook

import org.gulash.jooqbook.entity.Office
import org.gulash.jooqbook.repo.TypeUnsaveRepository
import org.jooq.DSLContext
import org.jooq.ResultQuery
import org.jooq.impl.DSL.field
import org.jooq.impl.DSL.table
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication


@SpringBootApplication
class NonSafetySqlApplication



fun main(args: Array<String>) {
    val applicationContext = runApplication<NonSafetySqlApplication>(*args)


    // Type unsave ==========================================
    val typeUnsaveRepository = applicationContext.getBean(TypeUnsaveRepository::class.java)
    val officeMutableList = typeUnsaveRepository.findOfficesInTerritory("NA")
    println(officeMutableList)

    val ctx = applicationContext.getBean(DSLContext::class.java)

    // Готовый запрос
    val query: ResultQuery<*> = ctx.select()
        .from(table("office"))
        .where(field("territory").eq("NA"))

    // Получили текст запроса
    println( query.toString() )

    // Выполнение запроса List<НужногоТипа>
    val officeMutableList1:List<Office> = query.fetch().into(Office::class.java)
    println(officeMutableList1)

}
