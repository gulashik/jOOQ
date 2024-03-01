/*
 * This file is generated by jOOQ.
 */
package jooq.generated.tables.pojos


import javax.annotation.processing.Generated

import jooq.generated.tables.interfaces.ITopThreeSalesPerEmployee


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
data class TopThreeSalesPerEmployee(
    override var sales: Double? = null
): ITopThreeSalesPerEmployee {


    override fun equals(other: Any?): Boolean {
        if (this === other)
            return true
        if (other == null)
            return false
        if (this::class != other::class)
            return false
        val o: TopThreeSalesPerEmployee = other as TopThreeSalesPerEmployee
        if (this.sales == null) {
            if (o.sales != null)
                return false
        }
        else if (this.sales != o.sales)
            return false
        return true
    }

    override fun hashCode(): Int {
        val prime = 31
        var result = 1
        result = prime * result + (if (this.sales == null) 0 else this.sales.hashCode())
        return result
    }

    override fun toString(): String {
        val sb = StringBuilder("TopThreeSalesPerEmployee (")

        sb.append(sales)

        sb.append(")")
        return sb.toString()
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    fun from(from: ITopThreeSalesPerEmployee) {
        this.sales = from.sales
    }
}