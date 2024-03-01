/*
 * This file is generated by jOOQ.
 */
package jooq.generated.tables.interfaces


import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size

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
interface IProduct : Serializable {
    val productId: Long?
    @get:Size(max = 70)
    val productName: String?
    @get:Size(max = 50)
    val productLine: String?
    @get:NotNull
    val code: Long
    @get:Size(max = 10)
    val productScale: String?
    @get:Size(max = 50)
    val productVendor: String?
    val productDescription: String?
    val quantityInStock: Int?
    val buyPrice: BigDecimal?
    val msrp: BigDecimal?
    val specs: Any?
    val productUid: Long?
}
