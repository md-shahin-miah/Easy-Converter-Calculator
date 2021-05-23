package com.okcodex.easyconverters.ui.calculators.activity

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.okcodex.easyconverters.R
import kotlinx.android.synthetic.main.activity_loan.*
import kotlinx.android.synthetic.main.activity_tax.*
import kotlinx.android.synthetic.main.toolbar_menu.*
import kotlinx.android.synthetic.main.toolbar_menu.view.*

class TaxActivity : AppCompatActivity() {

    private lateinit var eTotalPrice: EditText
    private lateinit var eTax: EditText

    private lateinit var txtTotalResult :TextView
    private lateinit var taxResult :TextView

    private lateinit var taxCalculate :TextView



    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tax)



        supportActionBar?.hide()


        initToolbar()
        toolbar_tax.tvHeader.text="Tax Calculator"



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

    private fun initToolbar() {


        ivBack.setOnClickListener {
            onBackPressed()
            finish()
        }

    }
}