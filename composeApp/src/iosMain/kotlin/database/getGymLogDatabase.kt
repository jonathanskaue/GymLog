package database
import androidx.room.Room
import androidx.sqlite.driver.bundled.BundledSQLiteDriver
import platform.Foundation.NSHomeDirectory

fun getPeopleDatabase(): GymLogDatabase {
    val dbFile = NSHomeDirectory() + "/people.db"
    return Room.databaseBuilder<GymLogDatabase>(
        name = dbFile,
        factory = { GymLogDatabase::class.instantiateImpl() }
    )
        .setDriver(BundledSQLiteDriver())
        .build()
}