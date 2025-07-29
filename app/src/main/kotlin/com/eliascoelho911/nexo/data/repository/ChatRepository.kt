package com.eliascoelho911.nexo.data.repository

import com.eliascoelho911.nexo.data.database.entity.ChatRoom
import com.eliascoelho911.nexo.data.database.entity.Message
import com.eliascoelho911.nexo.data.dto.ApiState
import kotlinx.coroutines.flow.Flow

interface ChatRepository {

    suspend fun completeOpenAIChat(question: Message, history: List<Message>): Flow<ApiState>
    suspend fun completeAnthropicChat(question: Message, history: List<Message>): Flow<ApiState>
    suspend fun completeGoogleChat(question: Message, history: List<Message>): Flow<ApiState>
    suspend fun completeGroqChat(question: Message, history: List<Message>): Flow<ApiState>
    suspend fun completeOllamaChat(question: Message, history: List<Message>): Flow<ApiState>
    suspend fun fetchChatList(): List<ChatRoom>
    suspend fun fetchMessages(chatId: Int): List<Message>
    fun generateDefaultChatTitle(messages: List<Message>): String?
    suspend fun updateChatTitle(chatRoom: ChatRoom, title: String)
    suspend fun saveChat(chatRoom: ChatRoom, messages: List<Message>): ChatRoom
    suspend fun deleteChats(chatRooms: List<ChatRoom>)
}
