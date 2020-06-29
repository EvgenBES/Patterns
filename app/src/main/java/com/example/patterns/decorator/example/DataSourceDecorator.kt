package com.example.patterns.decorator.example

import android.util.Log

open class DataSourceDecorator(val wrappee: DataSource) : DataSource {

    override fun writeData(data: String) {
        Log.e("AAQQ", "writeData")

        wrappee.writeData(data)
    }

    override fun readData(): String {
        Log.e("AAQQ", "readData")

        return wrappee.readData()
    }
}