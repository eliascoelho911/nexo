package com.eliascoelho911.nexo.presentation.ui.main

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import dagger.hilt.android.AndroidEntryPoint
import com.eliascoelho911.nexo.presentation.common.LocalDynamicTheme
import com.eliascoelho911.nexo.presentation.common.LocalThemeMode
import com.eliascoelho911.nexo.presentation.common.Route
import com.eliascoelho911.nexo.presentation.common.SetupNavGraph
import com.eliascoelho911.nexo.presentation.common.ThemeSettingProvider
import com.eliascoelho911.nexo.presentation.theme.NexoTheme
import kotlinx.coroutines.launch

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    private val mainViewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        installSplashScreen().apply {
            setKeepOnScreenCondition {
                !mainViewModel.isReady.value
            }
        }
        enableEdgeToEdge()
        super.onCreate(savedInstanceState)

        setContent {
            val navController = rememberNavController()
            navController.checkForExistingSettings()

            ThemeSettingProvider {
                NexoTheme(
                    dynamicTheme = LocalDynamicTheme.current,
                    themeMode = LocalThemeMode.current
                ) {
                    SetupNavGraph(navController)
                }
            }
        }
    }

    private fun NavHostController.checkForExistingSettings() {
        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.CREATED) {
                mainViewModel.event.collect { event ->
                    if (event == MainViewModel.SplashEvent.OpenIntro) {
                        navigate(Route.GET_STARTED) {
                            popUpTo(Route.CHAT_LIST) { inclusive = true }
                        }
                    }
                }
            }
        }
    }
}
