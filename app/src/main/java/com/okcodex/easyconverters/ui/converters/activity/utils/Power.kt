package com.okcodex.easyconverters.ui.converters.activity.utils

import android.util.Log
import android.widget.EditText
import android.widget.TextView

class Power {

    companion object {
        private const val TAG = "Power"

         fun calculation(valueFrom: String,
                         valueTo: String,
                         textview_to: TextView,
                         result_showtext: TextView,
                         et_from: EditText
         ) {
            if (valueFrom == "KILOGRAM" && valueTo == "GRAM") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "KILOGRAM" && valueTo == "KILOGRAM") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "KILOGRAM" && valueTo == "MILIGRAM") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 10000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "KILOGRAM" && valueTo == "OUNCE") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 35.27396
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "KILOGRAM" && valueTo == "MICROGRAM") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1000000000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "KILOGRAM" && valueTo == "POUND") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 2.2046226218
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "KILOGRAM" && valueTo == "TONNE") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from / 1000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }


        }


    }
}