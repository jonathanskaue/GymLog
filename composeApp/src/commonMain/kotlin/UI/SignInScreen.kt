package UI

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.unit.dp

@Composable
fun SignInScreen(){
    Column(
        modifier = Modifier
            .padding(20.dp, 50.dp, 20.dp, 10.dp)
            .fillMaxSize()
    ){
        Text(
            text = "Sign In",
            style = MaterialTheme.typography.h3,
            fontWeight = Bold,
            color = Color.Black
        )
    }
}