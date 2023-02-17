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
        ID = 6, name = "Apple", price = 100.0, discount = 10.0, tax = 5.0, description = "Eating one medium apple a day may help lower blood pressure, cholesterol, and inflammation all of which support a healthy heart. " +
                "Eat the peel when you can as the fiber and polyphenols found in the peel benefit heart health. " +
                "Apples can strengthen your lungs"
    )
    private val papper = Product(
        ID = 7, name = "Apple", price = 100.0, discount = 10.0, tax = 5.0
    )

    fun addStore() {
        Store.addItem(pen)
        Store.addItem(ball)
        Store.addItem(scissors)
        Store.addItem(watch)
//        Store.addItems(mobile)
      Store.addItem(apple)
       // Store.addItem(pen, ball, scissors, watch, mobile, apple)
    }

    fun deleteStoreProduct() {
        Store.deleteProduct(papper)
    }

    fun showStoreItem() {
        Store.getStoreItem()
    }

    fun clearAllStoreProduct() {
        Store.clearAll()
    }

    fun getStoreProductCount() {
        Store.getProductCount()
    }

    fun filterStoreProduct() {
        Store.filterStoreItem()
    }

    fun searchStoreProduct(product: String) {
        Store.searchItem(product)
    }

    fun copyProduct() = Store.copyProduct(apple)
}



