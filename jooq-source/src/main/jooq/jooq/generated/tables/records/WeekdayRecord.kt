/*
 * This file is generated by jOOQ.
 */
package jooq.generated.tables.records


import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size

import javax.annotation.processing.Generated

import jooq.generated.tables.Weekday
import jooq.generated.tables.interfaces.IWeekday

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
open class WeekdayRecord private constructor() : UpdatableRecordImpl<WeekdayRecord>(Weekday.WEEKDAY), IWeekday {

    @get:NotNull
    open override var id: Int
        set(value): Unit = set(0, value)
        get(): Int = get(0) as Int

    @get:NotNull
    @get:Size(max = 50)
    open override var name: String
        set(value): Unit = set(1, value)
        get(): String = get(1) as String

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    override fun key(): Record1<Int?> = super.key() as Record1<Int?>

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    fun from(from: IWeekday) {
        this.id = from.id
        this.name = from.name
        resetChangedOnNotNull()
    }

    /**
     * Create a detached, initialised WeekdayRecord
     */
    constructor(id: Int, name: String): this() {
        this.id = id
        this.name = name
        resetChangedOnNotNull()
    }

    /**
     * Create a detached, initialised WeekdayRecord
     */
    constructor(value: jooq.generated.tables.pojos.Weekday?): this() {
        if (value != null) {
            this.id = value.id
            this.name = value.name
            resetChangedOnNotNull()
        }
    }
}
