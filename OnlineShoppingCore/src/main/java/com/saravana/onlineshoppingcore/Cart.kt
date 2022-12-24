package com.saravana.onlineshoppingcore

data class CartItem(
    val product: Product,
    var quantity: Int
)

class Cart {
    private val cartItems = mutableListOf<CartItem>()

    fun addCart(product: Product, quantity: Int) {
        cartItems.add(
            CartItem(
                product,
                quantity
            )
        )
    }

    fun deleteCartItem(product: Product) {
        val deleteItem = cartItems.listIterator()
        while (deleteItem.hasNext()) {
            if (deleteItem.next().product == product)
                deleteItem.remove()
        }
        println("Removed item: $product")
    }

    fun searchCartItems(searchItem: String): List<CartItem> {
        val pattern = searchItem.toRegex(RegexOption.IGNORE_CASE)
        return cartItems.filter { pattern.containsMatchIn(it.product.name) }
    }

    fun changeQuantity(productId: Int, quantity: Int) {
        val toBeQuantityChangeItem = cartItems.find { it.product.ID == productId }
        toBeQuantityChangeItem?.let { it.quantity = quantity }
    }

    fun viewCartItem() {
        cartItems.forEach {
            println(
                " ID: ${it.product.ID} :" +
                        " Name: ${it.product.name}:   " + "Price: ${it.product.price}:   " +
                        "Tax: ${it.product.tax}:   " +
                        "Discount: ${it.product.discount}:    " +
                        "Quantity: ${it.quantity}:    "
            )
        }
    }

    fun filterCartItem(
        filterName: String? = null,
        filterStartLetter: String? = null,
        filterEndLetter: String? = null,
        startPrice: Double? = null,
        endPrice: Double? = null
    ): List<CartItem> {

        val filter = when {
            startPrice != endPrice -> cartItems.filter { it.product.price in startPrice!!..endPrice!! }

            filterStartLetter != null -> cartItems.filter {
                it.product.name.startsWith(filterStartLetter.uppercase())
            }
            filterEndLetter != null -> cartItems.filter {
                it.product.name.endsWith(filterEndLetter)
            }
            filterName != null -> cartItems.sortedBy { it.product.name }
            else -> cartItems.sortedBy { it.product.price }

        }
        return filter
    }

    fun clearAll() {
    }


}


// Collection
// Getter/Setter
// SOLID -> S
// Why Readability is most important then other
// Signed vs Unsigned
// filter
