package com.example.myapplication.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview
@Composable
fun LogIn () {

    Column (
        modifier = Modifier.run {
            fillMaxSize()
                .background(Color.White)
        }
    )

    {
        Text(
            text = "\n\n\n✋ Добро пожаловать!",fontFamily= FontFamily.SansSerif,fontSize = 20.sp,
            fontWeight = FontWeight.Bold,textAlign = TextAlign.Center,modifier = Modifier.fillMaxWidth(1f)
        )
        Text(
            text = " \n\nВойдите, чтобы воспользоваться функциями приложения", fontSize = 16.sp,fontFamily= FontFamily.SansSerif
        )



           Text(
               text = "\n\n\n\nВход по E-mail",
               color = Color.Gray,
               fontStyle = FontStyle.Italic,
               fontSize = 12.sp,
               fontFamily = FontFamily.SansSerif
           )
        Column () {
           TextField(
               value = "example@mail.ru", onValueChange = { }, modifier = Modifier.fillMaxWidth(1f)
           )

        val label = remember{ mutableStateOf("Click") }
        Button(onClick = {label.value = "Проверяем введенные данные"}, modifier = Modifier.fillMaxWidth(1f)) {
            Text(
                text = "Далее", fontFamily = FontFamily.SansSerif, fontSize = 14.sp
            )
         }
        }

        Text(
            text = "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nИли войти с помощью", color = Color.Gray,fontStyle = FontStyle.Italic,fontSize = 12.sp,fontFamily= FontFamily.SansSerif,textAlign = TextAlign.Center,modifier = Modifier.fillMaxWidth(1f)
        )
        Button(onClick = {}, modifier = Modifier
            .padding(horizontal = 120.dp)) {
            Text(text = "Войти с Яндекс",fontFamily= FontFamily.SansSerif,fontSize = 14.sp,textAlign = TextAlign.Center)
        }


    }
}