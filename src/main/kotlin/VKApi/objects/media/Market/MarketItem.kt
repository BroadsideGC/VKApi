package VKApi.objects.media.Market

import VKApi.objects.Likes
import VKApi.objects.Price
import VKApi.objects.media.Media
import VKApi.objects.media.Photo
import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Created by bigz on 28.05.17.
 */


data class MarketItem(@JsonProperty("id") val id: Int,
                      @JsonProperty("owner_id") val ownerId: Int,
                      @JsonProperty("title") val title: String,
                      @JsonProperty("description") val description: String,
                      @JsonProperty("price") val price: Price,
                      @JsonProperty("thumb_photo") val thumbPhoto: String,
                      @JsonProperty("date") val date: Int,
                      @JsonProperty("availbility") val availability: Int,
                      @JsonProperty("photos") val photos: List<Photo>? = null,
                      @JsonProperty("can_comment") val canComment: Boolean? = null,
                      @JsonProperty("can_repost") val canRepost: Boolean? = null,
                      @JsonProperty("likes") val likes: Likes? = null

) : Media {
    data class Category(@JsonProperty("id") val id: Int,
                        @JsonProperty("name") val name: String,
                        @JsonProperty("section") val section: Section) {
        data class Section(@JsonProperty("id") val id: Int,
                           @JsonProperty("name") val name: String)
    }
}