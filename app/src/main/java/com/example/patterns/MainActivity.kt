package com.example.patterns

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.builder.Car
import com.example.patterns.builder.House
import com.example.patterns.builder.HouseBuilder

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val houseBuilder = HouseBuilder()

        val defHouse = houseBuilder.build()

        val house = houseBuilder.apply {
            setType(House.HouseType.Iron)
            setWindows(4)
            setDoors(2)
            setRooms(2)
        }.build()


        Log.e("AAQQ", "defHouse: $defHouse")

        Log.e("AAQQ", "house: $house")



        // === Cars builder

        val defCar = Car.Builder().build()

        val car = Car.Builder().apply {
            changedColor(Car.CarsColor.Red)
            changedMaxSpeed(320)
            changedHeight(178)
            changedWeight(2100)
        }.build()

        Log.e("AAQQ", "defCar: ${defCar.toString()}")

        Log.e("AAQQ", "car: ${car.toString()}")

    }
}
