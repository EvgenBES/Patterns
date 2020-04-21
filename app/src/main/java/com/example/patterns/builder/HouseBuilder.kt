package com.example.patterns.builder

class HouseBuilder : Builder {

    private var type: House.HouseType = House.HouseType.Wooden
    private var windows: Int = 0
    private var doors: Int = 1
    private var rooms: Int = 1

    override fun setType(type: House.HouseType) {
        this.type = type
    }

    override fun setWindows(windows: Int) {
        this.windows = windows
    }

    override fun setDoors(doors: Int) {
        this.doors = doors
    }

    override fun setRooms(rooms: Int) {
        this.rooms = rooms
    }

    override fun build(): House {
        return House(
            type,
            windows,
            doors,
            rooms
        )
    }
}