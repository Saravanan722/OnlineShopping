package com.saravana.onlineshoppingcore

object Store {
    private val items = mutableListOf<Product>()

    fun addItem(product: Product) {
        items.add(product)
    }

    fun addItem(vararg products: Product) {
        products.forEach { items.add(it) }
    }

    fun deleteProduct(product: Product): String {
        return if (items.remove(product)) {
            " Removed item $product"
        } else {
            "Does not have this item $product"
        }
    }

    fun getStoreItem(): List<Product> {
        return items
    }

    fun searchItem(product: String): Product? {
        return items.find { it.name == product }
    }

    fun filterStoreItem(
        filterName: String? = null,
        filterStartLetter: String? = null,
        filterEndLetter: String? = null,
        startPrice: Double? = null,
        endPrice: Double? = null
    ): List<Product> {

        val filter = when {
            startPrice != endPrice -> items.filter { it.price in startPrice!!..endPrice!! }

            filterStartLetter != null -> items.filter { it.name.startsWith(filterStartLetter.uppercase()) }

            filterEndLetter != null -> items.filter { it.name.endsWith(filterEndLetter) }

            filterName != null -> items.sortedBy { it.name }
            else -> items.sortedBy { it.price }

        }
        return filter
    }

    fun clearAll() {
        items.clear()
    }

    fun getProductCount(): Int {
        return items.size
    }
}




