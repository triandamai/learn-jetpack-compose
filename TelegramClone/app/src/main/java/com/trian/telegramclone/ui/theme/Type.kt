package com.trian.telegramclone.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.trian.telegramclone.R

// Set of Material typography styles to start with
val Typography = Typography(
    body1 = TextStyle(
        fontFamily = FontFamily(
            Font(R.font.lucidagrande_bold, FontWeight.Bold),
            Font(R.font.lucidagrande_semibold, FontWeight.SemiBold),
            Font(R.font.lucidagrande_regular, FontWeight.Normal),
            Font(R.font.lucidagrande_light, FontWeight.Light),
        ),
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    ),
    button = TextStyle(
        fontFamily = FontFamily(
            Font(R.font.lucidagrande_bold, FontWeight.Bold),
            Font(R.font.lucidagrande_semibold, FontWeight.SemiBold),
            Font(R.font.lucidagrande_regular, FontWeight.Normal),
            Font(R.font.lucidagrande_light, FontWeight.Light),
        ),
        fontWeight = FontWeight.W500,
        fontSize = 14.sp
    ),
    caption = TextStyle(
        fontFamily = FontFamily(
            Font(R.font.lucidagrande_bold, FontWeight.Bold),
            Font(R.font.lucidagrande_semibold, FontWeight.SemiBold),
            Font(R.font.lucidagrande_regular, FontWeight.Normal),
            Font(R.font.lucidagrande_light, FontWeight.Light),
        ),
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    )

)