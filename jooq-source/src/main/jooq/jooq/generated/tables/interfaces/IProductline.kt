/*
 * This file is generated by jOOQ.
 */
package jooq.generated.tables.interfaces


import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size

import java.io.Serializable
import java.time.LocalDate

import javax.annotation.processing.Generated

import org.jooq.XML


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
interface IProductline : Serializable {
    @get:NotNull
    @get:Size(max = 50)
    val productLine: String
    @get:NotNull
    val code: Long
    @get:Size(max = 4000)
    val textDescription: String?
    val htmlDescription: XML?
    val image: ByteArray?
    val createdOn: LocalDate?
}
