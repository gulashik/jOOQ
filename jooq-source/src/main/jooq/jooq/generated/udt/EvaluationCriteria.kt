/*
 * This file is generated by jOOQ.
 */
package jooq.generated.udt


import javax.annotation.processing.Generated

import jooq.generated.Public
import jooq.generated.udt.records.EvaluationCriteriaRecord

import org.jooq.Schema
import org.jooq.UDTField
import org.jooq.impl.DSL
import org.jooq.impl.SQLDataType
import org.jooq.impl.UDTImpl


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
open class EvaluationCriteria : UDTImpl<EvaluationCriteriaRecord>("evaluation_criteria", null, null, false) {

    public companion object {

        /**
         * The reference instance of <code>public.evaluation_criteria</code>
         */
        public val EVALUATION_CRITERIA: EvaluationCriteria = EvaluationCriteria()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<EvaluationCriteriaRecord> = EvaluationCriteriaRecord::class.java

    /**
     * The attribute
     * <code>public.evaluation_criteria.communication_ability</code>.
     */
    val COMMUNICATION_ABILITY: UDTField<EvaluationCriteriaRecord, Int> = UDTImpl.createField(DSL.name("communication_ability"), SQLDataType.INTEGER, this, "")

    /**
     * The attribute <code>public.evaluation_criteria.ethics</code>.
     */
    val ETHICS: UDTField<EvaluationCriteriaRecord, Int> = UDTImpl.createField(DSL.name("ethics"), SQLDataType.INTEGER, this, "")

    /**
     * The attribute <code>public.evaluation_criteria.performance</code>.
     */
    val PERFORMANCE: UDTField<EvaluationCriteriaRecord, Int> = UDTImpl.createField(DSL.name("performance"), SQLDataType.INTEGER, this, "")

    /**
     * The attribute <code>public.evaluation_criteria.employee_input</code>.
     */
    val EMPLOYEE_INPUT: UDTField<EvaluationCriteriaRecord, Int> = UDTImpl.createField(DSL.name("employee_input"), SQLDataType.INTEGER, this, "")

     override fun getSchema(): Schema = Public.PUBLIC
}
