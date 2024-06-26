/*
 * This file is generated by jOOQ.
 */
package jooq.generated.tables.interfaces


import jakarta.validation.constraints.NotNull

import java.io.Serializable
import java.math.BigDecimal

import javax.annotation.processing.Generated


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
interface IOrderdetail : Serializable {
    val orderdetailId: Int?
    @get:NotNull
    val orderId: Long
    @get:NotNull
    val productId: Long
    @get:NotNull
    val quantityOrdered: Int
    @get:NotNull
    val priceEach: BigDecimal
    @get:NotNull
    val orderLineNumber: Int
}
