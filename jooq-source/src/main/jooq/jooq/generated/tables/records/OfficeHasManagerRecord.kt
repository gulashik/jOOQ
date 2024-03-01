/*
 * This file is generated by jOOQ.
 */
package jooq.generated.tables.records


import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size

import javax.annotation.processing.Generated

import jooq.generated.tables.OfficeHasManager
import jooq.generated.tables.interfaces.IOfficeHasManager

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
open class OfficeHasManagerRecord private constructor() : TableRecordImpl<OfficeHasManagerRecord>(OfficeHasManager.OFFICE_HAS_MANAGER), IOfficeHasManager {

    @get:NotNull
    @get:Size(max = 10)
    open override var officesOfficeCode: String
        set(value): Unit = set(0, value)
        get(): String = get(0) as String

    @get:NotNull
    open override var managersManagerId: Long
        set(value): Unit = set(1, value)
        get(): Long = get(1) as Long

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    fun from(from: IOfficeHasManager) {
        this.officesOfficeCode = from.officesOfficeCode
        this.managersManagerId = from.managersManagerId
        resetChangedOnNotNull()
    }

    /**
     * Create a detached, initialised OfficeHasManagerRecord
     */
    constructor(officesOfficeCode: String, managersManagerId: Long): this() {
        this.officesOfficeCode = officesOfficeCode
        this.managersManagerId = managersManagerId
        resetChangedOnNotNull()
    }

    /**
     * Create a detached, initialised OfficeHasManagerRecord
     */
    constructor(value: jooq.generated.tables.pojos.OfficeHasManager?): this() {
        if (value != null) {
            this.officesOfficeCode = value.officesOfficeCode
            this.managersManagerId = value.managersManagerId
            resetChangedOnNotNull()
        }
    }
}