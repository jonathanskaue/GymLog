package database

import androidx.room.ConstructedBy
import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.RoomDatabaseConstructor
import database.daos.UserDao
import database.daos.WorkoutDao
import database.entities.Category
import database.entities.Exercise
import database.entities.User
import database.entities.Workout
import database.entities.WorkoutExercise
import database.entities.Set

@Database(
    entities = [User::class, Workout::class, WorkoutExercise::class, Set::class, Exercise::class, Category::class],
    version = 1
)
@ConstructedBy(GymLogDatabaseConstructor::class)
abstract class GymLogDatabase: RoomDatabase() {

    abstract fun userDao(): UserDao
    abstract fun workoutDao(): WorkoutDao
}

@Suppress("NO_ACTUAL_FOR_EXPECT")
expect object GymLogDatabaseConstructor : RoomDatabaseConstructor<GymLogDatabase>