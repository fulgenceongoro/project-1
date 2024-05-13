package net.ezra.ui.contact


import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.ezra.R
import net.ezra.navigation.ROUTE_CONTACT
import net.ezra.navigation.ROUTE_HOME


@Composable
fun ContactScreen(navController: NavHostController) {
Box(modifier = Modifier.fillMaxSize())

    Image(painter = painterResource(id = R.drawable.backpic), contentDescription =null,
        modifier = Modifier.fillMaxSize(),
        contentScale = ContentScale.Crop
    )
    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(Color.LightGray),
        horizontalAlignment = Alignment.CenterHorizontally
    ){


        Text(text = "This is the contact screen", color = Color.White, fontFamily = FontFamily.Cursive, fontWeight = FontWeight.Bold  , fontSize = (25.sp))
        Spacer(modifier = Modifier.height(7.dp))
        Text(text = "Holla us through our Email address (moviebox254@gmail.com)",color = Color.White)
        Spacer(modifier = Modifier.height(40.dp))
        Text(text = "Or call our hotline number 071111111112",color = Color.White)
        Spacer(modifier = Modifier.height(40.dp))
        Text(text = "Address: 123 Main street,Cityville,State,ZIP code",color = Color.White)
        Spacer(modifier = Modifier.height(40.dp))
        Text(text = "Store Hours:Monday-Friday:9:00AM-8:00PM,Saturday: 10:00 AM-6:00PM",color = Color.White)
        Spacer(modifier = Modifier.height(80.dp))
        Text(text = "Social Media Handles:",color = Color.White)
        Spacer(modifier = Modifier.height(40.dp))
        Text(text = "Twitter: @moviebox",color = Color.White)
        Spacer(modifier = Modifier.height(20.dp))
        Text(text = "Facebook: @movieboxHQ",color = Color.White)
        Spacer(modifier = Modifier.height(20.dp))
        Text(text = "Instagram: @movieboxofficial",color = Color.White)


        Text(
            modifier = Modifier
                .padding(70.dp)

                .clickable {
                    navController.navigate(ROUTE_HOME) {
                        popUpTo(ROUTE_CONTACT) { inclusive = true }
                    }
                },
            text = "Back to homepage", fontFamily = FontFamily.Cursive, fontSize = (20.sp)
        )







    }

}

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun HomeScreenPreviewLight() {
    ContactScreen(rememberNavController())
}

