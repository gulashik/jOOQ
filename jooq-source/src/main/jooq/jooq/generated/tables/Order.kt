/*
 * This file is generated by jOOQ.
 */
package jooq.generated.tables


import java.math.BigDecimal
import java.time.LocalDate

import javax.annotation.processing.Generated

import jooq.generated.Public
import jooq.generated.tables.records.OrderRecord

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
open class Order(
    alias: Name,
    child: Table<out Record>?,
    path: ForeignKey<out Record, OrderRecord>?,
    aliased: Table<OrderRecord>?,
    parameters: Array<Field<*>?>?
): TableImpl<OrderRecord>(
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
         * The reference instance of <code>public.order</code>
         */
        val ORDER: Order = Order()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<OrderRecord> = OrderRecord::class.java

    /**
     * The column <code>public.order.order_id</code>.
     */
    val ORDER_ID: TableField<OrderRecord, Long?> = createField(DSL.name("order_id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "")

    /**
     * The column <code>public.order.order_date</code>.
     */
    val ORDER_DATE: TableField<OrderRecord, LocalDate?> = createField(DSL.name("order_date"), SQLDataType.LOCALDATE.nullable(false), this, "")

    /**
     * The column <code>public.order.required_date</code>.
     */
    val REQUIRED_DATE: TableField<OrderRecord, LocalDate?> = createField(DSL.name("required_date"), SQLDataType.LOCALDATE.nullable(false), this, "")

    /**
     * The column <code>public.order.shipped_date</code>.
     */
    val SHIPPED_DATE: TableField<OrderRecord, LocalDate?> = createField(DSL.name("shipped_date"), SQLDataType.LOCALDATE, this, "")

    /**
     * The column <code>public.order.status</code>.
     */
    val STATUS: TableField<OrderRecord, String?> = createField(DSL.name("status"), SQLDataType.VARCHAR(15).nullable(false), this, "")

    /**
     * The column <code>public.order.comments</code>.
     */
    val COMMENTS: TableField<OrderRecord, String?> = createField(DSL.name("comments"), SQLDataType.CLOB, this, "")

    /**
     * The column <code>public.order.customer_number</code>.
     */
    val CUSTOMER_NUMBER: TableField<OrderRecord, Long?> = createField(DSL.name("customer_number"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>public.order.amount</code>.
     */
    val AMOUNT: TableField<OrderRecord, BigDecimal?> = createField(DSL.name("amount"), SQLDataType.NUMERIC(10, 2).nullable(false), this, "")

    private constructor(alias: Name, aliased: Table<OrderRecord>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<OrderRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>public.order</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>public.order</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>public.order</code> table reference
     */
    constructor(): this(DSL.name("order"), null)
    override fun getSchema(): Schema? = if (aliased()) null else Public.PUBLIC
    override fun getIdentity(): Identity<OrderRecord, Long?> = super.getIdentity() as Identity<OrderRecord, Long?>
    override fun getPrimaryKey(): UniqueKey<OrderRecord> = Internal.createUniqueKey(Order.ORDER, DSL.name("order_pk"), arrayOf(Order.ORDER.ORDER_ID), true)
    override fun `as`(alias: String): Order = Order(DSL.name(alias), this)
    override fun `as`(alias: Name): Order = Order(alias, this)
    override fun `as`(alias: Table<*>): Order = Order(alias.getQualifiedName(), this)

    /**
     * Rename this table
     */
    override fun rename(name: String): Order = Order(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): Order = Order(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): Order = Order(name.getQualifiedName(), null)
}
