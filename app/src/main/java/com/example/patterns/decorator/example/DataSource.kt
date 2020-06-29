package com.example.patterns.decorator.example

interface DataSource {
    fun writeData(data: String)
    fun readData(): String
}