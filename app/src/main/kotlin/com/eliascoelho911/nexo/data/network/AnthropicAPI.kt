package com.eliascoelho911.nexo.data.network

import com.eliascoelho911.nexo.data.dto.anthropic.request.MessageRequest
import com.eliascoelho911.nexo.data.dto.anthropic.response.MessageResponseChunk
import kotlinx.coroutines.flow.Flow

interface AnthropicAPI {
    fun setToken(token: String?)
    fun setAPIUrl(url: String)
    fun streamChatMessage(messageRequest: MessageRequest): Flow<MessageResponseChunk>
}
