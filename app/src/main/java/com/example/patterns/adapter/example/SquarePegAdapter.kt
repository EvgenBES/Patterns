package com.example.patterns.adapter.example

import kotlin.math.pow
import kotlin.math.sqrt

class SquarePegAdapter(
    val peg: SquarePeg
): RoundPeg() {

    override fun getRadiusPeg(): Double {
        return (sqrt((peg.width / 2).pow(2) * 2))
    }

}