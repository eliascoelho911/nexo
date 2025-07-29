package com.eliascoelho911.nexo.data.repository

import com.eliascoelho911.nexo.data.dto.Platform
import com.eliascoelho911.nexo.data.dto.ThemeSetting

interface SettingRepository {
    suspend fun fetchPlatforms(): List<Platform>
    suspend fun fetchThemes(): ThemeSetting
    suspend fun updatePlatforms(platforms: List<Platform>)
    suspend fun updateThemes(themeSetting: ThemeSetting)
}
