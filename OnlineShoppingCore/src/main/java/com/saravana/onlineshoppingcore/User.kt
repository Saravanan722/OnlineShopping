package com.saravana.onlineshoppingcore

 data class Address (
     var street: String? = null,
     var city: String? = null,
     var state: String? = null,
     var pinCode: String? = null,
 )

data class User(
    var name: String? = null,
    var phoneNumber: String? = null,
    var email: String? = null,
    var address: Address
)



