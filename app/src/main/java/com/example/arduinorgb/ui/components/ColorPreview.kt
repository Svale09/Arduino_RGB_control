package com.example.arduinorgb.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.arduinorgb.data.RGBValues

@Composable
fun ColorPreview(
    rgbValues: RGBValues,
    modifier: Modifier = Modifier,
) {
    Row(
        horizontalArrangement = Arrangement.SpaceAround,
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier.fillMaxWidth()
    ) {
        Text(text = "RGB Values: ${rgbValues.red}, ${rgbValues.green}, ${rgbValues.blue}")
        Box(
            modifier = Modifier
                .height(50.dp)
                .width(50.dp)
                .clip(shape = CircleShape)
                .background(Color(rgbValues.red, rgbValues.green, rgbValues.blue))
        )
    }
}

@Preview
@Composable
private fun PreviewColorPreview() {
    ColorPreview(rgbValues = RGBValues(255, 0, 0))
}