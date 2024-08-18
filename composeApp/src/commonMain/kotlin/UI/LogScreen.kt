package UI

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.unit.dp
import database.daos.WorkoutDao

@Composable
fun LogScreen(
    workoutDao: WorkoutDao
){
    val workouts = workoutDao.getAllWorkouts().collectAsState(initial = emptyList())
    val scope = rememberCoroutineScope()
    Column(
        modifier = Modifier
            .padding(20.dp, 50.dp, 20.dp, 10.dp)
            .fillMaxSize()
    ){
        Text(
            text = "Log",
            style = MaterialTheme.typography.h3,
            fontWeight = Bold,
            color = Color.Black
        )
        FloatingActionButton(
            onClick = { /*TODO*/ },
            modifier = Modifier.padding(10.dp)
        ){
            Icon(Icons.Default.Add, contentDescription = "Add")
        }
    }
}