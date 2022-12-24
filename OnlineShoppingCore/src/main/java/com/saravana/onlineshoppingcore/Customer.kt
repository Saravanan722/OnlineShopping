package com.saravana.onlineshoppingcore

class Customer(
    name: String,
    emailID: String,
    address: String,
    phoneNumber: String,
    customerId: String,
    boolean: Boolean
) : Person(name, emailID, address, phoneNumber) {

    val customer_Id = customerId
    private var trueOrFalse = boolean
        private set

    fun registerCustomer() {

        val yesNo = if (this.trueOrFalse) {
            "Yes"
        } else {
            "No"
        }
        println(
            "Customer Info :<---------------------> " +
                    "\nCus_ID      : $customer_Id " +
                    "\nCusterName  : $name" +
                    "\nemailID     : $emailID" +
                    "\nAddress     : $address" +
                    "\nPhoneNumber : $phoneNumber" +
                    "\nYes or No   : $yesNo"
        )
    }

//    fun updateCustomer(name: String,emailID: String,address: String,phoneNumber: String,CusID:String) {
//        if (customer_Id == CusID )
//        this.name = name
//        this.emailID = emailID
//        this.address = address
//        this.phoneNumber = phoneNumber
//    }
}


// 0      0
// 1      2 -> T
// 9      4 -> L

// 1   2 -->
// 9   4
// 5   0
// 1   4
// 0   1
// 9   4
// 6

// a = 10  b = 20 --> a = 20 b = 10
// a = a + b
// b = a - b
// a = a - b

