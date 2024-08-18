package database.daos

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import androidx.room.Upsert
import database.entities.User
import kotlinx.coroutines.flow.Flow

@Dao
interface UserDao {

    @Query("SELECT * FROM user")
    fun getAllUser(): Flow<List<User>>

    @Upsert
    suspend fun upsert (user: User)

    @Delete
    suspend fun delete (user: User)
}