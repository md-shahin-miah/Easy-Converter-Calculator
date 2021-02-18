package com.okcodex.easyconverters.ui.converters.activity.utils

import android.util.Log
import android.widget.EditText
import android.widget.TextView

class Cooking {

    companion object {

        private const val TAG = "Cooking"

         fun calculation(valueFrom: String,
                         valueTo: String,
                         textview_to: TextView,
                         result_showtext: TextView,
                         et_from:EditText
         )
         {

            if (valueFrom == "RADIAN" && valueTo == "RADIAN") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "RADIAN" && valueTo == "DEGREE") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 57.295779513082
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "RADIAN" && valueTo == "MINUTE") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 3437.7467707849
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "RADIAN" && valueTo == "SECOND") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 206264.8062471
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "RADIAN" && valueTo == "SIGN") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1.9098593171027
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }

        }


    }

}