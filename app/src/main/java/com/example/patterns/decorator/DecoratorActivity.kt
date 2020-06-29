package com.example.patterns.decorator

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.patterns.R
import com.example.patterns.decorator.example.CompressionDecorator
import com.example.patterns.decorator.example.EncryptionDecorator
import com.example.patterns.decorator.example.FileDataSource
import kotlinx.android.synthetic.main.activity_decorator.*
import java.lang.StringBuilder
import java.util.*


class DecoratorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_decorator)

        val keyDataSource = "dataSource"
        val time = Calendar.getInstance().time

        val data = "Test data text time:${time.hours}:${time.minutes}:${time.seconds}"

        val encoded = CompressionDecorator(
            EncryptionDecorator(
                FileDataSource (keyDataSource)
            )
        )

        val plain = FileDataSource(keyDataSource)

        encoded.writeData(data)

        vMessage.text = StringBuilder()
            .append("----- Start ----- ${time.hours}:${time.minutes}:${time.seconds}")
            .append("\n")
            .append("${plain.readData()}  ${time.hours}:${time.minutes}:${time.seconds}")
            .append("\n")
            .append("${encoded.readData()}  ${time.hours}:${time.minutes}:${time.seconds}")
            .append("\n")

    }
}