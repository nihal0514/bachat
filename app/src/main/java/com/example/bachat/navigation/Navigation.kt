package com.example.bachat.navigation

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.bachat.screen.GetStarted
import com.example.bachat.screen.HomeScreen
import com.example.bachat.screen.SplashScreen
import com.example.bachat.screen.expense.AddExpenseScreen
import com.example.bachat.screen.expense.TransactionsDetailsScreen
import com.example.bachat.screen.navigationScreens.HomePage
import com.example.bachat.screen.navigationScreens.ProfilePage
import com.example.bachat.screen.navigationScreens.StatisticsScreen
import com.example.bachat.screen.navigationScreens.WalletScreen
import com.example.bachat.utils.Routes

@Composable
fun NavigationGraph(navController: NavHostController) {
    NavHost(navController, startDestination = Destinations.HomeScreen.route) {
        composable(Destinations.HomeScreen.route) {
        //    HomeScreen()
            HomePage()
            //ProfilePage()
        }
        composable(Destinations.Analysis.route) {
            StatisticsScreen()
        }
        composable(Destinations.Wallet.route) {
            WalletScreen()
       //     NotificationScreen()
        }
        composable(Destinations.Profile.route) {
            ProfilePage()
            //     NotificationScreen()
        }

    }
}
@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun Navigation() {

    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Routes.Get_Started.route
    ) {
        composable(Routes.Splash_Screen.route){
            SplashScreen(navController = navController)
        }
        composable(Routes.Home_Screen.route){
            HomeScreen(navController)
        }
        composable(Routes.Get_Started.route){
            GetStarted(navController = navController)
        }
        composable(Routes.Add_Expense_Screen.route) {
            AddExpenseScreen()
            //     NotificationScreen()
        }
        composable(Routes.Transactions_Details_Screen.route) {
            TransactionsDetailsScreen()
        }

    }
}