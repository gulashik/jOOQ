/*
 * This file is generated by jOOQ.
 */
package jooq.generated.tables.daos


import javax.annotation.processing.Generated

import jooq.generated.tables.Book
import jooq.generated.tables.records.BookRecord

import kotlin.collections.List

import org.jooq.Configuration
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
open class BookDao(configuration: Configuration?) : DAOImpl<BookRecord, jooq.generated.tables.pojos.Book, Int>(Book.BOOK, jooq.generated.tables.pojos.Book::class.java, configuration) {

    /**
     * Create a new BookDao without any configuration
     */
    constructor(): this(null)

    override fun getId(o: jooq.generated.tables.pojos.Book): Int = o.id

    /**
     * Fetch records that have <code>id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    fun fetchRangeOfId(lowerInclusive: Int, upperInclusive: Int): List<jooq.generated.tables.pojos.Book> = fetchRange(Book.BOOK.ID, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    fun fetchById(vararg values: Int): List<jooq.generated.tables.pojos.Book> = fetch(Book.BOOK.ID, *values.toTypedArray())

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    fun fetchOneById(value: Int): jooq.generated.tables.pojos.Book? = fetchOne(Book.BOOK.ID, value)

    /**
     * Fetch records that have <code>author_id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    fun fetchRangeOfAuthorId(lowerInclusive: Int, upperInclusive: Int): List<jooq.generated.tables.pojos.Book> = fetchRange(Book.BOOK.AUTHOR_ID, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>author_id IN (values)</code>
     */
    fun fetchByAuthorId(vararg values: Int): List<jooq.generated.tables.pojos.Book> = fetch(Book.BOOK.AUTHOR_ID, *values.toTypedArray())

    /**
     * Fetch records that have <code>title BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    fun fetchRangeOfTitle(lowerInclusive: String, upperInclusive: String): List<jooq.generated.tables.pojos.Book> = fetchRange(Book.BOOK.TITLE, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>title IN (values)</code>
     */
    fun fetchByTitle(vararg values: String): List<jooq.generated.tables.pojos.Book> = fetch(Book.BOOK.TITLE, *values)

    /**
     * Fetch records that have <code>published_in BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    fun fetchRangeOfPublishedIn(lowerInclusive: Int, upperInclusive: Int): List<jooq.generated.tables.pojos.Book> = fetchRange(Book.BOOK.PUBLISHED_IN, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>published_in IN (values)</code>
     */
    fun fetchByPublishedIn(vararg values: Int): List<jooq.generated.tables.pojos.Book> = fetch(Book.BOOK.PUBLISHED_IN, *values.toTypedArray())

    /**
     * Fetch records that have <code>language_id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    fun fetchRangeOfLanguageId(lowerInclusive: Int, upperInclusive: Int): List<jooq.generated.tables.pojos.Book> = fetchRange(Book.BOOK.LANGUAGE_ID, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>language_id IN (values)</code>
     */
    fun fetchByLanguageId(vararg values: Int): List<jooq.generated.tables.pojos.Book> = fetch(Book.BOOK.LANGUAGE_ID, *values.toTypedArray())
}