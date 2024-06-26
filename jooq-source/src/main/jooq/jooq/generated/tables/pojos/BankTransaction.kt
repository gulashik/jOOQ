/*
 * This file is generated by jOOQ.
 */
package jooq.generated.tables.pojos


import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size

import java.math.BigDecimal
import java.time.LocalDateTime

import javax.annotation.processing.Generated

import jooq.generated.tables.interfaces.IBankTransaction


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
data class BankTransaction(
    override var transactionId: Int? = null,
    @get:NotNull
    @get:Size(max = 50)
    override var bankName: String,
    @get:NotNull
    @get:Size(max = 50)
    override var bankIban: String,
    @get:NotNull
    override var transferAmount: BigDecimal,
    override var cachingDate: LocalDateTime? = null,
    @get:NotNull
    override var customerNumber: Long,
    @get:NotNull
    @get:Size(max = 50)
    override var checkNumber: String,
    @get:NotNull
    @get:Size(max = 50)
    override var cardType: String,
    @get:Size(max = 50)
    override var status: String? = null
): IBankTransaction {


    override fun equals(other: Any?): Boolean {
        if (this === other)
            return true
        if (other == null)
            return false
        if (this::class != other::class)
            return false
        val o: BankTransaction = other as BankTransaction
        if (this.transactionId == null) {
            if (o.transactionId != null)
                return false
        }
        else if (this.transactionId != o.transactionId)
            return false
        if (this.bankName != o.bankName)
            return false
        if (this.bankIban != o.bankIban)
            return false
        if (this.transferAmount != o.transferAmount)
            return false
        if (this.cachingDate == null) {
            if (o.cachingDate != null)
                return false
        }
        else if (this.cachingDate != o.cachingDate)
            return false
        if (this.customerNumber != o.customerNumber)
            return false
        if (this.checkNumber != o.checkNumber)
            return false
        if (this.cardType != o.cardType)
            return false
        if (this.status == null) {
            if (o.status != null)
                return false
        }
        else if (this.status != o.status)
            return false
        return true
    }

    override fun hashCode(): Int {
        val prime = 31
        var result = 1
        result = prime * result + (if (this.transactionId == null) 0 else this.transactionId.hashCode())
        result = prime * result + this.bankName.hashCode()
        result = prime * result + this.bankIban.hashCode()
        result = prime * result + this.transferAmount.hashCode()
        result = prime * result + (if (this.cachingDate == null) 0 else this.cachingDate.hashCode())
        result = prime * result + this.customerNumber.hashCode()
        result = prime * result + this.checkNumber.hashCode()
        result = prime * result + this.cardType.hashCode()
        result = prime * result + (if (this.status == null) 0 else this.status.hashCode())
        return result
    }

    override fun toString(): String {
        val sb = StringBuilder("BankTransaction (")

        sb.append(transactionId)
        sb.append(", ").append(bankName)
        sb.append(", ").append(bankIban)
        sb.append(", ").append(transferAmount)
        sb.append(", ").append(cachingDate)
        sb.append(", ").append(customerNumber)
        sb.append(", ").append(checkNumber)
        sb.append(", ").append(cardType)
        sb.append(", ").append(status)

        sb.append(")")
        return sb.toString()
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    fun from(from: IBankTransaction) {
        this.transactionId = from.transactionId
        this.bankName = from.bankName
        this.bankIban = from.bankIban
        this.transferAmount = from.transferAmount
        this.cachingDate = from.cachingDate
        this.customerNumber = from.customerNumber
        this.checkNumber = from.checkNumber
        this.cardType = from.cardType
        this.status = from.status
    }
}
