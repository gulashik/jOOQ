/*
 * This file is generated by jOOQ.
 */
package jooq.generated.tables.pojos


import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size

import javax.annotation.processing.Generated

import jooq.generated.tables.interfaces.IBookStore


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
data class BookStore(
    @get:NotNull
    @get:Size(max = 400)
    override var name: String
): IBookStore {


    override fun equals(other: Any?): Boolean {
        if (this === other)
            return true
        if (other == null)
            return false
        if (this::class != other::class)
            return false
        val o: BookStore = other as BookStore
        if (this.name != o.name)
            return false
        return true
    }

    override fun hashCode(): Int {
        val prime = 31
        var result = 1
        result = prime * result + this.name.hashCode()
        return result
    }

    override fun toString(): String {
        val sb = StringBuilder("BookStore (")

        sb.append(name)

        sb.append(")")
        return sb.toString()
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    fun from(from: IBookStore) {
        this.name = from.name
    }
}
