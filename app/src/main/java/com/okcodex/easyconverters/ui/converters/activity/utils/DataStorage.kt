package com.okcodex.easyconverters.ui.converters.activity.utils

import android.util.Log
import android.widget.EditText
import android.widget.TextView

class DataStorage {

    companion object {
        private const val TAG = "DataStorage"

         fun calculation(valueFrom: String,
                         valueTo: String,
                         textview_to: TextView,
                         result_showtext: TextView,
                         et_from: EditText
         ) {

            if (valueFrom == "KILOBYTE" && valueTo == "KILOBYTE") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "KILOBYTE" && valueTo == "MEGABYTE") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from *0.0009765625
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "KILOBYTE" && valueTo == "GIGABYTE") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.00000095367431640625
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "KILOBYTE" && valueTo == "TERABYTE") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.00000000093132257461548
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "KILOBYTE" && valueTo == "PETABYTE") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from *0.00000000000090949470177293
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "KILOBYTE" && valueTo == "EXABYTE") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.00000000000000088817841970012
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "KILOBYTE" && valueTo == "ZETTABYTE") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.0000000000000000008673617379884
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "KILOBYTE" && valueTo == "YOTTABYTE") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.0000000000000000000008470329472543
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "KILOBYTE" && valueTo == "NIBBLE") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 2048
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "KILOBYTE" && valueTo == "BYTE") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1024
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "KILOBYTE" && valueTo == "BIT") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 8192
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }




            if (valueFrom == "MEGABYTE" && valueTo == "KILOBYTE") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1024
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "MEGABYTE" && valueTo == "MEGABYTE") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from *1
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "MEGABYTE" && valueTo == "GIGABYTE") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.0009765625
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "MEGABYTE" && valueTo == "TERABYTE") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.00000095367431640625
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "MEGABYTE" && valueTo == "PETABYTE") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.00000000093132257461548
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "MEGABYTE" && valueTo == "EXABYTE") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.00000000000090949470177293
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "MEGABYTE" && valueTo == "ZETTABYTE") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from *0.00000000000000088817841970013
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "MEGABYTE" && valueTo == "YOTTABYTE") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from *0.0000000000000000008673617379884
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "MEGABYTE" && valueTo == "NIBBLE") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 2097152
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "MEGABYTE" && valueTo == "BYTE") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from *1048576
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "MEGABYTE" && valueTo == "BIT") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from *8388608
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }



            if (valueFrom == "GIGABYTE" && valueTo == "KILOBYTE") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1048576
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "GIGABYTE" && valueTo == "MEGABYTE") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1024
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "GIGABYTE" && valueTo == "GIGABYTE") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "GIGABYTE" && valueTo == "TERABYTE") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.0009765625
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "GIGABYTE" && valueTo == "PETABYTE") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from *0.00000095367431640625
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "GIGABYTE" && valueTo == "EXABYTE") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from *  0.00000000093132257461548
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "GIGABYTE" && valueTo == "ZETTABYTE") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.00000000000090949470177293
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "GIGABYTE" && valueTo == "YOTTABYTE") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from *0.00000000000000088817841970012
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "GIGABYTE" && valueTo == "NIBBLE") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from *2147483648
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "GIGABYTE" && valueTo == "BYTE") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from *1073741824
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "GIGABYTE" && valueTo == "BIT") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from *8589934592
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }



            if (valueFrom == "TERABYTE" && valueTo == "KILOBYTE") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1073741824
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "TERABYTE" && valueTo == "MEGABYTE") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from *1048576
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "TERABYTE" && valueTo == "GIGABYTE") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1024
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "TERABYTE" && valueTo == "TERABYTE") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "TERABYTE" && valueTo == "PETABYTE") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.0009765625
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "TERABYTE" && valueTo == "EXABYTE") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from *0.00000095367431640625
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "TERABYTE" && valueTo == "ZETTABYTE") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.00000000093132257461548
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "TERABYTE" && valueTo == "YOTTABYTE") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.00000000000090949470177293
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "TERABYTE" && valueTo == "NIBBLE") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 2199023255552
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "TERABYTE" && valueTo == "BYTE") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1099511627776
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "TERABYTE" && valueTo == "BIT") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from *8796093022208
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }




            if (valueFrom == "PETABYTE" && valueTo == "KILOBYTE") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1099511627776
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "PETABYTE" && valueTo == "MEGABYTE") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1073741824
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "PETABYTE" && valueTo == "GIGABYTE") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1048576
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "PETABYTE" && valueTo == "TERABYTE") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from *1024
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "PETABYTE" && valueTo == "PETABYTE") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "PETABYTE" && valueTo == "EXABYTE") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from *0.00097656249999999
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "PETABYTE" && valueTo == "ZETTABYTE") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.00000095367431640625
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "PETABYTE" && valueTo == "YOTTABYTE") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.00000000093132257461547
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "PETABYTE" && valueTo == "NIBBLE") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.0000000000000022517998136852
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "PETABYTE" && valueTo == "BYTE") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.0000000000000011258999068426
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "PETABYTE" && valueTo == "BIT") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.000000000000009007199254741
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }




            //done




            if (valueFrom == "EXABYTE" && valueTo == "KILOBYTE") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.0000000000000011258999068426
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "EXABYTE" && valueTo == "MEGABYTE") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1099511627776
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "EXABYTE" && valueTo == "GIGABYTE") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from *1073741824
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "EXABYTE" && valueTo == "TERABYTE") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1048576
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "EXABYTE" && valueTo == "PETABYTE") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1024
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "EXABYTE" && valueTo == "EXABYTE") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "EXABYTE" && valueTo == "ZETTABYTE") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.0009765625
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "EXABYTE" && valueTo == "YOTTABYTE") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.00000095367431640625
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "EXABYTE" && valueTo == "NIBBLE") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.0000000000000000023058430092137
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "EXABYTE" && valueTo == "BYTE") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.0000000000000000011529215046069
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "EXABYTE" && valueTo == "BIT") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from *0.0000000000000000092233720368548
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }



            if (valueFrom == "ZETTABYTE" && valueTo == "KILOBYTE") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.0000000000000000011529215046068
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "ZETTABYTE" && valueTo == "MEGABYTE") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.0000000000000011258999068426
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "ZETTABYTE" && valueTo == "GIGABYTE") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from *1099511627776
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "ZETTABYTE" && valueTo == "TERABYTE") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1073741824
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "ZETTABYTE" && valueTo == "PETABYTE") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from *1048576
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "ZETTABYTE" && valueTo == "EXABYTE") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1024
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "ZETTABYTE" && valueTo == "ZETTABYTE") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from *1
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "ZETTABYTE" && valueTo == "YOTTABYTE") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from *0.0009765625
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "ZETTABYTE" && valueTo == "NIBBLE") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.0000000000000000000023611832414348
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "ZETTABYTE" && valueTo == "BYTE") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.0000000000000000000011805916207174
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "ZETTABYTE" && valueTo == "BIT") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.0000000000000000000094447329657393
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }



            if (valueFrom == "YOTTABYTE" && valueTo == "KILOBYTE") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.0000000000000000000011805916207174
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "YOTTABYTE" && valueTo == "MEGABYTE") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.0000000000000000011529215046068
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "YOTTABYTE" && valueTo == "GIGABYTE") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from *0.0000000000000011258999068426
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "YOTTABYTE" && valueTo == "TERABYTE") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from *1099511627776
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "YOTTABYTE" && valueTo == "PETABYTE") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1073741824
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "YOTTABYTE" && valueTo == "EXABYTE") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1048576
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "YOTTABYTE" && valueTo == "ZETTABYTE") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1024
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "YOTTABYTE" && valueTo == "YOTTABYTE") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "YOTTABYTE" && valueTo == "NIBBLE") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.0000000000000000000000024178516392293
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "YOTTABYTE" && valueTo == "BYTE") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.0000000000000000000000012089258196146
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "YOTTABYTE" && valueTo == "BIT") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from *0.000000000000000000000009671406556917
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }





            if (valueFrom == "NIBBLE" && valueTo == "KILOBYTE") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.00048828125
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "NIBBLE" && valueTo == "MEGABYTE") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.00000047683715820312
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "NIBBLE" && valueTo == "GIGABYTE") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from *0.00000000046566128730774
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "NIBBLE" && valueTo == "TERABYTE") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.00000000000045474735088646
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "NIBBLE" && valueTo == "PETABYTE") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.00000000000000044408920985006
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "NIBBLE" && valueTo == "EXABYTE") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from *0.0000000000000000004336808689942
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "NIBBLE" && valueTo == "ZETTABYTE") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.00000000000000000000042351647362715
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "NIBBLE" && valueTo == "YOTTABYTE") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.00000000000000000000000041359030627651
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "NIBBLE" && valueTo == "NIBBLE") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from *1
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "NIBBLE" && valueTo == "BYTE") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from *0.5
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "NIBBLE" && valueTo == "BIT") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 4
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }






            if (valueFrom == "BYTE" && valueTo == "KILOBYTE") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.0009765625
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "BYTE" && valueTo == "MEGABYTE") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.00000095367431640625
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "BYTE" && valueTo == "GIGABYTE") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from *0.00000000093132257461548
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "BYTE" && valueTo == "TERABYTE") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from *0.00000000000090949470177293
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "BYTE" && valueTo == "PETABYTE") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.00000000000000088817841970013
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "BYTE" && valueTo == "EXABYTE") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.0000000000000000008673617379884
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "BYTE" && valueTo == "ZETTABYTE") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.0000000000000000000008470329472543
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "BYTE" && valueTo == "YOTTABYTE") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.000000000000000000000000082718061255303
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "BYTE" && valueTo == "NIBBLE") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 2
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "BYTE" && valueTo == "BYTE") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "BYTE" && valueTo == "BIT") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 8
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }





            if (valueFrom == "BIT" && valueTo == "KILOBYTE") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.0001220703125
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "BIT" && valueTo == "MEGABYTE") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.00000011920928955078
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "BIT" && valueTo == "GIGABYTE") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.00000000011641532182693
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "BIT" && valueTo == "TERABYTE") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.00000000000011368683772162
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "BIT" && valueTo == "PETABYTE") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.00000000000000011102230246252
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "BIT" && valueTo == "EXABYTE") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.00000000000000000010842021724855
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "BIT" && valueTo == "ZETTABYTE") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.00000000000000000000010587911840679
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "BIT" && valueTo == "YOTTABYTE") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.00000000000000000000000010339757656913
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "BIT" && valueTo == "NIBBLE") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.25
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "BIT" && valueTo == "BYTE") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.125
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "BIT" && valueTo == "BIT") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }





        }


    }

}