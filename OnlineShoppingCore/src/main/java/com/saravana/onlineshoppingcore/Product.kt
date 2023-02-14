package com.saravana.onlineshoppingcore

class Product(
    var ID: Int = 0,
    var name: String = "",
    var price: Double = 0.0,
    var discount: Double = 0.0,
    var tax: Double = 0.0,
    var description: String = ""
) {
    override fun toString(): String {
        return " ID: $ID ProductName: $name, Price: $price, Discount: $discount Tax: $tax  Description: $description"
    }
}






