package UI

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import gymlog.composeapp.generated.resources.Res
import gymlog.composeapp.generated.resources.social_leaderboard
import gymlog.composeapp.generated.resources.monitoring
import gymlog.composeapp.generated.resources.fitness_center
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.painterResource

@Composable
fun WelcomeScreen(
    onNavigateToSignIn: () -> Unit
) {
    Column(
        modifier = Modifier
            .padding(20.dp, 50.dp, 20.dp, 10.dp)
            .fillMaxSize()
    ) {
        Text(
            text = "Welcome to",
            style = MaterialTheme.typography.h3,
            fontWeight = Bold,
            color = Color.Black,
            textAlign = TextAlign.Left
        )
        Text(
            text = "GymLog",
            style = MaterialTheme.typography.h3,
            fontWeight = Bold,
            color = Color(0xFF1F7A8C),
            textAlign = TextAlign.Left
        )
        Spacer(modifier = Modifier.height(30.dp))
        FeatureItem(
            title = "Track Your Workouts",
            description1 = "Without the hassle. Gymlog is quick,",
            description2 = "clean and easy to use",
            icon = Res.drawable.fitness_center
        )
        FeatureItem(
            "Get Motivated",
            "Beat your previous workouts",
            "GymLog helps you progressive overload",
            Res.drawable.social_leaderboard
        )
        FeatureItem(
            "Analyze your strength",
            "Advanced charts, PR tracking and",
            "much more...",
            Res.drawable.monitoring
        )
        Spacer(Modifier.weight(1.1f))
        Button(
            onClick = {
                onNavigateToSignIn()
            },
            colors = ButtonDefaults.buttonColors(
                backgroundColor = Color(0xFF1F7A8C),
                contentColor = Color.White
            ),
            modifier = Modifier.align(Alignment.CenterHorizontally)
        ){
            Text("Get started")
        }
        Spacer(Modifier.height(20.dp))
    }
}

@Composable
fun FeatureItem(title: String, description1: String, description2: String, icon: DrawableResource){
    Row(){
        Icon(
            painter = painterResource(resource = icon),
            contentDescription = null,
            tint = Color(0xFF1F7A8C),
            modifier = Modifier.align(Alignment.CenterVertically)
        )
        Spacer(modifier = Modifier.width(16.dp))
        Column {
            Text(
                text = title,
                style = MaterialTheme.typography.h5,
                color = Color.Black,
                textAlign = TextAlign.Left
            )
            Text(
                text = description1,
                style = MaterialTheme.typography.body1,
                color = Color.Gray,
                textAlign = TextAlign.Left
            )
            Text(
                text = description2,
                style = MaterialTheme.typography.body1,
                color = Color.Gray,
                textAlign = TextAlign.Left
            )
            Spacer(Modifier.height(16.dp))
        }
    }
}