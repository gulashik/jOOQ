/*
 * This file is generated by jOOQ.
 */
package jooq.generated.tables


import javax.annotation.processing.Generated

import jooq.generated.Public
import jooq.generated.tables.records.GetOfficesMultipleRecord

import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.Name
import org.jooq.Record
import org.jooq.Result
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
open class GetOfficesMultiple(
    alias: Name,
    child: Table<out Record>?,
    path: ForeignKey<out Record, GetOfficesMultipleRecord>?,
    aliased: Table<GetOfficesMultipleRecord>?,
    parameters: Array<Field<*>?>?
): TableImpl<GetOfficesMultipleRecord>(
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
         * The reference instance of <code>public.get_offices_multiple</code>
         */
        val GET_OFFICES_MULTIPLE: GetOfficesMultiple = GetOfficesMultiple()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<GetOfficesMultipleRecord> = GetOfficesMultipleRecord::class.java

    /**
     * The column <code>public.get_offices_multiple.get_offices_multiple</code>.
     */
    val GET_OFFICES_MULTIPLE_: TableField<GetOfficesMultipleRecord, Result<Record>?> = createField(DSL.name("get_offices_multiple"), SQLDataType.RESULT, this, "")

    private constructor(alias: Name, aliased: Table<GetOfficesMultipleRecord>?): this(alias, null, null, aliased, arrayOf(
    ))
    private constructor(alias: Name, aliased: Table<GetOfficesMultipleRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>public.get_offices_multiple</code> table
     * reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>public.get_offices_multiple</code> table
     * reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>public.get_offices_multiple</code> table reference
     */
    constructor(): this(DSL.name("get_offices_multiple"), null)
    override fun getSchema(): Schema? = if (aliased()) null else Public.PUBLIC
    override fun `as`(alias: String): GetOfficesMultiple = GetOfficesMultiple(DSL.name(alias), this, parameters)
    override fun `as`(alias: Name): GetOfficesMultiple = GetOfficesMultiple(alias, this, parameters)
    override fun `as`(alias: Table<*>): GetOfficesMultiple = GetOfficesMultiple(alias.getQualifiedName(), this, parameters)

    /**
     * Rename this table
     */
    override fun rename(name: String): GetOfficesMultiple = GetOfficesMultiple(DSL.name(name), null, parameters)

    /**
     * Rename this table
     */
    override fun rename(name: Name): GetOfficesMultiple = GetOfficesMultiple(name, null, parameters)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): GetOfficesMultiple = GetOfficesMultiple(name.getQualifiedName(), null, parameters)

    /**
     * Call this table-valued function
     */
    fun call(): GetOfficesMultiple = GetOfficesMultiple(DSL.name("get_offices_multiple"), null, arrayOf()).let { if (aliased()) it.`as`(unqualifiedName) else it }
}