package com.okcodex.easyconverters.ui.calculators.activity

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.okcodex.easyconverters.R


class TipActivity : AppCompatActivity() {

    private lateinit var ebill: EditText
    private lateinit var etip:EditText
    private lateinit var eperson:EditText

    private lateinit var calculate: TextView
    private lateinit var totalbill:TextView
    private lateinit var totaltip:TextView
    private lateinit var personbill:TextView
    private lateinit var persontip:TextView
    private lateinit var layout: LinearLayout


    var total: Double = 0.0
    var tip:Double = 0.0
    var perperson:Double = 0.0
    var perpersontip:Double = 0.0

    var person: Double = 0.0



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tip)

        ebill = findViewById(R.id.etotalbillID)
        etip = findViewById(R.id.etipID)
        eperson = findViewById(R.id.epersonID)

        calculate = findViewById(R.id.tipcalculate)

        totalbill = findViewById(R.id.totalbill)
        totaltip = findViewById(R.id.totaltip)
        personbill = findViewById(R.id.personbill)
        persontip = findViewById(R.id.persontip)

        layout = findViewById(R.id.resululinID)



        calculate.setOnClickListener {
            val b = ebill.text.toString().trim()
            val t = etip.text.toString().trim()
            val p = eperson.text.toString().trim()
            if (b == "") {
                Toast.makeText(this@TipActivity, "Enter your bill", Toast.LENGTH_SHORT).show()
            } else if (t == "") {
                Toast.makeText(this@TipActivity, " input Tips Percentage", Toast.LENGTH_SHORT).show()
            } else {


                person = if (p == "" || p == "0") {
                    1.0
                } else {
                    p.toDouble()
                }
                val bill = b.toDouble()
                val tipp = t.toDouble()
                total = bill * (tipp / 100) + bill
                tip = bill * (tipp / 100)
                perperson = total / person
                perpersontip = tip / person
                layout.visibility = View.VISIBLE
                totalbill.text = "%.2f".format(total)+"$"
                totaltip.text = "%.2f".format(tip)+"$"
                personbill.text = "%.2f".format(perperson)+"$"
                persontip.text = "%.2f".format(perpersontip)+"$"
            }
        }

    }
}
