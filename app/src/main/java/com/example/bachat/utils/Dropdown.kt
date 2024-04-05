package com.example.bachat.utils

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.Divider
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.toSize
import androidx.compose.ui.window.Dialog
import com.example.bachat.ui.theme.greenPrimary


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DropDown(){
    var mExpanded by remember { mutableStateOf(false) }

    val mExpense = listOf("Snacks", "Lunch", "Dinner", "Personal Care", "Fuel", "Savings", "Investments")

    var mSelectedText by remember { mutableStateOf("") }

    var mTextFieldSize by remember { mutableStateOf(Size.Zero)}

    val icon = if (mExpanded)
        Icons.Filled.KeyboardArrowUp
    else
        Icons.Filled.KeyboardArrowDown

    Column(Modifier.padding(horizontal = 20.dp)) {

        OutlinedTextField(
            colors = TextFieldDefaults.outlinedTextFieldColors(
                disabledTextColor = greenPrimary, // Set the same color for enabled and disabled text
                disabledBorderColor = Color.Gray, // Set the same color for enabled and disabled border
                focusedBorderColor = greenPrimary, // Customize focused border color if needed
                unfocusedBorderColor = Color.Gray // Customize unfocused border color if needed
            ),
            enabled=false,
            value = mSelectedText,
            onValueChange = { mSelectedText = it },
            modifier = Modifier
                .fillMaxWidth()
                .clickable{
                    mExpanded = !mExpanded
                }
                .onGloballyPositioned { coordinates ->
                    mTextFieldSize = coordinates.size.toSize()
                },
            label = {Text("NAME", color = Color.Black)},
            trailingIcon = {
                Icon(icon,"contentDescription",
                    Modifier.clickable { mExpanded = !mExpanded })
            }
        )

        DropdownMenu(
            expanded = mExpanded,
            onDismissRequest = { mExpanded = false },
            modifier = Modifier
                .width(with(LocalDensity.current){mTextFieldSize.width.toDp()})
        ) {
            mExpense.forEach { label ->
                DropdownMenuItem(text = { Text(label) }, onClick = { mSelectedText = label
                    mExpanded = false })
            }
        }
    }

}