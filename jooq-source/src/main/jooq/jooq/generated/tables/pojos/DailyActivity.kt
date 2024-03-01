/*
 * This file is generated by jOOQ.
 */
package jooq.generated.tables.pojos


import jakarta.validation.constraints.NotNull

import java.time.LocalDate

import javax.annotation.processing.Generated

import jooq.generated.tables.interfaces.IDailyActivity


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
data class DailyActivity(
    override var dayId: Int? = null,
    @get:NotNull
    override var dayDate: LocalDate,
    @get:NotNull
    override var sales: Double,
    @get:NotNull
    override var visitors: Double,
    @get:NotNull
    override var conversion: Double
): IDailyActivity {


    override fun equals(other: Any?): Boolean {
        if (this === other)
            return true
        if (other == null)
            return false
        if (this::class != other::class)
            return false
        val o: DailyActivity = other as DailyActivity
        if (this.dayId == null) {
            if (o.dayId != null)
                return false
        }
        else if (this.dayId != o.dayId)
            return false
        if (this.dayDate != o.dayDate)
            return false
        if (this.sales != o.sales)
            return false
        if (this.visitors != o.visitors)
            return false
        if (this.conversion != o.conversion)
            return false
        return true
    }

    override fun hashCode(): Int {
        val prime = 31
        var result = 1
        result = prime * result + (if (this.dayId == null) 0 else this.dayId.hashCode())
        result = prime * result + this.dayDate.hashCode()
        result = prime * result + this.sales.hashCode()
        result = prime * result + this.visitors.hashCode()
        result = prime * result + this.conversion.hashCode()
        return result
    }

    override fun toString(): String {
        val sb = StringBuilder("DailyActivity (")

        sb.append(dayId)
        sb.append(", ").append(dayDate)
        sb.append(", ").append(sales)
        sb.append(", ").append(visitors)
        sb.append(", ").append(conversion)

        sb.append(")")
        return sb.toString()
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    fun from(from: IDailyActivity) {
        this.dayId = from.dayId
        this.dayDate = from.dayDate
        this.sales = from.sales
        this.visitors = from.visitors
        this.conversion = from.conversion
    }
}