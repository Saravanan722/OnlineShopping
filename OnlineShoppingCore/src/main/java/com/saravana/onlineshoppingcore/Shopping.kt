package com.saravana.onlineshoppingcore

fun main() {
    val pen = Product(
        ID = 1,
        name = "Hero Pen",
        price = 50.0,
        discount = 10.0,
        tax = 5.0
    )

    val ball = Product(
        ID = 2,
        name = "Cricket Ball",
        price = 100.0,
        discount = 10.0,
        tax = 20.0
    )

    val scissors = Product(
        ID = 3,
        name = "Scissors",
        price = 100.0,
        discount = 10.0,
        tax = 50.0
    )

    val watch = Product(
        ID = 4,
        name = "Smart Watch",
        price = 50.0,
        discount = 0.0,
        tax = 0.0
    )

    val mobile = Product(
        ID = 5,
        name = "Redmi Note 8 Bro",
        price = 10000.0,
        discount = 10.0,
        tax = 10.0
    )

    val apple = Product(
        ID = 6,
        name = "Apple",
        price = 100.0,
        discount = 10.0,
        tax = 5.0
    )

    val store = Store()
    store.addItems(pen)
    store.addItems(ball)
    store.addItems(scissors)
    store.addItems(watch)
    store.addItems(mobile)
    store.addItems(apple)


    val cart = Cart()
    cart.addCart(pen, 2)
    cart.addCart(ball, 3)
    cart.addCart(scissors, 5)
    cart.addCart(watch, 5)
    cart.addCart(mobile, 1)
    cart.addCart(apple, 1)

    val customer1 = Customer(
        name = "Vijay",
        emailID = "tamail1234@gamil.com",
        address =  "12,xyz Salem(DT) Pin:123445",
        phoneNumber = "7917971210",
        customerId  = "1",
        boolean = false
    )

    val customer2 = Customer(
        name = "Jack",
        emailID = "tamail1234@gamil.com",
        address = "12,xyz Salem(DT) Pin:123445",
        phoneNumber = "7917971210",
        customerId =  "2",
        boolean = true
    )
    cart.viewCartItem()
}