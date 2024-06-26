/*
 * This file is generated by jOOQ.
 */
package jooq.generated.tables.records


import javax.annotation.processing.Generated

import jooq.generated.tables.Skeys
import jooq.generated.tables.interfaces.ISkeys

import org.jooq.impl.TableRecordImpl


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
open class SkeysRecord private constructor() : TableRecordImpl<SkeysRecord>(Skeys.SKEYS), ISkeys {

    open override var skeys: String?
        set(value): Unit = set(0, value)
        get(): String? = get(0) as String?

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    fun from(from: ISkeys) {
        this.skeys = from.skeys
        resetChangedOnNotNull()
    }

    /**
     * Create a detached, initialised SkeysRecord
     */
    constructor(skeys: String? = null): this() {
        this.skeys = skeys
        resetChangedOnNotNull()
    }

    /**
     * Create a detached, initialised SkeysRecord
     */
    constructor(value: jooq.generated.tables.pojos.Skeys?): this() {
        if (value != null) {
            this.skeys = value.skeys
            resetChangedOnNotNull()
        }
    }
}
