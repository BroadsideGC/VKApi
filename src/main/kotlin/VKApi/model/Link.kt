import VKApi.model.Button
import VKApi.model.Photo
import com.fasterxml.jackson.annotation.JsonProperty


/**
 * Created by bigz on 22.05.17.
 */


data class Link(
        @JsonProperty("url") val url: String,
        @JsonProperty("title") val title: String,
        @JsonProperty("caption") val caption: String? = null,
        @JsonProperty("description") val description: String,
        @JsonProperty("photo") val photo: Photo? = null,
        @JsonProperty("is_external") val isExternal: Boolean,
        @JsonProperty("button") val buttonText: Button? = null,
        @JsonProperty("preview_page") val previewPage: String,
        @JsonProperty("preview_url") val previewUrl: String)
