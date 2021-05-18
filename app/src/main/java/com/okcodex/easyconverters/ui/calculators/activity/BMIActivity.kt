package com.okcodex.easyconverters.ui.calculators.activity

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.okcodex.easyconverters.R
import kotlinx.android.synthetic.main.activity_age_calculator.*
import kotlinx.android.synthetic.main.activity_b_m_i.*
import kotlinx.android.synthetic.main.toolbar_menu.*
import kotlinx.android.synthetic.main.toolbar_menu.view.*

import java.text.DecimalFormat

class BMIActivity : AppCompatActivity() {


    private lateinit var EhightF: EditText
    private lateinit var EhightI: EditText
    private lateinit var EWeight: EditText
    private lateinit var calculate: TextView
    private lateinit var showResult: TextView
    private lateinit var typebmi: TextView

    var weight = 0.0
    var feet = 0.0
    var inches = 0.0
    var result = 0.0


    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b_m_i)

        supportActionBar?.hide()



        EWeight = findViewById(R.id.weightbmiID)
        EhightF = findViewById(R.id.heightbmifeetID)
        EhightI = findViewById(R.id.heightbmiincheID)
        calculate = findViewById(R.id.bmicalculate)
        showResult = findViewById(R.id.showresultbmiID)
        typebmi = findViewById(R.id.typeBmiID)


        initToolbar()
        toolbar_bmi.tvHeader.text="BMI Calculator"

        calculate.setOnClickListener(View.OnClickListener {
            val w = EWeight.text.toString().trim()
            val f = EhightF.text.toString().trim()
            val i = EhightI.text.toString().trim()

            if (w == "") {
                Toast.makeText(this@BMIActivity, "Enter your Weight", Toast.LENGTH_SHORT).show()
                return@OnClickListener
            } else if (f == "") {
                Toast.makeText(this@BMIActivity, "Feet Missing", Toast.LENGTH_SHORT).show()
                return@OnClickListener
            } else if (i == "") {
                Toast.makeText(this@BMIActivity, "Inches Missing", Toast.LENGTH_SHORT).show()
                return@OnClickListener
            } else {
                weight = w.toDouble()
                feet = f.toDouble()
                inches = i.toDouble()
                if (inches > 12) {
                    Toast.makeText(this@BMIActivity, "input valid inches", Toast.LENGTH_SHORT)
                        .show()
                    return@OnClickListener
                }
                val weightInKilos = weight
                val heightInMeters = (feet * 12 + inches) * .0254
                val bmi = weightInKilos / Math.pow(heightInMeters, 2.0)
                showResult.text = DecimalFormat("##.##").format(bmi)


                //interpret BMI
                if (bmi < 18.5) {
                    typebmi.text = "Underweight"
                    typebmi.setTextColor(resources.getColor(R.color.red_active))
                } else if (bmi >= 18.5 && bmi < 25) {
                    typebmi.text = "Normal"
                    typebmi.setTextColor(resources.getColor(R.color.green_active))
                } else if (bmi >= 25 && bmi < 30) {
                    typebmi.text = "Overweight"
                    typebmi.setTextColor(resources.getColor(R.color.orange_active))
                } else if (bmi >= 30) {
                    typebmi.text = "Obese"
                    typebmi.setTextColor(resources.getColor(R.color.red_active))
                }
            }
        })


    }
    private fun initToolbar() {


        ivBack.setOnClickListener {
            onBackPressed()
            finish()
        }

    }

}