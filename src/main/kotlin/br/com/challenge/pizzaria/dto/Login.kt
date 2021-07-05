package br.com.challenge.pizzaria.dto

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.PropertyNamingStrategies
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper

val mapper = jacksonObjectMapper().apply {
    propertyNamingStrategy = PropertyNamingStrategies.LOWER_CAMEL_CASE
    setSerializationInclusion(JsonInclude.Include.NON_NULL)
}

data class Login(
    @get:JsonProperty(required = true) @field:JsonProperty(required = true)
    val email: String,

    @get:JsonProperty(required = true) @field:JsonProperty(required = true)
    val password: String
)
