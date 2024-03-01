/*
 * This file is generated by jOOQ.
 */
package jooq.generated.tables


import javax.annotation.processing.Generated

import jooq.generated.Public
import jooq.generated.tables.records.SkeysRecord

import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.Name
import org.jooq.Record
import org.jooq.Schema
import org.jooq.Table
import org.jooq.TableField
import org.jooq.TableOptions
import org.jooq.impl.DSL
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
open class Skeys(
    alias: Name,
    child: Table<out Record>?,
    path: ForeignKey<out Record, SkeysRecord>?,
    aliased: Table<SkeysRecord>?,
    parameters: Array<Field<*>?>?
): TableImpl<SkeysRecord>(
    alias,
    Public.PUBLIC,
    child,
    path,
    aliased,
    parameters,
    DSL.comment(""),
    TableOptions.function()
) {
    companion object {

        /**
         * The reference instance of <code>public.skeys</code>
         */
        val SKEYS: Skeys = Skeys()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<SkeysRecord> = SkeysRecord::class.java

    /**
     * The column <code>public.skeys.skeys</code>.
     */
    val SKEYS_: TableField<SkeysRecord, String?> = createField(DSL.name("skeys"), SQLDataType.CLOB, this, "")

    private constructor(alias: Name, aliased: Table<SkeysRecord>?): this(alias, null, null, aliased, arrayOf(
        DSL.value(null, org.jooq.impl.DefaultDataType.getDefaultDataType("\"public\".\"hstore\""))
    ))
    private constructor(alias: Name, aliased: Table<SkeysRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>public.skeys</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>public.skeys</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>public.skeys</code> table reference
     */
    constructor(): this(DSL.name("skeys"), null)
    override fun getSchema(): Schema? = if (aliased()) null else Public.PUBLIC
    override fun `as`(alias: String): Skeys = Skeys(DSL.name(alias), this, parameters)
    override fun `as`(alias: Name): Skeys = Skeys(alias, this, parameters)
    override fun `as`(alias: Table<*>): Skeys = Skeys(alias.getQualifiedName(), this, parameters)

    /**
     * Rename this table
     */
    override fun rename(name: String): Skeys = Skeys(DSL.name(name), null, parameters)

    /**
     * Rename this table
     */
    override fun rename(name: Name): Skeys = Skeys(name, null, parameters)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): Skeys = Skeys(name.getQualifiedName(), null, parameters)

    /**
     * Call this table-valued function
     */
    fun call(
          __1: Any?
    ): Skeys = Skeys(DSL.name("skeys"), null, arrayOf(
        DSL.value(__1, org.jooq.impl.DefaultDataType.getDefaultDataType("\"public\".\"hstore\""))
    )).let { if (aliased()) it.`as`(unqualifiedName) else it }

    /**
     * Call this table-valued function
     */
    fun call(
          __1: Field<Any?>
    ): Skeys = Skeys(DSL.name("skeys"), null, arrayOf(
        __1
    )).let { if (aliased()) it.`as`(unqualifiedName) else it }
}