/*
 * This file is generated by jOOQ.
 */
package jooq.generated.tables.interfaces


import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size

import java.io.Serializable

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
interface IOffice : Serializable {
    @get:NotNull
    @get:Size(max = 10)
    val officeCode: String
    @get:Size(max = 50)
    val city: String?
    @get:NotNull
    @get:Size(max = 50)
    val phone: String
    @get:NotNull
    @get:Size(max = 50)
    val addressLineFirst: String
    @get:Size(max = 50)
    val addressLineSecond: String?
    @get:Size(max = 50)
    val state: String?
    @get:Size(max = 50)
    val country: String?
    @get:NotNull
    @get:Size(max = 15)
    val postalCode: String
    @get:NotNull
    @get:Size(max = 10)
    val territory: String
    val location: Any?
    @get:NotNull
    val internalBudget: Int
}