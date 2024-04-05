package com.example.bachat.screen.navigationScreens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bachat.R
import com.example.bachat.utils.CustomBackgroundShape

@Composable
fun ProfilePage(){
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(color = Color(0xFFF5F5F5)),


    ) {
        Box(modifier= Modifier.fillMaxWidth()){
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
                    .background(Color.Red)
            ) {
                CustomBackgroundShape()
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
                        Icon(
                            Icons.Default.ArrowBack,  contentDescription = "Localized description",
                            tint = Color.White,
                            modifier = Modifier
                                .padding(top = 25.dp, end = 20.dp)
                                .size(30.dp))
                        Text("Profile",color = Color.White, fontSize = 18.sp,)
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
            }
            Column (modifier= Modifier
                .fillMaxWidth()
                .height(300.dp), horizontalAlignment = Alignment.CenterHorizontally,
            ){
                Spacer(modifier = Modifier.height(150.dp))
                Image(
                    modifier = Modifier
                        .size(120.dp)
                        .clip(CircleShape),
                    painter = painterResource(id = R.drawable.profilesampleicon),
                    contentDescription = "",
                    contentScale = ContentScale.FillWidth

                )
            }

        }
        Column(
            Modifier
                .fillMaxWidth()
                .fillMaxHeight()
        ){
            Spacer(
                Modifier
                    .fillMaxWidth()
                    .height(280.dp))
            Text(modifier= Modifier.fillMaxWidth(),text="Enjelin Morgeana", fontWeight = FontWeight.W500, fontSize = 20.sp, textAlign = TextAlign.Center)
            Text(modifier= Modifier.fillMaxWidth(),text="@engelina_morgeana", color = Color(0xff438883),fontSize= 14.sp, textAlign = TextAlign.Center)
            Spacer(
                Modifier
                    .fillMaxWidth()
                    .height(20.dp))

            Row(modifier= Modifier.fillMaxWidth().padding(horizontal = 20.dp), verticalAlignment = Alignment.CenterVertically){

                Icon(painter= painterResource(id = R.drawable.profile_icon),"", tint = Color.Gray)
                Spacer(Modifier.width(15.dp))
                Text("Account info", fontWeight = FontWeight.W500, fontSize = 18.sp)
            }
            Spacer(
                Modifier
                    .fillMaxWidth()
                    .height(20.dp))

            Row(modifier= Modifier.fillMaxWidth().padding(horizontal = 20.dp), verticalAlignment = Alignment.CenterVertically){
                Icon(painter= painterResource(id = R.drawable.personal_profile_icon),"", tint = Color.Gray)
                Spacer(Modifier.width(15.dp))
                Text("Personal profile", fontWeight = FontWeight.W500, fontSize = 18.sp)
            }
            Spacer(
                Modifier
                    .fillMaxWidth()
                    .height(20.dp))
            Row(modifier= Modifier.fillMaxWidth().padding(horizontal = 20.dp), verticalAlignment = Alignment.CenterVertically){
                Icon(painter= painterResource(id = R.drawable.message_icon),"", tint = Color.Gray)
                Spacer(Modifier.width(15.dp))
                Text("Message center", fontWeight = FontWeight.W500, fontSize = 18.sp)
            }
            Spacer(
                Modifier
                    .fillMaxWidth()
                    .height(20.dp))
            Row(modifier= Modifier.fillMaxWidth().padding(horizontal = 20.dp), verticalAlignment = Alignment.CenterVertically){
                Icon(painter= painterResource(id = R.drawable.security_icon),"", tint = Color.Gray)
                Spacer(Modifier.width(15.dp))
                Text("Login and security", fontWeight = FontWeight.W500, fontSize = 18.sp)
            }
            Spacer(
                Modifier
                    .fillMaxWidth()
                    .height(20.dp))

            Row(modifier= Modifier.fillMaxWidth().padding(horizontal = 20.dp), verticalAlignment = Alignment.CenterVertically){
                Icon(painter= painterResource(id = R.drawable.privacy_icon),"", tint = Color.Gray)
                Spacer(Modifier.width(15.dp))
                Text("Data and privacy", fontWeight = FontWeight.W500, fontSize = 18.sp)
            }


        }
    }
}