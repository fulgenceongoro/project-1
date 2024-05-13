package net.ezra.ui.upload


import android.annotation.SuppressLint


import android.os.Bundle
import android.widget.MediaController
import androidx.appcompat.app.AppCompatActivity




import android.content.Intent
import android.media.AsyncPlayer
import android.net.Uri
import android.provider.MediaStore
import androidx.activity.compose.ManagedActivityResultLauncher
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.ActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
//noinspection UsingMaterialAndMaterial3Libraries
import androidx.compose.material.BottomNavigation
//noinspection UsingMaterialAndMaterial3Libraries
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.OutlinedButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.MailOutline
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Send
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.rounded.ArrowForward
import androidx.compose.material.icons.rounded.Menu
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonColors
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.ContextCompat.startActivity
import androidx.core.net.toUri
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import coil.compose.AsyncImage
import com.google.api.Context
import hilt_aggregated_deps._dagger_hilt_android_internal_modules_ApplicationContextModule
import net.ezra.R
import net.ezra.navigation.ROUTE_HOME
import net.ezra.navigation.ROUTE_LOGIN
import net.ezra.navigation.ROUTE_VIEW_STUDENTS
import net.ezra.navigation.ROUTE_CONTACT
import net.ezra.navigation.ROUTE_MOVIESSCREEN
import net.ezra.navigation.ROUTE_SEARCH
import net.ezra.navigation.ROUTE_UPLOAD
import net.ezra.navigation.ROUTE_VIDEOS
import net.ezra.navigation.ROUTE_SIGNUP
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController



