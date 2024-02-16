package com.example.myapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.painter.BitmapPainter
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun SmartLab ()
{
    val myColor: Color = Color(53252532)

    Column (
        modifier = Modifier.run {
            fillMaxSize()
                .background(Color.Gray)
        }
    ) {
        Image(

            painter = BitmapPainter(ImageBitmap.imageResource(R.drawable.logo)), modifier = Modifier
                .padding(top = 375.dp, start = 95.dp)
                .width(200.dp)
                .height(50.dp),
            contentDescription = "Смарт лаб"
        )

    }
}