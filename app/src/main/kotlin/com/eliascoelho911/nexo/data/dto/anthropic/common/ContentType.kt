package com.eliascoelho911.nexo.data.dto.anthropic.common

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
enum class ContentType {

    @SerialName("text")
    TEXT,

    @SerialName("image")
    IMAGE
}
