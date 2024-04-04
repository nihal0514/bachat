package com.example.bachat.utils

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.foundation.Canvas
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Fill
import androidx.compose.ui.unit.dp

@Composable
fun CustomBackgroundShape(){
    Canvas(modifier = Modifier
        .fillMaxWidth()
        .height(200.dp)){
        drawRect(color = Color(0xFF429690))

    }
    Canvas(modifier = Modifier.fillMaxSize()) {
        val centerX = size.width / 2
        val centerY = size.height
        val radius = size.width / 2

        drawArc(
            color = Color(0xFF429690),
            startAngle = 0f,
            sweepAngle = 180f,
            useCenter = true,
            topLeft = Offset(centerX - radius, 480f),
            size = Size(radius*2 , radius/4),
            style = Fill
        )
    }
}
