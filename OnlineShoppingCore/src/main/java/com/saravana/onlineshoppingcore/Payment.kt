package com.saravana.onlineshoppingcore


open class Payment(
    val ID: String, val cardType: String, val cardNumber: String, val invoice: Invoice
)

interface Pay {
    fun payAmount(payAmount: Double, pinNumber: String): String
}

class CardPayment(
    ID: String, cardType: String, cardNumber: String, invoice: Invoice
) : Payment(
    ID, cardType, cardNumber, invoice
), Pay {


    override fun payAmount(payAmount: Double, pinNumber: String): String {
        var name = ""
        print("Enter Coupon Number: ")
        val getCoupon: String? = readLine()
        val total = invoice.applyCoupon(getCoupon)
        println("Total: $total")
        if (pinNumber == cardNumber) if (total == payAmount) {
            name = "Successful $payAmount payed"
        } else if (total > payAmount && payAmount >= 1) {
            val balanceAmount = total - payAmount
            name = "Payed Amount : $payAmount Balance Amount: $balanceAmount "
        } else {
            name = "Insufficient Balance your account"
        }
        return name
    }


}

class UPIPayment(
    ID: String, cardType: String, cardNumber: String, invoice: Invoice
) : Payment(
    ID, cardType, cardNumber, invoice
), Pay {

    override fun payAmount(payAmount: Double, pinNumber: String): String {
        var name = ""
        print("Enter Coupon Number: ")
        val getCoupon: String? = readLine()
        val total = invoice.applyCoupon(getCoupon)
        println("Total: $total")
        if (pinNumber == cardNumber) if (total == payAmount) {
            name = "Successful $payAmount payed"
        } else if (total > payAmount) {
            val balanceAmount = total - payAmount
            name = "Payed Amount : $payAmount Balance Amount: $balanceAmount "
        } else {
            name = "Insufficient Balance your account"
        }
        return name
    }

}
