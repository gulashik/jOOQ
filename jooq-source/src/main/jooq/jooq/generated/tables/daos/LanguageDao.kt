/*
 * This file is generated by jOOQ.
 */
package jooq.generated.tables.daos


import javax.annotation.processing.Generated

import jooq.generated.tables.Language
import jooq.generated.tables.records.LanguageRecord

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
open class LanguageDao(configuration: Configuration?) : DAOImpl<LanguageRecord, jooq.generated.tables.pojos.Language, Int>(Language.LANGUAGE, jooq.generated.tables.pojos.Language::class.java, configuration) {

    /**
     * Create a new LanguageDao without any configuration
     */
    constructor(): this(null)

    override fun getId(o: jooq.generated.tables.pojos.Language): Int = o.id

    /**
     * Fetch records that have <code>id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    fun fetchRangeOfId(lowerInclusive: Int, upperInclusive: Int): List<jooq.generated.tables.pojos.Language> = fetchRange(Language.LANGUAGE.ID, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    fun fetchById(vararg values: Int): List<jooq.generated.tables.pojos.Language> = fetch(Language.LANGUAGE.ID, *values.toTypedArray())

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    fun fetchOneById(value: Int): jooq.generated.tables.pojos.Language? = fetchOne(Language.LANGUAGE.ID, value)

    /**
     * Fetch records that have <code>cd BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    fun fetchRangeOfCd(lowerInclusive: String, upperInclusive: String): List<jooq.generated.tables.pojos.Language> = fetchRange(Language.LANGUAGE.CD, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>cd IN (values)</code>
     */
    fun fetchByCd(vararg values: String): List<jooq.generated.tables.pojos.Language> = fetch(Language.LANGUAGE.CD, *values)

    /**
     * Fetch records that have <code>description BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    fun fetchRangeOfDescription(lowerInclusive: String?, upperInclusive: String?): List<jooq.generated.tables.pojos.Language> = fetchRange(Language.LANGUAGE.DESCRIPTION, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>description IN (values)</code>
     */
    fun fetchByDescription(vararg values: String): List<jooq.generated.tables.pojos.Language> = fetch(Language.LANGUAGE.DESCRIPTION, *values)
}