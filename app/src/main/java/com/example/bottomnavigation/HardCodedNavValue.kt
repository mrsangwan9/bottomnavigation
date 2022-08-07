package com.example.bottomnavigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector

sealed class Screen(
    val route :String,
    val title :String,
    val icon:ImageVector
){
    object Home :Screen(
        route = "home",
        title = "home",
        icon = Icons.Default.Home
    )
    object Profile :Screen(
        route = "profile",
        title = "profile",
        icon = Icons.Default.Person
    )
    object Settings:Screen(
        route = "settings",
        title = "settings",
        icon = Icons.Default.Settings
    )
}