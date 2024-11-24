package com.example.littlelemon.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color
import androidx.compose.runtime.Composable


private val DarkColorPalette = darkColorScheme(
    primary = PrimaryGreen,
    primaryContainer = Purple700,  // Updated to use primaryContainer (recommended for Material3)
    secondary = Secondary2,
    onPrimary = Color.White
)


private val LightColorPalette = lightColorScheme(
    primary = PrimaryYellow,
    primaryContainer = Purple700, // Updated for Material3 usage
    secondary = Secondary1,
    onPrimary = Color.Black
)

@Composable
fun LittleLemonTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colorScheme = colors, // Use colorScheme for Material3
        typography = Typography, // Use your defined typography
        shapes = Shapes,
        content = content
    )
}