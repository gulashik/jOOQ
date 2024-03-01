/*
 * This file is generated by jOOQ.
 */
package jooq.generated.tables


import javax.annotation.processing.Generated

import jooq.generated.Public
import jooq.generated.tables.records.BookRecord

import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.Name
import org.jooq.Record
import org.jooq.Schema
import org.jooq.Table
import org.jooq.TableField
import org.jooq.TableOptions
import org.jooq.UniqueKey
import org.jooq.impl.DSL
import org.jooq.impl.Internal
import org.jooq.impl.SQLDataType
import org.jooq.impl.TableImpl


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
open class Book(
    alias: Name,
    child: Table<out Record>?,
    path: ForeignKey<out Record, BookRecord>?,
    aliased: Table<BookRecord>?,
    parameters: Array<Field<*>?>?
): TableImpl<BookRecord>(
    alias,
    Public.PUBLIC,
    child,
    path,
    aliased,
    parameters,
    DSL.comment(""),
    TableOptions.table()
) {
    companion object {

        /**
         * The reference instance of <code>public.book</code>
         */
        val BOOK: Book = Book()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<BookRecord> = BookRecord::class.java

    /**
     * The column <code>public.book.id</code>.
     */
    val ID: TableField<BookRecord, Int?> = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false), this, "")

    /**
     * The column <code>public.book.author_id</code>.
     */
    val AUTHOR_ID: TableField<BookRecord, Int?> = createField(DSL.name("author_id"), SQLDataType.INTEGER.nullable(false), this, "")

    /**
     * The column <code>public.book.title</code>.
     */
    val TITLE: TableField<BookRecord, String?> = createField(DSL.name("title"), SQLDataType.VARCHAR(400).nullable(false), this, "")

    /**
     * The column <code>public.book.published_in</code>.
     */
    val PUBLISHED_IN: TableField<BookRecord, Int?> = createField(DSL.name("published_in"), SQLDataType.INTEGER.nullable(false), this, "")

    /**
     * The column <code>public.book.language_id</code>.
     */
    val LANGUAGE_ID: TableField<BookRecord, Int?> = createField(DSL.name("language_id"), SQLDataType.INTEGER.nullable(false), this, "")

    private constructor(alias: Name, aliased: Table<BookRecord>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<BookRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>public.book</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>public.book</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>public.book</code> table reference
     */
    constructor(): this(DSL.name("book"), null)
    override fun getSchema(): Schema? = if (aliased()) null else Public.PUBLIC
    override fun getPrimaryKey(): UniqueKey<BookRecord> = Internal.createUniqueKey(Book.BOOK, DSL.name("book_pkey"), arrayOf(Book.BOOK.ID), true)
    override fun `as`(alias: String): Book = Book(DSL.name(alias), this)
    override fun `as`(alias: Name): Book = Book(alias, this)
    override fun `as`(alias: Table<*>): Book = Book(alias.getQualifiedName(), this)

    /**
     * Rename this table
     */
    override fun rename(name: String): Book = Book(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): Book = Book(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): Book = Book(name.getQualifiedName(), null)
}
