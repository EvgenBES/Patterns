package com.example.patterns.command.example.commands

class Receiver {
    fun doSomething(a: String) {
        print("Receiver: Working on ($a)\n")
    }

    fun doSomethingElse(b: String) {
        print("Receiver: Also working on ($b)\n")
    }
}