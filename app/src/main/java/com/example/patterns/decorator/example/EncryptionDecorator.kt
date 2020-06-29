package com.example.patterns.decorator.example

import android.util.Log

class EncryptionDecorator(source: DataSource): DataSourceDecorator(source)  {

    override fun writeData(data: String) {
        super.writeData(encode(data))
    }

    override fun readData(): String {
        return decode(super.readData())
    }

    private fun encode(data: String): String  {
        Log.e("AAQQ", "magic encode")

        return data
    }

    private fun decode(data: String): String {
        Log.e("AAQQ", "magic decode")

        return data
    }
}