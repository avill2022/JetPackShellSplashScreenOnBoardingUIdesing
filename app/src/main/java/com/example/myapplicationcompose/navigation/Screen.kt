package com.example.myapplicationcompose.navigation

sealed class Screen(val route: String) {
    object Splash : Screen("splash_screen")
    object Home : Screen("home_screen")
    object Welcome : Screen(route = "welcome_screen")
}