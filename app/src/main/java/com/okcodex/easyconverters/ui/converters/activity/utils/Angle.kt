package com.okcodex.easyconverters.ui.converters.activity.utils

import android.widget.TextView

class Angle {

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

            if (valueFrom == "RADIAN" && valueTo == "RADIAN") {
                getValue(1.0)
            }
            if (valueFrom == "RADIAN" && valueTo == "DEGREE") {
                getValue(57.295779513082)
            }
            if (valueFrom == "RADIAN" && valueTo == "MINUTE") {
                getValue(3437.7467707849)
            }
            if (valueFrom == "RADIAN" && valueTo == "SECOND") {
                getValue(206264.8062471)
            }
            if (valueFrom == "RADIAN" && valueTo == "SIGN") {
                getValue(1.9098593171027)
            }
            if (valueFrom == "RADIAN" && valueTo == "OCTANT") {
                getValue(1.2732395447352)
            }
            if (valueFrom == "RADIAN" && valueTo == "SEXTANT") {
                getValue(0.95492965855137)
            }
            if (valueFrom == "RADIAN" && valueTo == "QUADRANT") {
                getValue(0.63661977236758)
            }
            if (valueFrom == "RADIAN" && valueTo == "REVOLUTION") {
                getValue(0.1591549430919)
            }
            if (valueFrom == "RADIAN" && valueTo == "GON") {
                getValue(63.661977236758)
            }
            if (valueFrom == "RADIAN" && valueTo == "MIL") {
                getValue(1018.5916357881)
            }




            if (valueFrom == "DEGREE" && valueTo == "RADIAN") {
                getValue(0.017453292519943)
            }
            if (valueFrom == "DEGREE" && valueTo == "DEGREE") {
                getValue(1.0)
            }
            if (valueFrom == "DEGREE" && valueTo == "MINUTE") {
                getValue(60.0)
            }
            if (valueFrom == "DEGREE" && valueTo == "SECOND") {
                getValue(3600.0)
            }
            if (valueFrom == "DEGREE" && valueTo == "SIGN") {
                getValue(0.033333333333333)
            }
            if (valueFrom == "DEGREE" && valueTo == "OCTANT") {
                getValue(0.022222222222222)
            }
            if (valueFrom == "DEGREE" && valueTo == "SEXTANT") {
                getValue(0.016666666666667)
            }
            if (valueFrom == "DEGREE" && valueTo == "QUADRANT") {
                getValue(0.011111111111111)
            }
            if (valueFrom == "DEGREE" && valueTo == "REVOLUTION") {
                getValue(0.0027777777777778)
            }
            if (valueFrom == "DEGREE" && valueTo == "GON") {
                getValue(1.1111111111111)
            }
            if (valueFrom == "DEGREE" && valueTo == "MIL") {
                getValue(17.777777777778)
            }



            if (valueFrom == "MINUTE" && valueTo == "RADIAN") {
                getValue(0.00029088820866572)
            }
            if (valueFrom == "MINUTE" && valueTo == "DEGREE") {
                getValue(0.016666666666667)
            }
            if (valueFrom == "MINUTE" && valueTo == "MINUTE") {
                getValue(1.0)
            }
            if (valueFrom == "MINUTE" && valueTo == "SECOND") {
                getValue(60.0)
            }
            if (valueFrom == "MINUTE" && valueTo == "SIGN") {
                getValue(1.9098593171027)
            }
            if (valueFrom == "MINUTE" && valueTo == "OCTANT") {
                getValue(0.00037037037037037)
            }
            if (valueFrom == "MINUTE" && valueTo == "SEXTANT") {
                getValue(0.00027777777777778)
            }
            if (valueFrom == "MINUTE" && valueTo == "QUADRANT") {
                getValue(0.00018518518518519)
            }
            if (valueFrom == "MINUTE" && valueTo == "REVOLUTION") {
                getValue(0.000046296296296296)
            }
            if (valueFrom == "MINUTE" && valueTo == "GON") {
                getValue(0.018518518518519)
            }
            if (valueFrom == "MINUTE" && valueTo == "MIL") {
                getValue(0.2962962962963)
            }



