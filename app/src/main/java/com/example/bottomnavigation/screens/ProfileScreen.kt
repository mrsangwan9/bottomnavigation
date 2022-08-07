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


@Composable
fun ProfileScreen(){
    Box(contentAlignment = Alignment.Center,modifier= Modifier.fillMaxSize().background(color = Color.Green)){

        Text(text = "Profile Screen",style = MaterialTheme.typography.h3)

    }

}