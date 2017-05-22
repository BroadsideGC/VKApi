package VKApi.model.media

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Created by bigz on 22.05.17.
 */
data class Note(@JsonProperty("id") val id: Int,
                @JsonProperty("owner_id") val ownerId: Int,
                @JsonProperty("title") val title: String,
                @JsonProperty("text") val text: String,
                @JsonProperty("date") val date: Int,
                @JsonProperty("comments") val comments: Int,
                @JsonProperty("read_comments") val readComments: Int? = null,
                @JsonProperty("view_url") val view_url: String) : Media