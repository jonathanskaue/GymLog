package database.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class WorkoutExercise(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val kg: Double,
    val reps: Int,
    val notes: String,
    val workoutId: Int,
    val exerciseId: Int
)
