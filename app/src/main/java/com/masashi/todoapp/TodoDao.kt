package com.masashi.todoapp

import androidx.room.*

/**
 * Created by Masashi Hamaguchi on 2022/04/25.
 */

@Dao
interface TodoDao {
    @Query("select * from todos order by created_at asc")
    fun getAll(): MutableList<Todo>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun post(todo: Todo)

    @Delete
    fun delete(todo: Todo)
}
