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
interface ILanguage : Serializable {
    @get:NotNull
    val id: Int
    @get:NotNull
    @get:Size(max = 2)
    val cd: String
    @get:Size(max = 50)
    val description: String?
}
