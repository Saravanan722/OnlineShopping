package com.saravana.onlineshoppingcore

class Store {
    private val items = mutableListOf<Product>()
    private val register = mutableListOf<Customer>()

    fun addItems(product: Product) {
        items.add(product)
    }

    fun deleteProduct(product: Product): String {
        if (items.remove(product)) {
            return " Removed item $product"
        } else {
            return "Does not have this item $product"
        }
    }

    fun showItem() {
        items.forEach { println(it.name) }
    }

    fun searchItems(searchItem: String): List<Product> {
        val pattern = searchItem.toRegex(RegexOption.IGNORE_CASE)
        return items.filter { pattern.containsMatchIn(it.name) }
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

}


//filter price, name
//Category