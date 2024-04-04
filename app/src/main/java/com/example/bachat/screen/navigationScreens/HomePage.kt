package com.example.bachat.screen.navigationScreens

import androidx.compose.foundation.Image
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
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bachat.R
import com.example.bachat.screen.DemoTransactionModel
import com.example.bachat.utils.CustomBackgroundShape

@Composable
fun HomePage(){
    val transactions = mutableListOf<DemoTransactionModel>()
    transactions.add(DemoTransactionModel("Upwork", "Today", true, 850, R.drawable.demoimage_1))
    transactions.add(DemoTransactionModel("Transfer", "Yesterday", false, 85, R.drawable.demoimage_2))
    transactions.add(DemoTransactionModel("Paypal", "Yesterday", true, 350, R.drawable.demoimage_3))
    transactions.add(DemoTransactionModel("Youtube", "Yesterday", false, 250, R.drawable.demoimage_1))

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0xFFF5F5F5))

    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(280.dp)

        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
                   // .clip(RoundedCornerShape(0.dp, 0.dp, 20.dp, 20.dp))
                   // .background(Color(0xFF429690))
            ) {

               /* Canvas(
                    modifier = Modifier
                        .size(100.dp)
                        .padding(16.dp)
                ) {
                    val instaColors = listOf(Color.Yellow, Color.Red, Color.Magenta)
                    drawRoundRect(
                        brush = Brush.linearGradient(colors = instaColors),
                        cornerRadius = CornerRadius(60f, 60f),
                        style = Stroke(width = 15f, cap = StrokeCap.Round)
                    )
                    drawCircle(
                        brush = Brush.linearGradient(colors = instaColors),
                        radius = 45f,
                        style = Stroke(width = 15f, cap = StrokeCap.Round)
                    )
                    drawCircle(
                        brush = Brush.linearGradient(colors = instaColors),
                        radius = 13f,
                        center = Offset(this.size.width * .80f, this.size.height * 0.20f),
                    )
                }*/
                CustomBackgroundShape()
                Column (  modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(),
                    verticalArrangement = Arrangement.Center
                ){
                    Row(
                        modifier = Modifier
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                    ) {
                        Column(
                        ) {
                            Text(
                                "Good afternoon,", color = Color.White, fontSize = 16.sp,
                                modifier = Modifier.padding(start = 20.dp, top = 20.dp, bottom = 5.dp)
                            )
                            Text(
                                "Enjelin Morgeana", color = Color.White, fontSize = 20.sp,
                                modifier = Modifier.padding(start = 20.dp)
                            )

                        }
                        Icon(
                            Icons.Default.Notifications,
                            contentDescription = "Localized description",
                            tint = Color.White,
                            modifier = Modifier
                                .padding(top = 25.dp, end = 20.dp)
                                .size(30.dp)

                        )
                    }
                    Spacer(modifier = Modifier.height(80.dp))
                }

            }


                Box(
                    modifier = Modifier
                        .height(150.dp)
                        .fillMaxWidth()
                        .padding(horizontal = 25.dp)
                        .shadow(
                            elevation = 100.dp,
                            ambientColor = Color(0xFF1B5C58),
                            spotColor = Color(0xFF1B5C58)
                        )
                        .clip(RoundedCornerShape(10.dp, 10.dp, 10.dp, 10.dp))
                         .align(Alignment.BottomCenter)
                        .background(Color(0xFF1B5C58))

                ) {
                    Column() {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {

                            Row() {
                                Text(
                                    "Total Balance", color = Color.White, fontSize = 18.sp,
                                    modifier = Modifier.padding(start = 20.dp, top = 10.dp)
                                )
                                Image(
                                    modifier = Modifier
                                        .padding(top = 10.dp)
                                        .height(20.dp)
                                        .width(15.dp),
                                    painter = painterResource(R.drawable.chevron_down),
                                    contentDescription = ""
                                )

                            }
                            Image(
                                modifier = Modifier
                                    .padding(end = 20.dp, top = 20.dp)
                                    .height(20.dp)
                                    .width(15.dp),
                                painter = painterResource(R.drawable.more), contentDescription = ""
                            )

                        }
                        Text(
                            "Rs.2,548", color = Color.White, fontSize = 18.sp,
                            fontWeight = FontWeight.Bold, modifier = Modifier.padding(start = 20.dp)
                        )
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            Column() {
                                Row(

                                    modifier = Modifier.padding(start = 15.dp, top = 10.dp),
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    Image(
                                        modifier = Modifier
                                            .height(20.dp)
                                            .width(15.dp),
                                        painter = painterResource(R.drawable.down_arrow),
                                        contentDescription = ""
                                    )
                                    Spacer(modifier = Modifier.width(5.dp))
                                    Text(
                                        "Income",
                                        color = Color.White,
                                        fontSize = 16.sp,
                                        fontWeight = FontWeight.W400,
                                    )
                                }
                                Text(
                                    "Rs.1,840",
                                    color = Color.White,
                                    fontSize = 16.sp,
                                    modifier = Modifier.padding(start = 20.dp)
                                )
                            }
                            Column() {
                                Row(
                                    modifier = Modifier.padding(top = 10.dp),
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    Image(
                                        modifier = Modifier
                                            .height(20.dp)
                                            .width(15.dp),
                                        painter = painterResource(R.drawable.up_arrow),
                                        contentDescription = ""
                                    )
                                    Spacer(modifier = Modifier.width(5.dp))
                                    Text(
                                        "Expenses",
                                        color = Color.White,
                                        fontSize = 16.sp,
                                        fontWeight = FontWeight.W400,
                                        modifier = Modifier.padding(end = 20.dp)
                                    )
                                }
                                Text(
                                    "Rs.284",
                                    color = Color.White,
                                    fontSize = 16.sp,
                                    modifier = Modifier.padding(end = 20.dp)
                                )

                            }
                        }

                    }

                }
            }
            Spacer(modifier = Modifier.height(20.dp))
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 15.dp)
            ) {
                Text(
                    "Transaction History",
                    fontSize = 16.sp,
                    color = Color.Black,
                    fontWeight = FontWeight.W500
                )
                Text("See all", fontSize = 14.sp, color = Color.Gray)
            }
            Spacer(modifier = Modifier.height(15.dp))
            LazyColumn(content = {
                items(transactions.size) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 15.dp, vertical = 5.dp),
                        horizontalArrangement =
                        Arrangement.SpaceBetween
                    ) {
                        Row() {
                            Image(
                                modifier = Modifier.size(50.dp),
                                painter = painterResource(id = transactions[it].image),
                                contentDescription = ""
                            )

                            Spacer(modifier = Modifier.width(10.dp))
                            Column(
                                verticalArrangement = Arrangement.SpaceEvenly
                            ) {
                                Text(transactions[it].name, fontSize = 12.sp, color = Color.Black);
                                Text(
                                    transactions[it].daytime,
                                    fontSize = 10.sp,
                                    color = Color(0xff666666)
                                )
                            }
                        }
                        Text(
                            text = (if (transactions[it].type) "+ " else "- ") + transactions[it].amount.toString(),
                            color = if (transactions[it].type) Color(0xff25A969) else Color(
                                0xffF95B51
                            ),
                            fontSize = 16.sp
                        )
                    }
                }
            })


        }

}