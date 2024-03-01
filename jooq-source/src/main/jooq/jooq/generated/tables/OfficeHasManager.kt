/*
 * This file is generated by jOOQ.
 */
package jooq.generated.tables


import javax.annotation.processing.Generated

import jooq.generated.Public
import jooq.generated.tables.records.OfficeHasManagerRecord

import kotlin.collections.List

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
open class OfficeHasManager(
    alias: Name,
    child: Table<out Record>?,
    path: ForeignKey<out Record, OfficeHasManagerRecord>?,
    aliased: Table<OfficeHasManagerRecord>?,
    parameters: Array<Field<*>?>?
): TableImpl<OfficeHasManagerRecord>(
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
         * The reference instance of <code>public.office_has_manager</code>
         */
        val OFFICE_HAS_MANAGER: OfficeHasManager = OfficeHasManager()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<OfficeHasManagerRecord> = OfficeHasManagerRecord::class.java

    /**
     * The column <code>public.office_has_manager.offices_office_code</code>.
     */
    val OFFICES_OFFICE_CODE: TableField<OfficeHasManagerRecord, String?> = createField(DSL.name("offices_office_code"), SQLDataType.VARCHAR(10).nullable(false), this, "")

    /**
     * The column <code>public.office_has_manager.managers_manager_id</code>.
     */
    val MANAGERS_MANAGER_ID: TableField<OfficeHasManagerRecord, Long?> = createField(DSL.name("managers_manager_id"), SQLDataType.BIGINT.nullable(false), this, "")

    private constructor(alias: Name, aliased: Table<OfficeHasManagerRecord>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<OfficeHasManagerRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>public.office_has_manager</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>public.office_has_manager</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>public.office_has_manager</code> table reference
     */
    constructor(): this(DSL.name("office_has_manager"), null)
    override fun getSchema(): Schema? = if (aliased()) null else Public.PUBLIC
    override fun getUniqueKeys(): List<UniqueKey<OfficeHasManagerRecord>> = listOf(
        Internal.createUniqueKey(OfficeHasManager.OFFICE_HAS_MANAGER, DSL.name("office_manager_uk"), arrayOf(OfficeHasManager.OFFICE_HAS_MANAGER.OFFICES_OFFICE_CODE, OfficeHasManager.OFFICE_HAS_MANAGER.MANAGERS_MANAGER_ID), true)
    )
    override fun `as`(alias: String): OfficeHasManager = OfficeHasManager(DSL.name(alias), this)
    override fun `as`(alias: Name): OfficeHasManager = OfficeHasManager(alias, this)
    override fun `as`(alias: Table<*>): OfficeHasManager = OfficeHasManager(alias.getQualifiedName(), this)

    /**
     * Rename this table
     */
    override fun rename(name: String): OfficeHasManager = OfficeHasManager(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): OfficeHasManager = OfficeHasManager(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): OfficeHasManager = OfficeHasManager(name.getQualifiedName(), null)
}
