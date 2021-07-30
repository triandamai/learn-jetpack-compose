package com.trian.moviesappcompose.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.trian.moviesappcompose.R

val Montserrat =FontFamily(
        Font(R.font.montserrat_regular),
        Font(R.font.montserrat_medium,FontWeight.W500),
        Font(R.font.montserrat_medium,FontWeight.W600),
        Font(R.font.montserrat_bold,FontWeight.Bold),
)
// Set of Material typography styles to start with
val Typography = Typography(
    h6 = TextStyle(
        fontFamily = Montserrat,
        fontWeight = FontWeight.W600,
        fontSize = 16.sp
    ),
    subtitle1 = TextStyle(
            fontFamily = Montserrat,
            fontWeight = FontWeight.Normal,
            fontSize = 15.sp
    ),
    subtitle2 = TextStyle(
            fontFamily = Montserrat,
            fontWeight = FontWeight.Medium,
            fontSize = 12.sp
    ),
    body1 = TextStyle(
            fontFamily = Montserrat,
            fontWeight = FontWeight.Normal,
            fontSize = 16.sp
    ),
    body2 = TextStyle(
            fontFamily = Montserrat,
            fontWeight = FontWeight.Normal,
            fontSize = 14.sp
    ),
    button = TextStyle(
            fontFamily = Montserrat,
            fontWeight = FontWeight.W500,
            fontSize = 14.sp
    ),
    caption = TextStyle(
            fontFamily = Montserrat,
            fontWeight = FontWeight.Normal,
            fontSize = 12.sp
    )

)