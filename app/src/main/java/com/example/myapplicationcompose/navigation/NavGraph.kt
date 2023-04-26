@file:OptIn(ExperimentalPagerApi::class)

package com.example.myapplicationcompose.navigation

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.myapplicationcompose.screen.AnimatedSplashScreen
import com.example.myapplicationcompose.screen.ProfileScreen
import com.example.myapplicationcompose.screen.WelcomeScreen
import com.google.accompanist.pager.ExperimentalPagerApi

@OptIn(ExperimentalAnimationApi::class)
@ExperimentalFoundationApi
@Composable
fun SetupNavGraph(
    navController: NavHostController,
    startDestination: String
) {
    NavHost(
        navController = navController,
        startDestination = startDestination
    ) {
        composable(route = Screen.Splash.route) {
            AnimatedSplashScreen(navController = navController)
        }
        composable(route = Screen.Welcome.route) {
            WelcomeScreen(navController = navController)
        }
        composable(route = Screen.Home.route) {
            ProfileScreen()
        }
    }
}