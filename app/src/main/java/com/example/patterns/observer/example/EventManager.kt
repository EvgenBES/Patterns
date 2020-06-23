package com.example.patterns.observer.example

class EventManager(vararg operations: String) {

    private val listeners: HashMap<String, MutableList<EventListener>> = HashMap()

    init {
        for (operation in operations) {
            listeners[operation] = mutableListOf()
        }
    }

    fun subscribe(eventType: String, listener: EventListener) {
        val users = listeners[eventType]
        users?.add(listener)
    }

    fun unsubscribe(eventType: String, listener: EventListener) {
        val users = listeners[eventType]
        users?.remove(listener)
    }

    fun notify(eventType: String, message: String) {
        val users = listeners[eventType]
        users?.forEach { listener ->
            listener.update(eventType, message)
        }

    }


}