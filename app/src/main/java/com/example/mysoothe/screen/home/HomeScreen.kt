package com.example.mysoothe.screen.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.mysoothe.R
import com.example.mysoothe.component.AlignCard
import com.example.mysoothe.component.MySootheTextField
import com.example.mysoothe.component.FavoriteCard
import com.example.mysoothe.component.TitleText


@Composable
fun HomeScreen(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colors.background)
            .padding(start = 16.dp)) {
        
        Spacer(modifier = Modifier.height(56.dp))

        SearchContent()

        FavoriteContent()

        AlignContent(stringResource(id = R.string.align_your_body))
        AlignContent(stringResource(id = R.string.align_your_mind))

    }
}

@Composable
private fun SearchContent() {
    MySootheTextField(
        value = "",
        onValueChange = {},
        text = stringResource(id = R.string.search),
        leadingIcon = { Icon(imageVector = Icons.Filled.Search, contentDescription = null) },
        modifier = Modifier.padding(end = 16.dp)
    )
}

@Composable
private fun FavoriteContent() {
    TitleText(
        text = stringResource(id = R.string.favorite_collections),
        modifier = Modifier.paddingFromBaseline(top = 40.dp, bottom = 8.dp)
    )

    Column {
        LazyRow(
            modifier =
            Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            items(19) {
                FavoriteCard("k", "hjk");
            }
        }

        Spacer(modifier = Modifier.height(8.dp))

        LazyRow(
            modifier =
            Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            items(19) {
                FavoriteCard("k", "hjk");
            }
        }
    }
}

@Composable
private fun AlignContent(text : String) {
    Spacer(modifier = Modifier.height(32.dp))

    TitleText(
        text = text,
        modifier = Modifier.paddingFromBaseline(top = 40.dp, bottom = 8.dp)
    )

    LazyRow(
        modifier = Modifier
            .fillMaxWidth()
            .height(112.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)

    ) {

        items(19) {it
                AlignCard("k","hjk$it");
        }
    }
}
