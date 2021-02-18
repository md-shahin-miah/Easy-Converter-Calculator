package com.okcodex.easyconverters.ui.converters.activity.utils

import android.widget.TextView

class Area {

    companion object {

         fun calculation(
            valueFrom: String,
            valueTo: String,
            from: Float,
            textViewTo: TextView,
            resultShowText: TextView
        ) {

            if (valueFrom == "SQUARE INCH" && valueTo == "SQUARE INCH") {
                val result = from * 1
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "SQUARE INCH" && valueTo == "SQUARE FOOT") {
                val result = from * 0.0069444444444444
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "SQUARE INCH" && valueTo == "SQUARE YARD") {
                val result = from * 0.0007716049382716
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "SQUARE INCH" && valueTo == "SQUARE MILE") {
                val result = from * 0.00000000024909766860524
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "SQUARE INCH" && valueTo == "ACRE") {

                val result = from * 0.00000015942250790736
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "SQUARE INCH" && valueTo == "HECTACRE") {

                val result = from * 0.000000064516
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "SQUARE INCH" && valueTo == "SQUARE MILIMETER") {

                val result = from * 645.16
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "SQUARE INCH" && valueTo == "SQUARE CENTIMETER") {

                val result = from * 6.4516
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "SQUARE INCH" && valueTo == "SQUARE METER") {

                val result = from * 0.00064516
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "SQUARE INCH" && valueTo == "SQUARE KILOMETER") {

                val result = from * 0.00000000064516
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }




            if (valueFrom == "SQUARE FOOT" && valueTo == "SQUARE INCH") {

                val result = from * 144
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "SQUARE FOOT" && valueTo == "SQUARE FOOT") {

                val result = from * 1
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "SQUARE FOOT" && valueTo == "SQUARE YARD") {

                val result = from * 0.11111111111111
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "SQUARE FOOT" && valueTo == "SQUARE MILE") {

                val result = from * 0.000000035870064279155
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "SQUARE FOOT" && valueTo == "ACRE") {

                val result = from * 0.000022956841138659
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "SQUARE FOOT" && valueTo == "HECTACRE") {

                val result = from * 0.000009290304
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "SQUARE FOOT" && valueTo == "SQUARE MILIMETER") {

                val result = from * 92903.04
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "SQUARE FOOT" && valueTo == "SQUARE CENTIMETER") {

                val result = from * 929.0304
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "SQUARE FOOT" && valueTo == "SQUARE METER") {

                val result = from * 0.09290304
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "SQUARE FOOT" && valueTo == "SQUARE KILOMETER") {

                val result = from * 0.00000009290304
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }




            if (valueFrom == "SQUARE YARD" && valueTo == "SQUARE INCH") {

                val result = from * 1296
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "SQUARE YARD" && valueTo == "SQUARE FOOT") {

                val result = from * 57.295779513082
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "SQUARE YARD" && valueTo == "SQUARE YARD") {

                val result = from * 9
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "SQUARE YARD" && valueTo == "SQUARE MILE") {

                val result = from * 1
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "SQUARE YARD" && valueTo == "ACRE") {

                val result = from * 0.00020661157024793
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "SQUARE YARD" && valueTo == "HECTACRE") {

                val result = from * 0.000083612736
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "SQUARE YARD" && valueTo == "SQUARE MILIMETER") {

                val result = from * 836127.36
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "SQUARE YARD" && valueTo == "SQUARE CENTIMETER") {

                val result = from * 8361.2736
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "SQUARE YARD" && valueTo == "SQUARE METER") {

                val result = from * 0.83612736
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "SQUARE YARD" && valueTo == "SQUARE KILOMETER") {

                val result = from * 0.00000083612736
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }




            if (valueFrom == "SQUARE MILE" && valueTo == "SQUARE INCH") {

                val result = from * 4014489600
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "SQUARE MILE" && valueTo == "SQUARE FOOT") {

                val result = from * 27878400
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "SQUARE MILE" && valueTo == "SQUARE YARD") {

                val result = from * 3097600
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "SQUARE MILE" && valueTo == "SQUARE MILE") {

                val result = from * 1
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "SQUARE MILE" && valueTo == "ACRE") {

                val result = from * 640
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "SQUARE MILE" && valueTo == "HECTACRE") {

                val result = from * 258.9988110336
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "SQUARE MILE" && valueTo == "SQUARE MILIMETER") {

                val result = from * 2589988110336
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "SQUARE MILE" && valueTo == "SQUARE CENTIMETER") {

                val result = from * 25899881103.36
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "SQUARE MILE" && valueTo == "SQUARE METER") {

                val result = from * 2589988.110336
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "SQUARE MILE" && valueTo == "SQUARE KILOMETER") {

                val result = from * 2.589988110336
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }




            if (valueFrom == "ACRE" && valueTo == "SQUARE INCH") {

                val result = from * 6272640
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "ACRE" && valueTo == "SQUARE FOOT") {

                val result = from * 43560
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "ACRE" && valueTo == "SQUARE YARD") {

                val result = from * 4840
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "ACRE" && valueTo == "SQUARE MILE") {

                val result = from * 0.0015625
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "ACRE" && valueTo == "ACRE") {

                val result = from * 1
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "ACRE" && valueTo == "HECTACRE") {

                val result = from * 0.40468564224
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "ACRE" && valueTo == "SQUARE MILIMETER") {

                val result = from * 4046856422.4
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "ACRE" && valueTo == "SQUARE CENTIMETER") {

                val result = from * 40468564.224
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "ACRE" && valueTo == "SQUARE METER") {

                val result = from * 4046.8564224
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "ACRE" && valueTo == "SQUARE KILOMETER") {

                val result = from * 0.0040468564224
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }




            if (valueFrom == "HECTACRE" && valueTo == "SQUARE INCH") {

                val result = from * 15500031.000062
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "HECTACRE" && valueTo == "SQUARE FOOT") {

                val result = from * 107639.1041671
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "HECTACRE" && valueTo == "SQUARE YARD") {

                val result = from * 11959.900463011
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "HECTACRE" && valueTo == "SQUARE MILE") {

                val result = from * 0.0038610215854245
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "HECTACRE" && valueTo == "ACRE") {

                val result = from * 2.4710538146717
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "HECTACRE" && valueTo == "HECTACRE") {

                val result = from * 1
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "HECTACRE" && valueTo == "SQUARE MILIMETER") {

                val result = from * 10000000000
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "HECTACRE" && valueTo == "SQUARE CENTIMETER") {

                val result = from * 100000000
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "HECTACRE" && valueTo == "SQUARE METER") {

                val result = from * 10000
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "HECTACRE" && valueTo == "SQUARE KILOMETER") {

                val result = from * 0.01
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }




            if (valueFrom == "SQUARE MILIMETER" && valueTo == "SQUARE INCH") {

                val result = from * 0.0015500031000062
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "SQUARE MILIMETER" && valueTo == "SQUARE FOOT") {

                val result = from * 0.00001076391041671
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "SQUARE MILIMETER" && valueTo == "SQUARE YARD") {

                val result = from * 0.0000011959900463011
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "SQUARE MILIMETER" && valueTo == "SQUARE MILE") {

                val result = from * 0.00000000000038610215854245
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "SQUARE MILIMETER" && valueTo == "ACRE") {

                val result = from * 0.00000000024710538146717
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "SQUARE MILIMETER" && valueTo == "HECTACRE") {

                val result = from * 0.00000000010
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "SQUARE MILIMETER" && valueTo == "SQUARE MILIMETER") {

                val result = from * 1
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "SQUARE MILIMETER" && valueTo == "SQUARE CENTIMETER") {

                val result = from * 0.01
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "SQUARE MILIMETER" && valueTo == "SQUARE METER") {

                val result = from * 0.0000010
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "SQUARE MILIMETER" && valueTo == "SQUARE KILOMETER") {

                val result = from * 0.0000000000010
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }




            if (valueFrom == "SQUARE CENTIMETER" && valueTo == "SQUARE INCH") {

                val result = from * 0.15500031000062
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "SQUARE CENTIMETER" && valueTo == "SQUARE FOOT") {

                val result = from * 0.001076391041671
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "SQUARE CENTIMETER" && valueTo == "SQUARE YARD") {

                val result = from * 0.00011959900463011
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "SQUARE CENTIMETER" && valueTo == "SQUARE MILE") {

                val result = from * 0.000000000038610215854245
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "SQUARE CENTIMETER" && valueTo == "ACRE") {

                val result = from * 0.000000024710538146717
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "SQUARE CENTIMETER" && valueTo == "HECTACRE") {

                val result = from * 0.000000010
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "SQUARE CENTIMETER" && valueTo == "SQUARE MILIMETER") {

                val result = from * 100
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "SQUARE CENTIMETER" && valueTo == "SQUARE CENTIMETER") {

                val result = from * 1
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "SQUARE CENTIMETER" && valueTo == "SQUARE METER") {

                val result = from * 0.0001
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "SQUARE CENTIMETER" && valueTo == "SQUARE KILOMETER") {

                val result = from * 0.00000000010
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }




            if (valueFrom == "SQUARE METER" && valueTo == "SQUARE INCH") {

                val result = from * 1550.0031000062
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "SQUARE METER" && valueTo == "SQUARE FOOT") {

                val result = from * 10.76391041671
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "SQUARE METER" && valueTo == "SQUARE YARD") {

                val result = from * 1.1959900463011
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "SQUARE METER" && valueTo == "SQUARE MILE") {

                val result = from * 0.00000038610215854245
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "SQUARE METER" && valueTo == "ACRE") {

                val result = from * 0.00024710538146717
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "SQUARE METER" && valueTo == "HECTACRE") {

                val result = from * 0.0001
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "SQUARE METER" && valueTo == "SQUARE MILIMETER") {

                val result = from * 1000000
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "SQUARE METER" && valueTo == "SQUARE CENTIMETER") {

                val result = from * 10000
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "SQUARE METER" && valueTo == "SQUARE METER") {

                val result = from * 1
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "SQUARE METER" && valueTo == "SQUARE KILOMETER") {

                val result = from * 0.0000010
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }




            if (valueFrom == "SQUARE KILOMETER" && valueTo == "SQUARE INCH") {

                val result = from * 1550003100.0062
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "SQUARE KILOMETER" && valueTo == "SQUARE FOOT") {

                val result = from * 10763910.41671
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "SQUARE KILOMETER" && valueTo == "SQUARE YARD") {

                val result = from * 1195990.0463011
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "SQUARE KILOMETER" && valueTo == "SQUARE MILE") {

                val result = from * 0.38610215854245
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "SQUARE KILOMETER" && valueTo == "ACRE") {

                val result = from * 247.10538146717
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "SQUARE KILOMETER" && valueTo == "HECTACRE") {

                val result = from * 100
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "SQUARE KILOMETER" && valueTo == "SQUARE MILIMETER") {

                val result = from * 1000000000000
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "SQUARE KILOMETER" && valueTo == "SQUARE CENTIMETER") {

                val result = from * 10000000000
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "SQUARE KILOMETER" && valueTo == "SQUARE METER") {


                val result = from * 1000000
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "SQUARE KILOMETER" && valueTo == "SQUARE KILOMETER") {

                val result = from * 1
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }


        }


        private const val TAG = "Area"

    }
}