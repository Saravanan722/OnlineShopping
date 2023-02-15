package com.saravana.onlineshoppingcore


data class CartItem(
    val product: Product, var quantity: Int = 0
)

class Cart {
    private val cartItem = mutableListOf<CartItem>()


    fun addCart(product: Product, quantity: Int) {
        cartItem.add(
            CartItem(
                product, quantity
            )
        )
    }

    fun removeCartItem(position: Int): Int {
        cartItem.removeAt(position)
        return position
    }

    fun searchCartItem(product: String): CartItem? {
        return cartItem.find { it.product.name == product }

    }

    fun changeQuantity(productId: Int, quantity: Int) {
        val toBeQuantityChangeItem = cartItem.find { it.product.ID == productId }
        toBeQuantityChangeItem?.let { it.quantity = quantity }
    }

    fun getCartItem(): List<CartItem> {
        return cartItem
    }

    fun filterCartItem(
        filterName: String? = null,
        filterStartLetter: String? = null,
        filterEndLetter: String? = null,
        startPrice: Double? = null,
        endPrice: Double? = null
    ): List<CartItem> {

        val filter = when {
            startPrice != endPrice -> cartItem.filter { it.product.price in startPrice!!..endPrice!! }

            filterStartLetter != null -> cartItem.filter {
                it.product.name.startsWith(filterStartLetter.uppercase())
            }
            filterEndLetter != null -> cartItem.filter {
                it.product.name.endsWith(filterEndLetter)
            }
            filterName != null -> cartItem.sortedBy { it.product.name }
            else -> cartItem.sortedBy { it.product.price }

        }
        return filter
    }

    fun clearAll() {
        cartItem.clear()
    }

    fun getCartCount(): Int {
        return cartItem.size
    }

    fun savedForLater(product: Product) {

        Store.addItem(product)
    }
}

fun main() {
    val admin = Admin()
    val cart1 = Cart()
    admin.addStore()
    println(Store.getStoreItem())
    val cart = admin.copyProduct()
    cart1.addCart(cart,1)
    println(cart1.getCartItem())

}

