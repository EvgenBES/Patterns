package com.example.patterns.builder

data class House(
    val type: HouseType,
    val windows: Int,
    val doors: Int,
    val rooms: Int
) {

    sealed class HouseType {
        object Wooden: HouseType()
        object Stone: HouseType()
        object Iron: HouseType()
    }
}