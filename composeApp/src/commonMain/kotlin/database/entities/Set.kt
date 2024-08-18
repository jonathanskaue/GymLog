package database.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Set(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val kg: Double,
    val reps: Int,
    val notes: String,
    val workoutExerciseId: Int
)
