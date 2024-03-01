package org.gulash.jooqobjectsql

import jooq.generated.tables.records.OfficeRecord
import jooq.generated.tables.references.OFFICE
import org.jooq.DSLContext
import org.springframework.stereotype.Repository

@Repository
class SafeRepositoryCls(
    // DSL Context
    private val ctx: DSLContext
) {
    fun findOfficesInTerritory(territory: String): MutableList<OfficeRecord>  {
        return ctx.selectFrom(OFFICE)
            .where(OFFICE.TERRITORY.eq(territory))
            .fetchInto(OfficeRecord::class.java)
    }
}