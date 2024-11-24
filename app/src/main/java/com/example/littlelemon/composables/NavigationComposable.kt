package com.example.littlelemon.composables

import android.content.Context
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.compose.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.example.littlelemon.navigation.Home
import com.example.littlelemon.navigation.Onboarding
import com.example.littlelemon.navigation.Profile

@Composable
fun NavigationComposable(navController: NavHostController) {
    val context = LocalContext.current
    val sharedPreferences = context.getSharedPreferences("Little Lemon", Context.MODE_PRIVATE)

    val startDestination = remember {
        if (sharedPreferences.getBoolean("userRegistered", false)) {
            Home.route
        } else {
            Onboarding.route
        }
    }



    NavHost(navController = navController, startDestination = startDestination) {
        composable(Onboarding.route) {
            Onboarding(navController)
        }
        composable(Home.route) {
            Home(navController)
        }
        composable(Profile.route) {
            Profile(navController)
        }
    }
}

