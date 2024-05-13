package net.ezra.ui.movies

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import net.ezra.navigation.ROUTE_MOVIESSCREEN
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.painter.BitmapPainter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import net.ezra.R
import androidx.navigation.compose.rememberNavController
import androidx.compose.ui.res.imageResource


@Composable
fun ClickableImageExample(navController: NavController) {
    val imageBitmap = ImageBitmap.imageResource(R.drawable.wakanda)

    ClickableImage(
        imageBitmap = imageBitmap,
        onClick = {
            // Navigate to another destination when the image is clicked
            navController.navigate("https://lookerstudio.google.com/reporting/3674ea7f-71be-4c00-9445-d5f4a1743ef0/page/44b7C?s=vwR34pdVdT0")
        }
    )
}

@Composable
fun ClickableImage(
    imageBitmap: ImageBitmap,
    onClick: () -> Unit
) {
    Image(
        painter = BitmapPainter(imageBitmap),
        contentDescription = null, // Provide a description if needed
        modifier = Modifier
            .size(100.dp)
            .clickable(onClick = onClick),
        contentScale = ContentScale.Crop
    )
}