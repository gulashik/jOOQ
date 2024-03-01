package org.gulash.jooqsourcesql.repository.interfaces

import jooq.generated.tables.pojos.Customer
import jooq.generated.tables.records.CustomerRecord


interface CustomerRepoInterf<RowType,CustNumb>: CommonRepoInterf<Customer> {

    fun findCustomerByCustomerNumber(customerNumber: CustNumb): List<RowType>
}