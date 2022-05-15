package com.masashi.todoapp

import androidx.room.TypeConverter
import java.util.*

/**
 * Created by Masashi Hamaguchi on 2022/05/14.
 */

class DateTimeConverter {
    @TypeConverter
    fun fromTimestamp(value: Long?): Date? {
        return value?.let { Date(it) }
    }

    @TypeConverter
    fun dateToTimestamp(date: Date?): Long? {
        return date?.time?.toLong()
    }
}
