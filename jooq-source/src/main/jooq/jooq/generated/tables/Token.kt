/*
 * This file is generated by jOOQ.
 */
package jooq.generated.tables


import java.time.LocalDateTime

import javax.annotation.processing.Generated

import jooq.generated.Public
import jooq.generated.tables.records.TokenRecord

import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.Identity
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
open class Token(
    alias: Name,
    child: Table<out Record>?,
    path: ForeignKey<out Record, TokenRecord>?,
    aliased: Table<TokenRecord>?,
    parameters: Array<Field<*>?>?
): TableImpl<TokenRecord>(
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
         * The reference instance of <code>public.token</code>
         */
        val TOKEN: Token = Token()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<TokenRecord> = TokenRecord::class.java

    /**
     * The column <code>public.token.token_id</code>.
     */
    val TOKEN_ID: TableField<TokenRecord, Long?> = createField(DSL.name("token_id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "")

    /**
     * The column <code>public.token.sale_id</code>.
     */
    val SALE_ID: TableField<TokenRecord, Long?> = createField(DSL.name("sale_id"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>public.token.amount</code>.
     */
    val AMOUNT: TableField<TokenRecord, Double?> = createField(DSL.name("amount"), SQLDataType.DOUBLE.nullable(false), this, "")

    /**
     * The column <code>public.token.updated_on</code>.
     */
    val UPDATED_ON: TableField<TokenRecord, LocalDateTime?> = createField(DSL.name("updated_on"), SQLDataType.LOCALDATETIME(6).nullable(false).defaultValue(DSL.field(DSL.raw("CURRENT_TIMESTAMP"), SQLDataType.LOCALDATETIME)), this, "")

    private constructor(alias: Name, aliased: Table<TokenRecord>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<TokenRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>public.token</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>public.token</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>public.token</code> table reference
     */
    constructor(): this(DSL.name("token"), null)
    override fun getSchema(): Schema? = if (aliased()) null else Public.PUBLIC
    override fun getIdentity(): Identity<TokenRecord, Long?> = super.getIdentity() as Identity<TokenRecord, Long?>
    override fun getPrimaryKey(): UniqueKey<TokenRecord> = Internal.createUniqueKey(Token.TOKEN, DSL.name("token_pk"), arrayOf(Token.TOKEN.TOKEN_ID), true)
    override fun `as`(alias: String): Token = Token(DSL.name(alias), this)
    override fun `as`(alias: Name): Token = Token(alias, this)
    override fun `as`(alias: Table<*>): Token = Token(alias.getQualifiedName(), this)

    /**
     * Rename this table
     */
    override fun rename(name: String): Token = Token(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): Token = Token(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): Token = Token(name.getQualifiedName(), null)
}