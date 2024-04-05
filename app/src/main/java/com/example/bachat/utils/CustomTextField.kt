package com.example.bachat.utils

import android.app.DatePickerDialog
import android.widget.DatePicker
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import com.example.bachat.ui.theme.greenPrimary
import java.util.Calendar
import java.util.Date

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomTextField(label: String, trailing: @Composable () -> Unit,text: String,onValueChanged:(String) ->Unit,enabled: Boolean){
    val mContext = LocalContext.current

    val mYear: Int
    val mMonth: Int
    val mDay: Int

    val mCalendar = Calendar.getInstance()

    mYear = mCalendar.get(Calendar.YEAR)
    mMonth = mCalendar.get(Calendar.MONTH)
    mDay = mCalendar.get(Calendar.DAY_OF_MONTH)

    mCalendar.time = Date()

    val mDate = remember { mutableStateOf("") }
    val mDatePickerDialog = DatePickerDialog(
        mContext,
        { _: DatePicker, mYear: Int, mMonth: Int, mDayOfMonth: Int ->
            mDate.value = "$mDayOfMonth/${mMonth+1}/$mYear"
        }, mYear, mMonth, mDay
    )
    Column(Modifier.padding(horizontal = 20.dp)) {

        OutlinedTextField(
            colors = TextFieldDefaults.outlinedTextFieldColors(
                disabledTextColor = greenPrimary,
                disabledBorderColor = Color.Gray,
                focusedBorderColor = greenPrimary,
                unfocusedBorderColor = Color.Gray
            ),
            value = text,
            onValueChange ={onValueChanged(it)},
            modifier = Modifier
                .fillMaxWidth(),
            label = { Text(
                text = label, style = TextStyle(color = Color.Black))},
            trailingIcon = trailing,
            enabled = enabled
        )
    }

}