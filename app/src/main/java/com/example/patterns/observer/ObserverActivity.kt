package com.example.patterns.observer

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.patterns.R
import com.example.patterns.observer.example.Editor
import com.example.patterns.observer.example.EventManager
import com.example.patterns.observer.example.LogOpenListener
import kotlinx.android.synthetic.main.activity_observer.*

class ObserverActivity : AppCompatActivity() {

    private val messageBuilder: StringBuilder = StringBuilder()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_observer)

        val editor = Editor(EventManager("send"))
        editor.events.subscribe("send", LogOpenListener(
            eventListener = { message ->
                messageBuilder.append(message)
                messageBuilder.append("\n")
                vTextView.setText("")
            }
        ))

        vButton.setOnClickListener {
            val messageText = vTextView.text.toString()

            if (messageText.isNotEmpty()) {
                editor.sendMessage(messageText)
            }

            vMessage.text = messageBuilder.toString()
        }
    }
}
