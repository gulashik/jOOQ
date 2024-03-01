/*
 * This file is generated by jOOQ.
 */
package jooq.generated.tables.records


import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size

import javax.annotation.processing.Generated

import jooq.generated.tables.BookStore
import jooq.generated.tables.interfaces.IBookStore

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
open class BookStoreRecord private constructor() : TableRecordImpl<BookStoreRecord>(BookStore.BOOK_STORE), IBookStore {

    @get:NotNull
    @get:Size(max = 400)
    open override var name: String
        set(value): Unit = set(0, value)
        get(): String = get(0) as String

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    fun from(from: IBookStore) {
        this.name = from.name
        resetChangedOnNotNull()
    }

    /**
     * Create a detached, initialised BookStoreRecord
     */
    constructor(name: String): this() {
        this.name = name
        resetChangedOnNotNull()
    }

    /**
     * Create a detached, initialised BookStoreRecord
     */
    constructor(value: jooq.generated.tables.pojos.BookStore?): this() {
        if (value != null) {
            this.name = value.name
            resetChangedOnNotNull()
        }
    }
}
