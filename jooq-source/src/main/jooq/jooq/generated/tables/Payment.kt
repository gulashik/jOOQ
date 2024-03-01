/*
 * This file is generated by jOOQ.
 */
package jooq.generated.tables


import java.math.BigDecimal
import java.time.LocalDateTime

import javax.annotation.processing.Generated

import jooq.generated.Public
import jooq.generated.tables.records.PaymentRecord

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
open class Payment(
    alias: Name,
    child: Table<out Record>?,
    path: ForeignKey<out Record, PaymentRecord>?,
    aliased: Table<PaymentRecord>?,
    parameters: Array<Field<*>?>?
): TableImpl<PaymentRecord>(
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
         * The reference instance of <code>public.payment</code>
         */
        val PAYMENT: Payment = Payment()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<PaymentRecord> = PaymentRecord::class.java

    /**
     * The column <code>public.payment.customer_number</code>.
     */
    val CUSTOMER_NUMBER: TableField<PaymentRecord, Long?> = createField(DSL.name("customer_number"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>public.payment.check_number</code>.
     */
    val CHECK_NUMBER: TableField<PaymentRecord, String?> = createField(DSL.name("check_number"), SQLDataType.VARCHAR(50).nullable(false), this, "")

    /**
     * The column <code>public.payment.payment_date</code>.
     */
    val PAYMENT_DATE: TableField<PaymentRecord, LocalDateTime?> = createField(DSL.name("payment_date"), SQLDataType.LOCALDATETIME(6).nullable(false).defaultValue(DSL.field(DSL.raw("CURRENT_TIMESTAMP"), SQLDataType.LOCALDATETIME)), this, "")

    /**
     * The column <code>public.payment.invoice_amount</code>.
     */
    val INVOICE_AMOUNT: TableField<PaymentRecord, BigDecimal?> = createField(DSL.name("invoice_amount"), SQLDataType.NUMERIC(10, 2).nullable(false), this, "")

    /**
     * The column <code>public.payment.caching_date</code>.
     */
    val CACHING_DATE: TableField<PaymentRecord, LocalDateTime?> = createField(DSL.name("caching_date"), SQLDataType.LOCALDATETIME(6), this, "")

    /**
     * The column <code>public.payment.version</code>.
     */
    val VERSION: TableField<PaymentRecord, Int?> = createField(DSL.name("version"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field(DSL.raw("0"), SQLDataType.INTEGER)), this, "")

    /**
     * The column <code>public.payment.modified</code>.
     */
    val MODIFIED: TableField<PaymentRecord, LocalDateTime?> = createField(DSL.name("modified"), SQLDataType.LOCALDATETIME(6).nullable(false).defaultValue(DSL.field(DSL.raw("now()"), SQLDataType.LOCALDATETIME)), this, "")

    private constructor(alias: Name, aliased: Table<PaymentRecord>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<PaymentRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>public.payment</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>public.payment</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>public.payment</code> table reference
     */
    constructor(): this(DSL.name("payment"), null)
    override fun getSchema(): Schema? = if (aliased()) null else Public.PUBLIC
    override fun getPrimaryKey(): UniqueKey<PaymentRecord> = Internal.createUniqueKey(Payment.PAYMENT, DSL.name("payment_pk"), arrayOf(Payment.PAYMENT.CUSTOMER_NUMBER, Payment.PAYMENT.CHECK_NUMBER), true)
    override fun getUniqueKeys(): List<UniqueKey<PaymentRecord>> = listOf(
        Internal.createUniqueKey(Payment.PAYMENT, DSL.name("check_number_uk"), arrayOf(Payment.PAYMENT.CHECK_NUMBER), true)
    )
    override fun `as`(alias: String): Payment = Payment(DSL.name(alias), this)
    override fun `as`(alias: Name): Payment = Payment(alias, this)
    override fun `as`(alias: Table<*>): Payment = Payment(alias.getQualifiedName(), this)

    /**
     * Rename this table
     */
    override fun rename(name: String): Payment = Payment(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): Payment = Payment(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): Payment = Payment(name.getQualifiedName(), null)
}