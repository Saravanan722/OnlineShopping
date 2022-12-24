package com.saravana.onlineshoppingcore

import java.text.SimpleDateFormat
import java.util.Calendar

class PrinterManager(private val printer: Printer) {
    fun print() = printer.print()
}

interface Printer {
    fun print()
}

/*
Laser Printers.
Solid Ink Printers.
LED Printers.
 */

class LaserPrinter(private val invoice: Invoice) : Printer {

    override fun print() {
        val today = Calendar.getInstance()
        println("Date: ${SimpleDateFormat().format(today.time)}  ")
        println("Invoice: ")
        invoice.products.withIndex().forEach {
            println("${it.index + 1}: ${it.value}")
        }

        println("Total discount: ${invoice.discount}")
        println("Total: ${invoice.getTotal()}")
        print("Enter Coupon Number: ")
        val getCoupon: String? = readLine()
        println(invoice.applyCoupon(getCoupon))
    }
}

class SolidInkPrinter(private val invoice: Invoice) : Printer {
    override fun print() {

    }
}

class LEDPrinter(private val invoice: Invoice) : Printer {
    override fun print() {

    }
}