            if (valueFrom == "SECOND" && valueTo == "RADIAN") {
                getValue(0.0000048481368110954)
            }
            if (valueFrom == "SECOND" && valueTo == "DEGREE") {
                getValue(0.00027777777777778)
            }
            if (valueFrom == "SECOND" && valueTo == "MINUTE") {
                getValue(0.016666666666667)
            }
            if (valueFrom == "SECOND" && valueTo == "SECOND") {
                getValue(1.0)
            }
            if (valueFrom == "SECOND" && valueTo == "SIGN") {
                getValue(0.0000092592592592593)
            }
            if (valueFrom == "SECOND" && valueTo == "OCTANT") {
                getValue(0.0000061728395061728)
            }
            if (valueFrom == "SECOND" && valueTo == "SEXTANT") {
                getValue(0.0000046296296296296)
            }
            if (valueFrom == "SECOND" && valueTo == "QUADRANT") {
                getValue(0.0000030864197530864)
            }
            if (valueFrom == "SECOND" && valueTo == "REVOLUTION") {
                getValue(0.0000007716049382716)
            }
            if (valueFrom == "SECOND" && valueTo == "GON") {
                getValue(0.00030864197530864)
            }
            if (valueFrom == "SECOND" && valueTo == "MIL") {
                getValue(0.0049382716049383)
            }



            if (valueFrom == "SIGN" && valueTo == "RADIAN") {
                getValue(0.5235987755983)
            }
            if (valueFrom == "SIGN" && valueTo == "DEGREE") {
                getValue(30.0)
            }
            if (valueFrom == "SIGN" && valueTo == "MINUTE") {
                getValue(1800.0)
            }
            if (valueFrom == "SIGN" && valueTo == "SECOND") {
                getValue(108000.0)
            }
            if (valueFrom == "SIGN" && valueTo == "SIGN") {
                getValue(1.0)
            }
            if (valueFrom == "SIGN" && valueTo == "OCTANT") {
                getValue(0.66666666666667)
            }
            if (valueFrom == "SIGN" && valueTo == "SEXTANT") {
                getValue(0.5)
            }
            if (valueFrom == "SIGN" && valueTo == "QUADRANT") {
                getValue(0.33333333333333)
            }
            if (valueFrom == "SIGN" && valueTo == "REVOLUTION") {
                getValue(0.083333333333333)
            }
            if (valueFrom == "SIGN" && valueTo == "GON") {
                val result = from * 33.333333333333
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "SIGN" && valueTo == "MIL") {
                val result = from * 533.33333333333
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }



            if (valueFrom == "OCTANT" && valueTo == "RADIAN") {
                val result = from * 0.78539816339745
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "OCTANT" && valueTo == "DEGREE") {
                val result = from * 45
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "OCTANT" && valueTo == "MINUTE") {
                val result = from * 2700
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "OCTANT" && valueTo == "SECOND") {
                val result = from * 162000
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "OCTANT" && valueTo == "SIGN") {
                val result = from * 1.5
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "OCTANT" && valueTo == "OCTANT") {
                val result = from * 1
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "OCTANT" && valueTo == "SEXTANT") {
                val result = from * 0.75
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "OCTANT" && valueTo == "QUADRANT") {
                val result = from * 0.5
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "OCTANT" && valueTo == "REVOLUTION") {
                val result = from * 0.125
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "OCTANT" && valueTo == "GON") {
                val result = from * 50
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "OCTANT" && valueTo == "MIL") {
                val result = from * 800
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }



            if (valueFrom == "SEXTANT" && valueTo == "RADIAN") {
                val result = from * 1.0471975511966
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "SEXTANT" && valueTo == "DEGREE") {
                val result = from * 60
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "SEXTANT" && valueTo == "MINUTE") {
                val result = from * 3600
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "SEXTANT" && valueTo == "SECOND") {
                val result = from * 216000
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "SEXTANT" && valueTo == "SIGN") {
                val result = from * 2
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "SEXTANT" && valueTo == "OCTANT") {
                val result = from * 1.3333333333333
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "SEXTANT" && valueTo == "SEXTANT") {
                val result = from * 1
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "SEXTANT" && valueTo == "QUADRANT") {
                val result = from * 0.66666666666667
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "SEXTANT" && valueTo == "REVOLUTION") {
                val result = from * 0.16666666666667
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "SEXTANT" && valueTo == "GON") {
                val result = from * 66.666666666667
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "SEXTANT" && valueTo == "MIL") {
                val result = from * 1066.6666666667
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }



