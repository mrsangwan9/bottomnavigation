package com.example.bottomnavigation

import androidx.compose.foundation.layout.RowScope
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController

@Composable
fun BottomNavigationHome(){
    val navController = rememberNavController()
    Scaffold(
        bottomBar = {
            BottomBar(navController)
        }
    ) {
        BottomNavGraph(navController = navController)

    }
}


@Composable
fun BottomBar(navController:NavHostController){
    val screen =listOf(
        Screen.Home,
        Screen.Profile,
        Screen.Settings
        )
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination =navBackStackEntry?.destination

    BottomNavigation {
        screen.forEach {screen->
            AddItem(
                screen = screen,
                currentDestination = currentDestination,
            navController )
            }
    }
}
@Composable
fun RowScope.AddItem(
    screen: Screen,
    currentDestination: NavDestination?,
    navController: NavHostController
){
    BottomNavigationItem(label = {
                                 Text(screen.title)
    },
        icon = {
       Icon(
           imageVector = screen.icon,
           contentDescription = null
       )
    },
        onClick = { navController.navigate(route =screen.route ){

        popUpTo(navController.graph.findStartDestination().id)
            launchSingleTop=true

        }},
        selected = currentDestination?.hierarchy?.any{
            it.route ==screen.route
        }==true,
    )


}
