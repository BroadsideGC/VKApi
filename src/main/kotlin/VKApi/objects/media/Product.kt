package VKApi.objects.media

import VKApi.objects.Price
import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Created by bigz on 22.05.17.
 */
data class Product(@JsonProperty("price") val price: Price)