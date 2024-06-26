/*
 * This file is generated by jOOQ.
 */
package jooq.generated.tables.daos


import javax.annotation.processing.Generated

import jooq.generated.tables.BookToBookStore
import jooq.generated.tables.records.BookToBookStoreRecord

import kotlin.collections.List

import org.jooq.Configuration
import org.jooq.Record2
import org.jooq.impl.DAOImpl
import org.springframework.stereotype.Repository


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
@Repository
open class BookToBookStoreDao(configuration: Configuration?) : DAOImpl<BookToBookStoreRecord, jooq.generated.tables.pojos.BookToBookStore, Record2<String?, Int?>>(BookToBookStore.BOOK_TO_BOOK_STORE, jooq.generated.tables.pojos.BookToBookStore::class.java, configuration) {

    /**
     * Create a new BookToBookStoreDao without any configuration
     */
    constructor(): this(null)

    override fun getId(o: jooq.generated.tables.pojos.BookToBookStore): Record2<String?, Int?> = compositeKeyRecord(o.name, o.bookId)

    /**
     * Fetch records that have <code>name BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    fun fetchRangeOfName(lowerInclusive: String, upperInclusive: String): List<jooq.generated.tables.pojos.BookToBookStore> = fetchRange(BookToBookStore.BOOK_TO_BOOK_STORE.NAME, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>name IN (values)</code>
     */
    fun fetchByName(vararg values: String): List<jooq.generated.tables.pojos.BookToBookStore> = fetch(BookToBookStore.BOOK_TO_BOOK_STORE.NAME, *values)

    /**
     * Fetch records that have <code>book_id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    fun fetchRangeOfBookId(lowerInclusive: Int, upperInclusive: Int): List<jooq.generated.tables.pojos.BookToBookStore> = fetchRange(BookToBookStore.BOOK_TO_BOOK_STORE.BOOK_ID, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>book_id IN (values)</code>
     */
    fun fetchByBookId(vararg values: Int): List<jooq.generated.tables.pojos.BookToBookStore> = fetch(BookToBookStore.BOOK_TO_BOOK_STORE.BOOK_ID, *values.toTypedArray())

    /**
     * Fetch records that have <code>stock BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    fun fetchRangeOfStock(lowerInclusive: Int?, upperInclusive: Int?): List<jooq.generated.tables.pojos.BookToBookStore> = fetchRange(BookToBookStore.BOOK_TO_BOOK_STORE.STOCK, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>stock IN (values)</code>
     */
    fun fetchByStock(vararg values: Int): List<jooq.generated.tables.pojos.BookToBookStore> = fetch(BookToBookStore.BOOK_TO_BOOK_STORE.STOCK, *values.toTypedArray())
}
