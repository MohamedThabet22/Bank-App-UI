package com.example.bankingapp.data

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AttachMoney
import androidx.compose.material.icons.rounded.Euro
import androidx.compose.ui.graphics.vector.ImageVector

sealed class Currency (
    val name : String ,
    val buy : Float ,
    val sell : Float ,
    val icon : ImageVector
){
    data object  USD : Currency(
        name = "USD",
        buy = 31.54f,
        sell = 31.21f,
        icon = Icons.Rounded.AttachMoney
    )

    data object  EUR : Currency(
        name = "EUR",
        buy = 41.52f,
        sell = 21.61f,
        icon = Icons.Rounded.Euro
    )


    data object  EGP : Currency(
        name = "EGP",
        buy = 1.94f,
        sell = 0.28f,
        icon = Icons.Rounded.AttachMoney
    )

    data object  YEN : Currency(
        name = "YEN",
        buy = 11.64f,
        sell = 9.11f,
        icon = Icons.Rounded.AttachMoney
    )
}


