package com.example.patterns.observer.example

class LogOpenListener(
    private val eventListener: (String) -> Unit
) : EventListener  {

    override fun update(eventType: String, message: String) {
        eventListener(message)
    }
}