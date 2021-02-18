package com.okcodex.easyconverters.ui.converters.activity.utils

import android.util.Log
import android.widget.EditText
import android.widget.TextView

class Volume {

    companion object {
        private const val TAG = "Power"

         fun calculation(
            valueFrom: String,
            valueTo: String,
            textViewTo: TextView,
            resultShowText: TextView,
            et_from: EditText
        ) {
            if (valueFrom == "US LIQUID GALLON" && valueTo == "US LIQUID GALLON") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "US LIQUID GALLON" && valueTo == "US LIQUID QUART") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 4
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "US LIQUID GALLON" && valueTo == "US LIQUID PINT") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 8
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "US LIQUID GALLON" && valueTo == "US LEGAL CUP") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 15.7725
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "US LIQUID GALLON" && valueTo == "FLUID OUNCE") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 128
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "US LIQUID GALLON" && valueTo == "US TABLESPOON") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 256
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "US LIQUID GALLON" && valueTo == "US TEASPOON") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 768
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "US LIQUID GALLON" && valueTo == "CUBIC METER") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.00378541
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "US LIQUID GALLON" && valueTo == "CUBIC FOOT") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.133681
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "US LIQUID GALLON" && valueTo == "CUBIC INCH") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 231
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "US LIQUID GALLON" && valueTo == "LITER") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 3.78541
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "US LIQUID GALLON" && valueTo == "MILILITER") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 3785.41
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "US LIQUID GALLON" && valueTo == "IMPERIAL GALLON") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.832674
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "US LIQUID GALLON" && valueTo == "IMPERIAL QUART") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from / 3.3307
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "US LIQUID GALLON" && valueTo == "IMPERIAL PINT") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 6.66139
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "US LIQUID GALLON" && valueTo == "IMPERIAL CUP") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 13.3228
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "US LIQUID GALLON" && valueTo == "IPMERIAL TABLESPOON") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 213.165
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "US LIQUID GALLON" && valueTo == "IPMERIAL TEASPOON") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 639.494
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }


            if (valueFrom == "US LIQUID QUART" && valueTo == "US LIQUID GALLON") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.25
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "US LIQUID QUART" && valueTo == "US LIQUID QUART") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "US LIQUID QUART" && valueTo == "US LIQUID PINT") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 2
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "US LIQUID QUART" && valueTo == "US LEGAL CUP") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 3.94314
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "US LIQUID QUART" && valueTo == "FLUID OUNCE") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 32
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "US LIQUID QUART" && valueTo == "US TABLESPOON") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 64
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "US LIQUID QUART" && valueTo == "US TEASPOON") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 192
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "US LIQUID QUART" && valueTo == "CUBIC METER") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.000946353
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "US LIQUID QUART" && valueTo == "CUBIC FOOT") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.0334201
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "US LIQUID QUART" && valueTo == "CUBIC INCH") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 57.75
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "US LIQUID QUART" && valueTo == "LITER") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.946353
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "US LIQUID QUART" && valueTo == "MILILITER") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 946.353
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "US LIQUID QUART" && valueTo == "IMPERIAL GALLON") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.208169
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "US LIQUID QUART" && valueTo == "IMPERIAL QUART") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.832674
                resultShowText.text = result.toString()
            }
            if (valueFrom == "US LIQUID QUART" && valueTo == "IMPERIAL PINT") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1.66535
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "US LIQUID QUART" && valueTo == "IMPERIAL CUP") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 3.3307
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "US LIQUID QUART" && valueTo == "IPMERIAL TABLESPOON") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 53.2911
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "US LIQUID QUART" && valueTo == "IPMERIAL TEASPOON") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 159.873
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }





            if (valueFrom == "US LIQUID PINT" && valueTo == "US LIQUID GALLON") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.125
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "US LIQUID PINT" && valueTo == "US LIQUID QUART") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.5
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "US LIQUID PINT" && valueTo == "US LIQUID PINT") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "US LIQUID PINT" && valueTo == "US LEGAL CUP") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1.97157
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "US LIQUID PINT" && valueTo == "FLUID OUNCE") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 16
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "US LIQUID PINT" && valueTo == "US TABLESPOON") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 32
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "US LIQUID PINT" && valueTo == "US TEASPOON") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 96
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "US LIQUID PINT" && valueTo == "CUBIC METER") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.000473176
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "US LIQUID PINT" && valueTo == "CUBIC FOOT") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.0167101
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "US LIQUID PINT" && valueTo == "CUBIC INCH") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 28.875
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "US LIQUID PINT" && valueTo == "LITER") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.473176
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "US LIQUID PINT" && valueTo == "MILILITER") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 473.176
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "US LIQUID PINT" && valueTo == "IMPERIAL GALLON") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.104084
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "US LIQUID PINT" && valueTo == "IMPERIAL QUART") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.416337
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "US LIQUID PINT" && valueTo == "IMPERIAL PINT") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.832674
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "US LIQUID PINT" && valueTo == "IMPERIAL CUP") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1.66535
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "US LIQUID PINT" && valueTo == "IPMERIAL TABLESPOON") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 26.6456
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "US LIQUID PINT" && valueTo == "IPMERIAL TEASPOON") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 79.9367
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }




            if (valueFrom == "US LEGAL CUP" && valueTo == "US LIQUID GALLON") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.0634013
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "US LEGAL CUP" && valueTo == "US LIQUID QUART") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.253605
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "US LEGAL CUP" && valueTo == "US LIQUID PINT") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.50721
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "US LEGAL CUP" && valueTo == "US LEGAL CUP") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "US LEGAL CUP" && valueTo == "FLUID OUNCE") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 8.11537
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "US LEGAL CUP" && valueTo == "US TABLESPOON") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 16.2307
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "US LEGAL CUP" && valueTo == "US TEASPOON") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 48.6922
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "US LEGAL CUP" && valueTo == "CUBIC METER") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.00024
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "US LEGAL CUP" && valueTo == "CUBIC FOOT") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.00847552
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "US LEGAL CUP" && valueTo == "CUBIC INCH") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 14.6457
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "US LEGAL CUP" && valueTo == "LITER") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.24
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "US LEGAL CUP" && valueTo == "MILILITER") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 240
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "US LEGAL CUP" && valueTo == "IMPERIAL GALLON") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.0527926
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "US LEGAL CUP" && valueTo == "IMPERIAL QUART") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.21117
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "US LEGAL CUP" && valueTo == "IMPERIAL PINT") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.422341
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "US LEGAL CUP" && valueTo == "IMPERIAL CUP") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.844682
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "US LEGAL CUP" && valueTo == "IPMERIAL TABLESPOON") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 13.5149
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "US LEGAL CUP" && valueTo == "IPMERIAL TEASPOON") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 40.5447
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }




            if (valueFrom == "FLUID OUNCE" && valueTo == "US LIQUID GALLON") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.0078125
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "FLUID OUNCE" && valueTo == "US LIQUID QUART") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.03125
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "FLUID OUNCE" && valueTo == "US LIQUID PINT") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.0625
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "FLUID OUNCE" && valueTo == "US LEGAL CUP") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.123223
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "FLUID OUNCE" && valueTo == "FLUID OUNCE") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "FLUID OUNCE" && valueTo == "US TABLESPOON") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 2
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "FLUID OUNCE" && valueTo == "US TEASPOON") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 6
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "FLUID OUNCE" && valueTo == "CUBIC METER") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.000029574
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "FLUID OUNCE" && valueTo == "CUBIC FOOT") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.00104438
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "FLUID OUNCE" && valueTo == "CUBIC INCH") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1.80469
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "FLUID OUNCE" && valueTo == "LITER") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.0295735
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "FLUID OUNCE" && valueTo == "MILILITER") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 29.5735
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "FLUID OUNCE" && valueTo == "IMPERIAL GALLON") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.00650527
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "FLUID OUNCE" && valueTo == "IMPERIAL QUART") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.0260211
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "FLUID OUNCE" && valueTo == "IMPERIAL PINT") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.0520421
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "FLUID OUNCE" && valueTo == "IMPERIAL CUP") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.104084
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "FLUID OUNCE" && valueTo == "IPMERIAL TABLESPOON") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1.66535
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "FLUID OUNCE" && valueTo == "IPMERIAL TEASPOON") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 4.99604
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }




            if (valueFrom == "US TABLESPOON" && valueTo == "US LIQUID GALLON") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.00390625
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "US TABLESPOON" && valueTo == "US LIQUID QUART") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.015625
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "US TABLESPOON" && valueTo == "US LIQUID PINT") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.03125
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "US TABLESPOON" && valueTo == "US LEGAL CUP") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.0616115
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "US TABLESPOON" && valueTo == "FLUID OUNCE") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.5
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "US TABLESPOON" && valueTo == "US TABLESPOON") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "US TABLESPOON" && valueTo == "US TEASPOON") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 3
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "US TABLESPOON" && valueTo == "CUBIC METER") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.000014787
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "US TABLESPOON" && valueTo == "CUBIC FOOT") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.00052219
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "US TABLESPOON" && valueTo == "CUBIC INCH") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.902344
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "US TABLESPOON" && valueTo == "LITER") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.0147868
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "US TABLESPOON" && valueTo == "MILILITER") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 14.7868
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "US TABLESPOON" && valueTo == "IMPERIAL GALLON") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.00325263
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "US TABLESPOON" && valueTo == "IMPERIAL QUART") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.0130105
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "US TABLESPOON" && valueTo == "IMPERIAL PINT") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.0260211
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "US TABLESPOON" && valueTo == "IMPERIAL CUP") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.0520421
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "US TABLESPOON" && valueTo == "IPMERIAL TABLESPOON") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.832674
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "US TABLESPOON" && valueTo == "IPMERIAL TEASPOON") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 2.49802
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }




            if (valueFrom == "US TEASPOON" && valueTo == "US LIQUID GALLON") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.00130208
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "US TEASPOON" && valueTo == "US LIQUID QUART") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.00520833
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "US TEASPOON" && valueTo == "US LIQUID PINT") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.0104167
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "US TEASPOON" && valueTo == "US LEGAL CUP") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.0205372
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "US TEASPOON" && valueTo == "FLUID OUNCE") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.166667
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "US TEASPOON" && valueTo == "US TABLESPOON") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.333333
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "US TEASPOON" && valueTo == "US TEASPOON") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "US TEASPOON" && valueTo == "CUBIC METER") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.0000049289
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "US TEASPOON" && valueTo == "CUBIC FOOT") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.000174063
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "US TEASPOON" && valueTo == "CUBIC INCH") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.902344
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "US TEASPOON" && valueTo == "LITER") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.00492892
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "US TEASPOON" && valueTo == "MILILITER") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 4.92892
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "US TEASPOON" && valueTo == "IMPERIAL GALLON") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.00108421
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "US TEASPOON" && valueTo == "IMPERIAL QUART") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.00433684
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "US TEASPOON" && valueTo == "IMPERIAL PINT") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.00867369
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "US TEASPOON" && valueTo == "IMPERIAL CUP") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.0173474
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "US TEASPOON" && valueTo == "IPMERIAL TABLESPOON") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.277558
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "US TEASPOON" && valueTo == "IPMERIAL TEASPOON") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.832674
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }




            if (valueFrom == "CUBIC METER" && valueTo == "US LIQUID GALLON") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 264.172
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "CUBIC METER" && valueTo == "US LIQUID QUART") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1056.69
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "CUBIC METER" && valueTo == "US LIQUID PINT") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 2113.38
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "CUBIC METER" && valueTo == "US LEGAL CUP") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 4166.67
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "CUBIC METER" && valueTo == "FLUID OUNCE") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 33814
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "CUBIC METER" && valueTo == "US TABLESPOON") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 67628
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "CUBIC METER" && valueTo == "US TEASPOON") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 202884
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "CUBIC METER" && valueTo == "CUBIC METER") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "CUBIC METER" && valueTo == "CUBIC FOOT") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 35.3147
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "CUBIC METER" && valueTo == "CUBIC INCH") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 61023.7
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "CUBIC METER" && valueTo == "LITER") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1000
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "CUBIC METER" && valueTo == "MILILITER") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.000001
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "CUBIC METER" && valueTo == "IMPERIAL GALLON") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 219.969
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "CUBIC METER" && valueTo == "IMPERIAL QUART") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 879.877
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "CUBIC METER" && valueTo == "IMPERIAL PINT") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1759.75
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "CUBIC METER" && valueTo == "IMPERIAL CUP") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 3519.51
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "CUBIC METER" && valueTo == "IPMERIAL TABLESPOON") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 56312.1
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "CUBIC METER" && valueTo == "IPMERIAL TEASPOON") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 168936
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }




            if (valueFrom == "CUBIC FOOT" && valueTo == "US LIQUID GALLON") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 7.48052
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "CUBIC FOOT" && valueTo == "US LIQUID QUART") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 29.9221
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "CUBIC FOOT" && valueTo == "US LIQUID PINT") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 59.8442
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "CUBIC FOOT" && valueTo == "US LEGAL CUP") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 117.987
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "CUBIC FOOT" && valueTo == "FLUID OUNCE") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 957.506
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "CUBIC FOOT" && valueTo == "US TABLESPOON") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1915.01
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "CUBIC FOOT" && valueTo == "US TEASPOON") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 5745.04
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "CUBIC FOOT" && valueTo == "CUBIC METER") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.0283168
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "CUBIC FOOT" && valueTo == "CUBIC FOOT") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "CUBIC FOOT" && valueTo == "CUBIC INCH") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1728
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "CUBIC FOOT" && valueTo == "LITER") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 28.3168
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "CUBIC FOOT" && valueTo == "MILILITER") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 28316.8
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "CUBIC FOOT" && valueTo == "IMPERIAL GALLON") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 6.22884
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "CUBIC FOOT" && valueTo == "IMPERIAL QUART") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 24.9153
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "CUBIC FOOT" && valueTo == "IMPERIAL PINT") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 49.8307
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "CUBIC FOOT" && valueTo == "IMPERIAL CUP") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 99.6614
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "CUBIC FOOT" && valueTo == "IPMERIAL TABLESPOON") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1594.58
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "CUBIC FOOT" && valueTo == "IPMERIAL TEASPOON") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 4783.74
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }




            if (valueFrom == "CUBIC INCH" && valueTo == "US LIQUID GALLON") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.004329
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "CUBIC INCH" && valueTo == "US LIQUID QUART") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.017316
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "CUBIC INCH" && valueTo == "US LIQUID PINT") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.034632
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "CUBIC INCH" && valueTo == "US LEGAL CUP") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.0682794
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "CUBIC INCH" && valueTo == "FLUID OUNCE") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.554113
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "CUBIC INCH" && valueTo == "US TABLESPOON") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1.10823
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "CUBIC INCH" && valueTo == "US TEASPOON") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 3.32468
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "CUBIC INCH" && valueTo == "CUBIC METER") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.000016387
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "CUBIC INCH" && valueTo == "CUBIC FOOT") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.000578704
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "CUBIC INCH" && valueTo == "CUBIC INCH") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "CUBIC INCH" && valueTo == "LITER") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.0163871
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "CUBIC INCH" && valueTo == "MILILITER") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1000000000
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "CUBIC INCH" && valueTo == "IMPERIAL GALLON") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.00360465
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "CUBIC INCH" && valueTo == "IMPERIAL QUART") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.0144186
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "CUBIC INCH" && valueTo == "IMPERIAL PINT") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.0288372
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "CUBIC INCH" && valueTo == "IMPERIAL CUP") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.0576744
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "CUBIC INCH" && valueTo == "IPMERIAL TABLESPOON") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.92279
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "CUBIC INCH" && valueTo == "IPMERIAL TEASPOON") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 2.76837
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }




            if (valueFrom == "LITER" && valueTo == "US LIQUID GALLON") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.264172
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "LITER" && valueTo == "US LIQUID QUART") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1.05669
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "LITER" && valueTo == "US LIQUID PINT") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 2.11338
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "LITER" && valueTo == "US LEGAL CUP") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 4.16667
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "LITER" && valueTo == "FLUID OUNCE") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 33.814
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "LITER" && valueTo == "US TABLESPOON") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 67.628
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "LITER" && valueTo == "US TEASPOON") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 202.884
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "LITER" && valueTo == "CUBIC METER") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.001
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "LITER" && valueTo == "CUBIC FOOT") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.0353147
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "LITER" && valueTo == "CUBIC INCH") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 61.0237
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "LITER" && valueTo == "LITER") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "LITER" && valueTo == "MILILITER") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1000
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "LITER" && valueTo == "IMPERIAL GALLON") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.219969
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "LITER" && valueTo == "IMPERIAL QUART") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.879877
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "LITER" && valueTo == "IMPERIAL PINT") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1.75975
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "LITER" && valueTo == "IMPERIAL CUP") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 3.51951
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "LITER" && valueTo == "IPMERIAL TABLESPOON") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 56.3121
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "LITER" && valueTo == "IPMERIAL TEASPOON") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 168.936
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }




            if (valueFrom == "MILILITER" && valueTo == "US LIQUID GALLON") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.000264172
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "MILILITER" && valueTo == "US LIQUID QUART") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.00105669
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "MILILITER" && valueTo == "US LIQUID PINT") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.00211338
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "MILILITER" && valueTo == "US LEGAL CUP") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.00416667
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "MILILITER" && valueTo == "FLUID OUNCE") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.033814
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "MILILITER" && valueTo == "US TABLESPOON") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.067628
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "MILILITER" && valueTo == "US TEASPOON") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.202884
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "MILILITER" && valueTo == "CUBIC METER") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.000001
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "MILILITER" && valueTo == "CUBIC FOOT") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.000035315
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "MILILITER" && valueTo == "CUBIC INCH") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.0610237
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "MILILITER" && valueTo == "LITER") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.001
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "MILILITER" && valueTo == "MILILITER") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "MILILITER" && valueTo == "IMPERIAL GALLON") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.000219969
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "MILILITER" && valueTo == "IMPERIAL QUART") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.000879877
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "MILILITER" && valueTo == "IMPERIAL PINT") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.00175975
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "MILILITER" && valueTo == "IMPERIAL CUP") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.00351951
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "MILILITER" && valueTo == "IPMERIAL TABLESPOON") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.0563121
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "MILILITER" && valueTo == "IPMERIAL TEASPOON") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.168936
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }




            if (valueFrom == "IMPERIAL GALLON" && valueTo == "US LIQUID GALLON") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1.20095
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "IMPERIAL GALLON" && valueTo == "US LIQUID QUART") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 4.8038
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "IMPERIAL GALLON" && valueTo == "US LIQUID PINT") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 9.6076
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "IMPERIAL GALLON" && valueTo == "US LEGAL CUP") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 18.942
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "IMPERIAL GALLON" && valueTo == "FLUID OUNCE") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 153.722
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "IMPERIAL GALLON" && valueTo == "US TABLESPOON") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 307.443
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "IMPERIAL GALLON" && valueTo == "US TEASPOON") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 922.33
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "IMPERIAL GALLON" && valueTo == "CUBIC METER") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.00454609
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "IMPERIAL GALLON" && valueTo == "CUBIC FOOT") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.160544
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "IMPERIAL GALLON" && valueTo == "CUBIC INCH") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 277.419
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "IMPERIAL GALLON" && valueTo == "LITER") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 4.54609
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "IMPERIAL GALLON" && valueTo == "MILILITER") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 4546.09
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "IMPERIAL GALLON" && valueTo == "IMPERIAL GALLON") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "IMPERIAL GALLON" && valueTo == "IMPERIAL QUART") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 4
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "IMPERIAL GALLON" && valueTo == "IMPERIAL PINT") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 8
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "IMPERIAL GALLON" && valueTo == "IMPERIAL CUP") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 16
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "IMPERIAL GALLON" && valueTo == "IPMERIAL TABLESPOON") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 256
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "IMPERIAL GALLON" && valueTo == "IPMERIAL TEASPOON") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 768
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }





            if (valueFrom == "IMPERIAL QUART" && valueTo == "US LIQUID GALLON") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.300237
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "IMPERIAL QUART" && valueTo == "US LIQUID QUART") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1.20095
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "IMPERIAL QUART" && valueTo == "US LIQUID PINT") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 2.4019
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "IMPERIAL QUART" && valueTo == "US LEGAL CUP") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 4.73551
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "IMPERIAL QUART" && valueTo == "FLUID OUNCE") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 38.4304
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "IMPERIAL QUART" && valueTo == "US TABLESPOON") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 76.8608
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "IMPERIAL QUART" && valueTo == "US TEASPOON") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 230.582
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "IMPERIAL QUART" && valueTo == "CUBIC METER") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.00113652
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "IMPERIAL QUART" && valueTo == "CUBIC FOOT") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.0401359
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "IMPERIAL QUART" && valueTo == "CUBIC INCH") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 69.3549
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "IMPERIAL QUART" && valueTo == "LITER") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1.13652
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "IMPERIAL QUART" && valueTo == "MILILITER") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1136.52
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "IMPERIAL QUART" && valueTo == "IMPERIAL GALLON") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.25
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "IMPERIAL QUART" && valueTo == "IMPERIAL QUART") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "IMPERIAL QUART" && valueTo == "IMPERIAL PINT") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 2
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "IMPERIAL QUART" && valueTo == "IMPERIAL CUP") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 4
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "IMPERIAL QUART" && valueTo == "IPMERIAL TABLESPOON") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 64
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "IMPERIAL QUART" && valueTo == "IPMERIAL TEASPOON") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 192
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }




            if (valueFrom == "IMPERIAL PINT" && valueTo == "US LIQUID GALLON") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.150119
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "IMPERIAL PINT" && valueTo == "US LIQUID QUART") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.600475
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "IMPERIAL PINT" && valueTo == "US LIQUID PINT") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1.20095
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "IMPERIAL PINT" && valueTo == "US LEGAL CUP") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 2.36776
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "IMPERIAL PINT" && valueTo == "FLUID OUNCE") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 19.2152
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "IMPERIAL PINT" && valueTo == "US TABLESPOON") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 38.4304
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "IMPERIAL PINT" && valueTo == "US TEASPOON") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 115.291
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "IMPERIAL PINT" && valueTo == "CUBIC METER") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.000568261
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "IMPERIAL PINT" && valueTo == "CUBIC FOOT") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.020068
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "IMPERIAL PINT" && valueTo == "CUBIC INCH") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 34.6774
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "IMPERIAL PINT" && valueTo == "LITER") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.568261
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "IMPERIAL PINT" && valueTo == "MILILITER") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 568.261
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "IMPERIAL PINT" && valueTo == "IMPERIAL GALLON") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.125
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "IMPERIAL PINT" && valueTo == "IMPERIAL QUART") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.5
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "IMPERIAL PINT" && valueTo == "IMPERIAL PINT") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "IMPERIAL PINT" && valueTo == "IMPERIAL CUP") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 2
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "IMPERIAL PINT" && valueTo == "IPMERIAL TABLESPOON") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 32
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "IMPERIAL PINT" && valueTo == "IPMERIAL TEASPOON") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 96
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }




            if (valueFrom == "IMPERIAL CUP" && valueTo == "US LIQUID GALLON") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.0750594
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "IMPERIAL CUP" && valueTo == "US LIQUID QUART") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.300237
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "IMPERIAL CUP" && valueTo == "US LIQUID PINT") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.600475
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "IMPERIAL CUP" && valueTo == "US LEGAL CUP") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1.18388
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "IMPERIAL CUP" && valueTo == "FLUID OUNCE") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 9.6076
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "IMPERIAL CUP" && valueTo == "US TABLESPOON") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 19.2152
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "IMPERIAL CUP" && valueTo == "US TEASPOON") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 57.6456
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "IMPERIAL CUP" && valueTo == "CUBIC METER") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.000284131
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "IMPERIAL CUP" && valueTo == "CUBIC FOOT") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.010034
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "IMPERIAL CUP" && valueTo == "CUBIC INCH") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 17.3387
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "IMPERIAL CUP" && valueTo == "LITER") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.284131
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "IMPERIAL CUP" && valueTo == "MILILITER") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 284.131
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "IMPERIAL CUP" && valueTo == "IMPERIAL GALLON") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.0625
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "IMPERIAL CUP" && valueTo == "IMPERIAL QUART") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.25
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "IMPERIAL CUP" && valueTo == "IMPERIAL PINT") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.5
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "IMPERIAL CUP" && valueTo == "IMPERIAL CUP") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "IMPERIAL CUP" && valueTo == "IPMERIAL TABLESPOON") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 16
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "IMPERIAL CUP" && valueTo == "IPMERIAL TEASPOON") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 48
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }




            if (valueFrom == "IPMERIAL TABLESPOON" && valueTo == "US LIQUID GALLON") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.00469121
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "IPMERIAL TABLESPOON" && valueTo == "US LIQUID QUART") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.0187649
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "IPMERIAL TABLESPOON" && valueTo == "US LIQUID PINT") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.0375297
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "IPMERIAL TABLESPOON" && valueTo == "US LEGAL CUP") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.0739924
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "IPMERIAL TABLESPOON" && valueTo == "FLUID OUNCE") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.600475
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "IPMERIAL TABLESPOON" && valueTo == "US TABLESPOON") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1.20095
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "IPMERIAL TABLESPOON" && valueTo == "US TEASPOON") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 3.60285
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "IPMERIAL TABLESPOON" && valueTo == "CUBIC METER") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.000017758
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "IPMERIAL TABLESPOON" && valueTo == "CUBIC FOOT") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.000627124
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "IPMERIAL TABLESPOON" && valueTo == "CUBIC INCH") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1.08367
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "IPMERIAL TABLESPOON" && valueTo == "LITER") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.0177582
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "IPMERIAL TABLESPOON" && valueTo == "MILILITER") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 17.7582
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "IPMERIAL TABLESPOON" && valueTo == "IMPERIAL GALLON") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.00390625
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "IPMERIAL TABLESPOON" && valueTo == "IMPERIAL QUART") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.015625
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "IPMERIAL TABLESPOON" && valueTo == "IMPERIAL PINT") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.03125
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "IPMERIAL TABLESPOON" && valueTo == "IMPERIAL CUP") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.0625
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "IPMERIAL TABLESPOON" && valueTo == "IPMERIAL TABLESPOON") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "IPMERIAL TABLESPOON" && valueTo == "IPMERIAL TEASPOON") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 3
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }




            if (valueFrom == "IPMERIAL TEASPOON" && valueTo == "US LIQUID GALLON") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.00156374
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "IPMERIAL TEASPOON" && valueTo == "US LIQUID QUART") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.00625495
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "IPMERIAL TEASPOON" && valueTo == "US LIQUID PINT") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.0125099
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "IPMERIAL TEASPOON" && valueTo == "US LEGAL CUP") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.0246641
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "IPMERIAL TEASPOON" && valueTo == "FLUID OUNCE") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.200158
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "IPMERIAL TEASPOON" && valueTo == "US TABLESPOON") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.400317
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "IPMERIAL TEASPOON" && valueTo == "US TEASPOON") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1.20095
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "IPMERIAL TEASPOON" && valueTo == "CUBIC METER") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.0000059194
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "IPMERIAL TEASPOON" && valueTo == "CUBIC FOOT") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.000209041
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "IPMERIAL TEASPOON" && valueTo == "CUBIC INCH") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.361223
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "IPMERIAL TEASPOON" && valueTo == "LITER") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.00591939
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "IPMERIAL TEASPOON" && valueTo == "MILILITER") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 5.91939
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "IPMERIAL TEASPOON" && valueTo == "IMPERIAL GALLON") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.00130208
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "IPMERIAL TEASPOON" && valueTo == "IMPERIAL QUART") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.00520834
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "IPMERIAL TEASPOON" && valueTo == "IMPERIAL PINT") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.0104167
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "IPMERIAL TEASPOON" && valueTo == "IMPERIAL CUP") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.0208333
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "IPMERIAL TEASPOON" && valueTo == "IPMERIAL TABLESPOON") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.333333
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "IPMERIAL TEASPOON" && valueTo == "IPMERIAL TEASPOON") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }


        }


    }
}