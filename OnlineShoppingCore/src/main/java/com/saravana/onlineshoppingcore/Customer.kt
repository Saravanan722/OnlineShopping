package com.saravana.onlineshoppingcore

open class Address(
    var street: String?,
    var city: String?,
    var state: String?,
    var pinCode: String?,
)

class Customer(
    var name: String,
    var phoneNumber: String,
    var email: String,
) {
    fun getCartItem() {

    }

}

//fun main() {
//    var customer = Customer(
//        name = "Jack",
//        phoneNumber = "1234567890",
//        email = "tamil@gmail.com",
//    )
//
//
//
//    Store.getStoreItem().forEach(::println)
//
//
//}

