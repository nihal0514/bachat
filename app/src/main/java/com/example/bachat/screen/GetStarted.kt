package com.example.bachat.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.bachat.R
import com.example.bachat.utils.GetStartedAnimation

@Composable
fun GetStarted(navController: NavController){
    Column(
        modifier= Modifier
            .fillMaxSize()
            .background(color = Color.White),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Spacer(modifier= Modifier.height(130.dp))
        GetStartedAnimation()
        Spacer(modifier= Modifier.height(80.dp))
        Text("Spend Smarter", fontSize = 36.sp,color= Color(0xFF438883), fontWeight = FontWeight.W600)
        Text("Save More", fontSize = 36.sp,color= Color(0xFF438883), fontWeight = FontWeight.W600)
        Spacer(modifier= Modifier.height(20.dp))
       Button(
           modifier = Modifier
               .fillMaxWidth()
               .height(60.dp)
               .padding(horizontal = 25.dp)
               .shadow(elevation = 20.dp, shape = RoundedCornerShape(12.dp), ambientColor = Color(0xFF438883), spotColor = Color(0xFF438883)),
           onClick={
               navController.navigate("home_screen")
           },
           colors = ButtonDefaults.buttonColors(
               containerColor = Color(0xFF438883)
           )
       ){
           Text(modifier= Modifier.clickable {


           },text= "Get Started", fontSize = 20.sp)
       }
        Spacer(modifier= Modifier.height(15.dp))
        Row {
            Text(
                "Already Have Account? ",
                fontSize = 14.sp,
                color = Color.Black,
                fontWeight = FontWeight.W600
            )
            Text(
                "Log In",
                fontSize = 14.sp,
                color = Color(0xFF438883),
                fontWeight = FontWeight.W600
            )
        }

    }
}