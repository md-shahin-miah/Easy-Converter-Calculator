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



            if (valueFrom == "exawatt" && valueTo == "exawatt") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "exawatt" && valueTo == "foot pound per minute") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 4.42537E19
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "exawatt" && valueTo == "foot pound per second") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 7.37562E17
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "exawatt" && valueTo == "horsepower") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1.34102E15
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "exawatt" && valueTo == "joule/second") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1.0E18
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "exawatt" && valueTo == "kilovolt/Ampheres") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1.0E15
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "exawatt" && valueTo == "kilowatt") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1.0E15
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "exawatt" && valueTo == "megawatt") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1000000000000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "exawatt" && valueTo == "milliwatt") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1.0E21
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "exawatt" && valueTo == "volt/Ampheres") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1.0E18
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "exawatt" && valueTo == "Watt") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1.0E18
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }

//spt-------2
            if (valueFrom == "foot pound per minute" && valueTo == "exawatt") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 2.2597E-20
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "foot pound per minute" && valueTo == "foot pound per minute") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "foot pound per minute" && valueTo == "foot pound per second") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.016666666666667
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "foot pound per minute" && valueTo == "horsepower") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.00003030303030303
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "foot pound per minute" && valueTo == "joule/second") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.022596965805523
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "foot pound per minute" && valueTo == "kilovolt/Ampheres") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.000022596965805523
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "foot pound per minute" && valueTo == "kilowatt") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.000022596965805523
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "foot pound per minute" && valueTo == "megawatt") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 2.2597E-8
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "foot pound per minute" && valueTo == "milliwatt") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 22.596965805523
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "foot pound per minute" && valueTo == "volt/Ampheres") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.022596965805523
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "foot pound per minute" && valueTo == "Watt") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.022596965805523
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }


            //stp-----------------------3

            if (valueFrom == "foot pound per second" && valueTo == "exawatt") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1.35582E-18
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "foot pound per second" && valueTo == "foot pound per minute") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 60
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "foot pound per second" && valueTo == "foot pound per second") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "foot pound per second" && valueTo == "horsepower") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.0018181818181818
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "foot pound per second" && valueTo == "joule/second") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1.3558179483314
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "foot pound per second" && valueTo == "kilovolt/Ampheres") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.0013558179483314
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "foot pound per second" && valueTo == "kilowatt") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.0013558179483314
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "foot pound per second" && valueTo == "megawatt") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.0000013558179483314
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "foot pound per second" && valueTo == "milliwatt") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1355.8179483314
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "foot pound per second" && valueTo == "volt/Ampheres") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1.3558179483314
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "foot pound per second" && valueTo == "Watt") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1.3558179483314
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }

            //stp-----------------------4

            if (valueFrom == "horsepower" && valueTo == "exawatt") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 7.457E-16
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "horsepower" && valueTo == "foot pound per minute") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 33000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "horsepower" && valueTo == "foot pound per second") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 550
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "horsepower" && valueTo == "horsepower") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "horsepower" && valueTo == "joule/second") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 745.69987158227
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "horsepower" && valueTo == "kilovolt/Ampheres") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.74569987158227
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "horsepower" && valueTo == "kilowatt") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.74569987158227
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "horsepower" && valueTo == "megawatt") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.00074569987158227
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "horsepower" && valueTo == "milliwatt") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 745699.87158227
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "horsepower" && valueTo == "volt/Ampheres") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 745.69987158227
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "horsepower" && valueTo == "Watt") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 745.69987158227
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }

            //stp-----------------------5


            if (valueFrom == "joule/second" && valueTo == "exawatt") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.0000000000000000010
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "joule/second" && valueTo == "foot pound per minute") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 44.253728956636
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "joule/second" && valueTo == "foot pound per second") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.73756214927727
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "joule/second" && valueTo == "horsepower") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.001341022089595
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "joule/second" && valueTo == "joule/second") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "joule/second" && valueTo == "kilovolt/Ampheres") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.001
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "joule/second" && valueTo == "kilowatt") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.001
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "joule/second" && valueTo == "megawatt") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.0000010
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "joule/second" && valueTo == "milliwatt") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "joule/second" && valueTo == "volt/Ampheres") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "joule/second" && valueTo == "Watt") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }

            //stp-----------------------6


            if (valueFrom == "kilovolt/Ampheres" && valueTo == "exawatt") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.0000000000000010
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "kilovolt/Ampheres" && valueTo == "foot pound per minute") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 44253.728956636
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "kilovolt/Ampheres" && valueTo == "foot pound per second") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 737.56214927727
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "kilovolt/Ampheres" && valueTo == "horsepower") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1.341022089595
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "kilovolt/Ampheres" && valueTo == "joule/second") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "kilovolt/Ampheres" && valueTo == "kilovolt/Ampheres") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "kilovolt/Ampheres" && valueTo == "kilowatt") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "kilovolt/Ampheres" && valueTo == "megawatt") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.001
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "kilovolt/Ampheres" && valueTo == "milliwatt") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1000000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "kilovolt/Ampheres" && valueTo == "volt/Ampheres") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "kilovolt/Ampheres" && valueTo == "Watt") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }


            //stp-----------------------7



            if (valueFrom == "kilowatt" && valueTo == "exawatt") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1.0E-15
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "kilowatt" && valueTo == "foot pound per minute") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 44253.728956636
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "kilowatt" && valueTo == "foot pound per second") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 737.56214927727
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "kilowatt" && valueTo == "horsepower") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1.341022089595
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "kilowatt" && valueTo == "joule/second") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "kilowatt" && valueTo == "kilovolt/Ampheres") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "kilowatt" && valueTo == "kilowatt") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "kilowatt" && valueTo == "megawatt") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.001
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "kilowatt" && valueTo == "milliwatt") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1000000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "kilowatt" && valueTo == "volt/Ampheres") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "kilowatt" && valueTo == "Watt") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }

            //stp-----------------------8


            if (valueFrom == "megawatt" && valueTo == "exawatt") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.0000000000010
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "megawatt" && valueTo == "foot pound per minute") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 44253728.956636
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "megawatt" && valueTo == "foot pound per second") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 737562.14927726
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "megawatt" && valueTo == "horsepower") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1341.022089595
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "megawatt" && valueTo == "joule/second") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1000000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "megawatt" && valueTo == "kilovolt/Ampheres") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "megawatt" && valueTo == "kilowatt") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "megawatt" && valueTo == "megawatt") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "megawatt" && valueTo == "milliwatt") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1000000000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "megawatt" && valueTo == "volt/Ampheres") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1000000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "megawatt" && valueTo == "Watt") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1000000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }

            //stp-----------------------9



            if (valueFrom == "milliwatt" && valueTo == "exawatt") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1.0E-21
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "milliwatt" && valueTo == "foot pound per minute") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.044253728956636
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "milliwatt" && valueTo == "foot pound per second") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.00073756214927727
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "milliwatt" && valueTo == "horsepower") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.000001341022089595
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "milliwatt" && valueTo == "joule/second") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.001
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "milliwatt" && valueTo == "kilovolt/Ampheres") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.0000010
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "milliwatt" && valueTo == "kilowatt") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.0000010
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "milliwatt" && valueTo == "megawatt") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.0000000010
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "milliwatt" && valueTo == "milliwatt") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "milliwatt" && valueTo == "volt/Ampheres") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.001
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "milliwatt" && valueTo == "Watt") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.001
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }

            //stp-----------------------10


            if (valueFrom == "volt/Ampheres" && valueTo == "exawatt") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1.0E-18
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "volt/Ampheres" && valueTo == "foot pound per minute") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 44.253728956636
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "volt/Ampheres" && valueTo == "foot pound per second") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.73756214927727
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "volt/Ampheres" && valueTo == "horsepower") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.001341022089595
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "volt/Ampheres" && valueTo == "joule/second") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "volt/Ampheres" && valueTo == "kilovolt/Ampheres") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.001
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "volt/Ampheres" && valueTo == "kilowatt") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.001
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "volt/Ampheres" && valueTo == "megawatt") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.0000010
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "volt/Ampheres" && valueTo == "milliwatt") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }

            if (valueFrom == "volt/Ampheres" && valueTo == "volt/Ampheres") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "volt/Ampheres" && valueTo == "Watt") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }

            //stp-----------------------11


            if (valueFrom == "Watt" && valueTo == "exawatt") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.0000000000000000010
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "Watt" && valueTo == "foot pound per minute") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 44.253728956636
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "Watt" && valueTo == "foot pound per second") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.73756214927727
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "Watt" && valueTo == "horsepower") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.001341022089595
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "Watt" && valueTo == "joule/second") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "Watt" && valueTo == "kilovolt/Ampheres") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.001
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "Watt" && valueTo == "kilowatt") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.001
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "Watt" && valueTo == "megawatt") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.0000010
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "Watt" && valueTo == "milliwatt") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "Watt" && valueTo == "volt/Ampheres") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "Watt" && valueTo == "Watt") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }



        }


    }
}