package com.example.patterns.adapter.example

import kotlin.math.pow

class SquarePeg(
    val width: Double
) {

    fun getSquare(): Double {
        return this.width.pow(2)
    }
}