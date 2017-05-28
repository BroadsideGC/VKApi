package VKApi.objects.media

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Created by bigz on 22.05.17.
 */

data class Photo(
        @JsonProperty("id") val id: Int,
        @JsonProperty("album_id") val albumId: Int,
        @JsonProperty("owner_id") val ownerId: Int,
        @JsonProperty("user_id") val userId: Int,
        @JsonProperty("text") val text: String,
        @JsonProperty("date") val date: Int,
        @JsonProperty("sizes") val sizes: Sizes,
        @JsonProperty("photo_75") val photo75: String,
        @JsonProperty("photo_130") val photo130: String,
        @JsonProperty("photo_604") val photo604: String,
        @JsonProperty("photo_807") val photo807: String,
        @JsonProperty("photo_1280") val photo1280: String,
        @JsonProperty("photo_2560") val photo2560: String,
        @JsonProperty("width") val width: Int? = null,
        @JsonProperty("height") val height: Int? = null
) : Media