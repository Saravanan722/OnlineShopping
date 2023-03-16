package com.saravana.onlineshopping.RoomDatabase

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.saravana.onlineshoppingcore.Address


@Entity(tableName = "User_details_table")
data class UserEntity(
    @PrimaryKey(autoGenerate = true)
    var userId: Int = 0,
    @ColumnInfo(name = "name")
    var userName: String,
    @ColumnInfo(name = "email_id")
    var emailId: String,
    @ColumnInfo(name = "phone_number")
    var phoneNumber:Int,
    @ColumnInfo(name = "password_text")
    var password: String,
    @ColumnInfo(name = "address")
    var address: Address

)
