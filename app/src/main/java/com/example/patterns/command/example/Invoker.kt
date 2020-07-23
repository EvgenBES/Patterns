package com.example.patterns.command.example.commands

class Invoker {

    private var onStart: Command? = null

    private var onFinish: Command? = null

    fun setOnStart(command: Command) {
        onStart = command
    }

    fun setOnFinish(command: Command) {
        onFinish = command
    }

    fun doSomethingImportant() {

        print("Invoker: Does anybody want something done before I begin?\n")

        onStart?.invoke()

        print("Invoker: ...doing something really important...\n")
        print("Invoker: Does anybody want something done after I finish?\n")

        onFinish?.invoke()
    }
}