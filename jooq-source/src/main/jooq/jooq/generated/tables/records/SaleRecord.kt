/*
 * This file is generated by jOOQ.
 */
package jooq.generated.tables.records


import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size

import javax.annotation.processing.Generated

import jooq.generated.enums.RateType
import jooq.generated.enums.VatType
import jooq.generated.tables.Sale
import jooq.generated.tables.interfaces.ISale

import org.jooq.Record1
import org.jooq.impl.UpdatableRecordImpl


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
open class SaleRecord private constructor() : UpdatableRecordImpl<SaleRecord>(Sale.SALE), ISale {

    open override var saleId: Long?
        set(value): Unit = set(0, value)
        get(): Long? = get(0) as Long?

    @get:NotNull
    open override var fiscalYear: Int
        set(value): Unit = set(1, value)
        get(): Int = get(1) as Int

    @get:NotNull
    open override var sale: Double
        set(value): Unit = set(2, value)
        get(): Double = get(2) as Double

    open override var employeeNumber: Long?
        set(value): Unit = set(3, value)
        get(): Long? = get(3) as Long?

    open override var hot: Boolean?
        set(value): Unit = set(4, value)
        get(): Boolean? = get(4) as Boolean?

    open override var rate: RateType?
        set(value): Unit = set(5, value)
        get(): RateType? = get(5) as RateType?

    open override var vat: VatType?
        set(value): Unit = set(6, value)
        get(): VatType? = get(6) as VatType?

    @get:NotNull
    open override var fiscalMonth: Int
        set(value): Unit = set(7, value)
        get(): Int = get(7) as Int

    @get:NotNull
    open override var revenueGrowth: Double
        set(value): Unit = set(8, value)
        get(): Double = get(8) as Double

    @get:Size(max = 10)
    open override var trend: String?
        set(value): Unit = set(9, value)
        get(): String? = get(9) as String?

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    override fun key(): Record1<Long?> = super.key() as Record1<Long?>

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    fun from(from: ISale) {
        this.saleId = from.saleId
        this.fiscalYear = from.fiscalYear
        this.sale = from.sale
        this.employeeNumber = from.employeeNumber
        this.hot = from.hot
        this.rate = from.rate
        this.vat = from.vat
        this.fiscalMonth = from.fiscalMonth
        this.revenueGrowth = from.revenueGrowth
        this.trend = from.trend
        resetChangedOnNotNull()
    }

    /**
     * Create a detached, initialised SaleRecord
     */
    constructor(saleId: Long? = null, fiscalYear: Int, sale: Double, employeeNumber: Long? = null, hot: Boolean? = null, rate: RateType? = null, vat: VatType? = null, fiscalMonth: Int, revenueGrowth: Double, trend: String? = null): this() {
        this.saleId = saleId
        this.fiscalYear = fiscalYear
        this.sale = sale
        this.employeeNumber = employeeNumber
        this.hot = hot
        this.rate = rate
        this.vat = vat
        this.fiscalMonth = fiscalMonth
        this.revenueGrowth = revenueGrowth
        this.trend = trend
        resetChangedOnNotNull()
    }

    /**
     * Create a detached, initialised SaleRecord
     */
    constructor(value: jooq.generated.tables.pojos.Sale?): this() {
        if (value != null) {
            this.saleId = value.saleId
            this.fiscalYear = value.fiscalYear
            this.sale = value.sale
            this.employeeNumber = value.employeeNumber
            this.hot = value.hot
            this.rate = value.rate
            this.vat = value.vat
            this.fiscalMonth = value.fiscalMonth
            this.revenueGrowth = value.revenueGrowth
            this.trend = value.trend
            resetChangedOnNotNull()
        }
    }
}
