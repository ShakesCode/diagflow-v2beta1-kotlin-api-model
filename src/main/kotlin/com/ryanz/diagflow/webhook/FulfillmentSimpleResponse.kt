package com.ryanz.diagflow.webhook

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import org.apache.commons.lang3.builder.EqualsBuilder
import org.apache.commons.lang3.builder.HashCodeBuilder
import org.apache.commons.lang3.builder.ToStringBuilder

// https://dialogflow.com/docs/reference/api-v2/rest/v2beta1/projects.agent.intents#SimpleResponse
@JsonIgnoreProperties(ignoreUnknown = true)
class FulfillmentSimpleResponse() {

        constructor(textToSpeech: String?, ssml: String?, displayText: String?): this() {
                this.textToSpeech = textToSpeech
                this.ssml = ssml
                this.displayText = displayText
        }

        @JsonProperty("textToSpeech")
        var textToSpeech: String? = ""
        @JsonProperty("ssml")
        var ssml: String? = ""

        @JsonProperty("displayText")
        var displayText: String? = ""

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
// https://dialogflow.com/docs/reference/api-v2/rest/v2beta1/projects.agent.intents#SimpleResponses
@JsonIgnoreProperties(ignoreUnknown = true)
class FulfillmentSimpleResponses() {

        constructor(simpleResponses: List<FulfillmentSimpleResponse>?): this() {
                this.simpleResponses = simpleResponses
        }

        @JsonProperty("simpleResponses")
        var simpleResponses: List<FulfillmentSimpleResponse>? = mutableListOf()

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