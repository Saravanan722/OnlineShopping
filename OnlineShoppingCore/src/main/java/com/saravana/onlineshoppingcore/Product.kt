package com.saravana.onlineshoppingcore

class Product(
    val ID: Int,
    var name: String,
    var price: Double,
    var discount: Double,
    var tax: Double = 0.0
) {
    override fun toString(): String {
        return "ProductName: $name, Price: $price, Discount: $discount"
    }
}