data class Screen(val title: String, val icon: Int)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter", "ResourceAsColor")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Services(navController: NavHostController) {


    var isDrawerOpen by remember { mutableStateOf(false) }

    val callLauncher: ManagedActivityResultLauncher<Intent, ActivityResult> =
        rememberLauncherForActivityResult(contract = ActivityResultContracts.StartActivityForResult()) { _ ->

        }

    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = {

                    Text(text = "Chill Spot Movies",
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                    )



                    // Text(text = stringResource(id = R.string.apen))
                },
                navigationIcon = @Composable {
                    if (!isDrawerOpen) {
                        IconButton(onClick = { isDrawerOpen = true }) {
                            Icon(
                                Icons.Default.Menu,
                                contentDescription = "Main Menu",
                                tint = Color.Gray
                            )
                        }
                    }
                },

                actions = {
                    IconButton(onClick = {
                        navController.navigate(ROUTE_LOGIN) {
                            popUpTo(ROUTE_HOME) { inclusive = true }
                        }

                    }) {
                        Icon(
                            imageVector = Icons.Filled.AccountCircle,
                            contentDescription = null,
                            tint = Color.Gray
                        )
                    }
                },

                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color(0xFF1d1e1c),
                    titleContentColor = Color.White,

                    )

            )
        },

        content = @Composable {

            Box(

                modifier = Modifier
                    .fillMaxSize()
                    .clickable {
                        if (isDrawerOpen) {
                            isDrawerOpen = false
                        }
                    }
            ){


                Spacer(modifier = Modifier.height(20.dp))


                LazyColumn {

                    item {


//Column {
//
//    Text(
//        color = Color.White,
//        textAlign=TextAlign.Center,
//        text = "Here Is What We Have!!",
//
//       style = MaterialTheme.typography.headlineLarge,
//
//        modifier = Modifier.padding(bottom = 16.dp)
//
//    )
//}





                        Column {
                            Image(painter = painterResource(id = R.drawable.chill), contentDescription = "",
                                Modifier.fillMaxSize(),
                                contentScale = ContentScale.Crop

                            )
                        }


                        Spacer(modifier = Modifier.height(15.dp))


                        Row {
//Button(onClick = {   navController.navigate(ROUTE_LOGIN) {
//    popUpTo(ROUTE_HOME) { inclusive = true }
//} },
//        modifier=Modifier,
//    colors=ButtonDefaults.buttonColors(Color.Transparent)
//    ) {
//
//    Icon(imageVector = Icons.Default.Menu, "",
//
//        modifier= Modifier
//            .background(Color.Black)
//            .size(30.dp)
//
//    )
//
//
//}
//
//                        BottomNavigationItem(icon = {
//                            Icon(imageVector = Icons.Default.Search, "",tint = Color.White)
//                        },
//                            label = { Text(
//                                text = "Find",
//                                color =  Color.White) },
//                            selected = (selectedIndex.value == 2),
//                            onClick = {
//
//                                navController.navigate(ROUTE_ADD_PRODUCT) {
//                                    popUpTo(ROUTE_HOME) { inclusive = true }
//                                }
//
//                            })
                            Row {


                                androidx.compose.material.IconButton(onClick = {
                                    navController.navigate(ROUTE_VIDEOS) {
                                        popUpTo(ROUTE_HOME) { inclusive = true }
                                    }
                                }) {
                                    Text(text = "Movies", fontFamily = FontFamily.Cursive, fontSize = (20.sp)
                                    )
                                }




                                Spacer(modifier = Modifier.width(170.dp))

                                androidx.compose.material.IconButton(onClick = {
                                    navController.navigate(ROUTE_CONTACT) {
                                        popUpTo(ROUTE_HOME) { inclusive = true }
                                    }
                                }) {
                                    Text(text = "About Us", fontFamily = FontFamily.Cursive, fontSize = (20.sp)
                                    )
                                }


                            }


                            Spacer(modifier = Modifier.width(285.dp))





                            Icon(
                                Icons.Rounded.Share,
                                contentDescription = stringResource(id = R.string.shopping_cart_content_desc),
                                modifier = Modifier.size(35.dp),


                                )





                        }

                        Spacer(modifier = Modifier.height(20.dp))










                        Column(modifier=Modifier.fillMaxSize()) {



                            var searchText by remember { mutableStateOf(TextFieldValue()) }

                            TextField(
                                value = searchText,
                                onValueChange = { searchText = it },
                                shape = RoundedCornerShape(25.dp),
                                placeholder = { Text("Search ") },
                                modifier = Modifier.fillMaxWidth(),
                                trailingIcon = {
                                    Icon(imageVector = Icons.Default.Search,
                                        contentDescription = "emailIcon"
                                    ) },

                                )


                        }
                        Spacer(modifier = Modifier.height(10.dp))




                        LazyRow {
                            item {
                                Card(onClick = { navController.navigate("https://lookerstudio.google.com/reporting/3674ea7f-71be-4c00-9445-d5f4a1743ef0/page/44b7C?s=vwR34pdVdT0") }) {

                                    Image(painter = painterResource(id = R.drawable.furiousnine), contentDescription ="")
                                    Text(text = "Fast/Furious nine", fontFamily = FontFamily.Cursive)


                                }


                                Spacer(modifier = Modifier.width(5.dp))
                                Card(onClick = { "https://www.marvel.com/movies/thor-love-and-thunder#purchase-10" }) {

                                    Image(painter = painterResource(id = R.drawable.blackwidow), contentDescription ="")
                                    Text(text = "...Black Widow", fontFamily = FontFamily.Cursive)

                                }


                                Spacer(modifier = Modifier.width(10.dp))
                                Card(onClick = { "https://www.marvel.com/movies/thor-love-and-thunder#purchase-10" }) {

                                    Image(painter = painterResource(id = R.drawable.snakeeyes), contentDescription ="")
                                    Text(text = "...Snake eyes", fontFamily = FontFamily.Cursive)

                                }


                                Spacer(modifier = Modifier.width(10.dp))
                                Card(onClick = { "https://www.marvel.com/movies/thor-love-and-thunder#purchase-10" }) {

                                    Image(painter = painterResource(id = R.drawable.junglecruise), contentDescription ="")
                                    Text(text = "..Jungle cruise", fontFamily = FontFamily.Cursive)

                                }

                                Spacer(modifier = Modifier.width(10.dp))
                                Card(onClick = { "https://www.marvel.com/movies/thor-love-and-thunder#purchase-10" }) {

                                    Image(painter = painterResource(id = R.drawable.quietplace), contentDescription ="")
                                    Text(text = "...Quiet place", fontFamily = FontFamily.Cursive)

                                }


                                Spacer(modifier = Modifier.width(10.dp))
                                Card(onClick = { "https://www.marvel.com/movies/thor-love-and-thunder#purchase-10" }) {

                                    Image(painter = painterResource(id = R.drawable.dune), contentDescription ="")
                                    Text(text = "....Dune", fontFamily = FontFamily.Cursive)

                                }


                                Spacer(modifier = Modifier.width(10.dp))
                                Card(onClick = { "https://www.marvel.com/movies/thor-love-and-thunder#purchase-10" }) {

                                    Image(painter = painterResource(id = R.drawable.venom), contentDescription ="")
                                    Text(text = "....Venom", fontFamily = FontFamily.Cursive)

                                }

                                Spacer(modifier = Modifier.width(10.dp))
                                Card(onClick = { "https://www.marvel.com/movies/thor-love-and-thunder#purchase-10" }) {

                                    Image(painter = painterResource(id = R.drawable.eternals), contentDescription ="")
                                    Text(text = "....Eternals", fontFamily = FontFamily.Cursive)

                                }


                                Spacer(modifier = Modifier.width(10.dp))
                                Card(onClick = { "https://www.marvel.com/movies/thor-love-and-thunder#purchase-10" }) {

                                    Image(painter = painterResource(id = R.drawable.ghostbusters), contentDescription ="")
                                    Text(text = "...Ghost busters", fontFamily = FontFamily.Cursive)

                                }


                            }


                        }




                        Spacer(modifier = Modifier.height(10.dp))


                        Row(modifier = Modifier.fillMaxSize()) {

                            Column(modifier = Modifier.padding(10.dp)) {
                                Text(text = "Recent", color = Color.Black, fontFamily = FontFamily.Cursive)
                            }
                            Spacer(modifier = Modifier.width(270.dp))
                            Column {


                                Icon(
                                    Icons.Rounded.ArrowForward,
                                    contentDescription = stringResource(id = R.string.shopping_cart_content_desc),
                                    modifier = Modifier
                                        .size(35.dp)
                                        .clickable {
                                            navController.navigate(ROUTE_HOME) {
                                                popUpTo(ROUTE_UPLOAD) { inclusive = true }
                                            }
                                        }
                                )
                            }
                        }



                        LazyRow(
                            modifier = Modifier,
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            item {



                                Spacer(modifier = Modifier.width(10.dp))
                                Card(onClick = { "https://www.marvel.com/movies/thor-love-and-thunder#purchase-10" }) {

                                    Image(painter = painterResource(id = R.drawable.nun), contentDescription ="")
                                    Text(text = "....Nun", fontFamily = FontFamily.Cursive)

                                }


       Spacer(modifier = Modifier.width(10.dp))
                                Card(onClick = { "https://www.marvel.com/movies/thor-love-and-thunder#purchase-10" }) {

                                    Image(painter = painterResource(id = R.drawable.shazam), contentDescription ="")
                                    Text(text = "...Shazam", fontFamily = FontFamily.Cursive)

                                }

                                Spacer(modifier = Modifier.width(10.dp))
                                Card(onClick = { "https://www.marvel.com/movies/thor-love-and-thunder#purchase-10" }) {

                                    Image(painter = painterResource(id = R.drawable.creed), contentDescription ="")
                                    Text(text = "....Creed", fontFamily = FontFamily.Cursive)

                                }


                                Spacer(modifier = Modifier.width(10.dp))
                                Card(onClick = { "https://www.marvel.com/movies/thor-love-and-thunder#purchase-10" }) {

                                    Image(painter = painterResource(id = R.drawable.black), contentDescription ="")
                                    Text(text = "...Black panther", fontFamily = FontFamily.Cursive)

                                }


                                Spacer(modifier = Modifier.width(10.dp))
                                Card(onClick = { "https://www.marvel.com/movies/thor-love-and-thunder#purchase-10" }) {

                                    Image(painter = painterResource(id = R.drawable.adam), contentDescription ="")
                                    Text(text = "Black adam", fontFamily = FontFamily.Cursive)

                                }

                                Spacer(modifier = Modifier.width(10.dp))
                                Card(onClick = { "https://www.marvel.com/movies/thor-love-and-thunder#purchase-10" }) {

                                    Image(painter = painterResource(id = R.drawable.flash), contentDescription ="")
                                    Text(text = "...Flash", fontFamily = FontFamily.Cursive)

                                }


                                Spacer(modifier = Modifier.width(10.dp))
                                Card(onClick = { "https://www.marvel.com/movies/thor-love-and-thunder#purchase-10" }) {

                                    Image(painter = painterResource(id = R.drawable.missionimpossible), contentDescription ="")
                                    Text(text = "..Mission impossible", fontFamily = FontFamily.Cursive)

                                }
                                Spacer(modifier = Modifier.width(10.dp))

                                Card(onClick = { "https://www.marvel.com/movies/thor-love-and-thunder#purchase-10" }) {

                                    Image(painter = painterResource(id = R.drawable.westside), contentDescription ="")
                                    Text(text = "...Westside stories", fontFamily = FontFamily.Cursive)

                                }
                                Spacer(modifier = Modifier.width(10.dp))

                                Card(onClick = { "https://www.marvel.com/movies/thor-love-and-thunder#purchase-10" }) {

                                    Image(painter = painterResource(id = R.drawable.doctorstrange), contentDescription ="")
                                    Text(text = "...Doctor strange", fontFamily = FontFamily.Cursive)

                                }
                                Spacer(modifier = Modifier.width(10.dp))

                                Card(onClick = { "https://www.marvel.com/movies/thor-love-and-thunder#purchase-10" }) {

                                    Image(painter = painterResource(id = R.drawable.matrix), contentDescription ="")
                                    Text(text = "...The matrix", fontFamily = FontFamily.Cursive)

                                }
                                Spacer(modifier = Modifier.width(10.dp))

                                Card(onClick = { "https://www.marvel.com/movies/thor-love-and-thunder#purchase-10" }) {

                                    Image(painter = painterResource(id = R.drawable.racooncity), contentDescription ="")
                                    Text(text = "...Racoon city", fontFamily = FontFamily.Cursive)

                                }


                            }


                        }



                        Spacer(modifier = Modifier.height(10.dp))




                        Row(modifier = Modifier.fillMaxSize()) {

                            Column(modifier = Modifier.padding(10.dp)) {
                                Text(text = "New", color = Color.Black, fontFamily = FontFamily.Cursive)
                            }
                            Spacer(modifier = Modifier.width(270.dp))
                            Column {


                                Icon(
                                    Icons.Rounded.ArrowForward,
                                    contentDescription = stringResource(id = R.string.shopping_cart_content_desc),
                                    modifier = Modifier
                                        .size(35.dp)
                                        .clickable {
                                            navController.navigate(ROUTE_HOME) {
                                                popUpTo(ROUTE_UPLOAD) { inclusive = true }
                                            }
                                        }

                                )
                            }
                        }



                        LazyRow {
                            item {
                                Card(onClick = { "https://www.marvel.com/movies/thor-love-and-thunder#purchase-10" }) {

                                    Image(painter = painterResource(id = R.drawable.batb), contentDescription ="")
                                    Text(text = "...Beauty and the beast", fontFamily = FontFamily.Cursive)

                                }



                                Spacer(modifier = Modifier.width(10.dp))


                                Card(onClick = { "https://www.marvel.com/movies/thor-love-and-thunder#purchase-10" }) {

                                    Image(painter = painterResource(id = R.drawable.beekeeper), contentDescription ="")
                                    Text(text = "...Beekeeper", fontFamily = FontFamily.Cursive)
                                    
                                }

                                
                                Spacer(modifier = Modifier.width(10.dp))

                                Card(onClick = { "https://www.marvel.com/movies/thor-love-and-thunder#purchase-10" }) {

                                    Image(painter = painterResource(id = R.drawable.wick), contentDescription ="")
                                    Text(text = "...John wick", fontFamily = FontFamily.Cursive)

                                }


                                Spacer(modifier = Modifier.width(10.dp))


                                Card(onClick = { "https://www.marvel.com/movies/thor-love-and-thunder#purchase-10" }) {

                                    Image(painter = painterResource(id = R.drawable.transformers), contentDescription ="")
                                    Text(text = "...Transformers", fontFamily = FontFamily.Cursive)

                                }

                                Spacer(modifier = Modifier.width(10.dp))


                                Card(onClick = { "https://www.marvel.com/movies/thor-love-and-thunder#purchase-10" }) {

                                    Image(painter = painterResource(id = R.drawable.guardiansofthegalaxy), contentDescription ="")
                                    Text(text = "...Guardians of the galaxy", fontFamily = FontFamily.Cursive)

                                }

                                Spacer(modifier = Modifier.width(10.dp))

                                Card(onClick = { "https://www.marvel.com/movies/thor-love-and-thunder#purchase-10" }) {

                                    Image(painter = painterResource(id = R.drawable.flash), contentDescription ="")
                                    Text(text = "...Flash", fontFamily = FontFamily.Cursive)

                                }

                                Spacer(modifier = Modifier.width(10.dp))

                                Card(onClick = { "https://www.marvel.com/movies/thor-love-and-thunder#purchase-10" }) {

                                    Image(painter = painterResource(id = R.drawable.fury), contentDescription ="")
                                    Text(text = "...Fury", fontFamily = FontFamily.Cursive)

                                }

                                Spacer(modifier = Modifier.width(10.dp))

                                Card(onClick = { "https://www.marvel.com/movies/thor-love-and-thunder#purchase-10" }) {

                                    Image(painter = painterResource(id = R.drawable.fastx), contentDescription ="")
                                    Text(text = "...Fast x", fontFamily = FontFamily.Cursive)

                                }


                                Spacer(modifier = Modifier.width(10.dp))

                                Card(onClick = { "https://www.marvel.com/movies/thor-love-and-thunder#purchase-10" }) {

                                    Image(painter = painterResource(id = R.drawable.beetle), contentDescription ="")
                                    Text(text = "...Blue beetle", fontFamily = FontFamily.Cursive)

                                }
                                Spacer(modifier = Modifier.width(10.dp))

                                Card(onClick = { "https://www.marvel.com/movies/thor-love-and-thunder#purchase-10" }) {

                                    Image(painter = painterResource(id = R.drawable.aquaman), contentDescription ="")
                                    Text(text = "...Aquaman", fontFamily = FontFamily.Cursive)

                                }




                            }


                        }


                        Spacer(modifier = Modifier.height(10.dp))

                        Row(modifier = Modifier.fillMaxSize()) {

                            Column(modifier = Modifier.padding(10.dp)) {
                                Text(text = "TBT Movies", color = Color.Black, fontFamily = FontFamily.Cursive)
                            }
                            Spacer(modifier = Modifier.width(270.dp))
                            Column {


                                Icon(
                                    Icons.Rounded.ArrowForward,
                                    contentDescription = stringResource(id = R.string.shopping_cart_content_desc),
                                    modifier = Modifier.size(35.dp)
                                )
                            }
                        }

                        LazyRow {
                            item {
                                Card(onClick = { navController.navigate("https://lookerstudio.google.com/reporting/3674ea7f-71be-4c00-9445-d5f4a1743ef0/page/44b7C?s=vwR34pdVdT0") }) {

                                    Image(painter = painterResource(id = R.drawable.wrathofman), contentDescription ="")
                                    Text(text = "...Wrath of man", fontFamily = FontFamily.Cursive)


                                }


                                Spacer(modifier = Modifier.width(5.dp))
                                Card(onClick = { "https://www.marvel.com/movies/thor-love-and-thunder#purchase-10" }) {

                                    Image(painter = painterResource(id = R.drawable.hitman), contentDescription ="")
                                    Text(text = "...Hitmans wife", fontFamily = FontFamily.Cursive)

                                }


                                Spacer(modifier = Modifier.width(10.dp))
                                Card(onClick = { "https://www.marvel.com/movies/thor-love-and-thunder#purchase-10" }) {

                                    Image(painter = painterResource(id = R.drawable.conjuring), contentDescription ="")
                                    Text(text = "...Conjuring", fontFamily = FontFamily.Cursive)

                                }


                                Spacer(modifier = Modifier.width(10.dp))
                                Card(onClick = { "https://www.marvel.com/movies/thor-love-and-thunder#purchase-10" }) {

                                    Image(painter = painterResource(id = R.drawable.kombat), contentDescription ="")
                                    Text(text = "...Mortal Kombat", fontFamily = FontFamily.Cursive)

                                }

                                Spacer(modifier = Modifier.width(10.dp))
                                Card(onClick = { "https://www.marvel.com/movies/thor-love-and-thunder#purchase-10" }) {

                                    Image(painter = painterResource(id = R.drawable.godzilla), contentDescription ="")
                                    Text(text = "...Godzilla vs kong", fontFamily = FontFamily.Cursive)

                                }


                                Spacer(modifier = Modifier.width(10.dp))
                                Card(onClick = { "https://www.marvel.com/movies/thor-love-and-thunder#purchase-10" }) {

                                    Image(painter = painterResource(id = R.drawable.chinatowndetective), contentDescription ="")
                                    Text(text = "...Chinatown detective", fontFamily = FontFamily.Cursive)

                                }


                                Spacer(modifier = Modifier.width(10.dp))
                                Card(onClick = { "https://www.marvel.com/movies/thor-love-and-thunder#purchase-10" }) {

                                    Image(painter = painterResource(id = R.drawable.lordofrings), contentDescription ="")
                                    Text(text = "...Lord of rings", fontFamily = FontFamily.Cursive)

                                }

                                Spacer(modifier = Modifier.width(10.dp))
                                Card(onClick = { "https://www.marvel.com/movies/thor-love-and-thunder#purchase-10" }) {

                                    Image(painter = painterResource(id = R.drawable.wonderwoman), contentDescription ="")
                                    Text(text = "...Wonder woman", fontFamily = FontFamily.Cursive)

                                }


                                Spacer(modifier = Modifier.width(10.dp))
                                Card(onClick = { "https://www.marvel.com/movies/thor-love-and-thunder#purchase-10" }) {

                                    Image(painter = painterResource(id = R.drawable.badboys), contentDescription ="")
                                    Text(text = "...Bad boys forever", fontFamily = FontFamily.Cursive)

                                }


                            }


                        }


                        Spacer(modifier = Modifier.height(10.dp))


                        Row(modifier = Modifier.fillMaxSize()) {

                            Column(modifier = Modifier.padding(10.dp)) {
                                Text(text = "Korean K Drama", color = Color.Black, fontFamily = FontFamily.Cursive)
                            }
                            Spacer(modifier = Modifier.width(270.dp))
                            Column {


                                Icon(
                                    Icons.Rounded.ArrowForward,
                                    contentDescription = stringResource(id = R.string.shopping_cart_content_desc),
                                    modifier = Modifier.size(35.dp)
                                )
                            }
                        }

                        LazyRow {
                            item {
                                Card(onClick = { navController.navigate("https://lookerstudio.google.com/reporting/3674ea7f-71be-4c00-9445-d5f4a1743ef0/page/44b7C?s=vwR34pdVdT0") }) {

                                    Image(painter = painterResource(id = R.drawable.peninsula), contentDescription ="")
                                    Text(text = "...Peninsula", fontFamily = FontFamily.Cursive)


                                }


                                Spacer(modifier = Modifier.width(5.dp))
                                Card(onClick = { "https://www.marvel.com/movies/thor-love-and-thunder#purchase-10" }) {

                                    Image(painter = painterResource(id = R.drawable.eighthundred), contentDescription ="")
                                    Text(text = "...Eight hundred", fontFamily = FontFamily.Cursive)

                                }


                                Spacer(modifier = Modifier.width(10.dp))
                                Card(onClick = { "https://www.marvel.com/movies/thor-love-and-thunder#purchase-10" }) {

                                    Image(painter = painterResource(id = R.drawable.leap), contentDescription ="")
                                    Text(text = "...Leap", fontFamily = FontFamily.Cursive)

                                }


                                Spacer(modifier = Modifier.width(10.dp))
                                Card(onClick = { "https://www.marvel.com/movies/thor-love-and-thunder#purchase-10" }) {

                                    Image(painter = painterResource(id = R.drawable.people), contentDescription ="")
                                    Text(text = "...People", fontFamily = FontFamily.Cursive)


                                }

                                Spacer(modifier = Modifier.width(10.dp))
                                Card(onClick = { "https://www.marvel.com/movies/thor-love-and-thunder#purchase-10" }) {

                                    Image(painter = painterResource(id = R.drawable.rescue), contentDescription ="")
                                    Text(text = "...The rescue", fontFamily = FontFamily.Cursive)

                                }


                                Spacer(modifier = Modifier.width(10.dp))
                                Card(onClick = { "https://www.marvel.com/movies/thor-love-and-thunder#purchase-10" }) {

                                    Image(painter = painterResource(id = R.drawable.shockwave), contentDescription ="")
                                    Text(text = "...Shockwave", fontFamily = FontFamily.Cursive)

                                }


                                Spacer(modifier = Modifier.width(10.dp))
                                Card(onClick = { "https://www.marvel.com/movies/thor-love-and-thunder#purchase-10" }) {

                                    Image(painter = painterResource(id = R.drawable.kenshin), contentDescription ="")
                                    Text(text = "...Kenshin", fontFamily = FontFamily.Cursive)

                                }

                                Spacer(modifier = Modifier.width(10.dp))
                                Card(onClick = { "https://www.marvel.com/movies/thor-love-and-thunder#purchase-10" }) {

                                    Image(painter = painterResource(id = R.drawable.impasse), contentDescription ="")
                                    Text(text = "...Impasse", fontFamily = FontFamily.Cursive)

                                }


                                Spacer(modifier = Modifier.width(10.dp))
                                Card(onClick = { "https://www.marvel.com/movies/thor-love-and-thunder#purchase-10" }) {

                                    Image(painter = painterResource(id = R.drawable.rurrouni), contentDescription ="")
                                    Text(text = "...Rurrouni", fontFamily = FontFamily.Cursive)

                                }


                            }


                        }


                        Spacer(modifier = Modifier.height(10.dp))


                        Row(modifier = Modifier.fillMaxSize()) {

                            Column(modifier = Modifier.padding(10.dp)) {
                                Text(text = "Legendary Oldies", color = Color.Black, fontFamily = FontFamily.Cursive)
                            }
                            Spacer(modifier = Modifier.width(270.dp))
                            Column {


                                Icon(
                                    Icons.Rounded.ArrowForward,
                                    contentDescription = stringResource(id = R.string.shopping_cart_content_desc),
                                    modifier = Modifier.size(35.dp)
                                )
                            }
                        }

                        LazyRow {
                            item {
                                Card(onClick = { navController.navigate("https://lookerstudio.google.com/reporting/3674ea7f-71be-4c00-9445-d5f4a1743ef0/page/44b7C?s=vwR34pdVdT0") }) {

                                    Image(painter = painterResource(id = R.drawable.jumanji), contentDescription ="")
                                    Text(text = "...Jumanji 1", fontFamily = FontFamily.Cursive)


                                }


                                Spacer(modifier = Modifier.width(5.dp))
                                Card(onClick = { "https://www.marvel.com/movies/thor-love-and-thunder#purchase-10" }) {

                                    Image(painter = painterResource(id = R.drawable.hobbs), contentDescription ="")
                                    Text(text = "...Hobbs and shaw", fontFamily = FontFamily.Cursive)

                                }


                                Spacer(modifier = Modifier.width(10.dp))
                                Card(onClick = { "https://www.marvel.com/movies/thor-love-and-thunder#purchase-10" }) {

                                    Image(painter = painterResource(id = R.drawable.shazam), contentDescription ="")
                                    Text(text = "...Shazam", fontFamily = FontFamily.Cursive)

                                }


                                Spacer(modifier = Modifier.width(10.dp))
                                Card(onClick = { "https://www.marvel.com/movies/thor-love-and-thunder#purchase-10" }) {

                                    Image(painter = painterResource(id = R.drawable.venom), contentDescription ="")
                                    Text(text = "...Venom", fontFamily = FontFamily.Cursive)

                                }

                                Spacer(modifier = Modifier.width(10.dp))
                                Card(onClick = { "https://www.marvel.com/movies/thor-love-and-thunder#purchase-10" }) {

                                    Image(painter = painterResource(id = R.drawable.welco), contentDescription ="")
                                    Text(text = "...Jumanji", fontFamily = FontFamily.Cursive)

                                }


                                Spacer(modifier = Modifier.width(10.dp))
                                Card(onClick = { "https://www.marvel.com/movies/thor-love-and-thunder#purchase-10" }) {

                                    Image(painter = painterResource(id = R.drawable.woman), contentDescription ="")
                                    Text(text = "...Wonder woman", fontFamily = FontFamily.Cursive)

                                }


                                Spacer(modifier = Modifier.width(10.dp))
                                Card(onClick = { "https://www.marvel.com/movies/thor-love-and-thunder#purchase-10" }) {

                                    Image(painter = painterResource(id = R.drawable.strange), contentDescription ="")
                                    Text(text = "...Doctor strange multiverse", fontFamily = FontFamily.Cursive)

                                }

                                Spacer(modifier = Modifier.width(10.dp))
                                Card(onClick = { "https://www.marvel.com/movies/thor-love-and-thunder#purchase-10" }) {

                                    Image(painter = painterResource(id = R.drawable.america), contentDescription ="")
                                    Text(text = "...Captain america", fontFamily = FontFamily.Cursive)

                                }


                                Spacer(modifier = Modifier.width(10.dp))
                                Card(onClick = { "https://www.marvel.com/movies/thor-love-and-thunder#purchase-10" }) {

                                    Image(painter = painterResource(id = R.drawable.jungle), contentDescription ="")
                                    Text(text = "...Jungle book", fontFamily = FontFamily.Cursive)

                                }


                            }


                        }











                    }}

            }


        },

        bottomBar = { BottomBar(navController = navController) }







    )

    AnimatedDrawer(
        isOpen = isDrawerOpen,
        onClose = { isDrawerOpen = false }
    )
}

