package com.okcodex.easyconverters.ui.calculators.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.okcodex.easyconverters.R

class UnitPriceActivity : AppCompatActivity() {

    private lateinit var eTtotalPrice: EditText
    private lateinit var eQuantity: EditText
    private lateinit var eFareCost: EditText


    private lateinit var calculate: TextView
    private lateinit var showResult: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_unit_price)

        eTtotalPrice = findViewById(R.id.eTotalPriceID)

        eQuantity = findViewById(R.id.eQuantityID)
        eFareCost = findViewById(R.id.eFareCostID)

        calculate = findViewById(R.id.unitPricecalculate)

        showResult = findViewById(R.id.showresultUnitPriceID)


        calculate.setOnClickListener {
            val total = eTtotalPrice.text.toString().trim()
            val quantity = eQuantity.text.toString().trim()
            val fare = eFareCost.text.toString().trim()

            if (total.isNotEmpty() && quantity.isNotEmpty() && fare.isNotEmpty()) {
                setUnitPrice(total, quantity, fare)
            } else {
                Toast.makeText(this, "input ", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun setUnitPrice(total: String, quantity: String, fare: String) {
        val t = total.toFloat()
        val q = quantity.toFloat()
        val f = fare.toFloat()
        val res = (t + f) / q
        showResult.text = "$res"
    }
}