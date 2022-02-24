package com.example.mysoothe.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.mysoothe.R


val KulimPark = FontFamily(
    Font(R.font.kulim_park_light,weight= FontWeight.Light),
    Font(R.font.kulim_park_regular, weight= FontWeight.)
)

val LatoBold = FontFamily(
    Font(R.font.lato_regular),
    Font(R.font.lato_bold)
)


val Typography = Typography(
    h1 = TextStyle(
        fontFamily = KulimPark,
        fontWeight = FontWeight.Light,
        fontSize = 28.sp,
        letterSpacing = (1.15).sp
    ),
    h2 = TextStyle(
        fontFamily = KulimPark.Li,
        fontWeight = KulimPark,
        fontSize = 15.sp,
        letterSpacing = (1.15).sp
    )
    /* Other default text styles to override
    button = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.W500,
        fontSize = 14.sp
    ),
    caption = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    )
    */
)