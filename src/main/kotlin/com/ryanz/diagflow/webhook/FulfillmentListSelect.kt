package com.ryanz.diagflow.webhook

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import org.apache.commons.lang3.builder.EqualsBuilder
import org.apache.commons.lang3.builder.HashCodeBuilder
import org.apache.commons.lang3.builder.ToStringBuilder

// https://dialogflow.com/docs/reference/api-v2/rest/v2beta1/projects.agent.intents#ListSelect
@JsonIgnoreProperties(ignoreUnknown = true)
class FulfillmentListSelect() {

        constructor(title: String?, items: List<FulfillmentItem>?): this() {
                this.title = title
                this.items = items
        }

        @JsonProperty("title")
        var title: String? = ""

        @JsonProperty("items")
        var items: List<FulfillmentItem>? = mutableListOf()

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