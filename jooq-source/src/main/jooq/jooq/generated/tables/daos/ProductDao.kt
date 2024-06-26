/*
 * This file is generated by jOOQ.
 */
package jooq.generated.tables.daos


import java.math.BigDecimal

import javax.annotation.processing.Generated

import jooq.generated.tables.Product
import jooq.generated.tables.records.ProductRecord

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
open class ProductDao(configuration: Configuration?) : DAOImpl<ProductRecord, jooq.generated.tables.pojos.Product, Long>(Product.PRODUCT, jooq.generated.tables.pojos.Product::class.java, configuration) {

    /**
     * Create a new ProductDao without any configuration
     */
    constructor(): this(null)

    override fun getId(o: jooq.generated.tables.pojos.Product): Long? = o.productId

    /**
     * Fetch records that have <code>product_id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    fun fetchRangeOfProductId(lowerInclusive: Long?, upperInclusive: Long?): List<jooq.generated.tables.pojos.Product> = fetchRange(Product.PRODUCT.PRODUCT_ID, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>product_id IN (values)</code>
     */
    fun fetchByProductId(vararg values: Long): List<jooq.generated.tables.pojos.Product> = fetch(Product.PRODUCT.PRODUCT_ID, *values.toTypedArray())

    /**
     * Fetch a unique record that has <code>product_id = value</code>
     */
    fun fetchOneByProductId(value: Long): jooq.generated.tables.pojos.Product? = fetchOne(Product.PRODUCT.PRODUCT_ID, value)

    /**
     * Fetch records that have <code>product_name BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    fun fetchRangeOfProductName(lowerInclusive: String?, upperInclusive: String?): List<jooq.generated.tables.pojos.Product> = fetchRange(Product.PRODUCT.PRODUCT_NAME, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>product_name IN (values)</code>
     */
    fun fetchByProductName(vararg values: String): List<jooq.generated.tables.pojos.Product> = fetch(Product.PRODUCT.PRODUCT_NAME, *values)

    /**
     * Fetch records that have <code>product_line BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    fun fetchRangeOfProductLine(lowerInclusive: String?, upperInclusive: String?): List<jooq.generated.tables.pojos.Product> = fetchRange(Product.PRODUCT.PRODUCT_LINE, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>product_line IN (values)</code>
     */
    fun fetchByProductLine(vararg values: String): List<jooq.generated.tables.pojos.Product> = fetch(Product.PRODUCT.PRODUCT_LINE, *values)

    /**
     * Fetch records that have <code>code BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    fun fetchRangeOfCode(lowerInclusive: Long, upperInclusive: Long): List<jooq.generated.tables.pojos.Product> = fetchRange(Product.PRODUCT.CODE, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>code IN (values)</code>
     */
    fun fetchByCode(vararg values: Long): List<jooq.generated.tables.pojos.Product> = fetch(Product.PRODUCT.CODE, *values.toTypedArray())

    /**
     * Fetch records that have <code>product_scale BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    fun fetchRangeOfProductScale(lowerInclusive: String?, upperInclusive: String?): List<jooq.generated.tables.pojos.Product> = fetchRange(Product.PRODUCT.PRODUCT_SCALE, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>product_scale IN (values)</code>
     */
    fun fetchByProductScale(vararg values: String): List<jooq.generated.tables.pojos.Product> = fetch(Product.PRODUCT.PRODUCT_SCALE, *values)

    /**
     * Fetch records that have <code>product_vendor BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    fun fetchRangeOfProductVendor(lowerInclusive: String?, upperInclusive: String?): List<jooq.generated.tables.pojos.Product> = fetchRange(Product.PRODUCT.PRODUCT_VENDOR, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>product_vendor IN (values)</code>
     */
    fun fetchByProductVendor(vararg values: String): List<jooq.generated.tables.pojos.Product> = fetch(Product.PRODUCT.PRODUCT_VENDOR, *values)

    /**
     * Fetch records that have <code>product_description BETWEEN lowerInclusive
     * AND upperInclusive</code>
     */
    fun fetchRangeOfProductDescription(lowerInclusive: String?, upperInclusive: String?): List<jooq.generated.tables.pojos.Product> = fetchRange(Product.PRODUCT.PRODUCT_DESCRIPTION, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>product_description IN (values)</code>
     */
    fun fetchByProductDescription(vararg values: String): List<jooq.generated.tables.pojos.Product> = fetch(Product.PRODUCT.PRODUCT_DESCRIPTION, *values)

    /**
     * Fetch records that have <code>quantity_in_stock BETWEEN lowerInclusive
     * AND upperInclusive</code>
     */
    fun fetchRangeOfQuantityInStock(lowerInclusive: Int?, upperInclusive: Int?): List<jooq.generated.tables.pojos.Product> = fetchRange(Product.PRODUCT.QUANTITY_IN_STOCK, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>quantity_in_stock IN (values)</code>
     */
    fun fetchByQuantityInStock(vararg values: Int): List<jooq.generated.tables.pojos.Product> = fetch(Product.PRODUCT.QUANTITY_IN_STOCK, *values.toTypedArray())

    /**
     * Fetch records that have <code>buy_price BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    fun fetchRangeOfBuyPrice(lowerInclusive: BigDecimal?, upperInclusive: BigDecimal?): List<jooq.generated.tables.pojos.Product> = fetchRange(Product.PRODUCT.BUY_PRICE, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>buy_price IN (values)</code>
     */
    fun fetchByBuyPrice(vararg values: BigDecimal): List<jooq.generated.tables.pojos.Product> = fetch(Product.PRODUCT.BUY_PRICE, *values)

    /**
     * Fetch records that have <code>msrp BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    fun fetchRangeOfMsrp(lowerInclusive: BigDecimal?, upperInclusive: BigDecimal?): List<jooq.generated.tables.pojos.Product> = fetchRange(Product.PRODUCT.MSRP, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>msrp IN (values)</code>
     */
    fun fetchByMsrp(vararg values: BigDecimal): List<jooq.generated.tables.pojos.Product> = fetch(Product.PRODUCT.MSRP, *values)
    @Deprecated(message = "Unknown data type. If this is a qualified, user-defined type, it may have been excluded from code generation. If this is a built-in type, you can define an explicit org.jooq.Binding to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.")
    fun fetchRangeOfSpecs(lowerInclusive: Any?, upperInclusive: Any?): List<jooq.generated.tables.pojos.Product> = fetchRange(Product.PRODUCT.SPECS, lowerInclusive, upperInclusive)
    @Deprecated(message = "Unknown data type. If this is a qualified, user-defined type, it may have been excluded from code generation. If this is a built-in type, you can define an explicit org.jooq.Binding to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.")
    fun fetchBySpecs(vararg values: Any): List<jooq.generated.tables.pojos.Product> = fetch(Product.PRODUCT.SPECS, *values)

    /**
     * Fetch records that have <code>product_uid BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    fun fetchRangeOfProductUid(lowerInclusive: Long?, upperInclusive: Long?): List<jooq.generated.tables.pojos.Product> = fetchRange(Product.PRODUCT.PRODUCT_UID, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>product_uid IN (values)</code>
     */
    fun fetchByProductUid(vararg values: Long): List<jooq.generated.tables.pojos.Product> = fetch(Product.PRODUCT.PRODUCT_UID, *values.toTypedArray())
}
