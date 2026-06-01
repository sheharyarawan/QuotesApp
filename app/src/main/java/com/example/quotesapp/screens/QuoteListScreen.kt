package com.example.quotesapp.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.quotesapp.model.Quote
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.quotesapp.model.QuoteData.quotes


@Composable
fun QuoteListScreen(quotes: List<Quote>) {

    Column(modifier = Modifier.fillMaxSize(1f)
        .background(Color(0xFFFAFAFA)))
    {
        Text(text = "Quotes App",
            style = MaterialTheme.typography.headlineMedium,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(0.dp, 10.dp,0.dp,0.dp).
            fillMaxWidth(1f))

        LazyColumn() {
            items(quotes){quote->
                QuoteListItem(quote)
            }
        }
    }
}
@Preview
@Composable
private fun prev() {
    QuoteListScreen(quotes)
}