package com.okcodex.easyconverters.ui.converters.activity.utils

import android.util.Log
import android.widget.EditText
import android.widget.TextView

class Fuel {

    companion object {
        private const val TAG = "Fuel"

        fun calculation(

            valueFrom: String,
                        valueTo: String,
                        textview_to: TextView,
                        result_showtext: TextView,
                        et_from: EditText
        ){

            if (valueFrom == "KILOMETER/LITER [KM/L]" && valueTo == "KILOMETER/LITER [KM/L]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "KILOMETER/LITER [KM/L]" && valueTo == "LITERS/100 km [L/100 km]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 100
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "KILOMETER/LITER [KM/L]" && valueTo == "MILES/GALLON (UK)[MPG]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from *2.8248093627967
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "KILOMETER/LITER [KM/L]" && valueTo == "MILES/GALLON (US)[MPG]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from *2.3521458329476
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "KILOMETER/LITER [KM/L]" && valueTo == "MILES/LITER [MI/L]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from *0.62137119223734
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }



            if (valueFrom == "LITERS/100 km [L/100 km]" && valueTo == "KILOMETER/LITER [KM/L]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 100
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "LITERS/100 km [L/100 km]" && valueTo == "LITERS/100 km [L/100 km]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "LITERS/100 km [L/100 km]" && valueTo == "MILES/GALLON (UK)[MPG]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 282.48093627967
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "LITERS/100 km [L/100 km]" && valueTo == "MILES/GALLON (US)[MPG]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 235.21458329475
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "LITERS/100 km [L/100 km]" && valueTo == "MILES/LITER [MI/L]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from *62.137119223734
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }



            if (valueFrom == "MILES/GALLON (UK)[MPG]" && valueTo == "KILOMETER/LITER [KM/L]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.35400619
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "MILES/GALLON (UK)[MPG]" && valueTo == "LITERS/100 km [L/100 km]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 282.48093627967
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "MILES/GALLON (UK)[MPG]" && valueTo == "MILES/GALLON (UK)[MPG]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from *1
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "MILES/GALLON (UK)[MPG]" && valueTo == "MILES/GALLON (US)[MPG]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.83267418464614
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "MILES/GALLON (UK)[MPG]" && valueTo == "MILES/LITER [MI/L]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.2199692483397
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }


            if (valueFrom == "MILES/GALLON (US)[MPG]" && valueTo == "KILOMETER/LITER [KM/L]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.4251437075
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "MILES/GALLON (US)[MPG]" && valueTo == "LITERS/100 km [L/100 km]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 235.21458329475
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "MILES/GALLON (US)[MPG]" && valueTo == "MILES/GALLON (UK)[MPG]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1.2009499254801
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "MILES/GALLON (US)[MPG]" && valueTo == "MILES/GALLON (US)[MPG]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "MILES/GALLON (US)[MPG]" && valueTo == "MILES/LITER [MI/L]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.26417205240148
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }



            if (valueFrom == "MILES/LITER [MI/L]" && valueTo == "KILOMETER/LITER [KM/L]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1.609344
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "MILES/LITER [MI/L]" && valueTo == "LITERS/100 km [L/100 km]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 62.137119223734
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "MILES/LITER [MI/L]" && valueTo == "MILES/GALLON (UK)[MPG]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 4.5460899991607
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "MILES/LITER [MI/L]" && valueTo == "MILES/GALLON (US)[MPG]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 3.7854117833791
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "MILES/LITER [MI/L]" && valueTo == "MILES/LITER [MI/L]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }

        }
    }

}