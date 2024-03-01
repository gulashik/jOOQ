/*
 * This file is generated by jOOQ.
 */
package jooq.generated.tables.interfaces


import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size

import java.io.Serializable
import java.math.BigDecimal
import java.time.LocalDateTime

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
interface IPayment : Serializable {
    @get:NotNull
    val customerNumber: Long
    @get:NotNull
    @get:Size(max = 50)
    val checkNumber: String
    val paymentDate: LocalDateTime?
    @get:NotNull
    val invoiceAmount: BigDecimal
    val cachingDate: LocalDateTime?
    val version: Int?
    val modified: LocalDateTime?
}
