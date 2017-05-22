package VKApi.model.media

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Created by bigz on 22.05.17.
 */


data class Poll(@JsonProperty("id") val id: Int,
                @JsonProperty("owner_id") val ownerId: Int,
                @JsonProperty("created") val created: Int,
                @JsonProperty("question") val question: String,
                @JsonProperty("votes") val votes: Int,
                @JsonProperty("answer_id") val answerId: Int,
                @JsonProperty("answers") val answers: List<Answer>,
                @JsonProperty("anonymous") val anonymous: Boolean) : Media {
    data class Answer(@JsonProperty("id") val id: Int,
                      @JsonProperty("text") val text: String,
                      @JsonProperty("votes") val votes: Int,
                      @JsonProperty("rate") val rate: Double)
}