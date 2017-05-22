package VKApi.model

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Created by bigz on 22.05.17.
 */

data class Document(@JsonProperty("id") val id: Int,
                    @JsonProperty("owner_id") val ownerId: Int,
                    @JsonProperty("title") val title: String,
                    @JsonProperty("size") val size: Int,
                    @JsonProperty("ext") val ext: String,
                    @JsonProperty("url") val url: String,
                    @JsonProperty("date") val date: Int,
                    @JsonProperty("type") val type: Int,
                    @JsonProperty("preview") val preview: Preview,
                    @JsonProperty("no_search") val noSearch: Boolean = false) : Media {

    data class Preview(@JsonProperty("photo") val photo: Photo?,
                       @JsonProperty("graffiti") val graffiti: Graffiti?,
                       @JsonProperty("audio_msg") val audioMsg: AudioMsg?) {
        data class Photo(@JsonProperty("sizes") val sizes: List<Sizes>)

        data class Graffiti(@JsonProperty("src") val src: String,
                            @JsonProperty("width") val width: Int,
                            @JsonProperty("height") val height: Int)

        data class AudioMsg(@JsonProperty("duration") val duration: Int,
                            @JsonProperty("waveform") val waveform: List<Int>,
                            @JsonProperty("link_ogg") val linkOgg: String,
                            @JsonProperty("link_mp3") val linkMp3: String)
    }
}