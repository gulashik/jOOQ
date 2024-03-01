/*
 * This file is generated by jOOQ.
 */
package jooq.generated.tables.daos


import java.math.BigDecimal
import java.time.LocalDateTime

import javax.annotation.processing.Generated

import jooq.generated.tables.BankTransaction
import jooq.generated.tables.records.BankTransactionRecord

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
open class BankTransactionDao(configuration: Configuration?) : DAOImpl<BankTransactionRecord, jooq.generated.tables.pojos.BankTransaction, Int>(BankTransaction.BANK_TRANSACTION, jooq.generated.tables.pojos.BankTransaction::class.java, configuration) {

    /**
     * Create a new BankTransactionDao without any configuration
     */
    constructor(): this(null)

    override fun getId(o: jooq.generated.tables.pojos.BankTransaction): Int? = o.transactionId

    /**
     * Fetch records that have <code>transaction_id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    fun fetchRangeOfTransactionId(lowerInclusive: Int?, upperInclusive: Int?): List<jooq.generated.tables.pojos.BankTransaction> = fetchRange(BankTransaction.BANK_TRANSACTION.TRANSACTION_ID, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>transaction_id IN (values)</code>
     */
    fun fetchByTransactionId(vararg values: Int): List<jooq.generated.tables.pojos.BankTransaction> = fetch(BankTransaction.BANK_TRANSACTION.TRANSACTION_ID, *values.toTypedArray())

    /**
     * Fetch a unique record that has <code>transaction_id = value</code>
     */
    fun fetchOneByTransactionId(value: Int): jooq.generated.tables.pojos.BankTransaction? = fetchOne(BankTransaction.BANK_TRANSACTION.TRANSACTION_ID, value)

    /**
     * Fetch records that have <code>bank_name BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    fun fetchRangeOfBankName(lowerInclusive: String, upperInclusive: String): List<jooq.generated.tables.pojos.BankTransaction> = fetchRange(BankTransaction.BANK_TRANSACTION.BANK_NAME, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>bank_name IN (values)</code>
     */
    fun fetchByBankName(vararg values: String): List<jooq.generated.tables.pojos.BankTransaction> = fetch(BankTransaction.BANK_TRANSACTION.BANK_NAME, *values)

    /**
     * Fetch records that have <code>bank_iban BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    fun fetchRangeOfBankIban(lowerInclusive: String, upperInclusive: String): List<jooq.generated.tables.pojos.BankTransaction> = fetchRange(BankTransaction.BANK_TRANSACTION.BANK_IBAN, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>bank_iban IN (values)</code>
     */
    fun fetchByBankIban(vararg values: String): List<jooq.generated.tables.pojos.BankTransaction> = fetch(BankTransaction.BANK_TRANSACTION.BANK_IBAN, *values)

    /**
     * Fetch records that have <code>transfer_amount BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    fun fetchRangeOfTransferAmount(lowerInclusive: BigDecimal, upperInclusive: BigDecimal): List<jooq.generated.tables.pojos.BankTransaction> = fetchRange(BankTransaction.BANK_TRANSACTION.TRANSFER_AMOUNT, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>transfer_amount IN (values)</code>
     */
    fun fetchByTransferAmount(vararg values: BigDecimal): List<jooq.generated.tables.pojos.BankTransaction> = fetch(BankTransaction.BANK_TRANSACTION.TRANSFER_AMOUNT, *values)

    /**
     * Fetch records that have <code>caching_date BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    fun fetchRangeOfCachingDate(lowerInclusive: LocalDateTime?, upperInclusive: LocalDateTime?): List<jooq.generated.tables.pojos.BankTransaction> = fetchRange(BankTransaction.BANK_TRANSACTION.CACHING_DATE, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>caching_date IN (values)</code>
     */
    fun fetchByCachingDate(vararg values: LocalDateTime): List<jooq.generated.tables.pojos.BankTransaction> = fetch(BankTransaction.BANK_TRANSACTION.CACHING_DATE, *values)

    /**
     * Fetch records that have <code>customer_number BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    fun fetchRangeOfCustomerNumber(lowerInclusive: Long, upperInclusive: Long): List<jooq.generated.tables.pojos.BankTransaction> = fetchRange(BankTransaction.BANK_TRANSACTION.CUSTOMER_NUMBER, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>customer_number IN (values)</code>
     */
    fun fetchByCustomerNumber(vararg values: Long): List<jooq.generated.tables.pojos.BankTransaction> = fetch(BankTransaction.BANK_TRANSACTION.CUSTOMER_NUMBER, *values.toTypedArray())

    /**
     * Fetch records that have <code>check_number BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    fun fetchRangeOfCheckNumber(lowerInclusive: String, upperInclusive: String): List<jooq.generated.tables.pojos.BankTransaction> = fetchRange(BankTransaction.BANK_TRANSACTION.CHECK_NUMBER, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>check_number IN (values)</code>
     */
    fun fetchByCheckNumber(vararg values: String): List<jooq.generated.tables.pojos.BankTransaction> = fetch(BankTransaction.BANK_TRANSACTION.CHECK_NUMBER, *values)

    /**
     * Fetch records that have <code>card_type BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    fun fetchRangeOfCardType(lowerInclusive: String, upperInclusive: String): List<jooq.generated.tables.pojos.BankTransaction> = fetchRange(BankTransaction.BANK_TRANSACTION.CARD_TYPE, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>card_type IN (values)</code>
     */
    fun fetchByCardType(vararg values: String): List<jooq.generated.tables.pojos.BankTransaction> = fetch(BankTransaction.BANK_TRANSACTION.CARD_TYPE, *values)

    /**
     * Fetch records that have <code>status BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    fun fetchRangeOfStatus(lowerInclusive: String?, upperInclusive: String?): List<jooq.generated.tables.pojos.BankTransaction> = fetchRange(BankTransaction.BANK_TRANSACTION.STATUS, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>status IN (values)</code>
     */
    fun fetchByStatus(vararg values: String): List<jooq.generated.tables.pojos.BankTransaction> = fetch(BankTransaction.BANK_TRANSACTION.STATUS, *values)
}
