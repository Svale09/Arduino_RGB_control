package com.example.arduinorgb.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Slider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ColorSlider(
    colorName: String,
    modifier: Modifier = Modifier
){
    var sliderPosition by remember {
        mutableStateOf(0f)
    }

    Column(
        horizontalAlignment = Alignment.Start,
        modifier = modifier.fillMaxWidth()
    ) {
        Text(
            text = colorName,
            fontSize = 30.sp
        )
        Slider(
            value = sliderPosition,
            onValueChange = {/*TODO*/},
            modifier = Modifier.padding(vertical = 10.dp)
        )
    }
}

@Preview(showBackground = true,backgroundColor = 0xff00ff00)
@Composable
private fun PreviewColorSlider(){
    ColorSlider(colorName = "Red")
}
