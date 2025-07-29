package com.eliascoelho911.nexo.data.dto

import com.eliascoelho911.nexo.data.model.DynamicTheme
import com.eliascoelho911.nexo.data.model.ThemeMode

data class ThemeSetting(
    val dynamicTheme: DynamicTheme = DynamicTheme.OFF,
    val themeMode: ThemeMode = ThemeMode.SYSTEM
)
