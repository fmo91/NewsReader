package com.example.newsreader.ui.home.news.components

import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.example.newsreader.model.entities.Article

@Composable
fun ArticleRow(
    modifier: Modifier = Modifier,
    article: Article
) {
    Card(
        modifier = modifier
            .padding(5.dp)
    ) {
        val context = LocalContext.current
        val intent = remember { Intent(Intent.ACTION_VIEW, Uri.parse(article.url)) }

        Column {
            AsyncImage(
                modifier = Modifier
                    .height(150.dp)
                    .fillMaxWidth(),
                model = article.urlToImage,
                contentScale = ContentScale.FillBounds,
                contentDescription = "Translated description of what the image contains",
            )

            Text(
                text = article.title,
                fontSize = 16.sp,
                fontWeight = FontWeight.Black,
            )

            Text(
                text = article.description,
                fontSize = 14.sp,
                fontWeight = FontWeight.Medium,
            )

            Button(onClick = {
                context.startActivity(intent)
            }) {
                Text("OPEN")
            }
        }
    }
}