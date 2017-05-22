package VKApi.model

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Created by bigz on 22.05.17.
 */
data class Graffiti(@JsonProperty("id") val id: Int,
                       @JsonProperty("owner_id") val ownerId: Int,
                       @JsonProperty("photo_130") val photo130: String,
                       @JsonProperty("photo_604") val photo604: String
) : Media