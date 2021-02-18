package com.okcodex.easyconverters.ui.calculators.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.okcodex.easyconverters.R

class LoanActivity : AppCompatActivity() {

    private lateinit var labelTotalLoan:TextView
    private lateinit var labelPerPeriod:TextView
    private lateinit var labelTotalAmount:TextView
    private lateinit var loanCalculate:TextView
    private lateinit var eLoanPeriod:EditText
    private lateinit var eLoanRate:EditText
    private lateinit var eTotalPrice:EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loan)

        labelTotalLoan = findViewById(R.id.labelTotalLoan)
        labelPerPeriod = findViewById(R.id.labelPerPeriod)
        labelTotalAmount = findViewById(R.id.labelTotalAmount)
        loanCalculate = findViewById(R.id.loanCalculate)
        eLoanPeriod = findViewById(R.id.eLoanPeriod)
        eLoanRate = findViewById(R.id.eLoanRate)
        eTotalPrice = findViewById(R.id.eTotalPrice)

        loanCalculate.setOnClickListener {

            val amount = eTotalPrice.text.toString()
            val loanRate = eLoanRate.text.toString()
            val period = eLoanPeriod.text.toString()

            when {
                amount.isEmpty() -> {
                    Toast.makeText(this, "Enter your Amount", Toast.LENGTH_SHORT).show()
                }
                loanRate.isEmpty() -> {
                    Toast.makeText(this, "Input loanRate Percentage", Toast.LENGTH_SHORT).show()
                }
                period.isEmpty() -> {
                    Toast.makeText(this, "Input period Percentage", Toast.LENGTH_SHORT).show()
                }
                else -> {

                    val totalLoanAmount: Float =
                        amount.toFloat() + (amount.toFloat() * loanRate.toFloat() / 100)
                    val totalLoan: Float =  totalLoanAmount -  amount.toFloat()
                    val totalPeriod = totalLoanAmount/period.toFloat()

                    labelTotalAmount.text = "%.2f".format(totalLoanAmount) + "$"
                    labelTotalLoan.text = "%.2f".format(totalLoan) + "$"
                    labelPerPeriod.text = "%.2f".format(totalPeriod) + "$"
                }
            }
        }
    }
}