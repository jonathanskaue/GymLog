import UI.SignInScreen
import androidx.compose.foundation.layout.fillMaxSize
import androidx.navigation.compose.NavHost
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import UI.WelcomeScreen
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController

enum class GymLogScreen(val title: String){
    Welcome(title = "Welcome"),
    SignIn(title = "Sign In")
}

@Composable
fun GymLogApp(
    navController: NavHostController = rememberNavController()
){
    val backStackEntry by navController.currentBackStackEntryAsState()
    val currentScreen = GymLogScreen.valueOf(
        backStackEntry?.destination?.route ?: GymLogScreen.Welcome.name
    )
    NavHost(
        navController = navController,
        startDestination = GymLogScreen.Welcome.name,
        modifier = Modifier
            .fillMaxSize()
    ){
        composable(route = GymLogScreen.Welcome.name){
            WelcomeScreen(
                onNavigateToSignIn = {
                    navController.navigate(GymLogScreen.SignIn.name)
                }
            )
        }
        composable(route = GymLogScreen.SignIn.name){
            SignInScreen()
        }
    }
}