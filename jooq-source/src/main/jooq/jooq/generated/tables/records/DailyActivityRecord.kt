/*
 * This file is generated by jOOQ.
 */
package jooq.generated.tables.records


import jakarta.validation.constraints.NotNull

import java.time.LocalDate

import javax.annotation.processing.Generated

import jooq.generated.tables.DailyActivity
import jooq.generated.tables.interfaces.IDailyActivity

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
open class DailyActivityRecord private constructor() : UpdatableRecordImpl<DailyActivityRecord>(DailyActivity.DAILY_ACTIVITY), IDailyActivity {

    open override var dayId: Int?
        set(value): Unit = set(0, value)
        get(): Int? = get(0) as Int?

    @get:NotNull
    open override var dayDate: LocalDate
        set(value): Unit = set(1, value)
        get(): LocalDate = get(1) as LocalDate

    @get:NotNull
    open override var sales: Double
        set(value): Unit = set(2, value)
        get(): Double = get(2) as Double

    @get:NotNull
    open override var visitors: Double
        set(value): Unit = set(3, value)
        get(): Double = get(3) as Double

    @get:NotNull
    open override var conversion: Double
        set(value): Unit = set(4, value)
        get(): Double = get(4) as Double

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    override fun key(): Record1<Int?> = super.key() as Record1<Int?>

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    fun from(from: IDailyActivity) {
        this.dayId = from.dayId
        this.dayDate = from.dayDate
        this.sales = from.sales
        this.visitors = from.visitors
        this.conversion = from.conversion
        resetChangedOnNotNull()
    }

    /**
     * Create a detached, initialised DailyActivityRecord
     */
    constructor(dayId: Int? = null, dayDate: LocalDate, sales: Double, visitors: Double, conversion: Double): this() {
        this.dayId = dayId
        this.dayDate = dayDate
        this.sales = sales
        this.visitors = visitors
        this.conversion = conversion
        resetChangedOnNotNull()
    }

    /**
     * Create a detached, initialised DailyActivityRecord
     */
    constructor(value: jooq.generated.tables.pojos.DailyActivity?): this() {
        if (value != null) {
            this.dayId = value.dayId
            this.dayDate = value.dayDate
            this.sales = value.sales
            this.visitors = value.visitors
            this.conversion = value.conversion
            resetChangedOnNotNull()
        }
    }
}
