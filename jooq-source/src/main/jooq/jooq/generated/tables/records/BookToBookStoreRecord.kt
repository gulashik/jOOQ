/*
 * This file is generated by jOOQ.
 */
package jooq.generated.tables.records


import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size

import javax.annotation.processing.Generated

import jooq.generated.tables.BookToBookStore
import jooq.generated.tables.interfaces.IBookToBookStore

import org.jooq.Record2
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
open class BookToBookStoreRecord private constructor() : UpdatableRecordImpl<BookToBookStoreRecord>(BookToBookStore.BOOK_TO_BOOK_STORE), IBookToBookStore {

    @get:NotNull
    @get:Size(max = 400)
    open override var name: String
        set(value): Unit = set(0, value)
        get(): String = get(0) as String

    @get:NotNull
    open override var bookId: Int
        set(value): Unit = set(1, value)
        get(): Int = get(1) as Int

    open override var stock: Int?
        set(value): Unit = set(2, value)
        get(): Int? = get(2) as Int?

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    override fun key(): Record2<String?, Int?> = super.key() as Record2<String?, Int?>

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    fun from(from: IBookToBookStore) {
        this.name = from.name
        this.bookId = from.bookId
        this.stock = from.stock
        resetChangedOnNotNull()
    }

    /**
     * Create a detached, initialised BookToBookStoreRecord
     */
    constructor(name: String, bookId: Int, stock: Int? = null): this() {
        this.name = name
        this.bookId = bookId
        this.stock = stock
        resetChangedOnNotNull()
    }

    /**
     * Create a detached, initialised BookToBookStoreRecord
     */
    constructor(value: jooq.generated.tables.pojos.BookToBookStore?): this() {
        if (value != null) {
            this.name = value.name
            this.bookId = value.bookId
            this.stock = value.stock
            resetChangedOnNotNull()
        }
    }
}