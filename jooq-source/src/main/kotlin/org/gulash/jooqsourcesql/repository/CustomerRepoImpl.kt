package org.gulash.jooqsourcesql.repository

import jooq.generated.tables.pojos.Customer
import jooq.generated.tables.references.CUSTOMER
import org.gulash.jooqsourcesql.repository.interfaces.CustomerRepoInterf
import org.jooq.DSLContext
import org.springframework.stereotype.Repository
import org.springframework.transaction.annotation.Transactional

@Repository
@Transactional
open class CustomerRepoImpl(
    private val dslContext: DSLContext,

    ) : CustomerRepoInterf<Customer,Long> {
    override fun findCustomerByCustomerNumber(customerNumber: Long): List<Customer> {
        return dslContext
            .selectFrom(CUSTOMER)
            .where(CUSTOMER.CUSTOMER_NUMBER.eq(customerNumber))
            .fetchInto(Customer::class.java)
    }

    override fun findAll(): List<Customer> {
        return dslContext.selectFrom(CUSTOMER).fetchInto(Customer::class.java)
    }
}