package com.example.patterns.builder

interface Builder {
    fun setType(type: House.HouseType)
    fun setWindows(windows: Int)
    fun setDoors(doors: Int)
    fun setRooms(rooms: Int)
    fun build(): House
}