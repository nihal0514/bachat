package com.example.bachat.screen.expense

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bachat.R
import com.example.bachat.ui.theme.greenPrimary
import com.example.bachat.ui.theme.greenSecondary
import com.example.bachat.utils.CustomBackgroundShape

@Composable
fun TransactionsDetailsScreen(){
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
                Text("Transaction Details",color = Color.White, fontSize = 18.sp,fontWeight = FontWeight.W600)
                Image(
                    modifier = Modifier
                        .padding(top = 25.dp, end = 20.dp)
                        .size(30.dp),
                    painter = painterResource(R.drawable.more), contentDescription = ""
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
                    .fillMaxWidth()) {
                    Spacer(modifier = Modifier.height(5.dp))
                    Column(modifier= Modifier
                        .fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally){
                        Spacer(modifier = Modifier.height(5.dp))
                        Image(
                            modifier = Modifier
                                .size(100.dp)
                                .clip(CircleShape),
                            painter = painterResource(id = R.drawable.profilesampleicon),
                            contentDescription = "",
                            contentScale = ContentScale.FillWidth

                        )
                        Spacer(modifier = Modifier.height(5.dp))
                        Column(modifier= Modifier
                            .width(80.dp)
                            .height(30.dp)
                            .clip(RoundedCornerShape(20.dp))
                            .background(color = greenSecondary),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center){
                            Spacer(modifier = Modifier.height(5.dp))
                            Text("Income", Modifier.fillMaxHeight().fillMaxHeight(),color = Color.White)
                        }
                        Spacer(modifier = Modifier.height(5.dp))
                        Text("$ 2,548.00", color = Color.Black, fontSize = 24.sp, fontWeight = FontWeight.Bold)
                        Spacer(modifier = Modifier.height(20.dp))
                        Row(modifier= Modifier.fillMaxWidth().padding(horizontal = 20.dp),
                            horizontalArrangement = Arrangement.SpaceBetween
                        ){
                            Text("Transaction Details", color = Color.Black, fontSize = 20.sp, fontWeight = FontWeight.W500)
                            Icon(Icons.Default.KeyboardArrowUp,"")
                        }
                        Spacer(modifier = Modifier.height(10.dp))
                        Row(modifier= Modifier.fillMaxWidth().padding(horizontal =20.dp),
                            horizontalArrangement = Arrangement.SpaceBetween
                        ){
                            Text("Status", color = Color.Gray, fontSize = 18.sp, fontWeight = FontWeight.W500)
                            Text("Income", color = greenSecondary, fontSize = 18.sp, fontWeight = FontWeight.W500)
                        }
                        Spacer(modifier = Modifier.height(5.dp))
                        Row(modifier= Modifier.fillMaxWidth().padding(horizontal =20.dp),
                            horizontalArrangement = Arrangement.SpaceBetween
                        ){
                            Text("From", color = Color.Gray, fontSize = 18.sp, fontWeight = FontWeight.W500)
                            Text("Upwork", color = Color.Black, fontSize = 18.sp, fontWeight = FontWeight.W500)
                        }
                        Spacer(modifier = Modifier.height(5.dp))
                        Row(modifier= Modifier.fillMaxWidth().padding(horizontal =20.dp),
                            horizontalArrangement = Arrangement.SpaceBetween
                        ){
                            Text("Time", color = Color.Gray, fontSize = 18.sp, fontWeight = FontWeight.W500)
                            Text("10.00 AM", color = Color.Black, fontSize = 18.sp, fontWeight = FontWeight.W500)
                        }
                        Spacer(modifier = Modifier.height(5.dp))
                        Row(modifier= Modifier.fillMaxWidth().padding(horizontal =20.dp),
                            horizontalArrangement = Arrangement.SpaceBetween
                        ){
                            Text("Date", color = Color.Gray, fontSize = 18.sp, fontWeight = FontWeight.W500)
                            Text("Feb 30,2022", color = Color.Black, fontSize = 18.sp, fontWeight = FontWeight.W500)
                        }
                    }

                }}
        }
    }
}