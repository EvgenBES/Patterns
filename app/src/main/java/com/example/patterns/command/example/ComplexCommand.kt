package com.example.patterns.command.example.commands

class ComplexCommand(
    private val receiver: Receiver,
    private val a: String,
    private val b: String
) : Command() {

    override fun invoke() {
        print("ComplexCommand: Complex stuff should be done by a receiver object.\n")
        receiver.doSomething(a)
        receiver.doSomethingElse(b)
    }

}