@Composable
fun AnimatedDrawer(isOpen: Boolean, onClose: () -> Unit) {
    val drawerWidth = remember { Animatable(if (isOpen) 250f else 0f) }

    LaunchedEffect(isOpen) {
        drawerWidth.animateTo(if (isOpen) 250f else 0f, animationSpec = tween(durationMillis = 300))
    }

    @Composable
    fun SocialMediaIcon() {

    }
    Surface(
        modifier = Modifier
            .fillMaxHeight()
            .width(drawerWidth.value.dp)
        ,
        color=Color.LightGray,
        // color = Color.LightGray,
//        elevation = 16.dp
    ) {






        val mContext = LocalContext.current
        val  navController: NavHostController
        Column {
//            Text(
//                text = "Drawer Item 1"
//
//            )
//            Text(
//                text = "Drawer Item 2"
//            )
//            Text(
//                text = "Drawer Item 3",
//                modifier = Modifier.clickable {  }
//            )




            Spacer(modifier = Modifier.height(16.dp))






            OutlinedButton(
                onClick = {

                    val simToolKitLaunchIntent =
                        mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                    simToolKitLaunchIntent?.let { mContext.startActivity(it) }

                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 30.dp, end = 30.dp),
                shape = RoundedCornerShape(5.dp),
                border = BorderStroke(2.dp, Color.DarkGray)
            ) {
                Icon(imageVector = Icons.Default.Send,"",tint = Color.White)
                Text(text = "Buy a Cinema seat", color = Color.DarkGray)

            }
            Spacer(modifier = Modifier.height(15.dp))

            OutlinedButton(
                onClick = {

                    val cameraIntent=Intent(MediaStore.ACTION_IMAGE_CAPTURE)
                    if (cameraIntent.resolveActivity(mContext.packageManager)!=null){
                        mContext.startActivity(cameraIntent)
                    }else{
                        println("Camera app is not available")
                    }


                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 30.dp, end = 30.dp),
                shape = RoundedCornerShape(5.dp),
                border = BorderStroke(2.dp, Color.DarkGray)
            ) {
                Icon(imageVector = Icons.Default.AddCircle,"",tint = Color.White)
                Text(text = "Camera", color = Color.DarkGray)

            }
            Spacer(modifier = Modifier.height(15.dp))

            OutlinedButton(
                onClick = {

                    val smsIntent=Intent(Intent.ACTION_SENDTO)
                    smsIntent.data="smsto:0780400635".toUri()
                    smsIntent.putExtra("sms_body","Hello")
                    mContext.startActivity(smsIntent)


                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 30.dp, end = 30.dp),
                shape = RoundedCornerShape(5.dp),
                border = BorderStroke(2.dp, Color.DarkGray)
            ) {

                Icon(imageVector = Icons.Default.MailOutline,"",tint = Color.Black)
                //Text(text = "Sms", color = Color.Black)

            }
            Spacer(modifier = Modifier.height(15.dp))

            OutlinedButton(
                onClick = {

                    val callIntent=Intent(Intent.ACTION_DIAL)
                    callIntent.data="tel:0780400635".toUri()
                    mContext.startActivity(callIntent)

                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 30.dp, end = 30.dp),
                shape = RoundedCornerShape(5.dp),
                border = BorderStroke(2.dp, Color.DarkGray)
            ) {

                Icon(imageVector = Icons.Default.Call,"",tint = Color.Black)
                //Text(text = "Call", color = Color.Black)

            }
            Spacer(modifier = Modifier.height(15.dp))

            OutlinedButton(
                onClick = {

                    val shareIntent = Intent(Intent.ACTION_SEND)
                    shareIntent.type = "text/plain"
                    shareIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("moviespot@gmail.com"))
                    shareIntent.putExtra(Intent.EXTRA_SUBJECT, "subject")
                    shareIntent.putExtra(Intent.EXTRA_TEXT, "Welcome to the Movie Point email address")
                    mContext.startActivity(shareIntent)



                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 30.dp, end = 30.dp),
                shape = RoundedCornerShape(5.dp),
                border = BorderStroke(2.dp, Color.DarkGray)
            ) {

                Icon(imageVector = Icons.Default.Email,"",tint = Color.Black)
                //Text(text = "email", color = Color.Black)

            }
            Spacer(modifier = Modifier.height(15.dp))

            OutlinedButton(
                onClick = {
                    val shareIntent=Intent(Intent.ACTION_SEND)
                    shareIntent.type="text/plain"
                    shareIntent.putExtra(Intent.EXTRA_TEXT, "Check out this is cool app that notifies you of new movies in cinemas")
                    mContext.startActivity(Intent.createChooser(shareIntent, "Share"))

                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 30.dp, end = 30.dp),
                shape = RoundedCornerShape(5.dp),
                border = BorderStroke(2.dp, Color.DarkGray)
            ) {

                Icon(imageVector = Icons.Default.Share,"",tint = Color.Black)
                //Text(text = "Share", color = Color.Black)

            }
            Spacer(modifier = Modifier.height(15.dp))
            Text(text = stringResource(id = R.string.name))



            @Composable
            fun SocialMediaIcons() {
//                Row {
//                    SocialMediaIcon(Icons.Default.Facebook, "https://www.facebook.com/")
//                    SocialMediaIcon(Icons.Default.Twitter, "https://twitter.com/")
//                    SocialMediaIcon(Icons.Default.Instagram, "https://www.instagram.com/")
//                    SocialMediaIcon(Icons.Default.YouTube, "https://www.youtube.com/")
//                }
            }

            @Composable

            fun SocialMediaIcon(icon: ImageVector, url: String) {
                Icon(
                    icon,
                    contentDescription = null, // Pass null if content description is not needed
                    modifier = Modifier
                        .padding(8.dp)
                        .clickable {
                            // Handle click by opening the URL in a browser
                            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
                            // startActivity(intent)
                        }
                )
            }



//
//            Text(text = "Already have an account",
//                fontSize = 20.sp,
//                fontWeight = FontWeight.Bold,
//                textAlign = TextAlign.Center,
//                modifier = Modifier
//                    .fillMaxWidth()
////                    .clickable {navController.navigate(ROUTE_LOGIN) {
////                        popUpTo(ROUTE_HOME) { inclusive = true }
////                    } }
//                    .clickable {  mContext.startActivity(Intent(mContext, ROUTE_LOGIN::class.java)) }
//            )


        }




    }



