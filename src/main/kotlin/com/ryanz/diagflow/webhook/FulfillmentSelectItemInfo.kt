package com.ryanz.diagflow.webhook

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import org.apache.commons.lang3.builder.EqualsBuilder
import org.apache.commons.lang3.builder.HashCodeBuilder
import org.apache.commons.lang3.builder.ToStringBuilder

// https://dialogflow.com/docs/reference/api-v2/rest/v2beta1/projects.agent.intents#Text
@JsonIgnoreProperties(ignoreUnknown = true)
class FulfillmentSelectItemInfo() {

        constructor(key: String?, synonyms: List<String>?): this() {
                this.key = key
                this.synonyms = synonyms
        }

        @JsonProperty("key")
        var key: String? = ""

        @JsonProperty("synonyms")
        var synonyms: List<String>? = mutableListOf()

        override fun equals(other: Any?): Boolean {
                return EqualsBuilder.reflectionEquals(this, other)
        }

        override fun hashCode(): Int {
                return HashCodeBuilder.reflectionHashCode(this)
        }

        override fun toString(): String {
                return ToStringBuilder.reflectionToString(this)
        }
}