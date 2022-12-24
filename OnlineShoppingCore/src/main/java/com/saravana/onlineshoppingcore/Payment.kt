package com.saravana.onlineshoppingcore


open class Payment(
    val ID: Int,
    val cardType: String,
    val cardNumber: String,
    val invoice: Invoice
)

interface Pay {
    fun payAmount(payAmount: Double, pinNumber: String)
}

class CardPayment(
    ID: Int,
    cardType: String,
    cardNumber: String,
    invoice: Invoice
) :
    Payment(
        ID,
        cardType,
        cardNumber,
        invoice
    ), Pay {


    override fun payAmount(payAmount: Double, pinNumber: String) {
        if (pinNumber == cardNumber)
            if (invoice.getTotal() == payAmount) {
                println("Successful $payAmount payed")
            } else if (invoice.getTotal() > payAmount) {
                var balanceAmount = invoice.getTotal() - payAmount
                println("Payed Amount : $payAmount Balance Amount: $balanceAmount ")
            } else {
                println("Insufficient Balance your account")
            }

    }


}

class UPIPayment(
    ID: Int,
    cardType: String,
    cardNumber: String,
    invoice: Invoice
) : Payment(
    ID,
    cardType,
    cardNumber,
    invoice
), Pay {

    override fun payAmount(payAmount: Double, pinNumber: String) {
        if (pinNumber == cardNumber)
            if (invoice.getTotal() == payAmount) {
                println("Successful $payAmount payed")
            } else if (invoice.getTotal() > payAmount) {
                var balanceAmount = invoice.getTotal() - payAmount
                println("Payed Amount : $payAmount Balance Amount: $balanceAmount ")
            } else {
                println("Insufficient Balance your account")
            }
    }

}
