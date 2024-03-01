/*
 * This file is generated by jOOQ.
 */
package jooq.generated.tables.daos


import javax.annotation.processing.Generated

import jooq.generated.tables.Productlinedetail
import jooq.generated.tables.records.ProductlinedetailRecord

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
open class ProductlinedetailDao(configuration: Configuration?) : DAOImpl<ProductlinedetailRecord, jooq.generated.tables.pojos.Productlinedetail, Record2<String?, Long?>>(Productlinedetail.PRODUCTLINEDETAIL, jooq.generated.tables.pojos.Productlinedetail::class.java, configuration) {

    /**
     * Create a new ProductlinedetailDao without any configuration
     */
    constructor(): this(null)

    override fun getId(o: jooq.generated.tables.pojos.Productlinedetail): Record2<String?, Long?> = compositeKeyRecord(o.productLine, o.code)

    /**
     * Fetch records that have <code>product_line BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    fun fetchRangeOfProductLine(lowerInclusive: String, upperInclusive: String): List<jooq.generated.tables.pojos.Productlinedetail> = fetchRange(Productlinedetail.PRODUCTLINEDETAIL.PRODUCT_LINE, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>product_line IN (values)</code>
     */
    fun fetchByProductLine(vararg values: String): List<jooq.generated.tables.pojos.Productlinedetail> = fetch(Productlinedetail.PRODUCTLINEDETAIL.PRODUCT_LINE, *values)

    /**
     * Fetch a unique record that has <code>product_line = value</code>
     */
    fun fetchOneByProductLine(value: String): jooq.generated.tables.pojos.Productlinedetail? = fetchOne(Productlinedetail.PRODUCTLINEDETAIL.PRODUCT_LINE, value)

    /**
     * Fetch records that have <code>code BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    fun fetchRangeOfCode(lowerInclusive: Long, upperInclusive: Long): List<jooq.generated.tables.pojos.Productlinedetail> = fetchRange(Productlinedetail.PRODUCTLINEDETAIL.CODE, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>code IN (values)</code>
     */
    fun fetchByCode(vararg values: Long): List<jooq.generated.tables.pojos.Productlinedetail> = fetch(Productlinedetail.PRODUCTLINEDETAIL.CODE, *values.toTypedArray())

    /**
     * Fetch records that have <code>line_capacity BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    fun fetchRangeOfLineCapacity(lowerInclusive: String, upperInclusive: String): List<jooq.generated.tables.pojos.Productlinedetail> = fetchRange(Productlinedetail.PRODUCTLINEDETAIL.LINE_CAPACITY, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>line_capacity IN (values)</code>
     */
    fun fetchByLineCapacity(vararg values: String): List<jooq.generated.tables.pojos.Productlinedetail> = fetch(Productlinedetail.PRODUCTLINEDETAIL.LINE_CAPACITY, *values)

    /**
     * Fetch records that have <code>line_type BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    fun fetchRangeOfLineType(lowerInclusive: Int?, upperInclusive: Int?): List<jooq.generated.tables.pojos.Productlinedetail> = fetchRange(Productlinedetail.PRODUCTLINEDETAIL.LINE_TYPE, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>line_type IN (values)</code>
     */
    fun fetchByLineType(vararg values: Int): List<jooq.generated.tables.pojos.Productlinedetail> = fetch(Productlinedetail.PRODUCTLINEDETAIL.LINE_TYPE, *values.toTypedArray())
}