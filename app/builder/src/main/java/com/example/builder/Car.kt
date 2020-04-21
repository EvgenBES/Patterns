package com.example.builder


open class Car internal constructor(
    builder: Builder
) {
     @get:JvmName("color") var color: CarsColor = builder.color
     @get:JvmName("maxSpeed") var maxSpeed = builder.maxSpeed
     @get:JvmName("weight") var weight  = builder.weight
     @get:JvmName("height") var height  = builder.height


    class Builder constructor() {
        internal var color: CarsColor = CarsColor.White
        internal var maxSpeed = 160
        internal var weight = 1100
        internal var height = 160

        fun changedColor(color: CarsColor) {
            this.color = color
        }

        fun changedMaxSpeed(maxSpeed: Int) {
            this.maxSpeed = maxSpeed
        }

        fun changedWeight(weight: Int) {
            this.weight = weight
        }

        fun changedHeight(height: Int) {
            this.height = height
        }

        internal constructor(car: Car) : this() {
            this.color = car.color
            this.maxSpeed = car.maxSpeed
            this.weight = car.weight
            this.height = car.height
        }

        fun build(): Car = Car(this)
    }

    enum class CarsColor {
        White,  Black, Red
    }

    override fun toString(): String {
        return "Car {color = $color , maxSpeed = $maxSpeed, weight = $weight, height = $height}"
    }

}