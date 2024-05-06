package com.example.arduinorgb.ui.components

import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.arduinorgb.data.RGBValues

@Composable
fun ColorPreview(
    rgbValues: RGBValues,
    modifier: Modifier = Modifier,
    color: Color
){
    Row {
        Text(text = "RGB Values: $rgbValues.red, $rgbValues.green, $rgbValues.blue")
    }
}