package com.example.mysoothe.component

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun TitleText(
    text: String,
    modifier: Modifier = Modifier,
){
    Text(text = text,
        modifier = modifier,
        style= MaterialTheme.typography.h2,
        color = MaterialTheme.colors.onBackground)
}


@Composable
fun ButtonInsideText(
    text: String,
    modifier: Modifier = Modifier,
){
    Text(text = text,
        modifier = modifier,
        style= MaterialTheme.typography.button,
        color = MaterialTheme.colors.onPrimary)
}


@Composable
fun TextFieldInsideText(
    text: String,
){
    Text(text = text,
        style=MaterialTheme.typography.body1,
        color = MaterialTheme.colors.onSurface)
}