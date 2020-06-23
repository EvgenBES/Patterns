package com.example.patterns

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.patterns.builder.BuilderActivity
import com.example.patterns.observer.ObserverActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        vButtonBuilder.setOnClickListener {
            startActivity(Intent(this, BuilderActivity::class.java))
        }

        vButtonObserver.setOnClickListener {
            startActivity(Intent(this, ObserverActivity::class.java))
        }


    }
}
