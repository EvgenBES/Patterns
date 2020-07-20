package com.example.patterns.adapter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.patterns.R
import com.example.patterns.adapter.example.RoundHole
import com.example.patterns.adapter.example.RoundPeg
import com.example.patterns.adapter.example.SquarePeg
import com.example.patterns.adapter.example.SquarePegAdapter
import kotlinx.android.synthetic.main.activity_adapter.*
import java.lang.StringBuilder

class AdapterActivity : AppCompatActivity() {

    private val stringBundle = StringBuilder("Console: \n")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_adapter)

        val hole = RoundHole(5.0)
        val rpeg = RoundPeg(5.0)

        if (hole.fits(rpeg)) {
           vTextView.text = stringBundle.append("Round peg r5 fits round hole r5. \n")
        }

        val smallSqPeg = SquarePeg(2.0)
        val largeSqPeg = SquarePeg(222.0)

        val smallSqPegAdapter = SquarePegAdapter(smallSqPeg)
        val largeSqPegAdapter = SquarePegAdapter(largeSqPeg)

        if (hole.fits(smallSqPegAdapter)) {
            vTextView.text = stringBundle.append("Square peg w2 fits round hole r5. \n")
        }
        if (!hole.fits(largeSqPegAdapter)) {
            vTextView.text = stringBundle.append("Square peg w20 does not fit into round hole r5. \n")
        }

    }
}