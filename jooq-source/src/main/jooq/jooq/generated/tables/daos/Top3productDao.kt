/*
 * This file is generated by jOOQ.
 */
package jooq.generated.tables.daos


import javax.annotation.processing.Generated

import jooq.generated.tables.Top3product
import jooq.generated.tables.records.Top3productRecord

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
open class Top3productDao(configuration: Configuration?) : DAOImpl<Top3productRecord, jooq.generated.tables.pojos.Top3product, Long>(Top3product.TOP3PRODUCT, jooq.generated.tables.pojos.Top3product::class.java, configuration) {

    /**
     * Create a new Top3productDao without any configuration
     */
    constructor(): this(null)

    override fun getId(o: jooq.generated.tables.pojos.Top3product): Long = o.productId

    /**
     * Fetch records that have <code>product_id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    fun fetchRangeOfProductId(lowerInclusive: Long, upperInclusive: Long): List<jooq.generated.tables.pojos.Top3product> = fetchRange(Top3product.TOP3PRODUCT.PRODUCT_ID, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>product_id IN (values)</code>
     */
    fun fetchByProductId(vararg values: Long): List<jooq.generated.tables.pojos.Top3product> = fetch(Top3product.TOP3PRODUCT.PRODUCT_ID, *values.toTypedArray())

    /**
     * Fetch a unique record that has <code>product_id = value</code>
     */
    fun fetchOneByProductId(value: Long): jooq.generated.tables.pojos.Top3product? = fetchOne(Top3product.TOP3PRODUCT.PRODUCT_ID, value)

    /**
     * Fetch records that have <code>product_name BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    fun fetchRangeOfProductName(lowerInclusive: String?, upperInclusive: String?): List<jooq.generated.tables.pojos.Top3product> = fetchRange(Top3product.TOP3PRODUCT.PRODUCT_NAME, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>product_name IN (values)</code>
     */
    fun fetchByProductName(vararg values: String): List<jooq.generated.tables.pojos.Top3product> = fetch(Top3product.TOP3PRODUCT.PRODUCT_NAME, *values)
}