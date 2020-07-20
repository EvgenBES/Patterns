package com.example.patterns.adapter.example

open class RoundPeg(
    val radius: Double = 0.0
) {


    open fun getRadiusPeg(): Double {
        return radius
    }
}