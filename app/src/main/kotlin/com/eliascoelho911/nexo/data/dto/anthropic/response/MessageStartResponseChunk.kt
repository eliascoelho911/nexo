package com.eliascoelho911.nexo.data.dto.anthropic.response

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("message_start")
data class MessageStartResponseChunk(

    @SerialName("message")
    val message: MessageResponse
) : MessageResponseChunk()
