package database.relationships

import androidx.room.Embedded
import androidx.room.Relation
import database.entities.Exercise
import database.entities.WorkoutExercise

data class ExerciseWithWorkoutExercises(
    @Embedded val exercise: Exercise,
    @Relation(
        parentColumn = "id",
        entityColumn = "exerciseId"
    )
    val workoutExercises: List<WorkoutExercise>
)
