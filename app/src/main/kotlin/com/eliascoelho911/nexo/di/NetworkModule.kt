package com.eliascoelho911.nexo.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import com.eliascoelho911.nexo.data.network.AnthropicAPI
import com.eliascoelho911.nexo.data.network.AnthropicAPIImpl
import com.eliascoelho911.nexo.data.network.NetworkClient
import io.ktor.client.engine.okhttp.OkHttp
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Provides
    @Singleton
    fun provideNetworkClient(): NetworkClient = NetworkClient(OkHttp)

    @Provides
    @Singleton
    fun provideAnthropicAPI(): AnthropicAPI = AnthropicAPIImpl(provideNetworkClient())
}
