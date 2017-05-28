package VKApi.objects.media

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Created by bigz on 22.05.17.
 */

data class Button(@JsonProperty("title") val title: String,
                  @JsonProperty("action") val action: Action) {
    data class Action(@JsonProperty("type") val type: Type,
                      @JsonProperty("url") val url: String) {
        enum class Type {
            @JsonProperty("open_url") OPENURL
        }
    }
}
