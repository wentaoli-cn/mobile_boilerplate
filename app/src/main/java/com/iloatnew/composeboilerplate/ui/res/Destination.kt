package com.iloatnew.composeboilerplate.ui.res

import kotlinx.serialization.Serializable

@Serializable
sealed class AppDestination {
    @Serializable
    object Splash : AppDestination()
}
