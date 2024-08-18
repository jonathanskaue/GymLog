package database.relationships

import androidx.room.Embedded
import androidx.room.Relation
import database.entities.Set
import database.entities.WorkoutExercise

data class WorkoutExerciseWithSets(
    @Embedded val workoutExercise: WorkoutExercise,
    @Relation(
        parentColumn = "id",
        entityColumn = "workoutExerciseId"
    )
    val sets: List<Set>
)
