package database.relationships

import androidx.room.Embedded
import androidx.room.Relation
import database.entities.Workout
import database.entities.WorkoutExercise

data class WorkoutWithWorkoutExercises(
    @Embedded val workout: Workout,
    @Relation(
        parentColumn = "id",
        entityColumn = "workoutId"
    )
    val workoutExercises: List<WorkoutExercise>
)
