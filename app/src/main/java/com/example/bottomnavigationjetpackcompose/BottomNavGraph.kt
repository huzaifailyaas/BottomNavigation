package com.example.bottomnavigationjetpackcompose

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.bottomnavigationjetpackcompose.screen.Home
import com.example.bottomnavigationjetpackcompose.screen.Profile
import com.example.bottomnavigationjetpackcompose.screen.Settings

@Composable
fun BottomNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = BottombarScreen.home.route
    ) {
        composable(BottombarScreen.home.route) {
            Home()
        }
        composable(BottombarScreen.profile.route) {
            // Your Composable for the Profile Screen
            Profile()
        }
        composable(BottombarScreen.setting.route) {
            // Your Composable for the Settings Screen
            Settings()
        }
        // Add other routes as needed
    }
}
