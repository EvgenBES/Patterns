package com.example.patterns.strategy

import android.annotation.SuppressLint
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.appcompat.app.AppCompatActivity
import com.example.patterns.R
import com.example.patterns.strategy.example.Order
import com.example.patterns.strategy.example.PayByCreditCard
import com.example.patterns.strategy.example.PayByPayPal
import com.example.patterns.strategy.example.PayStrategy
import kotlinx.android.synthetic.main.activity_strategy.*


class StrategyActivity : AppCompatActivity() {

    private val priceOnProducts = mutableMapOf<Int, Int>()
    private val order = Order()
    private var strategy: PayStrategy? = null
    private var price: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_strategy)

        setUpPriceOnProducts()
        setUpCountListener()


        setUpAction()

    }

    private fun setUpPriceOnProducts() {
        priceOnProducts[1] = 2200
        priceOnProducts[2] = 1850
        priceOnProducts[3] = 1100
        priceOnProducts[4] = 890
    }

    private fun setUpCountListener() {
        vCount.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(p0: Editable?) { }

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) { }

            @SuppressLint("SetTextI18n")
            override fun onTextChanged(text: CharSequence?, p1: Int, p2: Int, p3: Int) {
                    if (!text.isNullOrEmpty()) {
                        val productPrice = when(radioGroup.checkedRadioButtonId) {
                            R.id.radio_1 -> priceOnProducts[1]
                            R.id.radio_2 -> priceOnProducts[2]
                            R.id.radio_3 -> priceOnProducts[3]
                            R.id.radio_4 -> priceOnProducts[4]
                            else -> 0
                        }

                        if (productPrice != null) {
                            price = productPrice!! * text.toString().toInt()
                            vTotal.text = "$price $"
                        }
                    }
            }

        })
    }


    private fun setUpAction() {
        vPay.setOnClickListener {

            order.totalCost = price

            strategy = when(radioGroupPayment.checkedRadioButtonId) {
                R.id.radio_PalPay -> PayByPayPal(email ="amanda@ya.com", password = "amanda1985")
                R.id.radio_Card -> PayByCreditCard(
                    number = "1234 1234 1234 1234",
                    date = "03/23",
                    cvv = "112"
                )
                else -> null
            }

            strategy?.let { strategy ->
                order.processOrder(strategy)

                print("Pay " + order.totalCost + " units or Continue shopping? ")

                if (strategy.pay(order.totalCost)) {
                    println("Payment has been successful.")
                } else {
                    println("FAIL! Please, check your data.")
                }
                order.setClosed()
            }


        }


    }
}