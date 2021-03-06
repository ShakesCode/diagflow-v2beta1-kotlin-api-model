package com.ryanz.diagflow.webhook

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import org.apache.commons.lang3.builder.EqualsBuilder
import org.apache.commons.lang3.builder.HashCodeBuilder
import org.apache.commons.lang3.builder.ToStringBuilder

// https://dialogflow.com/docs/reference/api-v2/rest/v2beta1/projects.agent.intents#Suggestions
@JsonIgnoreProperties(ignoreUnknown = true)
class FulfillmentSuggestions() {

    constructor(suggestions: List<FulfillmentSuggestion>?): this() {
        this.suggestions = suggestions
    }

    @JsonProperty("suggestions")
    var suggestions: List<FulfillmentSuggestion>? = mutableListOf()

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
// https://dialogflow.com/docs/reference/api-v2/rest/v2beta1/projects.agent.intents#Suggestion
@JsonIgnoreProperties(ignoreUnknown = true)
class FulfillmentSuggestion() {


    constructor(title: String?): this() {
        this.title = title
    }

    @JsonProperty("title")
    var title: String? = ""

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