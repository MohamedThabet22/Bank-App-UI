package com.example.bankingapp.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bankingapp.data.Finace
val finaceList = listOf(
    Finace.Business,
    Finace.Wallet,
    Finace.Finacnee,
    Finace.Transctions,
)
@Preview(showBackground = true)
@Composable

fun  FinaceSection() {

    Column {

        Text(text = "Finance"
        ,
            fontSize =  24.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(16.dp))
    }
    LazyRow {
        items(finaceList.size){
            FinaceItme(it)
        }
    }
}

@Composable
fun FinaceItme(index: Int) {
    val finace = finaceList[index]
    var lastPeddingEnd = 0.dp

    if (index == finaceList.size - 1){
        lastPeddingEnd = 16.dp
    }
    Box(modifier = Modifier.padding(start = 16.dp, end = lastPeddingEnd)) {
        Column(
            modifier = Modifier
                .clip(RoundedCornerShape(16.dp))
                .background(MaterialTheme.colorScheme.secondaryContainer)
                .size(120.dp)
                .padding(13.dp),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Box(
                modifier =
                Modifier
                    .clip(RoundedCornerShape(16.dp))
                    .background(finace.background)
                    .padding(6.dp)
            ) {
                Icon(
                    imageVector = finace.icon, contentDescription = finace.name,
                    tint = Color.White
                )
            }

            Text(
                text = finace.name,
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.onSecondaryContainer
            )

        }

    }
}


