package com.eliascoelho911.nexo.data.dto.anthropic.common

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
enum class MediaType {

    @SerialName("image/jpeg")
    JPEG,

    @SerialName("image/png")
    PNG,

    @SerialName("image/gif")
    GIF,

    @SerialName("image/webp")
    WEBP
}
