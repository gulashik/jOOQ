/*
 * This file is generated by jOOQ.
 */
package jooq.generated.tables


import javax.annotation.processing.Generated

import jooq.generated.Public
import jooq.generated.tables.records.EmployeeRecord

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
open class Employee(
    alias: Name,
    child: Table<out Record>?,
    path: ForeignKey<out Record, EmployeeRecord>?,
    aliased: Table<EmployeeRecord>?,
    parameters: Array<Field<*>?>?
): TableImpl<EmployeeRecord>(
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
         * The reference instance of <code>public.employee</code>
         */
        val EMPLOYEE: Employee = Employee()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<EmployeeRecord> = EmployeeRecord::class.java

    /**
     * The column <code>public.employee.employee_number</code>.
     */
    val EMPLOYEE_NUMBER: TableField<EmployeeRecord, Long?> = createField(DSL.name("employee_number"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>public.employee.last_name</code>.
     */
    val LAST_NAME: TableField<EmployeeRecord, String?> = createField(DSL.name("last_name"), SQLDataType.VARCHAR(50).nullable(false), this, "")

    /**
     * The column <code>public.employee.first_name</code>.
     */
    val FIRST_NAME: TableField<EmployeeRecord, String?> = createField(DSL.name("first_name"), SQLDataType.VARCHAR(50).nullable(false), this, "")

    /**
     * The column <code>public.employee.extension</code>.
     */
    val EXTENSION: TableField<EmployeeRecord, String?> = createField(DSL.name("extension"), SQLDataType.VARCHAR(10).nullable(false), this, "")

    /**
     * The column <code>public.employee.email</code>.
     */
    val EMAIL: TableField<EmployeeRecord, String?> = createField(DSL.name("email"), SQLDataType.VARCHAR(100).nullable(false), this, "")

    /**
     * The column <code>public.employee.office_code</code>.
     */
    val OFFICE_CODE: TableField<EmployeeRecord, String?> = createField(DSL.name("office_code"), SQLDataType.VARCHAR(10).nullable(false), this, "")

    /**
     * The column <code>public.employee.salary</code>.
     */
    val SALARY: TableField<EmployeeRecord, Int?> = createField(DSL.name("salary"), SQLDataType.INTEGER.nullable(false), this, "")

    /**
     * The column <code>public.employee.commission</code>.
     */
    val COMMISSION: TableField<EmployeeRecord, Int?> = createField(DSL.name("commission"), SQLDataType.INTEGER, this, "")

    /**
     * The column <code>public.employee.reports_to</code>.
     */
    val REPORTS_TO: TableField<EmployeeRecord, Long?> = createField(DSL.name("reports_to"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>public.employee.job_title</code>.
     */
    val JOB_TITLE: TableField<EmployeeRecord, String?> = createField(DSL.name("job_title"), SQLDataType.VARCHAR(50).nullable(false), this, "")

    /**
     * The column <code>public.employee.employee_of_year</code>.
     */
    val EMPLOYEE_OF_YEAR: TableField<EmployeeRecord, Array<Int?>?> = createField(DSL.name("employee_of_year"), SQLDataType.INTEGER.array(), this, "")

    /**
     * The column <code>public.employee.monthly_bonus</code>.
     */
    val MONTHLY_BONUS: TableField<EmployeeRecord, Array<Int?>?> = createField(DSL.name("monthly_bonus"), SQLDataType.INTEGER.array(), this, "")

    private constructor(alias: Name, aliased: Table<EmployeeRecord>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<EmployeeRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>public.employee</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>public.employee</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>public.employee</code> table reference
     */
    constructor(): this(DSL.name("employee"), null)
    override fun getSchema(): Schema? = if (aliased()) null else Public.PUBLIC
    override fun getPrimaryKey(): UniqueKey<EmployeeRecord> = Internal.createUniqueKey(Employee.EMPLOYEE, DSL.name("employee_pk"), arrayOf(Employee.EMPLOYEE.EMPLOYEE_NUMBER), true)
    override fun `as`(alias: String): Employee = Employee(DSL.name(alias), this)
    override fun `as`(alias: Name): Employee = Employee(alias, this)
    override fun `as`(alias: Table<*>): Employee = Employee(alias.getQualifiedName(), this)

    /**
     * Rename this table
     */
    override fun rename(name: String): Employee = Employee(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): Employee = Employee(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): Employee = Employee(name.getQualifiedName(), null)
}
