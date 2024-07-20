package com.example.bankingapp.data

import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import com.example.bankingapp.ui.theme.BlueEnd
import com.example.bankingapp.ui.theme.BlueStart
import com.example.bankingapp.ui.theme.OrangeEnd
import com.example.bankingapp.ui.theme.OrangeStart
import com.example.bankingapp.ui.theme.PurpleEnd
import com.example.bankingapp.ui.theme.PurpleStart

sealed class DataCard(
    val cardType : String ,
    val cardName : String ,
    val cardNumper : String ,
    val balance : Double,
    val color: Brush
){

    data object Cardfrist : DataCard(
        cardType =  "VISA",
        cardName = "Business",
        cardNumper = "**** **** **** 6688",
        balance = 70.31,
        color =getGradient(PurpleStart, PurpleEnd)
    )
    data object CardSceand : DataCard(
        cardType =  "MASTER CARD",
        cardName = "Saving",
        cardNumper = "**** **** **** 2556",
        balance = 10.51,
        color =getGradient(BlueStart, BlueEnd)
    )
    data object CardSchool : DataCard(
        cardType =  "VISA",
        cardName = "School",
        cardNumper = "**** **** **** 2244",
        balance = 21.10,
        color =getGradient(OrangeStart, OrangeEnd)
    )
}


fun getGradient(
    startColor: Color,
    endColor: Color
) : Brush{
    return Brush.horizontalGradient(
        colors = listOf(
            startColor,
            endColor
        ))
}

