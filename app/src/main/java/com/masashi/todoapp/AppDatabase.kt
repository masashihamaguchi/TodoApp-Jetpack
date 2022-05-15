package com.masashi.todoapp

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters

/**
 * Created by Masashi Hamaguchi on 2022/04/25.
 */

@Database(entities = [Todo::class], version = 1, exportSchema = false)
@TypeConverters(DateTimeConverter::class)
abstract class AppDatabase : RoomDatabase() {
    abstract fun todoDao(): TodoDao
}
