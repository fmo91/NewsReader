package com.example.newsreader.ui.base

import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.newsreader.R

@Composable
fun NewsTopBar() {
    TopAppBar(
        title = {
            Text(text = stringResource(id = R.string.top_bar_title))
        }
    )
}

@Preview(showBackground = true)
@Composable
fun NewsTopBarPreview() {
    NewsTopBar()
}