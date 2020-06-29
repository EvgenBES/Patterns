package com.example.patterns.decorator.example


class FileDataSource(val name: String): DataSource  {

    private val myDataFromSystem = mutableMapOf<String, String>()

    override fun writeData(data: String) {
        myDataFromSystem[name] = data
    }

    override fun readData(): String {
        return myDataFromSystem[name] ?: "Not found data"
    }
}