package com.example.mysoothe.component

import android.graphics.Paint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.mysoothe.R

@Composable
fun FavoriteCard(imageUrl: String,text: String) {

    Card(
        shape = MaterialTheme.shapes.small,
        elevation = 0.dp,
        modifier = Modifier
            .height(56.dp)
            .width(192.dp)
            .background(MaterialTheme.colors.onPrimary)) {

        Row(modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically) {

            Image(
                painter = painterResource(id = R.drawable.ic_launcher_background),
                contentDescription = null,
                contentScale = ContentScale.FillBounds,
                modifier = Modifier.size(56.dp)
            )

            Text(
                text = text,
                color = MaterialTheme.colors.onSurface,
                style = MaterialTheme.typography.h3,
                modifier = Modifier.padding(horizontal = 16.dp),
            )
        }
    }
}

@Composable
fun AlignCard(imageUrl: String,text: String) {
    Card(
        shape = MaterialTheme.shapes.small,
        elevation = 0.dp,
        backgroundColor = MaterialTheme.colors.background,
        modifier = Modifier
        .height(112.dp)) {
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Image(
                painter = painterResource(id = R.drawable.ic_launcher_background),
                contentDescription = null,
                contentScale = ContentScale.FillBounds,
                modifier = Modifier
                    .size(88.dp)
                    .clip(CircleShape),
            )

            Text(
                text = text,
                color = MaterialTheme.colors.onSurface,
                style = MaterialTheme.typography.h3,
                modifier = Modifier.paddingFromBaseline(top = 24.dp),
            )
        }
    }
}