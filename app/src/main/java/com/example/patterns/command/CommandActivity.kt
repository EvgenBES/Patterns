package com.example.patterns.command

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.patterns.R
import com.example.patterns.command.example.commands.ComplexCommand
import com.example.patterns.command.example.commands.Invoker
import com.example.patterns.command.example.commands.Receiver
import com.example.patterns.command.example.commands.SimpleCommand

class CommandActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_command)

        val invoker = Invoker()
        invoker.setOnStart(SimpleCommand("Say Hi!"))


        val receiver = Receiver()
        invoker.setOnFinish(ComplexCommand(receiver, "Send email", "Save report"))
        invoker.doSomethingImportant()
    }
}