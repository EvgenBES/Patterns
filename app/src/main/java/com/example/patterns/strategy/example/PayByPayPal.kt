package com.example.patterns.strategy.example

class PayByPayPal(
    private val email: String,
    private val password: String
): PayStrategy {

    private val DATA_BASE = mutableMapOf<String, String>()

    private var signedIn: Boolean = false

    init {
        DATA_BASE["amanda1985"] = "amanda@ya.com"
        DATA_BASE["qwerty"] = "john@amazon.eu"
    }

    override fun collectPaymentDetails() {
        if (verify()) {
            println("Data verification has been successful.");
        } else {
            println("Wrong email or password!");
        }
    }

    override fun pay(paymentAmount: Int): Boolean {
        return if (signedIn) {
            println("Paying $paymentAmount using PayPal.")
            true
        } else {
            false
        }
    }

    private fun verify() : Boolean{
        signedIn = email == DATA_BASE[password]
        return signedIn
    }
}