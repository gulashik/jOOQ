package org.gulash.jooqbook.repo

import org.gulash.jooqbook.entity.Office
import org.jooq.DSLContext
import org.jooq.impl.DSL
import org.springframework.stereotype.Repository

@Repository
class TypeUnsaveRepository(private val ctx: DSLContext ) {

    /* Using jOOQ DSL to build and execute SQL */
    fun findOfficesInTerritory(territory: String): MutableList<Office> {

        return ctx.selectFrom(DSL.table("office"))
            .where(DSL.field("territory").eq(territory))
            .fetchInto(Office::class.java)
    }
}