package com.example.bachat.screen.expense

import android.app.DatePickerDialog
import android.os.Build
import android.widget.DatePicker
import androidx.annotation.RequiresApi
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathEffect
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import com.example.bachat.R
import com.example.bachat.ui.theme.greenSecondary
import com.example.bachat.utils.CustomBackgroundShape
import com.example.bachat.utils.CustomTextField
import com.example.bachat.utils.DropDown
import com.example.bachat.utils.getCurrentDate
import java.util.Calendar
import java.util.Date

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun AddExpenseScreen(){
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(color = Color(0xFFF5F5F5))


    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
        ) {
            CustomBackgroundShape()
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(80.dp)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
                    .padding(horizontal = 15.dp),
                verticalAlignment = Alignment.Bottom,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Icon(
                    Icons.Default.ArrowBack, contentDescription = "Localized description",
                    tint = Color.White,
                    modifier = Modifier
                        .padding(top = 25.dp, end = 20.dp)
                        .size(20.dp)
                )
                Text("Add Expense", color = Color.White, fontSize = 18.sp, fontWeight = FontWeight.W600)
                Image(
                    modifier = Modifier
                        .padding(top = 25.dp, end = 20.dp)
                        .size(30.dp),
                    painter = painterResource(R.drawable.more), contentDescription = ""
                )

            }
        }
        Column(modifier= Modifier
            .fillMaxWidth()
            .fillMaxHeight()){

            var amountText by remember { mutableStateOf("") }
            var dateText by remember { mutableStateOf(getCurrentDate()) }

            val mContext = LocalContext.current

            val mYear: Int
            val mMonth: Int
            val mDay: Int

            val mCalendar = Calendar.getInstance()

            mYear = mCalendar.get(Calendar.YEAR)
            mMonth = mCalendar.get(Calendar.MONTH)
            mDay = mCalendar.get(Calendar.DAY_OF_MONTH)

            mCalendar.time = Date()


            val mDatePickerDialog = DatePickerDialog(
                mContext,
                { _: DatePicker, mYear: Int, mMonth: Int, mDayOfMonth: Int ->
                    dateText = "$mDayOfMonth/${mMonth+1}/$mYear"
                }, mYear, mMonth, mDay
            )


            Spacer(Modifier.height(150.dp))
            Box(modifier= Modifier
                .height(430.dp)
                .fillMaxWidth()
                .padding(horizontal = 20.dp)
                .clip(
                    RoundedCornerShape(20.dp, 20.dp, 20.dp, 20.dp)
                )
                .background(color = Color(0xFffFFFFF))){
                Column(modifier= Modifier.fillMaxHeight().fillMaxWidth()){
                    Spacer(Modifier.height(10.dp))
                    DropDown()
                    Spacer(Modifier.height(10.dp))
                    CustomTextField(label = "AMOUNT", onValueChanged = {
                                                                       amountText= it
                    }, text = amountText, trailing = {Text("Clear", color = greenSecondary)}, enabled = true)
                    Spacer(Modifier.height(10.dp))
                    CustomTextField(label = "DATE", onValueChanged = {

                    }, text = dateText, trailing = {

                        Image(
                            modifier=  Modifier.clickable {
                                mDatePickerDialog.show()
                            },
                        painter = painterResource(R.drawable.calendar_icon), contentDescription = ""
                    )}, enabled = false)
                    Spacer(Modifier.height(15.dp))
                    Text("INVOICE",Modifier.padding(horizontal = 20.dp))
                    Spacer(Modifier.height(5.dp))
                    Box(Modifier.padding(horizontal = 20.dp)){
                        val stroke = Stroke(width = 2f,
                            pathEffect = PathEffect.dashPathEffect(floatArrayOf(10f, 10f), 0f)
                        )
                        Canvas(Modifier.fillMaxWidth().height(50.dp)){
                            drawRoundRect(color = Color(0xFFADA0A0),style = stroke)
                        }
                        Row(
                            modifier= Modifier.fillMaxWidth().height(50.dp),
                            horizontalArrangement = Arrangement.Center,
                            verticalAlignment = Alignment.CenterVertically
                        ){
                            Image(
                                modifier=  Modifier.clickable {
                                    mDatePickerDialog.show()
                                },
                                painter = painterResource(R.drawable.plus_circle_icon), contentDescription = ""
                            )
                            Spacer(Modifier.width(5.dp))
                            Text("Add Invoice", style = TextStyle(color = Color(0xff666666), fontSize = 16.sp))
                        }


                    }
                    Spacer(Modifier.height(30.dp))
                    Button(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(50.dp)
                            .padding(horizontal = 20.dp)
                            .shadow(elevation = 20.dp, shape = RoundedCornerShape(12.dp), ambientColor = Color(0xFF438883), spotColor = Color(0xFF438883)),
                        onClick={
                        },
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(0xFF438883)
                        )
                    ){
                        Text(modifier= Modifier.clickable {

                        },text= "Save", fontSize = 16.sp)
                    }

                }

            }
        }
    }
}