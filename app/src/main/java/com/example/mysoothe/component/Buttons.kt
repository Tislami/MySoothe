package com.example.mysoothe.component

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.InlineTextContent
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextLayoutResult
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import com.example.mysoothe.R
import com.example.mysoothe.screen.welcome.WelcomeScreen
import com.example.mysoothe.ui.theme.MySootheTheme

@Composable
fun WelcomeButton(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    color: Color=MaterialTheme.colors.primary
){
    Button(
        onClick = onClick,
        elevation= ButtonDefaults.elevation(8.dp),
        shape = MaterialTheme.shapes.medium,
        colors = ButtonDefaults.buttonColors(color),
        modifier = modifier
            .height(72.dp)
            .padding(horizontal = 16.dp)
            .fillMaxWidth()) {
        WelcomeButtonInsideText(text = text)
    }
}

@Composable
fun WelcomeButtonInsideText(
    text: String,
    modifier: Modifier = Modifier,
){
    Text(text = text,
        modifier = modifier,
        style=MaterialTheme.typography.button,
        color = MaterialTheme.colors.onPrimary)
}


@Preview(heightDp = 360, widthDp = 640)
@Composable
fun DarkThemePreview(){
    MySootheTheme(darkTheme = true) {
        WelcomeButton("",onClick = { /*TODO*/ })
    }
}


@Preview(heightDp = 360, widthDp = 640)
@Composable
fun LightThemePreview(){
    MySootheTheme(darkTheme = false) {
        WelcomeButton("",onClick = { /*TODO*/ })
    }
}
