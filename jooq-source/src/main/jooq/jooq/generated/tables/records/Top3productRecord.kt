/*
 * This file is generated by jOOQ.
 */
package jooq.generated.tables.records


import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size

import javax.annotation.processing.Generated

import jooq.generated.tables.Top3product
import jooq.generated.tables.interfaces.ITop3product

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
open class Top3productRecord private constructor() : UpdatableRecordImpl<Top3productRecord>(Top3product.TOP3PRODUCT), ITop3product {

    @get:NotNull
    open override var productId: Long
        set(value): Unit = set(0, value)
        get(): Long = get(0) as Long

    @get:Size(max = 70)
    open override var productName: String?
        set(value): Unit = set(1, value)
        get(): String? = get(1) as String?

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    override fun key(): Record1<Long?> = super.key() as Record1<Long?>

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    fun from(from: ITop3product) {
        this.productId = from.productId
        this.productName = from.productName
        resetChangedOnNotNull()
    }

    /**
     * Create a detached, initialised Top3productRecord
     */
    constructor(productId: Long, productName: String? = null): this() {
        this.productId = productId
        this.productName = productName
        resetChangedOnNotNull()
    }

    /**
     * Create a detached, initialised Top3productRecord
     */
    constructor(value: jooq.generated.tables.pojos.Top3product?): this() {
        if (value != null) {
            this.productId = value.productId
            this.productName = value.productName
            resetChangedOnNotNull()
        }
    }
}
