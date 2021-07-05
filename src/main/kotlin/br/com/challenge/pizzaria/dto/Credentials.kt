package br.com.challenge.pizzaria.dto

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.module.kotlin.readValue

data class Credentials(
    @get:JsonProperty(required = true) @field:JsonProperty(required = true)
    val accessToken: String,

    @get:JsonProperty(required = true) @field:JsonProperty(required = true)
    val tokenType: String
) {
    fun toJson() = mapper.writeValueAsString(this)

    companion object {
        fun fromJson(json: String) = mapper.readValue<Credentials>(json)
    }
}
