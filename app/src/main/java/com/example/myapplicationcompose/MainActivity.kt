package com.example.myapplicationcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.example.myapplicationcompose.navigation.Screen
import com.example.myapplicationcompose.navigation.SetupNavGraph
import com.example.myapplicationcompose.ui.theme.MyApplicationComposeTheme
import com.example.myapplicationcompose.viewmodel.SplashViewModel
import com.google.accompanist.pager.ExperimentalPagerApi
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@ExperimentalAnimationApi
@ExperimentalPagerApi
@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    @Inject
    lateinit var splashViewModel: SplashViewModel

    @OptIn(ExperimentalFoundationApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationComposeTheme {
                // A surface container using the 'background' color from the theme
                val screen by splashViewModel.startDestination
                val navController = rememberNavController()
                SetupNavGraph(navController = navController, startDestination = screen)
            }
        }
    }
}
@ExperimentalFoundationApi
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyApplicationComposeTheme {
        val navController = rememberNavController()
        SetupNavGraph(navController = navController, startDestination = Screen.Splash.route)
    }
}