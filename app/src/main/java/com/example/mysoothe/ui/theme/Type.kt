package com.example.mysoothe.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.mysoothe.R


val KulimParkLight = FontFamily(Font(R.font.kulim_park_light))
val KulimParkRegular = FontFamily(Font(R.font.kulim_park_regular))
val LatoBold = FontFamily(Font(R.font.lato_bold))
val LatoRegular = FontFamily(Font(R.font.lato_regular))


val Typography = Typography(
    h1 = TextStyle(
        fontFamily = KulimParkLight,
        fontSize = 28.sp,
        letterSpacing = (1.15).sp
    ),
    h2 = TextStyle(
        fontFamily = KulimParkRegular,
        fontSize = 15.sp,
        letterSpacing = (1.15).sp
    ),
    h3 = TextStyle(
        fontFamily = LatoBold,
        fontSize = 14.sp,
        letterSpacing = 0.sp
    ),
    body1 = TextStyle(
        fontFamily = LatoRegular,
        fontSize = 14.sp,
        letterSpacing = 0.sp
    ),
    button = TextStyle(
        fontFamily = LatoBold,
        letterSpacing = (1.15).sp,
        fontSize = 14.sp
    ),
    caption = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp,
        letterSpacing = (1.15).sp
    )
)