/*
 * This file is generated by jOOQ.
 */
package jooq.generated.tables


import javax.annotation.processing.Generated

import jooq.generated.Public
import jooq.generated.enums.RateType
import jooq.generated.enums.VatType
import jooq.generated.tables.records.SaleRecord

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
open class Sale(
    alias: Name,
    child: Table<out Record>?,
    path: ForeignKey<out Record, SaleRecord>?,
    aliased: Table<SaleRecord>?,
    parameters: Array<Field<*>?>?
): TableImpl<SaleRecord>(
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
         * The reference instance of <code>public.sale</code>
         */
        val SALE: Sale = Sale()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<SaleRecord> = SaleRecord::class.java

    /**
     * The column <code>public.sale.sale_id</code>.
     */
    val SALE_ID: TableField<SaleRecord, Long?> = createField(DSL.name("sale_id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "")

    /**
     * The column <code>public.sale.fiscal_year</code>.
     */
    val FISCAL_YEAR: TableField<SaleRecord, Int?> = createField(DSL.name("fiscal_year"), SQLDataType.INTEGER.nullable(false), this, "")

    /**
     * The column <code>public.sale.sale</code>.
     */
    val SALE_: TableField<SaleRecord, Double?> = createField(DSL.name("sale"), SQLDataType.DOUBLE.nullable(false), this, "")

    /**
     * The column <code>public.sale.employee_number</code>.
     */
    val EMPLOYEE_NUMBER: TableField<SaleRecord, Long?> = createField(DSL.name("employee_number"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>public.sale.hot</code>.
     */
    val HOT: TableField<SaleRecord, Boolean?> = createField(DSL.name("hot"), SQLDataType.BOOLEAN.defaultValue(DSL.field(DSL.raw("false"), SQLDataType.BOOLEAN)), this, "")

    /**
     * The column <code>public.sale.rate</code>.
     */
    val RATE: TableField<SaleRecord, RateType?> = createField(DSL.name("rate"), SQLDataType.VARCHAR.asEnumDataType(jooq.generated.enums.RateType::class.java), this, "")

    /**
     * The column <code>public.sale.vat</code>.
     */
    val VAT: TableField<SaleRecord, VatType?> = createField(DSL.name("vat"), SQLDataType.VARCHAR.asEnumDataType(jooq.generated.enums.VatType::class.java), this, "")

    /**
     * The column <code>public.sale.fiscal_month</code>.
     */
    val FISCAL_MONTH: TableField<SaleRecord, Int?> = createField(DSL.name("fiscal_month"), SQLDataType.INTEGER.nullable(false), this, "")

    /**
     * The column <code>public.sale.revenue_growth</code>.
     */
    val REVENUE_GROWTH: TableField<SaleRecord, Double?> = createField(DSL.name("revenue_growth"), SQLDataType.DOUBLE.nullable(false), this, "")

    /**
     * The column <code>public.sale.trend</code>.
     */
    val TREND: TableField<SaleRecord, String?> = createField(DSL.name("trend"), SQLDataType.VARCHAR(10).defaultValue(DSL.field(DSL.raw("NULL::character varying"), SQLDataType.VARCHAR)), this, "")

    private constructor(alias: Name, aliased: Table<SaleRecord>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<SaleRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>public.sale</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>public.sale</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>public.sale</code> table reference
     */
    constructor(): this(DSL.name("sale"), null)
    override fun getSchema(): Schema? = if (aliased()) null else Public.PUBLIC
    override fun getIdentity(): Identity<SaleRecord, Long?> = super.getIdentity() as Identity<SaleRecord, Long?>
    override fun getPrimaryKey(): UniqueKey<SaleRecord> = Internal.createUniqueKey(Sale.SALE, DSL.name("sale_pk"), arrayOf(Sale.SALE.SALE_ID), true)
    override fun `as`(alias: String): Sale = Sale(DSL.name(alias), this)
    override fun `as`(alias: Name): Sale = Sale(alias, this)
    override fun `as`(alias: Table<*>): Sale = Sale(alias.getQualifiedName(), this)

    /**
     * Rename this table
     */
    override fun rename(name: String): Sale = Sale(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): Sale = Sale(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): Sale = Sale(name.getQualifiedName(), null)
}
