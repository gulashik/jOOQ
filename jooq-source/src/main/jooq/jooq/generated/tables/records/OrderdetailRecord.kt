/*
 * This file is generated by jOOQ.
 */
package jooq.generated.tables.records


import jakarta.validation.constraints.NotNull

import java.math.BigDecimal

import javax.annotation.processing.Generated

import jooq.generated.tables.Orderdetail
import jooq.generated.tables.interfaces.IOrderdetail

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
open class OrderdetailRecord private constructor() : UpdatableRecordImpl<OrderdetailRecord>(Orderdetail.ORDERDETAIL), IOrderdetail {

    open override var orderdetailId: Int?
        set(value): Unit = set(0, value)
        get(): Int? = get(0) as Int?

    @get:NotNull
    open override var orderId: Long
        set(value): Unit = set(1, value)
        get(): Long = get(1) as Long

    @get:NotNull
    open override var productId: Long
        set(value): Unit = set(2, value)
        get(): Long = get(2) as Long

    @get:NotNull
    open override var quantityOrdered: Int
        set(value): Unit = set(3, value)
        get(): Int = get(3) as Int

    @get:NotNull
    open override var priceEach: BigDecimal
        set(value): Unit = set(4, value)
        get(): BigDecimal = get(4) as BigDecimal

    @get:NotNull
    open override var orderLineNumber: Int
        set(value): Unit = set(5, value)
        get(): Int = get(5) as Int

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    override fun key(): Record1<Int?> = super.key() as Record1<Int?>

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    fun from(from: IOrderdetail) {
        this.orderdetailId = from.orderdetailId
        this.orderId = from.orderId
        this.productId = from.productId
        this.quantityOrdered = from.quantityOrdered
        this.priceEach = from.priceEach
        this.orderLineNumber = from.orderLineNumber
        resetChangedOnNotNull()
    }

    /**
     * Create a detached, initialised OrderdetailRecord
     */
    constructor(orderdetailId: Int? = null, orderId: Long, productId: Long, quantityOrdered: Int, priceEach: BigDecimal, orderLineNumber: Int): this() {
        this.orderdetailId = orderdetailId
        this.orderId = orderId
        this.productId = productId
        this.quantityOrdered = quantityOrdered
        this.priceEach = priceEach
        this.orderLineNumber = orderLineNumber
        resetChangedOnNotNull()
    }

    /**
     * Create a detached, initialised OrderdetailRecord
     */
    constructor(value: jooq.generated.tables.pojos.Orderdetail?): this() {
        if (value != null) {
            this.orderdetailId = value.orderdetailId
            this.orderId = value.orderId
            this.productId = value.productId
            this.quantityOrdered = value.quantityOrdered
            this.priceEach = value.priceEach
            this.orderLineNumber = value.orderLineNumber
            resetChangedOnNotNull()
        }
    }
}
