package com.example.patterns.adapter.example

class RoundHole(
    private val radius: Double
) {

    fun fits(peg: RoundPeg): Boolean {
        return (radius >= peg.getRadiusPeg())
    }

}