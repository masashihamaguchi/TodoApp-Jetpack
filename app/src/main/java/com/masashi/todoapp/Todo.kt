package com.masashi.todoapp

import androidx.room.*
import java.util.*

/**
 * Created by Masashi Hamaguchi on 2022/04/25.
 */

@Entity(tableName = "todos")
data class Todo(
    @PrimaryKey(autoGenerate = true)
    val id: Int? = null,
    val title: String = "",
    val created_at: Date = Date()
)
