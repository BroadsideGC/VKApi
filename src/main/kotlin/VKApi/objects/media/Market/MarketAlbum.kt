package VKApi.objects.media.Market

import VKApi.objects.media.Media
import VKApi.objects.media.Photo
import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Created by bigz on 28.05.17.
 */

data class MarketAlbum(@JsonProperty("id") val id: Int,
                       @JsonProperty("owner_id") val ownerId: Int,
                       @JsonProperty("title") val title: String,
                       @JsonProperty("photo") val photo: Photo,
                       @JsonProperty("count") val count: Int,
                       @JsonProperty("updated_time") val updatedTime: Int):Media