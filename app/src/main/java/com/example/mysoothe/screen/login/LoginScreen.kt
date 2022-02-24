package com.example.mysoothe.screen.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.mysoothe.R
import com.example.mysoothe.component.LoginTextField
import com.example.mysoothe.component.MySootheButton

@Composable
fun LoginScreen(){

    Surface(
        color = MaterialTheme.colors.background,
        modifier = Modifier.fillMaxSize()
    ) {

        WelcomeBackground()

        WelcomeContent()
    }
}

@Composable
private fun WelcomeContent() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        LoginInputContent()

        Spacer(modifier = Modifier.height(8.dp))

        LoginClickContent()
    }
}

@Composable
private fun WelcomeBackground() {
    Image(
        painter = painterResource(getLoginBackground(isSystemInDarkTheme())),
        contentDescription = null,
        contentScale = ContentScale.FillBounds
    )
}

@Composable
private fun LoginInputContent() {
    Text(
        text = stringResource(id = R.string.log_in),
        style = MaterialTheme.typography.h1,
        color = MaterialTheme.colors.onSurface,
        modifier = Modifier.paddingFromBaseline(bottom = 32.dp)
    )

    LoginTextField(
        value = "",
        onValueChange = {},
        text = stringResource(id = R.string.email_address)
    )

    Spacer(modifier = Modifier.height(8.dp))

    LoginTextField(
        value = "",
        onValueChange = {},
        text = stringResource(id = R.string.password)
    )
}

@Composable
private fun LoginClickContent() {
    MySootheButton(
        text = stringResource(id = R.string.log_in),
        onClick = { /*TODO*/ },
        color = MaterialTheme.colors.primary
    )

    Row() {
        Text(
            text = stringResource(id = R.string.login_question_text),
            style = MaterialTheme.typography.body1,
            color = MaterialTheme.colors.onBackground,
            modifier = Modifier.paddingFromBaseline(top = 32.dp)
        )

        Text(
            text = stringResource(id = R.string.sign_up_login),
            style = MaterialTheme.typography.body1,
            color = MaterialTheme.colors.onBackground,
            modifier = Modifier
                .paddingFromBaseline(top = 32.dp)
                .padding(start = 8.dp)
                .clickable {  }
        )
    }
}



private fun getLoginBackground(isSystemDarkTheme: Boolean): Int{
    return if (isSystemDarkTheme) R.drawable.dark_login
    else R.drawable.light_login
}