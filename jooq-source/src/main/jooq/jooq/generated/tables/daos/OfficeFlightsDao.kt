/*
 * This file is generated by jOOQ.
 */
package jooq.generated.tables.daos


import javax.annotation.processing.Generated

import jooq.generated.tables.OfficeFlights
import jooq.generated.tables.records.OfficeFlightsRecord

import kotlin.collections.List

import org.jooq.Configuration
import org.jooq.Record2
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
open class OfficeFlightsDao(configuration: Configuration?) : DAOImpl<OfficeFlightsRecord, jooq.generated.tables.pojos.OfficeFlights, Record2<String?, String?>>(OfficeFlights.OFFICE_FLIGHTS, jooq.generated.tables.pojos.OfficeFlights::class.java, configuration) {

    /**
     * Create a new OfficeFlightsDao without any configuration
     */
    constructor(): this(null)

    override fun getId(o: jooq.generated.tables.pojos.OfficeFlights): Record2<String?, String?> = compositeKeyRecord(o.departTown, o.arrivalTown)

    /**
     * Fetch records that have <code>depart_town BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    fun fetchRangeOfDepartTown(lowerInclusive: String, upperInclusive: String): List<jooq.generated.tables.pojos.OfficeFlights> = fetchRange(OfficeFlights.OFFICE_FLIGHTS.DEPART_TOWN, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>depart_town IN (values)</code>
     */
    fun fetchByDepartTown(vararg values: String): List<jooq.generated.tables.pojos.OfficeFlights> = fetch(OfficeFlights.OFFICE_FLIGHTS.DEPART_TOWN, *values)

    /**
     * Fetch records that have <code>arrival_town BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    fun fetchRangeOfArrivalTown(lowerInclusive: String, upperInclusive: String): List<jooq.generated.tables.pojos.OfficeFlights> = fetchRange(OfficeFlights.OFFICE_FLIGHTS.ARRIVAL_TOWN, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>arrival_town IN (values)</code>
     */
    fun fetchByArrivalTown(vararg values: String): List<jooq.generated.tables.pojos.OfficeFlights> = fetch(OfficeFlights.OFFICE_FLIGHTS.ARRIVAL_TOWN, *values)

    /**
     * Fetch records that have <code>distance_km BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    fun fetchRangeOfDistanceKm(lowerInclusive: Int, upperInclusive: Int): List<jooq.generated.tables.pojos.OfficeFlights> = fetchRange(OfficeFlights.OFFICE_FLIGHTS.DISTANCE_KM, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>distance_km IN (values)</code>
     */
    fun fetchByDistanceKm(vararg values: Int): List<jooq.generated.tables.pojos.OfficeFlights> = fetch(OfficeFlights.OFFICE_FLIGHTS.DISTANCE_KM, *values.toTypedArray())
}