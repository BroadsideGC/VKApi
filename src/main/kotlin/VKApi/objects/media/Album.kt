package VKApi.objects.media

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Created by bigz on 28.05.17.
 */


data class Album(@JsonProperty("id") val id:Int,
                 @JsonProperty("thumb")val thumb:Photo,
                 @JsonProperty("owner_id")val ownerId:Int,
                 @JsonProperty("title")val title :String,
                 @JsonProperty("description") val description : String,
                 @JsonProperty("created") val created : Int,
                 @JsonProperty("updated") val updated : Int,
                 @JsonProperty("size")val size:Int):Media