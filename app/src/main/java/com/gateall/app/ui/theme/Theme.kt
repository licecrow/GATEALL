package com.gateall.app.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val Scheme = darkColorScheme(
    primary = Color(0xFF2BE3A0),
    onPrimary = Color(0xFF04140E),
    secondary = Color(0xFF4DA3FF),
    background = Color(0xFF05070C),
    onBackground = Color(0xFFE6EDF5),
    surface = Color(0xFF0E131B),
    onSurface = Color(0xFFE6EDF5),
    surfaceVariant = Color(0xFF161D27),
    error = Color(0xFFFF6B6B)
)

@Composable
fun GateAllTheme(content: @Composable () -> Unit) {
    MaterialTheme(colorScheme = Scheme, content = content)
}
