package com.saravana.onlineshoppingcore

class Admin {

    private val pen = Product(
        ID = 1, name = "Hero Pen", price = 50.0, discount = 10.0, tax = 5.0
    )

    private val ball = Product(
        ID = 2, name = "Cricket Ball", price = 100.0, discount = 10.0, tax = 20.0
    )

    private val scissors = Product(
        ID = 3, name = "Scissors", price = 100.0, discount = 10.0, tax = 50.0
    )

    private val watch = Product(
        ID = 4, name = "Smart Watch", price = 50.0, discount = 0.0, tax = 0.0
    )

    private val mobile = Product(
        ID = 5, name = "Redmi Note 8 Bro", price = 10000.0, discount = 10.0, tax = 10.0
    )

    private val apple = Product(
        ID = 6, name = "Apple", price = 100.0, discount = 10.0, tax = 5.0
    )
    private val papper = Product(
        ID = 7, name = "Apple", price = 100.0, discount = 10.0, tax = 5.0
    )

    fun addStore() {
//        Store.addItems(pen)
//        Store.addItems(ball)
//        Store.addItems(scissors)
//        Store.addItems(watch)
//        Store.addItems(mobile)
//        Store.addItems(apple)
        Store.addItem(pen, ball, scissors, watch, mobile, apple)
    }

    fun deleteStoreProduct() {
        println(Store.deleteProduct(papper))
    }

    fun showStoreItem() {
        Store.getStoreItem()
    }

    fun clearAllStoreProduct() {
        Store.clearAll()
    }

    fun getStoreProductCount() {
        println(Store.getProductCount())
    }

    fun filterStoreProduct() {
        Store.filterStoreItem()
    }

    fun searchStoreProduct(product: String) {
        println(Store.searchItem(product))
    }

    
}



