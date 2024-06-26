/*
 * This file is generated by jOOQ.
 */
package jooq.generated.tables.records


import jakarta.validation.constraints.Size

import java.math.BigDecimal

import javax.annotation.processing.Generated

import jooq.generated.tables.CustomerMaster
import jooq.generated.tables.interfaces.ICustomerMaster

import org.jooq.impl.TableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = [
        "https://www.jooq.org",
        "jOOQ version:3.18.14",
        "schema version:1.2"
    ],
    comments = "This class is generated by jOOQ"
)
@Suppress("UNCHECKED_CAST")
open class CustomerMasterRecord private constructor() : TableRecordImpl<CustomerMasterRecord>(CustomerMaster.CUSTOMER_MASTER), ICustomerMaster {

    @get:Size(max = 50)
    open override var customerName: String?
        set(value): Unit = set(0, value)
        get(): String? = get(0) as String?

    open override var creditLimit: BigDecimal?
        set(value): Unit = set(1, value)
        get(): BigDecimal? = get(1) as BigDecimal?

    @get:Size(max = 50)
    open override var city: String?
        set(value): Unit = set(2, value)
        get(): String? = get(2) as String?

    @get:Size(max = 50)
    open override var country: String?
        set(value): Unit = set(3, value)
        get(): String? = get(3) as String?

    @get:Size(max = 50)
    open override var addressLineFirst: String?
        set(value): Unit = set(4, value)
        get(): String? = get(4) as String?

    @get:Size(max = 15)
    open override var postalCode: String?
        set(value): Unit = set(5, value)
        get(): String? = get(5) as String?

    @get:Size(max = 50)
    open override var state: String?
        set(value): Unit = set(6, value)
        get(): String? = get(6) as String?

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    fun from(from: ICustomerMaster) {
        this.customerName = from.customerName
        this.creditLimit = from.creditLimit
        this.city = from.city
        this.country = from.country
        this.addressLineFirst = from.addressLineFirst
        this.postalCode = from.postalCode
        this.state = from.state
        resetChangedOnNotNull()
    }

    /**
     * Create a detached, initialised CustomerMasterRecord
     */
    constructor(customerName: String? = null, creditLimit: BigDecimal? = null, city: String? = null, country: String? = null, addressLineFirst: String? = null, postalCode: String? = null, state: String? = null): this() {
        this.customerName = customerName
        this.creditLimit = creditLimit
        this.city = city
        this.country = country
        this.addressLineFirst = addressLineFirst
        this.postalCode = postalCode
        this.state = state
        resetChangedOnNotNull()
    }

    /**
     * Create a detached, initialised CustomerMasterRecord
     */
    constructor(value: jooq.generated.tables.pojos.CustomerMaster?): this() {
        if (value != null) {
            this.customerName = value.customerName
            this.creditLimit = value.creditLimit
            this.city = value.city
            this.country = value.country
            this.addressLineFirst = value.addressLineFirst
            this.postalCode = value.postalCode
            this.state = value.state
            resetChangedOnNotNull()
        }
    }
}
