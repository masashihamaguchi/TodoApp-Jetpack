package com.masashi.todoapp

import android.app.Application
import androidx.room.Room

/**
 * Created by Masashi Hamaguchi on 2022/04/25.
 */

class RoomApplication : Application() {
    companion object {
        lateinit var database: AppDatabase
    }

    override fun onCreate() {
        super.onCreate()

        database = Room.databaseBuilder(
            applicationContext,
            AppDatabase::class.java,
            "todos"
        ).build()
    }
}
