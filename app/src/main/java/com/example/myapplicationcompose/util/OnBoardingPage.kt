package com.example.myapplicationcompose.util

import androidx.annotation.DrawableRes
import com.example.myapplicationcompose.R

sealed class OnBoardingPage(
    @DrawableRes
    val image: Int,
    val title: String,
    val description: String
) {
    object First : OnBoardingPage(
        image = R.drawable.ic_launcher_background,
        title = "Meeting",
        description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod."
    )

    object Second : OnBoardingPage(
        image = R.drawable.ic_launcher_background,
        title = "Coordination",
        description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod."
    )

    object Third : OnBoardingPage(
        image = R.drawable.ic_launcher_background,
        title = "Dialogue",
        description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod."
    )
}
