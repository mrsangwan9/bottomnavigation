package com.example.bottomnavigation.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview


@Composable
fun HomeScreen(){
    Box(contentAlignment = Alignment.Center,modifier= Modifier
        .fillMaxSize()
        .background(color = Color.Yellow)){

        Text(text = "Home Screen",style = MaterialTheme.typography.h3)

    }

}
@Preview(showBackground = true)
@Composable
fun HomeScreenPre(){
    HomeScreen()
}