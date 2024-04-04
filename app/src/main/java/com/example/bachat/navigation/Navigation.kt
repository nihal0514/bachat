package com.example.bachat.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.bachat.screen.HomeScreen
import com.example.bachat.screen.SplashScreen
import com.example.bachat.screen.navigationScreens.ProfilePage
import com.example.bachat.screen.navigationScreens.StatisticsScreen
import com.example.bachat.screen.navigationScreens.WalletScreen

@Composable
fun NavigationGraph(navController: NavHostController) {
    NavHost(navController, startDestination = Destinations.HomeScreen.route) {
        composable(Destinations.HomeScreen.route) {
        //    HomeScreen()
       //     HomePage()
            ProfilePage()
        }
        composable(Destinations.Analysis.route) {
            StatisticsScreen()
        }
        composable(Destinations.Wallet.route) {
            WalletScreen()
       //     NotificationScreen()
        }
        composable(Destinations.Profile.route) {
            //     NotificationScreen()
        }
    }
}
@Composable
fun Navigation() {

    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = "get_started_screen"
    ) {
        composable("splash_screen"){
            SplashScreen(navController = navController)
        }
        composable("home_screen"){
            HomeScreen()
        }
        composable("get_started_screen"){
          //  GetStarted(navController = navController)
        }

    }
}