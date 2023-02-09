package com.saravana.onlineshoppingcore

class Product(
    val ID: Int,
    val name: String,
    val price: Double,
    val discount: Double,
    val tax: Double = 0.0,
    val description:String = ""
) {
    override fun toString(): String {
        return " ID: $ID ProductName: $name, Price: $price, Discount: $discount Tax: $tax  Description: $description"
    }
}






