package com.example.patterns

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.patterns.adapter.AdapterActivity
import com.example.patterns.builder.BuilderActivity
import com.example.patterns.decorator.DecoratorActivity
import com.example.patterns.observer.ObserverActivity
import com.example.patterns.strategy.StrategyActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    @ExperimentalStdlibApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        vButtonBuilder.setOnClickListener {
            startActivity(Intent(this, BuilderActivity::class.java))
        }

        vButtonObserver.setOnClickListener {
            startActivity(Intent(this, ObserverActivity::class.java))
        }

        vButtonDecorator.setOnClickListener {
            startActivity(Intent(this, DecoratorActivity::class.java))
        }

        vButtonStrategy.setOnClickListener {
            startActivity(Intent(this, StrategyActivity::class.java))
        }

        vButtonAdapter.setOnClickListener {
            startActivity(Intent(this, AdapterActivity::class.java))
        }

    }
}
