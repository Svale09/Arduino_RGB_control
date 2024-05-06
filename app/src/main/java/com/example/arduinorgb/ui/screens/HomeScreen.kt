package com.example.arduinorgb.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.arduinorgb.data.RGBValues
import com.example.arduinorgb.ui.components.ColorPreview
import com.example.arduinorgb.ui.components.ColorSlider


@Composable
fun HomeScreen(
    modifier: Modifier = Modifier
) {
    var rgbValues = RGBValues(255, 255, 255);
    Column {
        ColorSlider(colorName = "Red")
        ColorSlider(colorName = "Green")
        ColorSlider(colorName = "Blue")
        ColorPreview(rgbValues = rgbValues)
    }
}

@Preview
@Composable
private fun PreviewHomeScreen(){
    HomeScreen()
}