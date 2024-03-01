/*
 * This file is generated by jOOQ.
 */
package jooq.generated.tables.records


import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size

import javax.annotation.processing.Generated

import jooq.generated.tables.Customerdetail
import jooq.generated.tables.interfaces.ICustomerdetail

import org.jooq.Record1
import org.jooq.impl.UpdatableRecordImpl


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
open class CustomerdetailRecord private constructor() : UpdatableRecordImpl<CustomerdetailRecord>(Customerdetail.CUSTOMERDETAIL), ICustomerdetail {

    @get:NotNull
    open override var customerNumber: Long
        set(value): Unit = set(0, value)
        get(): Long = get(0) as Long

    @get:NotNull
    @get:Size(max = 50)
    open override var addressLineFirst: String
        set(value): Unit = set(1, value)
        get(): String = get(1) as String

    @get:Size(max = 50)
    open override var addressLineSecond: String?
        set(value): Unit = set(2, value)
        get(): String? = get(2) as String?

    @get:Size(max = 50)
    open override var city: String?
        set(value): Unit = set(3, value)
        get(): String? = get(3) as String?

    @get:Size(max = 50)
    open override var state: String?
        set(value): Unit = set(4, value)
        get(): String? = get(4) as String?

    @get:Size(max = 15)
    open override var postalCode: String?
        set(value): Unit = set(5, value)
        get(): String? = get(5) as String?

    @get:Size(max = 50)
    open override var country: String?
        set(value): Unit = set(6, value)
        get(): String? = get(6) as String?

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    override fun key(): Record1<Long?> = super.key() as Record1<Long?>

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    fun from(from: ICustomerdetail) {
        this.customerNumber = from.customerNumber
        this.addressLineFirst = from.addressLineFirst
        this.addressLineSecond = from.addressLineSecond
        this.city = from.city
        this.state = from.state
        this.postalCode = from.postalCode
        this.country = from.country
        resetChangedOnNotNull()
    }

    /**
     * Create a detached, initialised CustomerdetailRecord
     */
    constructor(customerNumber: Long, addressLineFirst: String, addressLineSecond: String? = null, city: String? = null, state: String? = null, postalCode: String? = null, country: String? = null): this() {
        this.customerNumber = customerNumber
        this.addressLineFirst = addressLineFirst
        this.addressLineSecond = addressLineSecond
        this.city = city
        this.state = state
        this.postalCode = postalCode
        this.country = country
        resetChangedOnNotNull()
    }

    /**
     * Create a detached, initialised CustomerdetailRecord
     */
    constructor(value: jooq.generated.tables.pojos.Customerdetail?): this() {
        if (value != null) {
            this.customerNumber = value.customerNumber
            this.addressLineFirst = value.addressLineFirst
            this.addressLineSecond = value.addressLineSecond
            this.city = value.city
            this.state = value.state
            this.postalCode = value.postalCode
            this.country = value.country
            resetChangedOnNotNull()
        }
    }
}