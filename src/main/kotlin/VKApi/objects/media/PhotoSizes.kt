package VKApi.objects.media

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Created by bigz on 22.05.17.
 */
data class Sizes(@JsonProperty("src") val src: String,
                 @JsonProperty("width") val width: Int,
                 @JsonProperty("height") val height: Int,
                 @JsonProperty("type") val type: Type) {

    enum class Type {
        @JsonProperty("s") S,
        @JsonProperty("m") M,
        @JsonProperty("x") X,
        @JsonProperty("o") O,
        @JsonProperty("p") P,
        @JsonProperty("q") Q,
        @JsonProperty("r") R,
        @JsonProperty("y") Y,
        @JsonProperty("z") Z,
        @JsonProperty("w") W
    }
}