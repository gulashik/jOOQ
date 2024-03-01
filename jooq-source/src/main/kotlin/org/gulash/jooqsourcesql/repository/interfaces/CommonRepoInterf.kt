package org.gulash.jooqsourcesql.repository.interfaces

interface CommonRepoInterf <T> {
    fun findAll(): List<T>
}