package com.example.bachat.screen.navigationScreens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bachat.R
import com.example.bachat.utils.CustomBackgroundShape

@Composable
fun WalletScreen(){
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(color = Color(0xFFF5F5F5))


    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)){
            CustomBackgroundShape()
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(80.dp)){
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
                    .padding(horizontal = 15.dp),
                verticalAlignment = Alignment.Bottom,
                horizontalArrangement = Arrangement.SpaceBetween
            ){
                Icon(Icons.Default.ArrowBack,  contentDescription = "Localized description",
                    tint = Color.White,
                    modifier = Modifier
                        .padding(top = 25.dp, end = 20.dp)
                        .size(30.dp))
                Text("Wallet",color = Color.White, fontSize = 18.sp,fontWeight = FontWeight.W600)
                Icon(
                    Icons.Default.Notifications,
                    contentDescription = "Localized description",
                    tint = Color.White,
                    modifier = Modifier
                        .padding(top = 25.dp, end = 20.dp)
                        .size(30.dp)

                )

            }
        }
        Column {
            Spacer(
                Modifier
                    .fillMaxWidth()
                    .height(150.dp))
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
                    .clip(RoundedCornerShape(40.dp, 40.dp, 0.dp, 0.dp))
                    .background(color = Color(0xFFF5F5F5))
            ) {
                Column(modifier= Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()){
                    Spacer(Modifier.height(20.dp))
                 Column(modifier= Modifier
                     .fillMaxWidth()
                     .height(50.dp),
                 horizontalAlignment = Alignment.CenterHorizontally){
                     Text("Total Balance", color = Color.Gray, fontSize = 16.sp)
                     Text("$ 2,548.00", color = Color.Black, fontSize = 30.sp, fontWeight = FontWeight.Bold)
                 }
                    Spacer(Modifier.height(20.dp))
                    Row(modifier= Modifier
                        .fillMaxWidth()
                        .height(100.dp), horizontalArrangement = Arrangement.Center){
                        Column (modifier= Modifier.fillMaxHeight(),
                            horizontalAlignment = Alignment.CenterHorizontally){
                            Icon(
                                painter = painterResource(id = R.drawable.send_icon),
                                contentDescription = "",
                                tint = Color(0xFF549994),
                                modifier = Modifier.size(60.dp)
                            )
                            Spacer(modifier = Modifier.height(2.dp))
                            Text("Add")
                        }
                        Spacer(Modifier.width(15.dp))

                        Column(modifier= Modifier.fillMaxHeight(), horizontalAlignment = Alignment.CenterHorizontally) {
                            Icon(
                                painter = painterResource(id = R.drawable.add_icon),
                                contentDescription = "",
                                tint = Color(0xFF549994),
                                modifier = Modifier.size(60.dp)
                            )
                            Spacer(modifier = Modifier.height(2.dp))
                            Text("Pay")
                        }
                        Spacer(Modifier.width(15.dp))
                        Column (modifier= Modifier.fillMaxHeight(), horizontalAlignment = Alignment.CenterHorizontally){
                            Icon(
                                painter = painterResource(id = R.drawable.pay_icon),
                                contentDescription = "",
                                tint = Color(0xFF549994),
                                modifier = Modifier.size(60.dp)
                            )
                            Spacer(modifier = Modifier.height(2.dp))
                            Text("Send")
                        }

                    }

                }
            }
        }
    }
}