package org.gulash.jooqobjectsql


import jooq.generated.tables.daos.OfficeDao
import jooq.generated.tables.pojos.Customer
import jooq.generated.tables.records.OfficeRecord
import jooq.generated.tables.references.CUSTOMER
import jooq.generated.tables.references.OFFICE
import jooq.generated.tables.references.ORDER
import org.jooq.*
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import java.time.LocalDate

@SpringBootApplication
class JooqObjectSqlApplication

fun main(args: Array<String>) {
    val applicationContext = runApplication<JooqObjectSqlApplication>(*args)
    applicationContext.getBeanDefinitionNames().forEach { println(it) }

    // Сами получаем контест
    val ctx = applicationContext.getBean(DSLContext::class.java)


//    val ctxDao = applicationContext.getBean(OfficeDao::class.java)
//
//    val daoRes = ctxDao.fetchByCountry("USA")

    val query = ctx
        .select()
        .from(CUSTOMER)




    // Получили текст запроса
    println( query.toString() )

    // Выполнение запроса
    val sqlResult:MutableList<Customer> = query.fetch().into(Customer::class.java)
    println(sqlResult)

    // Через репозиторий
//    val safeRepositoryCls = applicationContext.getBean(SafeRepositoryCls::class.java)
//    val officeRecordMutableList = safeRepositoryCls.findOfficesInTerritory("NA")
//    println(officeRecordMutableList)
}
