package com.example.patterns.observer.example

import android.util.Log

class EmailNotificationListener : EventListener {

    override fun update(eventType: String, message: String) {
        Log.e("AAQQ", "Update: EmailNotificationListener - $message")
    }
}