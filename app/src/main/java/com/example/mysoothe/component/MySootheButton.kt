package com.example.mysoothe.component

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun MySootheButton(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    color: Color=MaterialTheme.colors.primary
){
    Button(
        onClick = onClick,
        shape = MaterialTheme.shapes.medium,
        colors = ButtonDefaults.buttonColors(color),
        modifier = modifier
            .height(72.dp)
            .fillMaxWidth()) {
        ButtonInsideText(text = text)
    }
}

