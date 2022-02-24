package com.example.mysoothe.screen.welcome

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mysoothe.R
import com.example.mysoothe.component.WelcomeButton
import com.example.mysoothe.ui.theme.MySootheTheme

@Composable
fun WelcomeScreen(){
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colors.background) {

        Image(
            painter = painterResource(
                id = getWelcomeBackground(isSystemInDarkTheme())),
            contentDescription = null,
            contentScale = ContentScale.FillBounds)

        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally) {

            Image(
                painter = painterResource(
                    id = getLogo(isSystemInDarkTheme())),
                contentDescription = null)

            Spacer(modifier = Modifier.height(32.dp))
            
            WelcomeButton(
                stringResource(id = R.string.sing_up),
                onClick = { /*TODO*/ },
                color = MaterialTheme.colors.primary)

            Spacer(modifier = Modifier.height(8.dp))

            WelcomeButton(
                stringResource(id = R.string.log_in),
                onClick = { /*TODO*/ },
                color = MaterialTheme.colors.secondary)
        }
    }

}

private fun getLogo(isSystemDarkTheme: Boolean): Int{
    return if (isSystemDarkTheme) R.drawable.dark_logo 
    else R.drawable.light_logo 
}

private fun getWelcomeBackground(isSystemDarkTheme: Boolean): Int{
    return if (isSystemDarkTheme) R.drawable.dark_welcome 
    else R.drawable.light_welcome 
}



@Preview
@Composable
fun LightThemePreview(){
    MySootheTheme(darkTheme = false) {
        WelcomeScreen()
    }
}

@Preview
@Composable
fun DarkThemePreview(){
    MySootheTheme(darkTheme = true) {
        WelcomeScreen()
    }
}