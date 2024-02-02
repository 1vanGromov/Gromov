package com.example.myapplication

import android.text.style.BackgroundColorSpan
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.layout
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.foundation.layout.fillMaxWidth



@Preview
@Composable
fun LogIn () {

    Column (
        modifier = Modifier.run {
            fillMaxSize()
                .background(Color.White)
        }
    ) {
        Text(
            text = "✋ Добро пожаловать!",fontFamily=FontFamily.SansSerif,fontSize = 20.sp,
            fontWeight = FontWeight.Bold,textAlign = TextAlign.Center,modifier = Modifier.fillMaxWidth(1f)
        )
        Text(
            text = "Войдите, чтобы воспользоваться функциями приложения", fontSize = 16.sp,fontFamily=FontFamily.SansSerif
        )
        Text(
            text = "Вход по E-mail", color = Color.Gray,fontStyle = FontStyle.Italic,fontSize = 12.sp,fontFamily=FontFamily.SansSerif
        )
        TextField(
            value = "example@mail.ru", onValueChange = {"0_0"}
        )
        val label = remember{mutableStateOf("Click")}
        Button(onClick = {label.value = "Проверяем введенные данные"}) {
            Text(
                text = "Далее",fontFamily=FontFamily.SansSerif,fontSize = 14.sp
            )
        }
        Text(
            text = "Или войти с помощью", color = Color.Gray,fontStyle = FontStyle.Italic,fontSize = 12.sp,fontFamily=FontFamily.SansSerif,textAlign = TextAlign.Center,modifier = Modifier.fillMaxWidth(1f)
        )
        Button(onClick = {}) {
            Text(text = "Войти с Яндекс",fontFamily=FontFamily.SansSerif,fontSize = 14.sp,textAlign = TextAlign.Center,modifier = Modifier.fillMaxWidth(1f))
        }

    }
}
