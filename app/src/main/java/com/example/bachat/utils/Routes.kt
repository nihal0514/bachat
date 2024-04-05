package com.example.bachat.utils

sealed class Routes(
    val route: String,
) {
    object Get_Started: Routes(
        route = "get_started_screen"
    )
    object Home_Screen: Routes(
        route = "home_screen"
    )
    object Splash_Screen: Routes(
        route = "splash_screen"
    )
    object Add_Expense_Screen: Routes(
        route = "add_expense_screen"
    )
    object Transactions_Details_Screen: Routes(
        route = "transaction_details_screen"
    )
}
