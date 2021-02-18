package com.okcodex.easyconverters.ui.converters.activity.utils

import android.util.Log
import android.widget.EditText
import android.widget.TextView

class Length {

    companion object {

        private const val TAG = "Length"
        
        fun calculation(
            valueFrom: String,
            valueTo: String,
            textview_to: TextView,
            result_showtext: TextView,
            et_from: EditText
        ) {

            if (valueFrom == "KILOMETRE" && valueTo == "METRE") {
                val from = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "KILOMETRE" && valueTo == "CENTIMETRE") {
                val from = et_from.text.toString().toFloat()

                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 100000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "KILOMETRE" && valueTo == "MILIMETRE") {
                val from = et_from.text.toString().toFloat()

                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1000000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "KILOMETRE" && valueTo == "MICROMETRE") {
                val from = et_from.text.toString().toFloat()

                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1000000000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "KILOMETRE" && valueTo == "NANOMETRE") {
                val from = et_from.text.toString().toFloat()

                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = (from * 1000000000000) / 1
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "KILOMETRE" && valueTo == "MILE") {
                val from = et_from.text.toString().toFloat()

                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.62137119
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "KILOMETRE" && valueTo == "YARD") {
                val from = et_from.text.toString().toFloat()

                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1093.6133
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "KILOMETRE" && valueTo == "FEET") {
                val from = et_from.text.toString().toFloat()

                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 32808399
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "KILOMETRE" && valueTo == "INCH") {
                val from = et_from.text.toString().toFloat()

                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 39370.079
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "KILOMETRE" && valueTo == "KILOMETRE") {
                val from = et_from.text.toString().toFloat()

                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }



            if (valueFrom == "METRE" && valueTo == "METRE") {
                val from = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "METRE" && valueTo == "CENTIMETRE") {
                val from = et_from.text.toString().toFloat()

                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 100
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "METRE" && valueTo == "MILIMETRE") {
                val from = et_from.text.toString().toFloat()

                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "METRE" && valueTo == "MICROMETRE") {
                val from = et_from.text.toString().toFloat()

                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1000000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "METRE" && valueTo == "NANOMETRE") {
                val from = et_from.text.toString().toFloat()

                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = (from * 1000000000) / 1
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "METRE" && valueTo == "MILE") {
                val from = et_from.text.toString().toFloat()

                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.00062137119
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "METRE" && valueTo == "YARD") {
                val from = et_from.text.toString().toFloat()

                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1.0936133
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "METRE" && valueTo == "FEET") {
                val from = et_from.text.toString().toFloat()

                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 3.2808399
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "METRE" && valueTo == "INCH") {
                val from = et_from.text.toString().toFloat()

                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 39.370079
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "METRE" && valueTo == "KILOMETRE") {
                val from = et_from.text.toString().toFloat()

                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.001
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }


            if (valueFrom == "CENTIMETRE" && valueTo == "METRE") {
                val from = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.01
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "CENTIMETRE" && valueTo == "CENTIMETRE") {
                val from = et_from.text.toString().toFloat()

                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "CENTIMETRE" && valueTo == "MILIMETRE") {
                val from = et_from.text.toString().toFloat()

                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 10
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "CENTIMETRE" && valueTo == "MICROMETRE") {
                val from = et_from.text.toString().toFloat()

                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 10000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "CENTIMETRE" && valueTo == "NANOMETRE") {
                val from = et_from.text.toString().toFloat()

                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 10000000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "CENTIMETRE" && valueTo == "MILE") {
                val from = et_from.text.toString().toFloat()

                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.000006213711922
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "CENTIMETRE" && valueTo == "YARD") {
                val from = et_from.text.toString().toFloat()

                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.010936133
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "CENTIMETRE" && valueTo == "FEET") {
                val from = et_from.text.toString().toFloat()

                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.032808399
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "CENTIMETRE" && valueTo == "INCH") {
                val from = et_from.text.toString().toFloat()

                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.39370079
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "CENTIMETRE" && valueTo == "KILOMETRE") {
                val from = et_from.text.toString().toFloat()

                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.00001
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }



            if (valueFrom == "MILIMETRE" && valueTo == "METRE") {
                val from = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.001
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "MILIMETRE" && valueTo == "CENTIMETRE") {
                val from = et_from.text.toString().toFloat()

                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.1
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "MILIMETRE" && valueTo == "MILIMETRE") {
                val from = et_from.text.toString().toFloat()

                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "MILIMETRE" && valueTo == "MICROMETRE") {
                val from = et_from.text.toString().toFloat()

                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "MILIMETRE" && valueTo == "NANOMETRE") {
                val from = et_from.text.toString().toFloat()

                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1000000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "MILIMETRE" && valueTo == "MILE") {
                val from = et_from.text.toString().toFloat()

                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.00000062137
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "MILIMETRE" && valueTo == "YARD") {
                val from = et_from.text.toString().toFloat()

                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.001093613298
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "MILIMETRE" && valueTo == "FEET") {
                val from = et_from.text.toString().toFloat()

                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.003280839895
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "MILIMETRE" && valueTo == "INCH") {
                val from = et_from.text.toString().toFloat()

                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.039370079
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "MILIMETRE" && valueTo == "KILOMETRE") {
                val from = et_from.text.toString().toFloat()

                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from / 1000000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }



            if (valueFrom == "MICROMETRE" && valueTo == "METRE") {
                val from = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.000001000000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "MICROMETRE" && valueTo == "CENTIMETRE") {
                val from = et_from.text.toString().toFloat()

                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.0001000000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "MICROMETRE" && valueTo == "MILIMETRE") {
                val from = et_from.text.toString().toFloat()

                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.001000000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "MICROMETRE" && valueTo == "MICROMETRE") {
                val from = et_from.text.toString().toFloat()

                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "MICROMETRE" && valueTo == "NANOMETRE") {
                val from = et_from.text.toString().toFloat()

                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "MICROMETRE" && valueTo == "MILE") {
                val from = et_from.text.toString().toFloat()

                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from / 1609344000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "MICROMETRE" && valueTo == "YARD") {
                val from = et_from.text.toString().toFloat()

                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from / 914400
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "MICROMETRE" && valueTo == "FEET") {
                val from = et_from.text.toString().toFloat()

                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from / 304800
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "MICROMETRE" && valueTo == "INCH") {
                val from = et_from.text.toString().toFloat()

                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from / 25400
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "MICROMETRE" && valueTo == "KILOMETRE") {
                val from = et_from.text.toString().toFloat()

                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from / 1000000000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }



            if (valueFrom == "NANOMETRE" && valueTo == "METRE") {
                val from = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.0000000010
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "NANOMETRE" && valueTo == "CENTIMETRE") {
                val from = et_from.text.toString().toFloat()

                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.0000001
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "NANOMETRE" && valueTo == "MILIMETRE") {
                val from = et_from.text.toString().toFloat()

                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.000001
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "NANOMETRE" && valueTo == "MICROMETRE") {
                val from = et_from.text.toString().toFloat()

                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.001
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "NANOMETRE" && valueTo == "NANOMETRE") {
                val from = et_from.text.toString().toFloat()

                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "NANOMETRE" && valueTo == "MILE") {
                val from = et_from.text.toString().toFloat()

                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.0000000000006
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "NANOMETRE" && valueTo == "YARD") {
                val from = et_from.text.toString().toFloat()

                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from / 914400000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "NANOMETRE" && valueTo == "FEET") {
                val from = et_from.text.toString().toFloat()

                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from / 304800000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "NANOMETRE" && valueTo == "INCH") {
                val from = et_from.text.toString().toFloat()

                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from / 25400000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "NANOMETRE" && valueTo == "KILOMETRE") {
                val from = et_from.text.toString().toFloat()

                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1000000000000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }



            if (valueFrom == "MILE" && valueTo == "METRE") {
                val from = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1609.34
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "MILE" && valueTo == "CENTIMETRE") {
                val from = et_from.text.toString().toFloat()

                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 160934
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "MILE" && valueTo == "MILIMETRE") {
                val from = et_from.text.toString().toFloat()

                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1609344
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "MILE" && valueTo == "MICROMETRE") {
                val from = et_from.text.toString().toFloat()

                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1609344000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "MILE" && valueTo == "NANOMETRE") {
                val from = et_from.text.toString().toFloat()

                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1609344000000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "MILE" && valueTo == "MILE") {
                val from = et_from.text.toString().toFloat()

                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "MILE" && valueTo == "YARD") {
                val from = et_from.text.toString().toFloat()

                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1760
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "MILE" && valueTo == "FEET") {
                val from = et_from.text.toString().toFloat()

                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 5280
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "MILE" && valueTo == "INCH") {
                val from = et_from.text.toString().toFloat()

                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 63360
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "MILE" && valueTo == "KILOMETRE") {
                val from = et_from.text.toString().toFloat()

                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1.609344
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }



            if (valueFrom == "YARD" && valueTo == "METRE") {
                val from = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.9144
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "YARD" && valueTo == "CENTIMETRE") {
                val from = et_from.text.toString().toFloat()

                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 91.44
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "YARD" && valueTo == "MILIMETRE") {
                val from = et_from.text.toString().toFloat()

                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 914.4
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "YARD" && valueTo == "MICROMETRE") {
                val from = et_from.text.toString().toFloat()

                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 914400
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "YARD" && valueTo == "NANOMETRE") {
                val from = et_from.text.toString().toFloat()

                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 914400000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "YARD" && valueTo == "MILE") {
                val from = et_from.text.toString().toFloat()

                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.00056818182
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "YARD" && valueTo == "YARD") {
                val from = et_from.text.toString().toFloat()

                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "YARD" && valueTo == "FEET") {
                val from = et_from.text.toString().toFloat()

                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 3
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "YARD" && valueTo == "INCH") {
                val from = et_from.text.toString().toFloat()

                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 36
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "YARD" && valueTo == "KILOMETRE") {
                val from = et_from.text.toString().toFloat()

                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.0009144
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }



            if (valueFrom == "FEET" && valueTo == "METRE") {
                val from = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.3048
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "FEET" && valueTo == "CENTIMETRE") {
                val from = et_from.text.toString().toFloat()

                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 30.48
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "FEET" && valueTo == "MILIMETRE") {
                val from = et_from.text.toString().toFloat()

                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 304.8
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "FEET" && valueTo == "MICROMETRE") {
                val from = et_from.text.toString().toFloat()

                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 304800
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "FEET" && valueTo == "NANOMETRE") {
                val from = et_from.text.toString().toFloat()

                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 304800000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "FEET" && valueTo == "MILE") {
                val from = et_from.text.toString().toFloat()

                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.00018939394
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "FEET" && valueTo == "YARD") {
                val from = et_from.text.toString().toFloat()

                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.33333333
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "FEET" && valueTo == "FEET") {
                val from = et_from.text.toString().toFloat()

                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "FEET" && valueTo == "INCH") {
                val from = et_from.text.toString().toFloat()

                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 12
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "FEET" && valueTo == "KILOMETRE") {
                val from = et_from.text.toString().toFloat()

                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.0003048
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }



            if (valueFrom == "INCH" && valueTo == "METRE") {
                val from = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.0254
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "INCH" && valueTo == "CENTIMETRE") {
                val from = et_from.text.toString().toFloat()

                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 2.54
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "INCH" && valueTo == "MILIMETRE") {
                val from = et_from.text.toString().toFloat()

                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 25.4
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "INCH" && valueTo == "MICROMETRE") {
                val from = et_from.text.toString().toFloat()

                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 25400
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "INCH" && valueTo == "NANOMETRE") {
                val from = et_from.text.toString().toFloat()

                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 25400000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "INCH" && valueTo == "MILE") {
                val from = et_from.text.toString().toFloat()

                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from / 63360
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "INCH" && valueTo == "YARD") {
                val from = et_from.text.toString().toFloat()

                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.027777778
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "INCH" && valueTo == "FEET") {
                val from = et_from.text.toString().toFloat()

                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.083333333
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "INCH" && valueTo == "INCH") {
                val from = et_from.text.toString().toFloat()

                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "INCH" && valueTo == "KILOMETRE") {
                val from = et_from.text.toString().toFloat()

                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from / 39370
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }


        }


    }
}