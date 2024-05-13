package net.ezra.ui.home


import android.media.browse.MediaBrowser
import android.media.browse.MediaBrowser.MediaItem
import android.view.ViewGroup
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.media3.ui.PlayerView
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.ezra.navigation.ROUTE_HOME
import net.ezra.navigation.ROUTE_ACTIONMOVIES
import net.ezra.navigation.ROUTE_CONTACT
import net.ezra.navigation.ROUTE_UPLOAD
import net.ezra.R
import net.ezra.navigation.ROUTE_ACTIONMOVIES
import net.ezra.navigation.ROUTE_ADD_USER
import net.ezra.navigation.ROUTE_ADD_USER
import net.ezra.navigation.ROUTE_LOGIN
import net.ezra.navigation.ROUTE_MOVIESSCREEN
import net.ezra.navigation.ROUTE_VIDEOS


import android.net.Uri
import android.view.WindowManager

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.ButtonColors

import androidx.compose.runtime.*


import androidx.compose.ui.platform.LocalContext





@Composable
fun HomeScreen(navController: NavHostController) {

Box(modifier = Modifier.fillMaxSize())
    Image(painter = painterResource(id = R.drawable.back), contentDescription =null,
        modifier = Modifier.fillMaxSize(),
        contentScale = ContentScale.Crop
        )


    LazyColumn {
        item(

        ) {

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
                    .padding(10.dp)
                    .padding(top = 10.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally


            ){
                Text(text = stringResource(id = R.string.mit,), fontSize = 40.sp, color = Color.White, fontFamily = FontFamily.Cursive)


                Spacer(modifier = Modifier.height(10.dp))


                Card(
                    colors = CardDefaults.cardColors(Color(0xff9da29b)),
                    elevation = CardDefaults.cardElevation(5.dp)

                ) {



                }
                Spacer(modifier = Modifier.height(10.dp))

                OutlinedButton(onClick = {

                    navController.navigate(ROUTE_UPLOAD) {
                        popUpTo(ROUTE_HOME) { inclusive = true }
                    }

                }) {

                    Text(text = "Go to our movies collection", fontFamily = FontFamily.Cursive, color = Color.White, fontWeight = FontWeight.Bold, fontSize = (30.sp))

                }











                Spacer(modifier = Modifier.height(10.dp))



                OutlinedButton(onClick = {

                    navController.navigate(ROUTE_ADD_USER) {
                        popUpTo(ROUTE_HOME) { inclusive = true }
                    }

                }) {

                    Text(text = "Add User", fontFamily = FontFamily.Cursive, color = Color.White)

                }


                Spacer(modifier = Modifier.height(10.dp))
                
                Text(
                    text = "WEEKLY RELEASES",
                    fontFamily = FontFamily.Cursive,
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(90.dp)
                )




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





            }









Spacer(modifier = Modifier.height(390.dp))








            Row(

                modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.Top,
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Text(
                    modifier = Modifier
                        .clickable {
                            navController.navigate(ROUTE_CONTACT) {
                                popUpTo(ROUTE_HOME) { inclusive = true }
                            }
                        },
                    text = "Contact", color = Color.White, fontFamily = FontFamily.Cursive, fontSize = (30.sp)
                )

                Text(
                    modifier = Modifier

                        .clickable {
                            navController.navigate(ROUTE_LOGIN) {
                                popUpTo(ROUTE_HOME) { inclusive = true }
                            }
                        },
                    text = "Registration screen", color = Color.White, fontFamily = FontFamily.Cursive, fontSize = (30.sp)

                )





            }






        }
    }
}



















@Preview(showBackground = true)
@Composable
fun PreviewLight() {
    HomeScreen(rememberNavController())
}

