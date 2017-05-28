package VKApi.objects.media

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Created by bigz on 22.05.17.
 */

data class Audio(
        @JsonProperty("id") val id: Int,
        @JsonProperty("owner_id") val ownerId: Int,
        @JsonProperty("artist") val artist: String,
        @JsonProperty("title") val title: String,
        @JsonProperty("duration") val duration: Int,
        @JsonProperty("url") val url: String,
        @JsonProperty("lyrics_id") val lyricsId: Int,
        @JsonProperty("album_id") val albumId: Int,
        @JsonProperty("genre_id") val genreId: Int,
        @JsonProperty("date") val date: Int,
        @JsonProperty("no_search") val noSearch: Boolean = false
) : Media