package com.example.mysoothe.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun MySootheTextField(
    modifier: Modifier = Modifier,
    value: String,
    onValueChange: (String) -> Unit,
    text: String,
    leadingIcon: @Composable (() -> Unit)? = null,
    //background: Color =
){

    TextField(
        value = value,
        onValueChange = onValueChange,
        leadingIcon = leadingIcon,
        label = { TextFieldInsideText(text = text)},
        singleLine=true,
        maxLines=1,
        shape= MaterialTheme.shapes.small,
        modifier = modifier
            .height(56.dp)
            .fillMaxWidth(),
    )
}