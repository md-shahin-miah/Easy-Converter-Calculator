package com.okcodex.easyconverters.ui.converters.activity.utils

import android.util.Log
import android.widget.TextView

class Weight {


    companion object {
        private  val TAG = "AllConvertersActivity"

        fun calculation(
            valueFrom: String,
            valueTo: String,
            value: Float,
            textViewTo: TextView,
            resultShowText: TextView
        ) {

            Log.d(TAG, "calculation: cal")
            Log.d(TAG, "calculation: $valueFrom")
            Log.d(TAG, "calculation: $valueTo")
            fun getValue(value1: Float) {
                val result = value * value1
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
                Log.d(TAG, "getValue: result : $result")
            }

            if (valueFrom == "KILOMETRE" && valueTo == "METRE") {
                getValue(1000f)
            }

            if (valueFrom == "KILOMETRE" && valueTo == "CENTIMETRE") {
                getValue(100000f)
            }
            if (valueFrom == "KILOMETRE" && valueTo == "MILIMETRE") {
                getValue(1000000f)
            }
            if (valueFrom == "KILOMETRE" && valueTo == "MICROMETRE") {
                getValue(1000000000f)
            }
            if (valueFrom == "KILOMETRE" && valueTo == "NANOMETRE") {
                val result = (value * 1000000000000) / 1
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "KILOMETRE" && valueTo == "MILE") {
                getValue(0.62137119f)
            }
            if (valueFrom == "KILOMETRE" && valueTo == "YARD") {
                getValue(1093.6133f)
            }
            if (valueFrom == "KILOMETRE" && valueTo == "FEET") {
                getValue(32808399f)
            }
            if (valueFrom == "KILOMETRE" && valueTo == "INCH") {
                getValue(39370.079f)
            }
            if (valueFrom == "KILOMETRE" && valueTo == "KILOMETRE") {
                getValue(1f)
            }

            if (valueFrom == "METRE" && valueTo == "METRE") {
                getValue(1f)
            }
            if (valueFrom == "METRE" && valueTo == "CENTIMETRE") {
                getValue(100f)
            }
            if (valueFrom == "METRE" && valueTo == "MILIMETRE") {
                getValue(1000f)
            }
            if (valueFrom == "METRE" && valueTo == "MICROMETRE") {
                getValue(1000000f)
            }
            if (valueFrom == "METRE" && valueTo == "NANOMETRE") {
                getValue(1000000f)
            }
            if (valueFrom == "METRE" && valueTo == "MILE") {
                getValue(0.00062137119f)
            }
            if (valueFrom == "METRE" && valueTo == "YARD") {
                getValue(1.0936133f)
            }
            if (valueFrom == "METRE" && valueTo == "FEET") {
                getValue(3.2808399f)
            }
            if (valueFrom == "METRE" && valueTo == "INCH") {
                getValue(39.370079f)
            }
            if (valueFrom == "METRE" && valueTo == "KILOMETRE") {
                getValue(0.001f)
            }

            if (valueFrom == "CENTIMETRE" && valueTo == "METRE") {
                getValue(0.01f)
            }
            if (valueFrom == "CENTIMETRE" && valueTo == "CENTIMETRE") {
                getValue(1f)
            }
            if (valueFrom == "CENTIMETRE" && valueTo == "MILIMETRE") {
                getValue(10f)
            }
            if (valueFrom == "CENTIMETRE" && valueTo == "MICROMETRE") {
                getValue(10000f)
            }
            if (valueFrom == "CENTIMETRE" && valueTo == "NANOMETRE") {
                getValue(10000000f)
            }
            if (valueFrom == "CENTIMETRE" && valueTo == "MILE") {
                getValue(0.000006213711922f)
            }
            if (valueFrom == "CENTIMETRE" && valueTo == "YARD") {
                getValue(0.010936133f)
            }
            if (valueFrom == "CENTIMETRE" && valueTo == "FEET") {
                val result = value * 0.032808399
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "CENTIMETRE" && valueTo == "INCH") {
                val result = value * 0.39370079
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "CENTIMETRE" && valueTo == "KILOMETRE") {
                val result = value * 0.00001
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }

            if (valueFrom == "MILIMETRE" && valueTo == "METRE") {
                val result = value * 0.001
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "MILIMETRE" && valueTo == "CENTIMETRE") {
                val result = value * 0.1
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "MILIMETRE" && valueTo == "MILIMETRE") {
                val result = value * 1
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "MILIMETRE" && valueTo == "MICROMETRE") {
                val result = value * 1000
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "MILIMETRE" && valueTo == "NANOMETRE") {
                val result = value * 1000000
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "MILIMETRE" && valueTo == "MILE") {
                val result = value * 0.00000062137
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "MILIMETRE" && valueTo == "YARD") {
                val result = value * 0.001093613298
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "MILIMETRE" && valueTo == "FEET") {
                val result = value * 0.003280839895
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "MILIMETRE" && valueTo == "INCH") {
                val result = value * 0.039370079
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "MILIMETRE" && valueTo == "KILOMETRE") {
                val result = value / 1000000
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }



            if (valueFrom == "MICROMETRE" && valueTo == "METRE") {
                val result = value * 0.000001000000
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "MICROMETRE" && valueTo == "CENTIMETRE") {
                val result = value * 0.0001000000
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "MICROMETRE" && valueTo == "MILIMETRE") {
                val result = value * 0.001000000
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "MICROMETRE" && valueTo == "MICROMETRE") {
                val result = value * 1
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "MICROMETRE" && valueTo == "NANOMETRE") {
                val result = value * 1000
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "MICROMETRE" && valueTo == "MILE") {
                val result = value / 1609344000
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "MICROMETRE" && valueTo == "YARD") {
                val result = value / 914400
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "MICROMETRE" && valueTo == "FEET") {
                val result = value / 304800
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "MICROMETRE" && valueTo == "INCH") {
                val result = value / 25400
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "MICROMETRE" && valueTo == "KILOMETRE") {
                val result = value / 1000000000
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }

            if (valueFrom == "NANOMETRE" && valueTo == "METRE") {
                val result = value * 0.0000000010
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "NANOMETRE" && valueTo == "CENTIMETRE") {
                val result = value * 0.0000001
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "NANOMETRE" && valueTo == "MILIMETRE") {
                val result = value * 0.000001
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "NANOMETRE" && valueTo == "MICROMETRE") {
                val result = value * 0.001
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "NANOMETRE" && valueTo == "NANOMETRE") {
                val result = value * 1
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "NANOMETRE" && valueTo == "MILE") {
                val result = value * 0.0000000000006
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "NANOMETRE" && valueTo == "YARD") {
                val result = value / 914400000
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "NANOMETRE" && valueTo == "FEET") {
                val result = value / 304800000
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "NANOMETRE" && valueTo == "INCH") {
                val result = value / 25400000
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "NANOMETRE" && valueTo == "KILOMETRE") {
                val result = value * 1000000000000
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }

            if (valueFrom == "MILE" && valueTo == "METRE") {
                val result = value * 1609.34
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "MILE" && valueTo == "CENTIMETRE") {
                val result = value * 160934
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "MILE" && valueTo == "MILIMETRE") {
                val result = value * 1609344
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "MILE" && valueTo == "MICROMETRE") {
                val result = value * 1609344000
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "MILE" && valueTo == "NANOMETRE") {
                val result = value * 1609344000000
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "MILE" && valueTo == "MILE") {
                val result = value * 1
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "MILE" && valueTo == "YARD") {
                val result = value * 1760
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "MILE" && valueTo == "FEET") {
                val result = value * 5280
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "MILE" && valueTo == "INCH") {
                val result = value * 63360
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "MILE" && valueTo == "KILOMETRE") {
                val result = value * 1.609344
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }



            if (valueFrom == "YARD" && valueTo == "METRE") {
                val result = value * 0.9144
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "YARD" && valueTo == "CENTIMETRE") {
                val result = value * 91.44
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "YARD" && valueTo == "MILIMETRE") {
                val result = value * 914.4
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "YARD" && valueTo == "MICROMETRE") {
                val result = value * 914400
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "YARD" && valueTo == "NANOMETRE") {
                val result = value * 914400000
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "YARD" && valueTo == "MILE") {
                val result = value * 0.00056818182
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "YARD" && valueTo == "YARD") {
                val result = value * 1
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "YARD" && valueTo == "FEET") {
                val result = value * 3
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "YARD" && valueTo == "INCH") {
                val result = value * 36
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "YARD" && valueTo == "KILOMETRE") {
                val result = value * 0.0009144
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }



            if (valueFrom == "FEET" && valueTo == "METRE") {
                val result = value * 0.3048
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "FEET" && valueTo == "CENTIMETRE") {
                val result = value * 30.48
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "FEET" && valueTo == "MILIMETRE") {
                val result = value * 304.8
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "FEET" && valueTo == "MICROMETRE") {
                val result = value * 304800
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "FEET" && valueTo == "NANOMETRE") {
                val result = value * 304800000
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "FEET" && valueTo == "MILE") {
                val result = value * 0.00018939394
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "FEET" && valueTo == "YARD") {
                val result = value * 0.33333333
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "FEET" && valueTo == "FEET") {
                val result = value * 1
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "FEET" && valueTo == "INCH") {
                val result = value * 12
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "FEET" && valueTo == "KILOMETRE") {
                val result = value * 0.0003048
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }



            if (valueFrom == "INCH" && valueTo == "METRE") {
                val result = value * 0.0254
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "INCH" && valueTo == "CENTIMETRE") {
                val result = value * 2.54
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "INCH" && valueTo == "MILIMETRE") {
                val result = value * 25.4
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "INCH" && valueTo == "MICROMETRE") {
                val result = value * 25400
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "INCH" && valueTo == "NANOMETRE") {
                val result = value * 25400000
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "INCH" && valueTo == "MILE") {
                val result = value / 63360
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "INCH" && valueTo == "YARD") {
                val result = value * 0.027777778
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "INCH" && valueTo == "FEET") {
                val result = value * 0.083333333
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "INCH" && valueTo == "INCH") {
                val result = value * 1
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "INCH" && valueTo == "KILOMETRE") {
                val result = value / 39370
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            else{
                Log.d(TAG, "calculation: else")
            }

        }

    }

}