package com.okcodex.easyconverters.ui.converters.activity

import android.os.Bundle
import android.util.Log
import android.util.TimeUtils
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.okcodex.easyconverters.R
import com.okcodex.easyconverters.ui.converters.activity.utils.*
import kotlin.math.log

class AllConvertersActivity : AppCompatActivity() {

    companion object {
        private const val TAG = "AllConvertersActivity"
    }

    private var valueFrom = "METRE"
    private var valueTo = "METRE"


    private lateinit var calculateAllConverter: Button
    private lateinit var resultShowText: TextView
    private lateinit var textViewTo: TextView

    private lateinit var spinnerFrom: Spinner
    private lateinit var spinnerTo: Spinner

    private lateinit var etFrom: EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_all_converters)

        calculateAllConverter = findViewById(R.id.calculateAllConverter)
        resultShowText = findViewById(R.id.resultShowText)


        spinnerFrom = findViewById(R.id.spinnerFrom)
        spinnerTo = findViewById(R.id.spinnerTo)
        etFrom = findViewById(R.id.etFrom)
        textViewTo = findViewById(R.id.textViewTo)

        val array=intent.getIntExtra("converter",R.array.weight_array)



        ArrayAdapter.createFromResource(
            this,
            array,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinnerFrom.adapter = adapter
        }


        spinnerFrom.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {}
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                valueFrom = parent?.getItemAtPosition(position).toString()
            }
        }
        ArrayAdapter.createFromResource(
            this,
            array,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinnerTo.adapter = adapter
        }
        spinnerTo.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {}
            override fun onItemSelected(
                parent: AdapterView<*>?, view: View?, position: Int,
                id: Long
            ) {
                valueTo = parent?.getItemAtPosition(position).toString()
            }
        }

        calculateAllConverter.setOnClickListener {

            Log.d(TAG, "onCreate: clicked")
            val value = etFrom.text.toString()
            if (value.isEmpty()) {
                etFrom.error = "input required"
            } else {
                when (array) {
                    R.array.weight_array -> {
                        Weight.calculation(valueFrom, valueTo, value.toFloat(), textViewTo, resultShowText)
                    }
                    R.array.length_array -> {
                        Length.calculation(valueFrom, valueTo, textViewTo, resultShowText,etFrom)
                    }
                    R.array.speed_array -> {
                        Speed.calculation(valueFrom, valueTo, value.toFloat(), textViewTo, resultShowText)
                    }
                    R.array.pressure_array -> {
                        Pressure.calculation(valueFrom, valueTo, value.toFloat(), textViewTo, resultShowText)
                    }
                    R.array.volume_array -> {
                        Volume.calculation(valueFrom, valueTo, textViewTo, resultShowText,etFrom)
                    }
                    R.array.angle_array -> {
                        Angle.calculation(valueFrom, valueTo, value.toFloat(), textViewTo, resultShowText)
                    }
                    R.array.fuel_array -> {
                        Fuel.calculation(valueFrom, valueTo, textViewTo, resultShowText,etFrom)
                    }
                    R.array.temperature_array -> {
                        Temperature.calculation(valueFrom, valueTo, textViewTo, resultShowText,etFrom)
                    }
                    R.array.area_array -> {
                        Area.calculation(valueFrom, valueTo, value.toFloat(), textViewTo, resultShowText)
                    }
                    R.array.cooking_array -> {
                        Cooking.calculation(valueFrom, valueTo, textViewTo, resultShowText,etFrom)
                    }
                    R.array.data_storage_array -> {
                        DataStorage.calculation(valueFrom, valueTo, textViewTo, resultShowText,etFrom)
                    }
                    //                else if (array==R.array.time_array){
                    //                    Time.calculation(valueFrom, valueTo, value.toFloat(), textViewTo, resultShowText)
                    //                }
                    R.array.energy_array -> {
                        Energy.calculation(valueFrom, valueTo, textViewTo, resultShowText,etFrom)
                    }
                }
//                else if (array==R.array.){
//                    Weight.calculation(valueFrom, valueTo, value.toFloat(), textViewTo, resultShowText)
//                }
//                else if (array==R.array.){
//                    Weight.calculation(valueFrom, valueTo, value.toFloat(), textViewTo, resultShowText)
//                }
//                else if (array==R.array.){
//                    Weight.calculation(valueFrom, valueTo, value.toFloat(), textViewTo, resultShowText)
//                }
            }
        }
    }

}