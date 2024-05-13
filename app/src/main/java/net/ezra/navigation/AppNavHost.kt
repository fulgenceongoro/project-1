package net.ezra.navigation

import StudentList
import androidx.activity.compose.BackHandler
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import net.ezra.ui.SplashScreen
import net.ezra.ui.auth.LoginScreen
import net.ezra.ui.auth.SignupScreen
import net.ezra.ui.contact.ContactScreen
import net.ezra.ui.home.HomeScreen
import net.ezra.ui.movies.ClickableImageExample
import net.ezra.ui.upload.Services
//import net.ezra.ui.shop.ShopScreen
import net.ezra.ui.users.AddStudents

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = ROUTE_SPLASH


) {
    BackHandler {
        navController.popBackStack()

        }
    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = startDestination
    ) {


        composable(ROUTE_LOGIN) {
            LoginScreen(navController)
        }


        composable(ROUTE_SIGNUP) {
            SignupScreen(navController)
        }


        composable(ROUTE_HOME) {
            HomeScreen(navController)
        }



        composable(ROUTE_ACTIONMOVIES) {
            ActionScreen(navController)
        }

        composable(ROUTE_CONTACT) {
            ContactScreen(navController)
        }


        composable(ROUTE_ADD_USER) {
            AddStudents(navController)
        }

        composable(ROUTE_SPLASH) {
            SplashScreen(navController)
        }

        composable(ROUTE_UPLOAD) {
            Services(navController)
        }

        composable(ROUTE_MOVIESSCREEN) {
            ClickableImageExample(navController)
        }






































    }
}

@Composable
fun ActionScreen(navController: NavHostController) {


}
