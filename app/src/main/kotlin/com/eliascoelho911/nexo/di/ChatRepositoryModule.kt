package com.eliascoelho911.nexo.di

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import com.eliascoelho911.nexo.data.database.dao.ChatRoomDao
import com.eliascoelho911.nexo.data.database.dao.MessageDao
import com.eliascoelho911.nexo.data.network.AnthropicAPI
import com.eliascoelho911.nexo.data.repository.ChatRepository
import com.eliascoelho911.nexo.data.repository.ChatRepositoryImpl
import com.eliascoelho911.nexo.data.repository.SettingRepository
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object ChatRepositoryModule {

    @Provides
    @Singleton
    fun provideChatRepository(
        @ApplicationContext appContext: Context,
        chatRoomDao: ChatRoomDao,
        messageDao: MessageDao,
        settingRepository: SettingRepository,
        anthropicAPI: AnthropicAPI
    ): ChatRepository = ChatRepositoryImpl(appContext, chatRoomDao, messageDao, settingRepository, anthropicAPI)
}
