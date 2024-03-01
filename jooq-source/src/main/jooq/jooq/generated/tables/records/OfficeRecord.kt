/*
 * This file is generated by jOOQ.
 */
package jooq.generated.tables.records


import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size

import javax.annotation.processing.Generated

import jooq.generated.tables.Office
import jooq.generated.tables.interfaces.IOffice

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
open class OfficeRecord private constructor() : UpdatableRecordImpl<OfficeRecord>(Office.OFFICE), IOffice {

    @get:NotNull
    @get:Size(max = 10)
    open override var officeCode: String
        set(value): Unit = set(0, value)
        get(): String = get(0) as String

    @get:Size(max = 50)
    open override var city: String?
        set(value): Unit = set(1, value)
        get(): String? = get(1) as String?

    @get:NotNull
    @get:Size(max = 50)
    open override var phone: String
        set(value): Unit = set(2, value)
        get(): String = get(2) as String

    @get:NotNull
    @get:Size(max = 50)
    open override var addressLineFirst: String
        set(value): Unit = set(3, value)
        get(): String = get(3) as String

    @get:Size(max = 50)
    open override var addressLineSecond: String?
        set(value): Unit = set(4, value)
        get(): String? = get(4) as String?

    @get:Size(max = 50)
    open override var state: String?
        set(value): Unit = set(5, value)
        get(): String? = get(5) as String?

    @get:Size(max = 50)
    open override var country: String?
        set(value): Unit = set(6, value)
        get(): String? = get(6) as String?

    @get:NotNull
    @get:Size(max = 15)
    open override var postalCode: String
        set(value): Unit = set(7, value)
        get(): String = get(7) as String

    @get:NotNull
    @get:Size(max = 10)
    open override var territory: String
        set(value): Unit = set(8, value)
        get(): String = get(8) as String

    open override var location: Any?
        set(value): Unit = set(9, value)
        get(): Any? = get(9) as Any?

    @get:NotNull
    open override var internalBudget: Int
        set(value): Unit = set(10, value)
        get(): Int = get(10) as Int

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    override fun key(): Record1<String?> = super.key() as Record1<String?>

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    fun from(from: IOffice) {
        this.officeCode = from.officeCode
        this.city = from.city
        this.phone = from.phone
        this.addressLineFirst = from.addressLineFirst
        this.addressLineSecond = from.addressLineSecond
        this.state = from.state
        this.country = from.country
        this.postalCode = from.postalCode
        this.territory = from.territory
        this.location = from.location
        this.internalBudget = from.internalBudget
        resetChangedOnNotNull()
    }

    /**
     * Create a detached, initialised OfficeRecord
     */
    constructor(officeCode: String, city: String? = null, phone: String, addressLineFirst: String, addressLineSecond: String? = null, state: String? = null, country: String? = null, postalCode: String, territory: String, location: Any? = null, internalBudget: Int): this() {
        this.officeCode = officeCode
        this.city = city
        this.phone = phone
        this.addressLineFirst = addressLineFirst
        this.addressLineSecond = addressLineSecond
        this.state = state
        this.country = country
        this.postalCode = postalCode
        this.territory = territory
        this.location = location
        this.internalBudget = internalBudget
        resetChangedOnNotNull()
    }

    /**
     * Create a detached, initialised OfficeRecord
     */
    constructor(value: jooq.generated.tables.pojos.Office?): this() {
        if (value != null) {
            this.officeCode = value.officeCode
            this.city = value.city
            this.phone = value.phone
            this.addressLineFirst = value.addressLineFirst
            this.addressLineSecond = value.addressLineSecond
            this.state = value.state
            this.country = value.country
            this.postalCode = value.postalCode
            this.territory = value.territory
            this.location = value.location
            this.internalBudget = value.internalBudget
            resetChangedOnNotNull()
        }
    }
}