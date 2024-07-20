package com.example.bankingapp.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bankingapp.R
import com.example.bankingapp.data.DataCard

val cards = listOf(
    DataCard.Cardfrist,
    DataCard.CardSceand,
    DataCard.CardSchool
)
@Preview(showBackground = true)
@Composable
fun  CardsSection() {
    LazyRow {
        items(cards.size){ index ->

            CardItme(index)
        }
    }

}

@Composable
fun CardItme(index: Int) {
    val card = cards[index]
    var lastItemPeddingEnd = 0.dp
    if (index == cards.size - 1){
        lastItemPeddingEnd = 16.dp
    }
    var image = painterResource(id = R.drawable.ic_visa)
    if (card.cardType == "MASTER CARD"){
        image = painterResource(id = R.drawable.ic_mastercard)
    }

    Box(modifier = Modifier.padding(start = 16.dp, end = lastItemPeddingEnd)){

        Column(
            modifier = Modifier
                .clip(RoundedCornerShape(16.dp))
                .background(card.color)
                .width(250.dp)
                .height(160.dp)
                .clickable { }
                .padding(vertical = 12.dp, horizontal = 16.dp),
            verticalArrangement = Arrangement.SpaceBetween
        ){
            Image(painter = image, contentDescription = card.cardName,
                modifier = Modifier.width(60.dp))

            Spacer(modifier = Modifier.height(10.dp))
            Text(text = card.cardName,
                color =  Color.White,
                fontWeight = FontWeight.Bold)

            Text(text = "$ ${card.balance}",
                color =  Color.White,
                fontSize = 24.sp
                ,
                fontWeight = FontWeight.Bold)

            Text(text = card.cardNumper,
                color =  Color.White,
                fontSize =  19.sp
                ,
                fontWeight = FontWeight.Bold)
        }
    }
}
