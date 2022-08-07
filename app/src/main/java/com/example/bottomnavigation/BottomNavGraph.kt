package com.example.bottomnavigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.bottomnavigation.screens.HomeScreen
import com.example.bottomnavigation.screens.ProfileScreen
import com.example.bottomnavigation.screens.SettingScreen

@Composable
fun BottomNavGraph(navController:NavHostController){


    NavHost(
        navController = navController,
        startDestination = Screen.Home.route
    )
    {
        composable(route = Screen.Home.route){
            HomeScreen()
        }
        composable(route = Screen.Profile.route){
            ProfileScreen()
        }
        composable(route = Screen.Settings.route){
            SettingScreen()
        }
    }
}