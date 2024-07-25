import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.material.Text

@Composable
@Preview
fun Welcome(){
    Column {
        Text(text = "Welcome to")
        Text(text = "GymLog")
    }
}