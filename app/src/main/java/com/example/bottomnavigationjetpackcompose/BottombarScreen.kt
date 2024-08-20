package com.example.bottomnavigationjetpackcompose

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottombarScreen(
    val route:String,
    val title:String,
    val icon:ImageVector
) {
    object home:BottombarScreen(
        route = "home",
        title = "Home",
        icon = Icons.Default.Home
    )
    object profile:BottombarScreen(
        route = "profile",
        title = "Profile",
        icon = Icons.Default.Person
    )
    object setting:BottombarScreen(
        route = "setting",
        title = "Setting",
        icon = Icons.Default.Settings
    )
}