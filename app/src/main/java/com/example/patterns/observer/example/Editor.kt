package com.example.patterns.observer.example

class Editor(
    val events: EventManager
) {
    fun sendMessage(message: String) {
        events.notify("send", message)
    }
}