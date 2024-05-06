package com.example.arduinorgb.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
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
    var rgbValues by remember { mutableStateOf(RGBValues(0, 0, 0)) }
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier.padding(top = 50.dp)
    ) {
        Text(
            text = "RGB Picker",
            fontSize = 30.sp,
            modifier = Modifier.padding(bottom = 50.dp)
        )
        ColorSlider(colorName = "Red", updateRGBValues = {rgbValues.red = (it*255).toInt() }) //TODO fix the logic behind this function so it actually changes the values of RGBValues
        ColorSlider(colorName = "Green", updateRGBValues = {rgbValues.green = (it*255).toInt() })
        ColorSlider(colorName = "Blue", updateRGBValues = {rgbValues.blue = (it*255).toInt()  })
        ColorPreview(rgbValues = rgbValues, modifier = Modifier.padding(top = 70.dp))
        Button(
            onClick = { /*TODO send values to arduino*/ },
            modifier = Modifier.padding(top = 50.dp)
        ) {
            Text(
                text = "Change color",
                modifier = Modifier.padding(5.dp)
            )
        }
    }
}

@Preview
@Composable
private fun PreviewHomeScreen() {
    HomeScreen()
}