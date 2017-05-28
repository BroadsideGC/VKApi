package VKApi.objects

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Created by bigz on 28.05.17.
 */

data class Likes(@JsonProperty("count") val count: Int,
                 @JsonProperty("user_likes") val userLikes: Boolean,
                 @JsonProperty("can_like") val canLike: Boolean,
                 @JsonProperty("can_puplish") val canPublish: Boolean)
