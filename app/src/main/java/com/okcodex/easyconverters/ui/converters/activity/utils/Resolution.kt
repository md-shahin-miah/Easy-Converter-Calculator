package com.okcodex.easyconverters.ui.converters.activity.utils

import android.content.ContentValues.TAG
import android.util.Log
import android.widget.TextView

class Resolution {

    companion object {

        private fun calculation(
            valueFrom: String,
            valueTo: String,
            from: Float,
            textViewTo: TextView,
            resultShowText: TextView
        ) {

            fun getValue(value1: Double) {
                val result = from * value1
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }

            if (valueFrom == "KILOGRAM" && valueTo == "GRAM") {
                getValue(1000.0)
            }
            if (valueFrom == "KILOGRAM" && valueTo == "KILOGRAM") {
                getValue(1.0)
            }
            if (valueFrom == "KILOGRAM" && valueTo == "MILIGRAM") {
                getValue(10000.0)
            }
            if (valueFrom == "KILOGRAM" && valueTo == "OUNCE") {
                getValue(35.27396)
            }
            if (valueFrom == "KILOGRAM" && valueTo == "MICROGRAM") {
                getValue(1000000000.0)
            }
            if (valueFrom == "KILOGRAM" && valueTo == "POUND") {
                getValue(2.2046226218)
            }
            if (valueFrom == "KILOGRAM" && valueTo == "TONNE") {
                val result = from / 1000
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }

        }
    }
}