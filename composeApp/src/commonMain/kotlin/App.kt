import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.*
import com.mmk.kmpauth.google.GoogleAuthCredentials
import com.mmk.kmpauth.google.GoogleAuthProvider
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    var authReady by remember { mutableStateOf(false) }
    LaunchedEffect(Unit){
        GoogleAuthProvider.create(
            credentials = GoogleAuthCredentials(
                serverId = "39610408044-ie6e2nmvs5cm25skqikl6bon1dg6c621.apps.googleusercontent.com"
            )
        )
        authReady = true
    }
    MaterialTheme {
        GymLogApp()
    }
}