package com.example.bachat.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Favorite
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.ui.graphics.vector.ImageVector
import com.example.bachat.R

sealed class Destinations(
    val route: String,
    val title: String? = null,
    val icon: Int? = null
) {
    object HomeScreen : Destinations(
        route = "home_screen",
        icon = R.drawable.home_f_1
    )

    object Analysis : Destinations(
        route = "analysis_screen",
        icon = R.drawable.bar_chart_1
    )
    object Wallet : Destinations(
        route = "wallet_screen",
        icon = R.drawable.wallet_1
    )
    object Profile : Destinations(
        route = "profile_screen",
        icon = R.drawable.user__1__1
    )

}