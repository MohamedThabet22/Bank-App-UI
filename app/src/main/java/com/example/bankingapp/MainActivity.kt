package com.example.bankingapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.bankingapp.screen.BottomNavigationBar
import com.example.bankingapp.screen.CardsSection
import com.example.bankingapp.screen.CurrenciesSection
import com.example.bankingapp.screen.FinaceSection
import com.example.bankingapp.screen.WalletSection
import com.example.bankingapp.ui.theme.BankingAppTheme
import com.google.accompanist.systemuicontroller.rememberSystemUiController

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BankingAppTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background
                ) {

                    HomeSceen()
                }
            }
        }
    }
    @Composable
    private fun SetBarColor(color: Color) {
        val systemUiController = rememberSystemUiController()
        systemUiController.setStatusBarColor(
            color = color
        )
    }
}
@Preview(showBackground = true)
@Composable
fun HomeSceen() {
     Scaffold(
         bottomBar = {
             BottomNavigationBar()
         }
          ){penerPadding ->
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(penerPadding)

            ){
                WalletSection()
                CardsSection()
                 Spacer(modifier = Modifier.height(16.dp))
                FinaceSection()
                CurrenciesSection()
            }


     }

}