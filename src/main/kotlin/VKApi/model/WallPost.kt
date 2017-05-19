import com.fasterxml.jackson.annotation.JsonProperty
import com.sun.xml.internal.ws.api.message.Attachment
import javafx.scene.web.WebHistory


/**
 * Created by bigz on 05.10.16.
 */
data class WallPost(@JsonProperty("id") val id: Int,
                    @JsonProperty("owner_id") val ownerId: Int,
                    @JsonProperty("from_id") val from_id: Int,
                    @JsonProperty("date") val date: Int,
                    @JsonProperty("text") val text: String,
                    @JsonProperty("reply_owner_id") val replyOwnerId: Int,
                    @JsonProperty("reply_post_id") val replyPostId: Int,
                    @JsonProperty("friends_only") val friendsOnly: Int,
                    @JsonProperty("comments") val comments: Comments,
                    @JsonProperty("likes") val likes: Likes,
                    @JsonProperty("reposts") val reposts: Reposts,
                    @JsonProperty("Views") val views: Views,
                    @JsonProperty("post_type") val postType: PostType,
                    @JsonProperty("post_source") val postSource:  PostSource?,
                    @JsonProperty("attachements") val attachments: List<Attachements>,
                    @JsonProperty("geo") val geo:  Geo,
                    @JsonProperty("signer_id") val signerId:  Int,
                    @JsonProperty("copy_history") val copyHistory: List<WallPost>?,
                    @JsonProperty("can_pin") val canPin:  Boolean,
                    @JsonProperty("can_delete") val canDelete:  Boolean,
                    @JsonProperty("can_edit") val canEdit:  Boolean,
                    @JsonProperty("is_pinned") val isPinned:  Boolean,
                    @JsonProperty("marked_as_ads") val isAds:  Boolean) {


    data class Comments(@JsonProperty("count") val count: Int,
                        @JsonProperty("can_post") val can_post: Boolean)

    data class Likes(@JsonProperty("count") val count: Int,
                     @JsonProperty("user_likes") val userLikes: Boolean,
                     @JsonProperty("can_like") val canLike: Boolean,
                     @JsonProperty("can_puplish") val canPublish: Boolean)

    data class Reposts(@JsonProperty("count") val count: Int,
                       @JsonProperty("user_reposted") val userReposted: Boolean)

    data class Views(@JsonProperty("count") val count: Int)

    enum class PostType {
        @JsonProperty("post")
        POST,
        @JsonProperty("copy")
        COPY,
        @JsonProperty("postpone")
        POSTPONE,
        @JsonProperty("suggest")
        SUGGEST
    }

    data class PostSource(@JsonProperty("type") val type: Type,
                          @JsonProperty("platform") val platform: Platform,
                          @JsonProperty("data") val data: ActionType,
                          @JsonProperty("url") val url: String) {

        enum class Type {
            @JsonProperty("vk")
            VK,
            @JsonProperty("widget")
            widget,
            @JsonProperty("api")
            API,
            @JsonProperty("rss")
            RSS,
            @JsonProperty("sms")
            SMS
        }

        enum class Platform {
            @JsonProperty("android")
            ANDROID,
            @JsonProperty("iphone")
            IPHONE,
            @JsonProperty("wphone")
            WPHONE
        }

        enum class ActionType {
            @JsonProperty("profile_activity")
            PROFILE_ACTIVITY,
            @JsonProperty("profile_photo")
            PROFILE_PHOTO,
            @JsonProperty("comments")
            COMMENTS,
            @JsonProperty("like")
            LIKE,
            @JsonProperty("poll")
            POLL
        }
    }


}