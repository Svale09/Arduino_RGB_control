package com.example.arduinorgb.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.arduinorgb.data.RGBValues
import com.example.arduinorgb.ui.components.ColorPreview
import com.example.arduinorgb.ui.components.ColorSlider


@Composable
fun HomeScreen(
    modifier: Modifier = Modifier
) {
    var rgbValues = RGBValues(255, 0, 255);
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier.padding(top = 50.dp)
    ) {
        Text(
            text = "RGB Picker",
            fontSize = 30.sp,
            modifier = Modifier.padding(bottom = 50.dp)
        )
        ColorSlider(colorName = "Red")
        ColorSlider(colorName = "Green")
        ColorSlider(colorName = "Blue")
        ColorPreview(rgbValues = rgbValues, modifier = Modifier.padding(top = 70.dp))
        Button(
            onClick = { /*TODO send values to arduino*/ },
            modifier = Modifier.padding(top = 30.dp)
        ) {
            Text(text = "Change color")
        }
    }
}

@Preview
@Composable
private fun PreviewHomeScreen() {
    HomeScreen()
}