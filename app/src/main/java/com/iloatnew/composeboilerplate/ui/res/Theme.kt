package com.iloatnew.composeboilerplate.ui.res

import android.app.Activity
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Shapes
import androidx.compose.material3.Typography
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat

@Composable
fun AppTheme(
    content: @Composable () -> Unit,
) {
    val view = LocalView.current

    LaunchedEffect(Unit) {
        if (!view.isInEditMode) {
            val window = (view.context as Activity).window
            WindowCompat.getInsetsController(window, window.decorView).apply {
                systemBarsBehavior =
                    WindowInsetsControllerCompat.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE
                hide(WindowInsetsCompat.Type.systemBars())
            }
        }
    }

    MaterialTheme(
        colorScheme = lightColorScheme(),
        shapes = Shapes(),
        typography = Typography(),
        content = content,
    )
}
