package com.saravana.onlineshoppingcore

open class Person {
   protected var name: String
        get() = field
        set(value) {
            field = value
        }
   protected var emailID: String
        get() = field
        set(value) {
            field = value
        }
   protected var address: String
        get() = field
        set(value) {
            field = value
        }
   protected var phoneNumber: String
       get() = field
        set(value) {
            field = value
        }

    constructor(name: String, emailID: String, address: String, phoneNumber: String) {
        this.name = name
        this.emailID = emailID
        this.address = address
        this.phoneNumber = phoneNumber


    }

}