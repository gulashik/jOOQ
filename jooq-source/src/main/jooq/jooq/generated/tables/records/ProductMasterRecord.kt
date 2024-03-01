/*
 * This file is generated by jOOQ.
 */
package jooq.generated.tables.records


import jakarta.validation.constraints.Size

import javax.annotation.processing.Generated

import jooq.generated.tables.ProductMaster
import jooq.generated.tables.interfaces.IProductMaster

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
open class ProductMasterRecord private constructor() : TableRecordImpl<ProductMasterRecord>(ProductMaster.PRODUCT_MASTER), IProductMaster {

    @get:Size(max = 50)
    open override var productLine: String?
        set(value): Unit = set(0, value)
        get(): String? = get(0) as String?

    @get:Size(max = 70)
    open override var productName: String?
        set(value): Unit = set(1, value)
        get(): String? = get(1) as String?

    @get:Size(max = 10)
    open override var productScale: String?
        set(value): Unit = set(2, value)
        get(): String? = get(2) as String?

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    fun from(from: IProductMaster) {
        this.productLine = from.productLine
        this.productName = from.productName
        this.productScale = from.productScale
        resetChangedOnNotNull()
    }

    /**
     * Create a detached, initialised ProductMasterRecord
     */
    constructor(productLine: String? = null, productName: String? = null, productScale: String? = null): this() {
        this.productLine = productLine
        this.productName = productName
        this.productScale = productScale
        resetChangedOnNotNull()
    }

    /**
     * Create a detached, initialised ProductMasterRecord
     */
    constructor(value: jooq.generated.tables.pojos.ProductMaster?): this() {
        if (value != null) {
            this.productLine = value.productLine
            this.productName = value.productName
            this.productScale = value.productScale
            resetChangedOnNotNull()
        }
    }
}
