/*
 * This file is generated by jOOQ.
 */
package jooq.generated.tables


import javax.annotation.processing.Generated

import jooq.generated.Public
import jooq.generated.tables.records.TopThreeSalesPerEmployeeRecord

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
open class TopThreeSalesPerEmployee(
    alias: Name,
    child: Table<out Record>?,
    path: ForeignKey<out Record, TopThreeSalesPerEmployeeRecord>?,
    aliased: Table<TopThreeSalesPerEmployeeRecord>?,
    parameters: Array<Field<*>?>?
): TableImpl<TopThreeSalesPerEmployeeRecord>(
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
         * The reference instance of
         * <code>public.top_three_sales_per_employee</code>
         */
        val TOP_THREE_SALES_PER_EMPLOYEE: TopThreeSalesPerEmployee = TopThreeSalesPerEmployee()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<TopThreeSalesPerEmployeeRecord> = TopThreeSalesPerEmployeeRecord::class.java

    /**
     * The column <code>public.top_three_sales_per_employee.sales</code>.
     */
    val SALES: TableField<TopThreeSalesPerEmployeeRecord, Double?> = createField(DSL.name("sales"), SQLDataType.DOUBLE, this, "")

    private constructor(alias: Name, aliased: Table<TopThreeSalesPerEmployeeRecord>?): this(alias, null, null, aliased, arrayOf(
        DSL.value(null, SQLDataType.BIGINT)
    ))
    private constructor(alias: Name, aliased: Table<TopThreeSalesPerEmployeeRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>public.top_three_sales_per_employee</code> table
     * reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>public.top_three_sales_per_employee</code> table
     * reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>public.top_three_sales_per_employee</code> table reference
     */
    constructor(): this(DSL.name("top_three_sales_per_employee"), null)
    override fun getSchema(): Schema? = if (aliased()) null else Public.PUBLIC
    override fun `as`(alias: String): TopThreeSalesPerEmployee = TopThreeSalesPerEmployee(DSL.name(alias), this, parameters)
    override fun `as`(alias: Name): TopThreeSalesPerEmployee = TopThreeSalesPerEmployee(alias, this, parameters)
    override fun `as`(alias: Table<*>): TopThreeSalesPerEmployee = TopThreeSalesPerEmployee(alias.getQualifiedName(), this, parameters)

    /**
     * Rename this table
     */
    override fun rename(name: String): TopThreeSalesPerEmployee = TopThreeSalesPerEmployee(DSL.name(name), null, parameters)

    /**
     * Rename this table
     */
    override fun rename(name: Name): TopThreeSalesPerEmployee = TopThreeSalesPerEmployee(name, null, parameters)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): TopThreeSalesPerEmployee = TopThreeSalesPerEmployee(name.getQualifiedName(), null, parameters)

    /**
     * Call this table-valued function
     */
    fun call(
          employeeNr: Long?
    ): TopThreeSalesPerEmployee = TopThreeSalesPerEmployee(DSL.name("top_three_sales_per_employee"), null, arrayOf(
        DSL.value(employeeNr, SQLDataType.BIGINT)
    )).let { if (aliased()) it.`as`(unqualifiedName) else it }

    /**
     * Call this table-valued function
     */
    fun call(
          employeeNr: Field<Long?>
    ): TopThreeSalesPerEmployee = TopThreeSalesPerEmployee(DSL.name("top_three_sales_per_employee"), null, arrayOf(
        employeeNr
    )).let { if (aliased()) it.`as`(unqualifiedName) else it }
}
