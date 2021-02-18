package com.okcodex.easyconverters.ui.converters.activity.utils

import android.content.ContentValues.TAG
import android.util.Log
import android.widget.TextView

class Pressure {

    companion object {

         fun calculation(
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

            //CENTIMETER PER SECOND

            if (valueFrom == "BAR" && valueTo == "BAR") {
                getValue(1.0)
            }
            if (valueFrom == "BAR" && valueTo == "PASCAL") {
                getValue(100000.0)
            }
            if (valueFrom == "BAR" && valueTo == "POUND-SQUARE PER SQUARE INCH") {
                getValue(14.5038)
            }
            if (valueFrom == "BAR" && valueTo == "STANDARD ATMOSPHERE") {
                getValue(0.986923)
            }
            if (valueFrom == "BAR" && valueTo == "TORR") {
                getValue(750.062)
            }

            if (valueFrom == "PASCAL" && valueTo == "BAR") {
                getValue(0.00001000000423)
            }
            if (valueFrom == "PASCAL" && valueTo == "PASCAL") {
                getValue(1.0)
            }
            if (valueFrom == "PASCAL" && valueTo == "POUND-SQUARE PER SQUARE INCH") {
                getValue(0.000145038)
            }
            if (valueFrom == "PASCAL" && valueTo == "STANDARD ATMOSPHERE") {
                getValue(0.0000098692)
            }
            if (valueFrom == "PASCAL" && valueTo == "TORR") {
                getValue(0.00750062)
            }


            if (valueFrom == "POUND-SQUARE PER SQUARE INCH" && valueTo == "BAR") {
                getValue(0.0689476)
            }
            if (valueFrom == "POUND-SQUARE PER SQUARE INCH" && valueTo == "PASCAL") {
                getValue(6894.76)
            }
            if (valueFrom == "POUND-SQUARE PER SQUARE INCH" && valueTo == "POUND-SQUARE PER SQUARE INCH") {
                getValue(1.0)
            }
            if (valueFrom == "POUND-SQUARE PER SQUARE INCH" && valueTo == "STANDARD ATMOSPHERE") {
                getValue(0.068046)
            }
            if (valueFrom == "POUND-SQUARE PER SQUARE INCH" && valueTo == "TORR") {
                getValue(51.7149)
            }


            if (valueFrom == "STANDARD ATMOSPHERE" && valueTo == "BAR") {
                getValue(1.01325)
            }
            if (valueFrom == "STANDARD ATMOSPHERE" && valueTo == "PASCAL") {
                getValue(101325.0)
            }
            if (valueFrom == "STANDARD ATMOSPHERE" && valueTo == "POUND-SQUARE PER SQUARE INCH") {
                getValue(118.11023157046)
            }
            if (valueFrom == "STANDARD ATMOSPHERE" && valueTo == "STANDARD ATMOSPHERE") {
                getValue(14.6959)
            }
            if (valueFrom == "STANDARD ATMOSPHERE" && valueTo == "TORR") {
                getValue(760.0)
            }


            if (valueFrom == "TORR" && valueTo == "BAR") {
                getValue(0.00133322)
            }
            if (valueFrom == "TORR" && valueTo == "PASCAL") {
                getValue(133.322)
            }
            if (valueFrom == "TORR" && valueTo == "POUND-SQUARE PER SQUARE INCH") {
                getValue(0.0193368)
            }
            if (valueFrom == "TORR" && valueTo == "STANDARD ATMOSPHERE") {
                getValue(0.00131579)
            }
            if (valueFrom == "TORR" && valueTo == "TORR") {
                getValue(1.0)
            }

        }


    }
}