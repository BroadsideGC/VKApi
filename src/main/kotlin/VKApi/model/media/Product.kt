package VKApi.model.media

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Created by bigz on 22.05.17.
 */
data class Product(@JsonProperty("price") val price: Price) {
    data class Price(@JsonProperty("amount") val amount: Int,
                     @JsonProperty("currency") val currency: Currency,
                     @JsonProperty("text") val text: String) {
        data class Currency(@JsonProperty("id") val id: Int,
                            @JsonProperty("name") val name: String)
    }
}