            if (valueFrom == "QUADRANT" && valueTo == "RADIAN") {
                val result = from * 1.5707963267949
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "QUADRANT" && valueTo == "DEGREE") {
                val result = from * 90
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "QUADRANT" && valueTo == "MINUTE") {
                val result = from * 5400
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "QUADRANT" && valueTo == "SECOND") {
                val result = from * 324000
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "QUADRANT" && valueTo == "SIGN") {
                val result = from * 3
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "QUADRANT" && valueTo == "OCTANT") {
                val result = from * 2
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "QUADRANT" && valueTo == "SEXTANT") {
                val result = from * 1.5
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "QUADRANT" && valueTo == "QUADRANT") {
                val result = from * 1
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "QUADRANT" && valueTo == "REVOLUTION") {
                val result = from * 0.25
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "QUADRANT" && valueTo == "GON") {
                val result = from * 100
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "QUADRANT" && valueTo == "MIL") {
                val result = from * 1600
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }



            if (valueFrom == "REVOLUTION" && valueTo == "RADIAN") {
                val result = from * 6.2831853071796
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "REVOLUTION" && valueTo == "DEGREE") {
                val result = from * 360
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "REVOLUTION" && valueTo == "MINUTE") {
                val result = from * 21600
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "REVOLUTION" && valueTo == "SECOND") {
                val result = from * 1296000
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "REVOLUTION" && valueTo == "SIGN") {
                val result = from * 12
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "REVOLUTION" && valueTo == "OCTANT") {
                val result = from * 8
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "REVOLUTION" && valueTo == "SEXTANT") {
                val result = from * 6
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "REVOLUTION" && valueTo == "QUADRANT") {
                val result = from * 4
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "REVOLUTION" && valueTo == "REVOLUTION") {
                val result = from * 1
                resultShowText.text = result.toString()
            }
            if (valueFrom == "REVOLUTION" && valueTo == "GON") {
                val result = from * 400
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "REVOLUTION" && valueTo == "MIL") {
                val result = from * 6400
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }



            if (valueFrom == "GON" && valueTo == "RADIAN") {
                val result = from * 0.015707963267949
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "GON" && valueTo == "DEGREE") {
                val result = from * 0.9
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "GON" && valueTo == "MINUTE") {
                val result = from * 54
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "GON" && valueTo == "SECOND") {
                val result = from * 3240
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "GON" && valueTo == "SIGN") {
                val result = from * 0.03
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "GON" && valueTo == "OCTANT") {
                val result = from * 0.02
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "GON" && valueTo == "SEXTANT") {
                val result = from * 0.015
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "GON" && valueTo == "QUADRANT") {
                val result = from * 0.01
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "GON" && valueTo == "REVOLUTION") {
                val result = from * 0.0025
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "GON" && valueTo == "GON") {
                val result = from * 1
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "GON" && valueTo == "MIL") {
                val result = from * 16
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }



            if (valueFrom == "MIL" && valueTo == "RADIAN") {
                val result = from * 0.00098174770424681
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "MIL" && valueTo == "DEGREE") {
                val result = from * 0.05625
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "MIL" && valueTo == "MINUTE") {
                val result = from * 3.375
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "MIL" && valueTo == "SECOND") {
                val result = from * 202.5
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "MIL" && valueTo == "SIGN") {
                val result = from * 0.001875
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "MIL" && valueTo == "OCTANT") {
                val result = from * 0.00125
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "MIL" && valueTo == "SEXTANT") {
                val result = from * 0.0009375
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "MIL" && valueTo == "QUADRANT") {
                val result = from * 0.000625
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "MIL" && valueTo == "REVOLUTION") {
                val result = from * 0.00015625
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "MIL" && valueTo == "GON") {
                val result = from * 0.0625
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }
            if (valueFrom == "MIL" && valueTo == "MIL") {
                val result = from * 1
                textViewTo.text = result.toString()
                resultShowText.text = result.toString()
            }


        }


    }
}