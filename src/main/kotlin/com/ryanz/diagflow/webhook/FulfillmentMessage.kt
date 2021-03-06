package com.ryanz.diagflow.webhook

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import org.apache.commons.lang3.builder.EqualsBuilder
import org.apache.commons.lang3.builder.HashCodeBuilder
import org.apache.commons.lang3.builder.ToStringBuilder

// https://dialogflow.com/docs/reference/api-v2/rest/v2beta1/projects.agent.intents#Message
@JsonIgnoreProperties(ignoreUnknown = true)
class FulfillmentMessage() {

        constructor(platform: FulfillmentIntentPlatform, text: FulfillmentText?, image: FulfillmentImage?, quickReplies: FulfillmentQuickReply?, card: FulfillmentCard?, payload: Map<String, Any>?, simpleResponses: FulfillmentSimpleResponses?, basicCard: FulfillmentBasicCard?, suggestions: FulfillmentSuggestions?, linkOutSuggestion: FulfillmentLinkOutSuggestion?, listSelect: FulfillmentListSelect?, carouselSelect: FulfillmentCarouselSelect?): this() {
                this.platform = platform
                this.text = text
                this.image = image
                this.quickReplies = quickReplies
                this.card = card
                this.payload = payload
                this.simpleResponses = simpleResponses
                this.basicCard = basicCard
                this.suggestions = suggestions
                this.linkOutSuggestion = linkOutSuggestion
                this.listSelect = listSelect
                this.carouselSelect = carouselSelect
        }

        @JsonProperty("platform")
        var platform: FulfillmentIntentPlatform = FulfillmentIntentPlatform.PLATFORM_UNSPECIFIED
        @JsonProperty("text")
        var text: FulfillmentText? = FulfillmentText()
        @JsonProperty("image")
        var image: FulfillmentImage? = FulfillmentImage()
        @JsonProperty("quickReplies")
        var quickReplies: FulfillmentQuickReply? = FulfillmentQuickReply()
        @JsonProperty("card")
        var card: FulfillmentCard? = FulfillmentCard()
        @JsonProperty("payload")
        var payload: Map<String, Any>? = mapOf()
        @JsonProperty("simpleResponses")
        var simpleResponses: FulfillmentSimpleResponses? = FulfillmentSimpleResponses()
        @JsonProperty("basicCard")
        var basicCard: FulfillmentBasicCard? = FulfillmentBasicCard()
        @JsonProperty("suggestions")
        var suggestions: FulfillmentSuggestions? = FulfillmentSuggestions()
        @JsonProperty("linkOutSuggestion")
        var linkOutSuggestion: FulfillmentLinkOutSuggestion? = FulfillmentLinkOutSuggestion()
        @JsonProperty("listSelect")
        var listSelect: FulfillmentListSelect? = FulfillmentListSelect()

        @JsonProperty("carouselSelect")
        var carouselSelect: FulfillmentCarouselSelect? = FulfillmentCarouselSelect()

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