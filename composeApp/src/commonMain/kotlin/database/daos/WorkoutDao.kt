package database.daos

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import androidx.room.Upsert
import database.entities.Workout
import kotlinx.coroutines.flow.Flow

@Dao
interface WorkoutDao {
    @Query("SELECT * FROM workout")
    fun getAllWorkouts(): Flow<List<Workout>>

    @Upsert
    suspend fun upsert(workout: Workout)

    @Delete
    suspend fun delete(workout: Workout)
}