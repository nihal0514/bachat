package com.example.bachat.navigation

import android.util.Log
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.bachat.R
import com.example.bachat.utils.BottomNavCurve

@Composable
fun BottomBar(
   mainNavController:NavController, navController: NavHostController, state: MutableState<Boolean>, modifier: Modifier = Modifier
) {
    val screens = listOf(
        Destinations.HomeScreen, Destinations.Analysis, Destinations.Wallet,Destinations.Profile
    )
    var isHomeScreen = remember{mutableStateOf(false)}
    Box (
        modifier= Modifier
            .fillMaxWidth()
            .height(110.dp),
        contentAlignment = Alignment.BottomCenter,


    ) {
        NavigationBar(
         //   modifier = modifier.clip(BottomNavCurve()),
            containerColor = Color.White
        ) {
            val navBackStackEntry by navController.currentBackStackEntryAsState()
            val currentRoute = navBackStackEntry?.destination?.route
            if(currentRoute=="home_screen"){
                isHomeScreen.value= true
            }else{
                isHomeScreen.value= false
            }
            screens.forEach { screen ->

                NavigationBarItem(

                    icon = {
                        Icon(painter = painterResource(id = if(currentRoute== screen.route){screen.onSelectedIcon!!}else{screen.icon!!}), contentDescription = "")
                    },
                    selected = currentRoute == screen.route,
                    onClick = {
                       navController.navigate(screen.route) {
                            popUpTo(navController.graph.findStartDestination().id) {
                                saveState = true
                            }
                            launchSingleTop = true
                            restoreState = true
                        }
                    },
                    colors = NavigationBarItemDefaults.colors(
                        unselectedTextColor = Color.Gray, selectedTextColor = Color.White
                    ),
                )
            }
        }
        if(isHomeScreen.value){
            Column(
                modifier= Modifier.fillMaxHeight()
            ) {
                Button(
                    modifier = Modifier
                        .size(60.dp).clip(CircleShape).background(color = Color.Transparent),
                    contentPadding = PaddingValues(0.dp),
                    colors = ButtonDefaults.buttonColors(containerColor =Color(0xff438883) ),
                    onClick = {
                        mainNavController.navigate("add_expense_screen")

                    }) {

                    Icon(Icons.Default.Add, "",Modifier.height(30.dp).width(30.dp),Color.White)
                }
            }
        }

    }


}