package com.eliascoelho911.nexo.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import com.eliascoelho911.nexo.data.datastore.SettingDataSource
import com.eliascoelho911.nexo.data.repository.SettingRepository
import com.eliascoelho911.nexo.data.repository.SettingRepositoryImpl
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object SettingRepositoryModule {

    @Provides
    @Singleton
    fun provideSettingRepository(
        settingDataSource: SettingDataSource
    ): SettingRepository = SettingRepositoryImpl(settingDataSource)
}
