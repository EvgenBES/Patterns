package com.example.patterns.strategy.example

class Order(
    var totalCost: Int = 0,
    var isClosed: Boolean = false
) {

    fun processOrder(strategy: PayStrategy) {
        strategy.collectPaymentDetails()
    }

    fun setClosed() {
        isClosed = true
    }
}