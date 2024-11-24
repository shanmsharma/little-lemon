package com.example.littlelemon.ui.theme

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Shapes
import androidx.compose.ui.unit.dp

val Shapes = Shapes(
    small = RoundedCornerShape(4.dp),  // 4dp corner radius for small elements
    medium = RoundedCornerShape(4.dp), // 4dp corner radius for medium elements
    large = RoundedCornerShape(0.dp)   // 0dp corner radius for large elements (square corners)
)
