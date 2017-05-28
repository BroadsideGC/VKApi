package VKApi.objects.media

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Created by bigz on 28.05.17.
 */
data class Sticker(@JsonProperty("id") val id: Int,
                   @JsonProperty("productId") val productId: Int,
                   @JsonProperty("photo_64") val photo64: String,
                   @JsonProperty("photo_128") val photo128: String,
                   @JsonProperty("photo_256") val photo256: String,
                   @JsonProperty("photo_352") val photo352: String,
                   @JsonProperty("width") val width: Int,
                   @JsonProperty("height") val height: Int) : Media