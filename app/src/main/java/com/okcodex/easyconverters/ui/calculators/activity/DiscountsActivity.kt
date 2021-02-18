package com.okcodex.easyconverters.ui.calculators.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.okcodex.easyconverters.R


class DiscountsActivity : AppCompatActivity() {

    private lateinit var labelDiscountAmount: TextView
    private lateinit var labelTotalAmount: TextView
    private lateinit var discountPriceCalculate: TextView
    private lateinit var eDiscount: EditText
    private lateinit var eTotalPrice: EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_discounts)

        labelDiscountAmount = findViewById(R.id.labelDiscountAmount)
        labelTotalAmount = findViewById(R.id.labelTotalAmount)
        discountPriceCalculate = findViewById(R.id.discountPriceCalculate)
        eDiscount = findViewById(R.id.eDiscount)
        eTotalPrice = findViewById(R.id.eTotalPrice)

        discountPriceCalculate.setOnClickListener {
            val amount = eTotalPrice.text.toString()
            val discount = eDiscount.text.toString()

            when {
                amount.isEmpty() -> {
                    Toast.makeText(this, "Enter your Amount", Toast.LENGTH_SHORT).show()
                }
                discount.isEmpty() -> {
                    Toast.makeText(this, "Input Discount Percentage", Toast.LENGTH_SHORT).show()
                }
                else -> {

                    val totalDiscountAmount: Float =
                        amount.toFloat() - (amount.toFloat() * discount.toFloat() / 100)
                    val totalDiscount: Float = amount.toFloat() - totalDiscountAmount
                    labelTotalAmount.text = "%.2f".format(totalDiscountAmount) + "$"
                    labelDiscountAmount.text = "%.2f".format(totalDiscount) + "$"
                }
            }

        }

    }
}