//            IconButton(onClick = {  }) {
//
//
//                Icon(
//                    Icons.Rounded.Share,
//                    contentDescription = stringResource(id = R.string.shopping_cart_content_desc),
//                    modifier = Modifier.size(35.dp)
//                )
//            }



}






@Composable
fun BottomBar(navController: NavHostController) {
    val selectedIndex = remember { mutableStateOf(0) }
    BottomNavigation(
        elevation = 10.dp,
        backgroundColor = Color(0xFF685d5b)


    ) {

        BottomNavigationItem(icon = {
            Icon(imageVector = Icons.Default.Home,"", tint = Color.White)
        },
            label = { Text(text = "Home",color =  Color.White) }, selected = (selectedIndex.value == 0), onClick = {

                navController.navigate(ROUTE_HOME) {
                    popUpTo(ROUTE_HOME) { inclusive = true }
                }

            })


//
//        BottomNavigationItem(icon = {
//            Icon(imageVector = Icons.Default.ShoppingCart, "",tint = Color.White)
//        },
//            label = { Text(
//                text = "Products",
//                color =  Color.White) },
//            selected = (selectedIndex.value == 2),
//            onClick = {
//
//                navController.navigate(ROUTE_ABOUT) {
//                    popUpTo(ROUTE_HOME) { inclusive = true }
//                }
//
//            })



//
//        BottomNavigationItem(icon = {
//            Icon(imageVector = Icons.Default.Search, "",tint = Color.White)
//        },
//            label = { Text(
//                text = "Customer",
//                color =  Color.White) },
//            selected = (selectedIndex.value == 2),
//            onClick = {
//
//                navController.navigate(ROUTE_SEARCH) {
//                    popUpTo(ROUTE_HOME) { inclusive = true }
//                }
//
//            })

//        BottomNavigationItem(icon = {
//            Icon(imageVector = Icons.Default.AddCircle, "",tint = Color.White)
//        },
//            label = { Text(
//                text = "Add Prod",
//                color =  Color.White) },
//            selected = (selectedIndex.value == 2),
//            onClick = {
//
//                navController.navigate(ROUTE_MOVIESSCREEN) {
//                    popUpTo(ROUTE_HOME) { inclusive = true }
//                }
//
//            })


        BottomNavigationItem(icon = {
            Icon(imageVector = Icons.Default.AccountCircle,"",tint = Color.White)
        },
            label = { Text(text = "Login",color =  Color.White) }, selected = (selectedIndex.value == 1), onClick = {
                navController.navigate(ROUTE_LOGIN) {
                    popUpTo(ROUTE_HOME) { inclusive = true }
                }


            })

    }

}



