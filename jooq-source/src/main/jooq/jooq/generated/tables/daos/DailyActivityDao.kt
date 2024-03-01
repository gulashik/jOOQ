/*
 * This file is generated by jOOQ.
 */
package jooq.generated.tables.daos


import java.time.LocalDate

import javax.annotation.processing.Generated

import jooq.generated.tables.DailyActivity
import jooq.generated.tables.records.DailyActivityRecord

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
open class DailyActivityDao(configuration: Configuration?) : DAOImpl<DailyActivityRecord, jooq.generated.tables.pojos.DailyActivity, Int>(DailyActivity.DAILY_ACTIVITY, jooq.generated.tables.pojos.DailyActivity::class.java, configuration) {

    /**
     * Create a new DailyActivityDao without any configuration
     */
    constructor(): this(null)

    override fun getId(o: jooq.generated.tables.pojos.DailyActivity): Int? = o.dayId

    /**
     * Fetch records that have <code>day_id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    fun fetchRangeOfDayId(lowerInclusive: Int?, upperInclusive: Int?): List<jooq.generated.tables.pojos.DailyActivity> = fetchRange(DailyActivity.DAILY_ACTIVITY.DAY_ID, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>day_id IN (values)</code>
     */
    fun fetchByDayId(vararg values: Int): List<jooq.generated.tables.pojos.DailyActivity> = fetch(DailyActivity.DAILY_ACTIVITY.DAY_ID, *values.toTypedArray())

    /**
     * Fetch a unique record that has <code>day_id = value</code>
     */
    fun fetchOneByDayId(value: Int): jooq.generated.tables.pojos.DailyActivity? = fetchOne(DailyActivity.DAILY_ACTIVITY.DAY_ID, value)

    /**
     * Fetch records that have <code>day_date BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    fun fetchRangeOfDayDate(lowerInclusive: LocalDate, upperInclusive: LocalDate): List<jooq.generated.tables.pojos.DailyActivity> = fetchRange(DailyActivity.DAILY_ACTIVITY.DAY_DATE, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>day_date IN (values)</code>
     */
    fun fetchByDayDate(vararg values: LocalDate): List<jooq.generated.tables.pojos.DailyActivity> = fetch(DailyActivity.DAILY_ACTIVITY.DAY_DATE, *values)

    /**
     * Fetch records that have <code>sales BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    fun fetchRangeOfSales(lowerInclusive: Double, upperInclusive: Double): List<jooq.generated.tables.pojos.DailyActivity> = fetchRange(DailyActivity.DAILY_ACTIVITY.SALES, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>sales IN (values)</code>
     */
    fun fetchBySales(vararg values: Double): List<jooq.generated.tables.pojos.DailyActivity> = fetch(DailyActivity.DAILY_ACTIVITY.SALES, *values.toTypedArray())

    /**
     * Fetch records that have <code>visitors BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    fun fetchRangeOfVisitors(lowerInclusive: Double, upperInclusive: Double): List<jooq.generated.tables.pojos.DailyActivity> = fetchRange(DailyActivity.DAILY_ACTIVITY.VISITORS, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>visitors IN (values)</code>
     */
    fun fetchByVisitors(vararg values: Double): List<jooq.generated.tables.pojos.DailyActivity> = fetch(DailyActivity.DAILY_ACTIVITY.VISITORS, *values.toTypedArray())

    /**
     * Fetch records that have <code>conversion BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    fun fetchRangeOfConversion(lowerInclusive: Double, upperInclusive: Double): List<jooq.generated.tables.pojos.DailyActivity> = fetchRange(DailyActivity.DAILY_ACTIVITY.CONVERSION, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>conversion IN (values)</code>
     */
    fun fetchByConversion(vararg values: Double): List<jooq.generated.tables.pojos.DailyActivity> = fetch(DailyActivity.DAILY_ACTIVITY.CONVERSION, *values.toTypedArray())
}
