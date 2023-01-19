package com.saravana.onlineshoppingcore

//fun main() {
//    val pen = Product(
//        ID = 1, name = "Hero Pen", price = 50.0, discount = 10.0, tax = 5.0
//    )
//
//    val ball = Product(
//        ID = 2, name = "Cricket Ball", price = 100.0, discount = 10.0, tax = 20.0
//    )
//
//    val scissors = Product(
//        ID = 3, name = "Scissors", price = 100.0, discount = 10.0, tax = 50.0
//    )
//
//    val watch = Product(
//        ID = 4, name = "Smart Watch", price = 50.0, discount = 0.0, tax = 0.0
//    )
//
//    val mobile = Product(
//        ID = 5, name = "Redmi Note 8 Bro", price = 10000.0, discount = 10.0, tax = 10.0
//    )
//
//    val apple = Product(
//        ID = 6, name = "Apple", price = 100.0, discount = 10.0, tax = 5.0
//    )
//
//    Store.addItems(pen)
//    Store.addItems(ball)
//    Store.addItems(scissors)
//    Store.addItems(watch)
//    Store.addItems(mobile)
//    Store.addItems(apple)
//
//    val cart = Cart()
//    cart.addCart(pen, 2)
//    cart.addCart(ball, 3)
//    cart.addCart(scissors, 5)
//    cart.addCart(watch, 5)
//    cart.addCart(mobile, 1)
//    cart.addCart(apple, 1)
//
////    val customer = Customer(
////        name = "Jack",
////        phoneNumber = "1234567890",
////        email = "tamil@gmail.com",
////        street = "Salem South",
////        city = "Salem",
////        state = "TamilNadu",
////        pinCode = "636116"
////
////    )
//
////    val invoice = Invoice(cart.cartItem, 10.0)
////    println(invoice.getTotal())
////
////    val laserPrinter = LaserPrinter(invoice)
////    laserPrinter.print()
////
////    val cardPayment = CardPayment(ID = "1234", cardType = "VSA", "1234", invoice)
////    println(cardPayment.payAmount(0.0, "1234"))
//
//}

class Soil

class Brick(val soil: Soil) {
    val shape: String = "Rectangle"
    val color: String = "Red"
}

fun main() {
    val myBrick = Brick(soil = Soil())
    val myBrick1 = Brick(soil = Soil())
    println(myBrick)
}