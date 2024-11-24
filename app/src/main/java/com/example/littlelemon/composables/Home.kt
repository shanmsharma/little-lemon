package com.example.littlelemon.composables

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController

@Composable
fun Home(navController: NavHostController) {
    Text(text = "Home screen")
}