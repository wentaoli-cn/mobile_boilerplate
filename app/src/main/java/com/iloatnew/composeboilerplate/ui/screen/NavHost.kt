package com.iloatnew.composeboilerplate.ui.screen

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.iloatnew.composeboilerplate.ui.res.AppDestination
import com.iloatnew.composeboilerplate.ui.screen.splash.SplashScreen

@Composable
fun AppNavHost(navController: NavHostController = rememberNavController()) {
    NavHost(navController = navController, startDestination = AppDestination.Splash) {
        composable<AppDestination.Splash> {
            SplashScreen()
        }
    }
}
