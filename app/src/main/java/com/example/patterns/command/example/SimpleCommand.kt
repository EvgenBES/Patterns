package com.example.patterns.command.example.commands

class SimpleCommand(
    private val payload: String
): Command() {

    override fun invoke() {
        print("SimpleCommand: See, I can do simple things like printing ($payload)\n")
    }
}