package com.example.bankingapp.data

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.MonetizationOn
import androidx.compose.material.icons.rounded.StarHalf
import androidx.compose.material.icons.rounded.Wallet
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import com.example.bankingapp.ui.theme.BlueStart
import com.example.bankingapp.ui.theme.OrangeStart
import com.example.bankingapp.ui.theme.PurpleStart

sealed class  Finace(
    val icon : ImageVector,
    val name : String,
    val background : Color,
){

    data object  Business : Finace(
        name = "MY\nBusiness",
        icon =  Icons.Rounded.StarHalf,
        background = OrangeStart

    )

    data object  Wallet : Finace(
        name = "MY\nWallet",
        icon =  Icons.Rounded.Wallet,
        background = BlueStart

    )
    data object  Finacnee : Finace(
        name = "Finacnee\nAnalytics",
        icon =  Icons.Rounded.StarHalf,
        background = PurpleStart

    )
    data object  Transctions : Finace(
        name = "MY\nTransctions",
        icon =  Icons.Rounded.MonetizationOn,
        background = OrangeStart

    )
}

