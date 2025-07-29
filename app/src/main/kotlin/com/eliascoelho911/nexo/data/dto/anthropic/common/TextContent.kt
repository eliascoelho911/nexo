package com.eliascoelho911.nexo.data.dto.anthropic.common

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("text")
data class TextContent(

    @SerialName("text")
    val text: String
) : MessageContent()
