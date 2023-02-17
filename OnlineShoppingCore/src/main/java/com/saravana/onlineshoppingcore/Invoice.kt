package com.saravana.onlineshoppingcore

class Invoice(
    val products: List<CartItem>,
    val discount: Double,
) {

    fun getTotal(): Double {

        val productTotal = products.map {
            val discountAmount = (it.product.price !!.times(it.quantity)) !!.times(it.product.discount!!.div(100))
            val taxAmount = ((it.product.price!!.times(it.quantity))!!.times(it.product.tax!!.div(100)))
            it.product.price!!.times(it.quantity)!!.plus(taxAmount)!!.minus(discountAmount)
        }.reduce(::add)
        return productTotal!!.minus(productTotal!!.times(getTotal()!!.times(0.01)))
    }

    fun applyCoupon(coupon: String?): Double {
        var discount = 0.0
        if (coupon == "TAMIL120") discount = getTotal() * 0.01
        return getTotal() - discount
    }
}


fun add(first: Double, second: Double): Double {
    return first + second
}


