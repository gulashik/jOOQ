/*
 * This file is generated by jOOQ.
 */
package jooq.generated.enums


import javax.annotation.processing.Generated

import jooq.generated.Public

import org.jooq.Catalog
import org.jooq.EnumType
import org.jooq.Schema


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
enum class RateType(@get:JvmName("literal") public val literal: String) : EnumType {
    SILVER("SILVER"),
    GOLD("GOLD"),
    PLATINUM("PLATINUM");
    override fun getCatalog(): Catalog? = schema.catalog
    override fun getSchema(): Schema = Public.PUBLIC
    override fun getName(): String = "rate_type"
    override fun getLiteral(): String = literal
}