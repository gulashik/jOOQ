package org.gulash.jooqsourcesql.service

import jooq.generated.tables.pojos.Customer
import org.gulash.jooqsourcesql.repository.CustomerRepoImpl
import org.springframework.stereotype.Service

@Service
class CustomerService(
    val customerRepoImpl: CustomerRepoImpl
) {
    fun getAllCustomers(): List<Customer> {
        return customerRepoImpl.findAll()
    }
}