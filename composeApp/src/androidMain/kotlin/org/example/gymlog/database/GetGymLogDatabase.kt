package org.example.gymlog.database

import android.content.Context
import androidx.room.Room
import androidx.sqlite.driver.bundled.BundledSQLiteDriver
import database.GymLogDatabase

fun getGymLogDatabase(context: Context): GymLogDatabase {
    val dbFile = context.getDatabasePath("gymlog.db")
    return Room.databaseBuilder<GymLogDatabase>(
        context = context.applicationContext,
        name = dbFile.absolutePath
    )
        .setDriver(BundledSQLiteDriver())
        .build()
}