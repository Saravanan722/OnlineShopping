package com.saravana.onlineshopping.RoomDatabase

import com.saravana.onlineshopping.RoomDatabase.RegisterDatabaseDAO
import com.saravana.onlineshopping.RoomDatabase.UserEntity

class RegisterRepository(private val dao: RegisterDatabaseDAO) {
    val users = dao.getAllUsers()

    suspend fun insert(user: UserEntity) {
        return dao.insert(user)
    }

    suspend fun getUserName(userName: String): UserEntity? {
        return dao.getUsername(userName)
    }
}
