package com.okcodex.easyconverters.ui.converters.activity.utils

import android.util.Log
import android.widget.EditText
import android.widget.TextView

class Power {

    companion object {
        private const val TAG = "Power"

        fun calculation(
            valueFrom: String,
            valueTo: String,
            textview_to: TextView,
            result_showtext: TextView,
            et_from: EditText
        ) {
            if (valueFrom == "attowatt" && valueTo == "attowatt") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "attowatt" && valueTo == "18 Btu/hour [I.T.]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "attowatt" && valueTo == "Btu/minute [I.T.]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 10000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "attowatt" && valueTo == "Btu/second [I.T.]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 35.27396
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "attowatt" && valueTo == "calorie/hour [I.T.]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1000000000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "attowatt" && valueTo == "calorie/minute [I.T.]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 2.2046226218
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "attowatt" && valueTo == "calorie/second [I.T.]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from / 1000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }


            if (valueFrom == "attowatt" && valueTo == "centiwatt") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from / 1000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }

            if (valueFrom == "attowatt" && valueTo == "TONNE") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from / 1000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }

            if (valueFrom == "attowatt" && valueTo == "cheval vapeur") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from / 1000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }

            if (valueFrom == "attowatt" && valueTo == "clusec") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from / 1000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }

            if (valueFrom == "attowatt" && valueTo == "deciwatt") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from / 1000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }

            if (valueFrom == "attowatt" && valueTo == "dekawatt") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from / 1000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }

            if (valueFrom == "attowatt" && valueTo == "dyne centimeter/hour") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from / 1000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }

            if (valueFrom == "attowatt" && valueTo == "dyne centimeter/minute") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from / 1000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }

            if (valueFrom == "attowatt" && valueTo == "dyne centimeter/second") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from / 1000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }

            if (valueFrom == "attowatt" && valueTo == "erg/hour") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from / 1000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }

            if (valueFrom == "attowatt" && valueTo == "erg/minute") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from / 1000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }

            if (valueFrom == "attowatt" && valueTo == "erg/second") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from / 1000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }

            if (valueFrom == "attowatt" && valueTo == "exawatt") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from / 1000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }

            if (valueFrom == "attowatt" && valueTo == "femtowatt") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from / 1000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }

            if (valueFrom == "attowatt" && valueTo == "foot pound-force/hour") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from / 1000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "attowatt" && valueTo == "foot pound-force/minute") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from / 1000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "attowatt" && valueTo == "foot pound-force/second") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from / 1000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }

            if (valueFrom == "attowatt" && valueTo == "foot poundal/hour") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from / 1000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }

            if (valueFrom == "attowatt" && valueTo == "foot poundal/minute") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from / 1000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "attowatt" && valueTo == "foot poundal/second") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from / 1000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "attowatt" && valueTo == "gigawatt") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from / 1000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "attowatt" && valueTo == "gram-force centimeter/hour") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from / 1000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "attowatt" && valueTo == "gram-force centimeter/minute") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from / 1000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "attowatt" && valueTo == "gram-force centimeter/second") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from / 1000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "attowatt" && valueTo == "hectowatt") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from / 1000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "attowatt" && valueTo == "horsepower [international]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from / 1000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }

            if (valueFrom == "attowatt" && valueTo == "horsepower [electric]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from / 1000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }

            if (valueFrom == "attowatt" && valueTo == "horsepower [metric]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from / 1000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }

            if (valueFrom == "attowatt" && valueTo == "horsepower [water]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from / 1000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }

            if (valueFrom == "attowatt" && valueTo == "inch ounce-force revolution/minute") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from / 1000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }

            if (valueFrom == "attowatt" && valueTo == "joule/hour") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from / 1000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }

            if (valueFrom == "attowatt" && valueTo == "joule/minute") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from / 1000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "attowatt" && valueTo == "joule/second") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from / 1000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "attowatt" && valueTo == "kilocalorie/hour [I.T.]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from / 1000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "attowatt" && valueTo == "kilocalorie/minute [I.T.]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from / 1000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "attowatt" && valueTo == "kilocalorie/second [I.T.]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from / 1000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "attowatt" && valueTo == "kilogram-force meter/hour") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from / 1000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "attowatt" && valueTo == "kilogram-force meter/minute") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from / 1000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "attowatt" && valueTo == "kilogram-force meter/second") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from / 1000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "attowatt" && valueTo == "kilopond meter/hour") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from / 1000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "attowatt" && valueTo == "foot") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from / 1000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "attowatt" && valueTo == "kilopond meter/minute") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from / 1000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "attowatt" && valueTo == "kilopond meter/second") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from / 1000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "attowatt" && valueTo == "kilowatt") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from / 1000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "attowatt" && valueTo == "megawatt") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from / 1000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "attowatt" && valueTo == "microwatt") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from / 1000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "attowatt" && valueTo == "million Btu/hour [I.T.]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from / 1000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "attowatt" && valueTo == "milliwatt") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from / 1000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "attowatt" && valueTo == "nanowatt") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from / 1000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "attowatt" && valueTo == "newton meter/hour") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from / 1000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "attowatt" && valueTo == "newton meter/minute") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from / 1000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "attowatt" && valueTo == "newton meter/second") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from / 1000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "attowatt" && valueTo == "petawatt") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from / 1000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "attowatt" && valueTo == "pferdestarke") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from / 1000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "attowatt" && valueTo == "picowatt") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from / 1000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "attowatt" && valueTo == "poncelet") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from / 1000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "attowatt" && valueTo == "pound square foot/cubic second") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from / 1000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "attowatt" && valueTo == "terawatt") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from / 1000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "attowatt" && valueTo == "ton of refrigeration") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from / 1000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "attowatt" && valueTo == "watt") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from / 1000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "attowatt" && valueTo == "yoctowatt") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from / 1000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "attowatt" && valueTo == "yottawatt") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from / 1000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "attowatt" && valueTo == "zeptowatt") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from / 1000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "attowatt" && valueTo == "zettawatt") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from / 1000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }


            //2nd stp


        }


    }
}