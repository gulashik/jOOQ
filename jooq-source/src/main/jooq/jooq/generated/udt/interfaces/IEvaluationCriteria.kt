/*
 * This file is generated by jOOQ.
 */
package jooq.generated.udt.interfaces


import java.io.Serializable

import javax.annotation.processing.Generated


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
interface IEvaluationCriteria : Serializable {
    val communicationAbility: Int?
    val ethics: Int?
    val performance: Int?
    val employeeInput: Int?
}
