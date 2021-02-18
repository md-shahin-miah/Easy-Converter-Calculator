package com.okcodex.easyconverters.ui.converters.activity.utils

import android.util.Log
import android.widget.EditText
import android.widget.TextView

class Temperature {

    companion object {
        private const val TAG = "Temperature"

         fun calculation(    valueFrom: String,
                                    valueTo: String,
                                    textview_to: TextView,
                                    result_showtext: TextView,
                                    et_from: EditText
        ) {

            if (valueFrom == "CELSIUS" && valueTo == "CELSIUS") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "CELSIUS" && valueTo == "FAHRENHEIT") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 33.8
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "CELSIUS" && valueTo == "KELVIN") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 274.15
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "CELSIUS" && valueTo == "RANKINE") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 493.47
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }




            if (valueFrom == "FAHRENHEIT" && valueTo == "CELSIUS") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from *-17.2222
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "FAHRENHEIT" && valueTo == "FAHRENHEIT") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "FAHRENHEIT" && valueTo == "KELVIN") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from *255.9278
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "FAHRENHEIT" && valueTo == "RANKINE") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 460.67
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }


            if (valueFrom == "KELVIN" && valueTo == "CELSIUS") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * -272.14996
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "KELVIN" && valueTo == "FAHRENHEIT") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * -457.869928
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "KELVIN" && valueTo == "KELVIN") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "KELVIN" && valueTo == "RANKINE") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1.8
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }



            if (valueFrom == "RANKINE" && valueTo == "CELSIUS") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 272.5944
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "RANKINE" && valueTo == "FAHRENHEIT") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from *458.67
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "RANKINE" && valueTo == "KELVIN") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.5556
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "RANKINE" && valueTo == "RANKINE") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from *1
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }




        }


    }
}