package com.example.bachat.screen.navigationScreens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bachat.R
import com.example.bachat.screen.DemoTransactionModel

@Composable
fun StatisticsScreen(){
    val transactions = mutableListOf<DemoTransactionModel>()
    transactions.add(DemoTransactionModel("Upwork", "Today", true, 850, R.drawable.demoimage_1))
    transactions.add(DemoTransactionModel("Transfer", "Yesterday", false, 85, R.drawable.demoimage_2))
    transactions.add(DemoTransactionModel("Paypal", "Yesterday", true, 350, R.drawable.demoimage_3))
    transactions.add(DemoTransactionModel("Youtube", "Yesterday", false, 250, R.drawable.demoimage_1))
    transactions.add(DemoTransactionModel("Youtube", "Yesterday", false, 250, R.drawable.demoimage_1))

   var selectedItem= mutableIntStateOf(-1)

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0xFFF5F5F5))
    ){
        Row(
            modifier= Modifier
                .fillMaxWidth()
                .padding(top = 20.dp, start = 20.dp, end = 20.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ){
            Image(
                modifier= Modifier
                    .height(40.dp)
                    .width(30.dp),
                painter= painterResource(R.drawable.chevron_left), contentDescription ="" )
            Text(
                "Statistics", fontSize = 18.sp, fontWeight = FontWeight.W600
            )

            Image(
                modifier= Modifier
                    .height(25.dp)
                    .width(25.dp),
                painter= painterResource(R.drawable.download_icon), contentDescription ="" )


        }
      Spacer(modifier= Modifier.height(350.dp))
        Row(modifier= Modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp),
        horizontalArrangement = Arrangement.SpaceBetween){
            Text("Top Spending", fontSize = 18.sp, fontWeight = FontWeight.W600)
            Image(
                modifier= Modifier
                    .height(20.dp)
                    .width(20.dp),
                painter= painterResource(R.drawable.sort_icon), contentDescription = "")

        }
        LazyColumn(content = {
            items(transactions.size) {
                Box(
                    modifier= Modifier.padding(horizontal = 20.dp, vertical = 5.dp).background(color = (if(selectedItem.value!=it) Color(0xFFE5E5E5) else Color(0XFF29756F)) as Color,  shape = RoundedCornerShape(10.dp)).clickable {
                        selectedItem.value= it
                    }

                ) {
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
                                    Text(transactions[it].name, fontSize = 12.sp, color = if(selectedItem.value!=it)  Color.Black else Color.White);
                                Text(
                                    transactions[it].daytime,
                                    fontSize = 10.sp,
                                    color = if(selectedItem.value!=it) Color(0xff666666) else Color.White
                                )
                            }
                        }
                        Text(
                            text = (if (transactions[it].type) "+ " else "- ") + transactions[it].amount.toString(),
                            color = if(selectedItem.value!=it )if (transactions[it].type) {Color(0xff25A969)} else {Color(
                                0xffF95B51
                            )} else {Color.White},
                            fontSize = 16.sp
                        )
                    }
                }
            }
        })
        Spacer(modifier= Modifier.height(200.dp))

    }
}