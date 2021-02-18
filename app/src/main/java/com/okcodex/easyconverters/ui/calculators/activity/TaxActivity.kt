package com.okcodex.easyconverters.ui.calculators.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.okcodex.easyconverters.R

class TaxActivity : AppCompatActivity() {

    private lateinit var eTotalPrice: EditText
    private lateinit var eTax: EditText

    private lateinit var txtTotalResult :TextView
    private lateinit var taxResult :TextView

    private lateinit var taxCalculate :TextView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tax)

        eTotalPrice = findViewById(R.id.eTotalPriceID)
        eTax = findViewById(R.id.eTaxID)
        txtTotalResult = findViewById(R.id.txtTotalResult)
        taxResult = findViewById(R.id.taxResult)
        taxCalculate = findViewById(R.id.taxCalculate)


        taxCalculate.setOnClickListener {
            val amount = eTotalPrice.text.toString()
            val tax = eTax.text.toString()

            when {
                amount.isEmpty() -> {
                    Toast.makeText(this, "Enter your Amount", Toast.LENGTH_SHORT).show()
                }
                tax.isEmpty() -> {
                    Toast.makeText(this, "Input Discount Percentage", Toast.LENGTH_SHORT).show()
                }
                else -> {
                    val totalTaxAmount: Float =
                        amount.toFloat() + (amount.toFloat() * tax.toFloat() / 100)
                    val totalTax: Float =  totalTaxAmount -  amount.toFloat()
                    txtTotalResult.text = "%.2f".format(totalTaxAmount) + "$"
                    taxResult.text = "%.2f".format(totalTax) + "$"
                }
            }

        }

        
    }
}