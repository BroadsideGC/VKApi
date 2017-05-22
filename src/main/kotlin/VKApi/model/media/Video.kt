package VKApi.model.media

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Created by bigz on 22.05.17.
 */

data class Video(
        @JsonProperty("id") val id: Int,
        @JsonProperty("owner_id") val ownerId: Int,
        @JsonProperty("title") val title: String,
        @JsonProperty("description") val description: String,
        @JsonProperty("duration") val duration: Int,
        @JsonProperty("photo_320") val photo320: String,
        @JsonProperty("photo_130") val photo130: String,
        @JsonProperty("photo_640") val photo640: String,
        @JsonProperty("photo_800") val photo8070: String,
        @JsonProperty("date") val date: Int,
        @JsonProperty("adding_date") val addingDate: Int,
        @JsonProperty("views") val views: Int,
        @JsonProperty("comments") val comments: Int,
        @JsonProperty("player") val player: String,
        @JsonProperty("access_key") val accessKey: String,
        @JsonProperty("processing") val processing: Boolean = false,
        @JsonProperty("live") val live: Boolean = false
) : Media