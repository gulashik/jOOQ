/*
 * This file is generated by jOOQ.
 */
package jooq.generated.udt.records


import javax.annotation.processing.Generated

import jooq.generated.udt.EvaluationCriteria
import jooq.generated.udt.interfaces.IEvaluationCriteria

import org.jooq.impl.UDTRecordImpl


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
open class EvaluationCriteriaRecord private constructor() : UDTRecordImpl<EvaluationCriteriaRecord>(EvaluationCriteria.EVALUATION_CRITERIA), IEvaluationCriteria {

    open override var communicationAbility: Int?
        set(value): Unit = set(0, value)
        get(): Int? = get(0) as Int?

    open override var ethics: Int?
        set(value): Unit = set(1, value)
        get(): Int? = get(1) as Int?

    open override var performance: Int?
        set(value): Unit = set(2, value)
        get(): Int? = get(2) as Int?

    open override var employeeInput: Int?
        set(value): Unit = set(3, value)
        get(): Int? = get(3) as Int?

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    fun from(from: IEvaluationCriteria) {
        this.communicationAbility = from.communicationAbility
        this.ethics = from.ethics
        this.performance = from.performance
        this.employeeInput = from.employeeInput
        resetChangedOnNotNull()
    }

    /**
     * Create a detached, initialised EvaluationCriteriaRecord
     */
    constructor(communicationAbility: Int? = null, ethics: Int? = null, performance: Int? = null, employeeInput: Int? = null): this() {
        this.communicationAbility = communicationAbility
        this.ethics = ethics
        this.performance = performance
        this.employeeInput = employeeInput
        resetChangedOnNotNull()
    }

    /**
     * Create a detached, initialised EvaluationCriteriaRecord
     */
    constructor(value: jooq.generated.udt.pojos.EvaluationCriteria?): this() {
        if (value != null) {
            this.communicationAbility = value.communicationAbility
            this.ethics = value.ethics
            this.performance = value.performance
            this.employeeInput = value.employeeInput
            resetChangedOnNotNull()
        }
    }
}