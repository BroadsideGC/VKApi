package VKApi.objects

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Created by bigz on 28.05.17.
 */

data class Currency(@JsonProperty("id") val id: Int,
                    @JsonProperty("name") val name: String)