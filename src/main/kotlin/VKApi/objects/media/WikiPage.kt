package VKApi.objects.media

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Created by bigz on 22.05.17.
 */

data class WikiPage(@JsonProperty("id") val id: Int,
                    @JsonProperty("group_id") val groupId: Int,
                    @JsonProperty("creator_id") val creatorId: Int,
                    @JsonProperty("title") val title: String,
                    @JsonProperty("current_user_can_edit") val currentUserCanEdit: Boolean,
                    @JsonProperty("current_user_can_edit_access") val currentUserCanEditAccess: Boolean,
                    @JsonProperty("who_can_view") val whoCanView: Int,
                    @JsonProperty("who_can_edit") val whoCanEdit: Int,
                    @JsonProperty("edited") val edited: Int,
                    @JsonProperty("created") val created: Int,
                    @JsonProperty("editor_id") val editorId: Int,
                    @JsonProperty("views") val views: Int,
                    @JsonProperty("parent") val parent: String? = null,
                    @JsonProperty("parent2") val parent2: String? = null,
                    @JsonProperty("source") val source: String? = null,
                    @JsonProperty("html") val html: String? = null,
                    @JsonProperty("view_url") val viewUrl: String) : Media