package com.example.bankingapp.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.bankingapp.data.Navigation

@Composable
fun BottomNavigationBar() {
    val itme = listOf(
        Navigation.Home,
        Navigation.Notification,
        Navigation.Account,
        Navigation.Wallet
    )
    NavigationBar {

        Row(
            modifier = Modifier.background(MaterialTheme.colorScheme.inverseOnSurface)

        ) {
            itme.forEachIndexed { index, item ->

                NavigationBarItem(selected =
                index == 0, onClick = { /*TODO*/ }, icon = {
                    Icon(
                        imageVector = item.icon, contentDescription = null,
                        tint = MaterialTheme.colorScheme.onBackground,

                    )
                },
                    label = {
                        Text(text = item.title, color = MaterialTheme.colorScheme.onBackground)
                    })
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomeSceen() {
    Scaffold(
        bottomBar = {BottomNavigationBar()}
    ){penerPadding ->
        Column(
            modifier = Modifier.padding(penerPadding)
        ){

        }
    }
}