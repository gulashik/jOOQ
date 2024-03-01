/*
 * This file is generated by jOOQ.
 */
package jooq.generated.tables.daos


import javax.annotation.processing.Generated

import jooq.generated.tables.Weekday
import jooq.generated.tables.records.WeekdayRecord

import kotlin.collections.List

import org.jooq.Configuration
import org.jooq.impl.DAOImpl
import org.springframework.stereotype.Repository


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
@Repository
open class WeekdayDao(configuration: Configuration?) : DAOImpl<WeekdayRecord, jooq.generated.tables.pojos.Weekday, Int>(Weekday.WEEKDAY, jooq.generated.tables.pojos.Weekday::class.java, configuration) {

    /**
     * Create a new WeekdayDao without any configuration
     */
    constructor(): this(null)

    override fun getId(o: jooq.generated.tables.pojos.Weekday): Int = o.id

    /**
     * Fetch records that have <code>id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    fun fetchRangeOfId(lowerInclusive: Int, upperInclusive: Int): List<jooq.generated.tables.pojos.Weekday> = fetchRange(Weekday.WEEKDAY.ID, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    fun fetchById(vararg values: Int): List<jooq.generated.tables.pojos.Weekday> = fetch(Weekday.WEEKDAY.ID, *values.toTypedArray())

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    fun fetchOneById(value: Int): jooq.generated.tables.pojos.Weekday? = fetchOne(Weekday.WEEKDAY.ID, value)

    /**
     * Fetch records that have <code>name BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    fun fetchRangeOfName(lowerInclusive: String, upperInclusive: String): List<jooq.generated.tables.pojos.Weekday> = fetchRange(Weekday.WEEKDAY.NAME, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>name IN (values)</code>
     */
    fun fetchByName(vararg values: String): List<jooq.generated.tables.pojos.Weekday> = fetch(Weekday.WEEKDAY.NAME, *values)
}
