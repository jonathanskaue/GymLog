package UI

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.mmk.kmpauth.google.GoogleAuthCredentials
import com.mmk.kmpauth.google.GoogleAuthProvider
import com.mmk.kmpauth.google.GoogleButtonUiContainer
import com.mmk.kmpauth.uihelper.google.GoogleSignInButton
import database.daos.UserDao

@Composable
fun SignInScreen(
    onNavigateToLog: () -> Unit
){
    var authReady by remember { mutableStateOf(false) }
    LaunchedEffect(Unit){
        GoogleAuthProvider.create(
            credentials = GoogleAuthCredentials(
                serverId = "39610408044-ie6e2nmvs5cm25skqikl6bon1dg6c621.apps.googleusercontent.com"
            )
        )
        authReady = true
    }
    if (authReady){
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            GoogleButtonUiContainer(
                onGoogleSignInResult = { googleUser ->
                    val tokenId = googleUser?.idToken
                    val userName = googleUser?.displayName
                    println("Token: $tokenId")
                    println("Name: $userName")
                    onNavigateToLog()
                }
            ) {
                GoogleSignInButton(
                    onClick = { this.onClick() }
                )
            }
        }
    }
}