package com.example.bankingapp.data

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Wallet
import androidx.compose.ui.graphics.vector.ImageVector

sealed class Navigation(
    val title: String,
    val icon : ImageVector
){

    data object  Home : Navigation("Home", Icons.Filled.Home)

    data object  Notification : Navigation("Notification", Icons.Filled.Notifications)

    data object  Account : Navigation("Account", Icons.Filled.AccountCircle)

    data object  Wallet : Navigation("Wallet", Icons.Filled.Wallet)

}
