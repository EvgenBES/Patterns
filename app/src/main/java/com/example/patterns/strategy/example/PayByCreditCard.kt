package com.example.patterns.strategy.example

class PayByCreditCard(
    private val number: String,
    private val date: String,
    private val cvv: String
): PayStrategy {

    private var card: CreditCard? = null

    override fun pay(paymentAmount: Int): Boolean {
        return if (cardIsPresent()) {
            println("Paying $paymentAmount using Credit Card.")
            card!!.amount = (card!!.amount - paymentAmount)
            true
        } else {
            false
        }
    }

    override fun collectPaymentDetails() {
        card = CreditCard(number, date, cvv)
    }

    private fun cardIsPresent(): Boolean {
        return card != null
    }
}