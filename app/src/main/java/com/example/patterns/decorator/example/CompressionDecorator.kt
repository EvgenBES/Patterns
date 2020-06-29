package com.example.patterns.decorator.example

import android.util.Log


class CompressionDecorator(source: DataSource) : DataSourceDecorator(source) {
    val compLevel = 6

    override fun writeData(data: String) {
        super.writeData(compress(data))
    }

    override fun readData(): String {
        return decompress(super.readData())
    }

    private fun compress(data: String): String {
        Log.e("AAQQ", "magic compress")

        return data
    }

    private fun decompress(data: String) : String {
        Log.e("AAQQ", "magic decompress")

        return data
    }
}