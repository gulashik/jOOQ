package org.gulash.jooqbook.entity

import java.io.Serializable

data class Office(val officecode: String?,
                  val city: String?,
                  val phone: String?,
                  val addressLineFirst: String?,
                  val addressLineSecond: String?,
                  val state: String?,
                  val country: String?,
                  val postalCode: String?,
                  val territory: String?): Serializable