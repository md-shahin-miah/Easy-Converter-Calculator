package com.okcodex.easyconverters.ui.converters.activity.utils

import android.util.Log
import android.widget.EditText
import android.widget.TextView

class Frequency {

    companion object {
        private const val TAG = "Frequency"

        fun calculation(
            valueFrom: String,
            valueTo: String,
            textview_to: TextView,
            result_showtext: TextView,
            et_from: EditText
        ) {

            if (valueFrom == "1/second" && valueTo == "1/second") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(Frequency.TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "1/second" && valueTo == "cycle/second") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(Frequency.TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "1/second" && valueTo == "degree/hour") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(Frequency.TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1296000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "1/second" && valueTo == "degree/minute") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(Frequency.TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 21600
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "1/second" && valueTo == "degree/second") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(Frequency.TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 360
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "1/second" && valueTo == "gigahertz") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(Frequency.TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1.0e-9
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "1/second" && valueTo == "hertz") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(Frequency.TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "1/second" && valueTo == "kilohertz") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(Frequency.TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from *0.001
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "1/second" && valueTo == "megahertz") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(Frequency.TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.000001
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }

            if (valueFrom == "1/second" && valueTo == "terrahertz") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(Frequency.TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1.0e-12
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }

            //2nd stp

            if (valueFrom == "cycle/second" && valueTo == "1/second") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(Frequency.TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "cycle/second" && valueTo == "cycle/second") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(Frequency.TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 57.295779513082
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "cycle/second" && valueTo == "degree/hour") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(Frequency.TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1296000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "cycle/second" && valueTo == "degree/minute") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(Frequency.TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 21600
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "cycle/second" && valueTo == "degree/second") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(Frequency.TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 360
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "cycle/second" && valueTo == "gigahertz") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(Frequency.TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1.0e-9
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "cycle/second" && valueTo == "hertz") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(Frequency.TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "cycle/second" && valueTo == "kilohertz") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(Frequency.TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from *  0.001
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "cycle/second" && valueTo == "megahertz") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(Frequency.TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.000001
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "cycle/second" && valueTo == "terrahertz") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(Frequency.TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1.0e-12
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }








            //3nd stp

            if (valueFrom == "degree/hour" && valueTo == "1/second") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(Frequency.TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 7.7160493827e-7
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "degree/hour" && valueTo == "cycle/second") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(Frequency.TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from *7.7160493827e-7
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "degree/hour" && valueTo == "degree/hour") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(Frequency.TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "degree/hour" && valueTo == "degree/minute") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(Frequency.TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.016666666667
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "degree/hour" && valueTo == "degree/second") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(Frequency.TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.00027777777777
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "degree/hour" && valueTo == "gigahertz") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(Frequency.TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 7.7160493827e-16
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "degree/hour" && valueTo == "hertz") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(Frequency.TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 7.7160493827e-7
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "degree/hour" && valueTo == "kilohertz") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(Frequency.TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 7.7160493827e-10
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "degree/hour" && valueTo == "megahertz") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(Frequency.TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 7.7160493827e-13
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "degree/hour" && valueTo == "terrahertz") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(Frequency.TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 7.7160493827e-19
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
//-------------------------
            //4nd stp

            if (valueFrom == "degree/minuter" && valueTo == "1/second") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(Frequency.TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from *  0.000046296296296
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "degree/minute" && valueTo == "cycle/second") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(Frequency.TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.000046296296296
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "degree/minute" && valueTo == "degree/hour") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(Frequency.TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 60
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "degree/minute" && valueTo == "degree/minute") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(Frequency.TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "degree/minute" && valueTo == "degree/second") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(Frequency.TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.016666666666
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "degree/minute" && valueTo == "gigahertz") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(Frequency.TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 4.6296296296e-14
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "degree/minute" && valueTo == "hertz") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(Frequency.TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.000046296296296
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "degree/minute" && valueTo == "kilohertz") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(Frequency.TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from *4.6296296296e-8
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "degree/minute" && valueTo == "megahertz") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(Frequency.TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from *  4.6296296296e-11
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "degree/minute" && valueTo == "terrahertz") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(Frequency.TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 4.6296296296e-17
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }


            //5nd stp

            if (valueFrom == "degree/second" && valueTo == "1/second") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(Frequency.TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from *  0.0027777777778
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "degree/second" && valueTo == "cycle/second") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(Frequency.TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from *  0.0027777777778
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "degree/second" && valueTo == "degree/hour") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(Frequency.TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from *  3600
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "degree/second" && valueTo == "degree/minute") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(Frequency.TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from *  60.000000001
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "degree/second" && valueTo == "degree/second") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(Frequency.TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "degree/second" && valueTo == "gigahertz") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(Frequency.TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 2.7777777778e-12
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "degree/second" && valueTo == "hertz") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(Frequency.TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from *  0.0027777777778
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "degree/second" && valueTo == "kilohertz") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(Frequency.TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from *0.0000027777777778
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "degree/second" && valueTo == "megahertz") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(Frequency.TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 2.7777777778e-9
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "degree/second" && valueTo == "terrahertz") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(Frequency.TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 2.7777777778e-15
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }

            //6nd stp

            if (valueFrom == "gigahertz" && valueTo == "1/second") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(Frequency.TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1000000000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "gigahertz" && valueTo == "cycle/second") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(Frequency.TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1000000000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "gigahertz" && valueTo == "degree/hour") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(Frequency.TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from *1296000000000000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "gigahertz" && valueTo == "degree/minute") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(Frequency.TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 21600000000000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "gigahertz" && valueTo == "degree/second") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(Frequency.TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from *360000000000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "gigahertz" && valueTo == "gigahertz") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(Frequency.TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1.9098593171027
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "gigahertz" && valueTo == "hertz") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(Frequency.TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from *  1000000000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "gigahertz" && valueTo == "kilohertz") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(Frequency.TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from *  1000000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "gigahertz" && valueTo == "megahertz") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(Frequency.TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "gigahertz" && valueTo == "terrahertz") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(Frequency.TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.001
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }



            //7nd stp

            if (valueFrom == "hertz" && valueTo == "1/second") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(Frequency.TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "hertz" && valueTo == "cycle/second") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(Frequency.TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from *1
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "hertz" && valueTo == "degree/hour") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(Frequency.TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1296000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "hertz" && valueTo == "degree/minute") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(Frequency.TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 21600
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "hertz" && valueTo == "degree/second") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(Frequency.TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from *360
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "hertz" && valueTo == "gigahertz") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(Frequency.TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from *  1.0e-9
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "hertz" && valueTo == "hertz") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(Frequency.TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from *1
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "hertz" && valueTo == "kilohertz") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(Frequency.TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.001
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "hertz" && valueTo == "megahertz") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(Frequency.TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.000001
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "hertz" && valueTo == "terrahertz") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(Frequency.TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1.0e-12
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }


            //8nd stp

            if (valueFrom == "kilohertz" && valueTo == "1/second") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(Frequency.TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "kilohertz" && valueTo == "cycle/second") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(Frequency.TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "kilohertz" && valueTo == "degree/hour") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(Frequency.TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1296000000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "kilohertz" && valueTo == "degree/minute") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(Frequency.TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 21600000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "kilohertz" && valueTo == "degree/second") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(Frequency.TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from *360000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "kilohertz" && valueTo == "gigahertz") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(Frequency.TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.000001
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "kilohertz" && valueTo == "hertz") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(Frequency.TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "kilohertz" && valueTo == "kilohertz") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(Frequency.TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "kilohertz" && valueTo == "megahertz") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(Frequency.TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from *  0.001
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }

            if (valueFrom == "kilohertz" && valueTo == "terrahertz") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(Frequency.TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1.0e-9
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }



            //9nd stp

            if (valueFrom == "megahertz" && valueTo == "1/second") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(Frequency.TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from *  1000000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "megahertz" && valueTo == "cycle/second") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(Frequency.TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1000000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "megahertz" && valueTo == "degree/hour") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(Frequency.TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1296000000000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "megahertz" && valueTo == "degree/minute") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(Frequency.TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 21600000000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "megahertz" && valueTo == "degree/second") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(Frequency.TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from *360000000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "megahertz" && valueTo == "gigahertz") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(Frequency.TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from *  0.001
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "megahertz" && valueTo == "hertz") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(Frequency.TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1000000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "megahertz" && valueTo == "kilohertz") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(Frequency.TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "megahertz" && valueTo == "megahertz") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(Frequency.TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "mega" && valueTo == "terrahertz") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(Frequency.TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.000001
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }

            //10th stp

            if (valueFrom == "terrahertz" && valueTo == "1/second") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(Frequency.TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1000000000000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "terrahertz" && valueTo == "cycle/second") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(Frequency.TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1000000000000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "terrahertz" && valueTo == "degree/hour") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(Frequency.TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1296000000000000000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "terrahertz" && valueTo == "degree/minute") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(Frequency.TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 21600000000000000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "terrahertz" && valueTo == "degree/second") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(Frequency.TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from *  360000000000000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "terrahertz" && valueTo == "gigahertz") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(Frequency.TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from *1000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "terrahertz" && valueTo == "hertz") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(Frequency.TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from *1000000000000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "terrahertz" && valueTo == "kilohertz") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(Frequency.TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1.9098593171027
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "terrahertz" && valueTo == "megahertz") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(Frequency.TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1000000000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "terrahertz" && valueTo == "terrahertz") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(Frequency.TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }


        }


    }
}