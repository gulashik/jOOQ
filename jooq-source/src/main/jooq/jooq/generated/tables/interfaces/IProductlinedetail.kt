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
interface IProductlinedetail : Serializable {
    @get:NotNull
    @get:Size(max = 50)
    val productLine: String
    @get:NotNull
    val code: Long
    @get:NotNull
    @get:Size(max = 20)
    val lineCapacity: String
    val lineType: Int?
}
