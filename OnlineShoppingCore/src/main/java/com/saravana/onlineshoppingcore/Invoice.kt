package com.saravana.onlineshoppingcore

class Invoice(
    val products: List<CartItem>,
    val discount: Double,
) {

    fun getTotal(): Double {
        val productTotal = products.map {
            val discountAmount = (it.product.price * it.quantity) * it.product.discount / 100
            val taxAmount = ((it.product.price * it.quantity) * it.product.tax / 100)
            it.product.price * it.quantity + taxAmount - discountAmount
        }.reduce(::add)

        return productTotal - (productTotal * discount / 100)
    }

    fun applyCoupon(coupon: String?): Double {
        var discount = 0.0
        if (coupon == "TAMIL120")
            discount = getTotal() * 0.1
        return getTotal() - discount
    }
}


fun add(first: Double, second: Double): Double {
    return first + second
}


