/*
 * This file is generated by jOOQ.
 */
package jooq.generated.tables.daos


import java.time.LocalDate

import javax.annotation.processing.Generated

import jooq.generated.tables.EmployeeStatus
import jooq.generated.tables.records.EmployeeStatusRecord

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
open class EmployeeStatusDao(configuration: Configuration?) : DAOImpl<EmployeeStatusRecord, jooq.generated.tables.pojos.EmployeeStatus, Int>(EmployeeStatus.EMPLOYEE_STATUS, jooq.generated.tables.pojos.EmployeeStatus::class.java, configuration) {

    /**
     * Create a new EmployeeStatusDao without any configuration
     */
    constructor(): this(null)

    override fun getId(o: jooq.generated.tables.pojos.EmployeeStatus): Int? = o.id

    /**
     * Fetch records that have <code>id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    fun fetchRangeOfId(lowerInclusive: Int?, upperInclusive: Int?): List<jooq.generated.tables.pojos.EmployeeStatus> = fetchRange(EmployeeStatus.EMPLOYEE_STATUS.ID, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    fun fetchById(vararg values: Int): List<jooq.generated.tables.pojos.EmployeeStatus> = fetch(EmployeeStatus.EMPLOYEE_STATUS.ID, *values.toTypedArray())

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    fun fetchOneById(value: Int): jooq.generated.tables.pojos.EmployeeStatus? = fetchOne(EmployeeStatus.EMPLOYEE_STATUS.ID, value)

    /**
     * Fetch records that have <code>employee_number BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    fun fetchRangeOfEmployeeNumber(lowerInclusive: Long, upperInclusive: Long): List<jooq.generated.tables.pojos.EmployeeStatus> = fetchRange(EmployeeStatus.EMPLOYEE_STATUS.EMPLOYEE_NUMBER, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>employee_number IN (values)</code>
     */
    fun fetchByEmployeeNumber(vararg values: Long): List<jooq.generated.tables.pojos.EmployeeStatus> = fetch(EmployeeStatus.EMPLOYEE_STATUS.EMPLOYEE_NUMBER, *values.toTypedArray())

    /**
     * Fetch records that have <code>status BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    fun fetchRangeOfStatus(lowerInclusive: String, upperInclusive: String): List<jooq.generated.tables.pojos.EmployeeStatus> = fetchRange(EmployeeStatus.EMPLOYEE_STATUS.STATUS, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>status IN (values)</code>
     */
    fun fetchByStatus(vararg values: String): List<jooq.generated.tables.pojos.EmployeeStatus> = fetch(EmployeeStatus.EMPLOYEE_STATUS.STATUS, *values)

    /**
     * Fetch records that have <code>acquired_date BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    fun fetchRangeOfAcquiredDate(lowerInclusive: LocalDate, upperInclusive: LocalDate): List<jooq.generated.tables.pojos.EmployeeStatus> = fetchRange(EmployeeStatus.EMPLOYEE_STATUS.ACQUIRED_DATE, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>acquired_date IN (values)</code>
     */
    fun fetchByAcquiredDate(vararg values: LocalDate): List<jooq.generated.tables.pojos.EmployeeStatus> = fetch(EmployeeStatus.EMPLOYEE_STATUS.ACQUIRED_DATE, *values)
}