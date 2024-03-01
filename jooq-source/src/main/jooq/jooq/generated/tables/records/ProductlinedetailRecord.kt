/*
 * This file is generated by jOOQ.
 */
package jooq.generated.tables.records


import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size

import javax.annotation.processing.Generated

import jooq.generated.tables.Productlinedetail
import jooq.generated.tables.interfaces.IProductlinedetail

import org.jooq.Record2
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
open class ProductlinedetailRecord private constructor() : UpdatableRecordImpl<ProductlinedetailRecord>(Productlinedetail.PRODUCTLINEDETAIL), IProductlinedetail {

    @get:NotNull
    @get:Size(max = 50)
    open override var productLine: String
        set(value): Unit = set(0, value)
        get(): String = get(0) as String

    @get:NotNull
    open override var code: Long
        set(value): Unit = set(1, value)
        get(): Long = get(1) as Long

    @get:NotNull
    @get:Size(max = 20)
    open override var lineCapacity: String
        set(value): Unit = set(2, value)
        get(): String = get(2) as String

    open override var lineType: Int?
        set(value): Unit = set(3, value)
        get(): Int? = get(3) as Int?

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    override fun key(): Record2<String?, Long?> = super.key() as Record2<String?, Long?>

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    fun from(from: IProductlinedetail) {
        this.productLine = from.productLine
        this.code = from.code
        this.lineCapacity = from.lineCapacity
        this.lineType = from.lineType
        resetChangedOnNotNull()
    }

    /**
     * Create a detached, initialised ProductlinedetailRecord
     */
    constructor(productLine: String, code: Long, lineCapacity: String, lineType: Int? = null): this() {
        this.productLine = productLine
        this.code = code
        this.lineCapacity = lineCapacity
        this.lineType = lineType
        resetChangedOnNotNull()
    }

    /**
     * Create a detached, initialised ProductlinedetailRecord
     */
    constructor(value: jooq.generated.tables.pojos.Productlinedetail?): this() {
        if (value != null) {
            this.productLine = value.productLine
            this.code = value.code
            this.lineCapacity = value.lineCapacity
            this.lineType = value.lineType
            resetChangedOnNotNull()
        }
    }
}
