package com.example.mysoothe.component

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun LoginTextField(
    value: String,
    onValueChange: (String) -> Unit,
    text: String,
    modifier: Modifier = Modifier
){

    TextField(
        value = value,
        onValueChange = onValueChange,
        label = { LoginInsideTextFieldText(text = text)},
        singleLine=true,
        maxLines=1,
        shape= MaterialTheme.shapes.small,
        modifier = modifier
            .height(56.dp)
            .fillMaxWidth()
        )
}

@Composable
fun LoginInsideTextFieldText(
    text: String,
){
    Text(text = text,
        style=MaterialTheme.typography.body1,
        color = MaterialTheme.colors.onSurface)
}