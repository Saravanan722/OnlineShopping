package com.saravana.onlineshopping.RoomDatabase

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query


@Dao
interface RegisterDatabaseDAO {
    @Insert
    suspend fun insert(register: UserEntity)

    @Query("SELECT * FROM user_details_table ORDER BY userId DESC")
    fun getAllUsers(): LiveData<List<UserEntity>>

    @Query("SELECT * FROM user_details_table WHERE userId LIKE :userName")
    suspend fun getUsername(userName: String): UserEntity?
}