package VKApi.objects

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Created by bigz on 28.05.17.
 */
data class Price(@JsonProperty("amount") val amount: Int,
                 @JsonProperty("currency") val currency: Currency,
                 @JsonProperty("text") val text: String) {
}