package com.example.littlelemon.ui.theme

// Import necessary packages
import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.littlelemon.R

// Define custom fonts
val Karla = FontFamily(Font(R.font.karla_regular))
val Markazi = FontFamily(Font(R.font.markazi_text_regular))

// Define Material 3 Typography styles
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = Karla,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    ),
    displayLarge = TextStyle(
        fontFamily = Markazi,
        fontWeight = FontWeight.Bold,
        fontSize = 48.sp
    ),
    headlineSmall = TextStyle(
        fontFamily = Karla,
        fontWeight = FontWeight.Bold,
        fontSize = 18.sp,
        color = PrimaryGreen
    )
)
