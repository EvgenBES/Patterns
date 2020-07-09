package com.example.patterns.strategy.example

data class CreditCard(
    val number: String,
    val date: String,
    val cvv: String,
    var amount: Int = 100_000
)