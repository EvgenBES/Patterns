package com.example.patterns.observer.example

interface EventListener {
    fun update(eventType: String, message: String)
}