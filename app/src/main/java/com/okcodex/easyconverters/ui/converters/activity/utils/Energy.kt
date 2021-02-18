package com.okcodex.easyconverters.ui.converters.activity.utils

import android.util.Log
import android.widget.EditText
import android.widget.TextView

class Energy {

    companion object {
        private const val TAG = "Energy"

         fun calculation(
            valueFrom: String,
            valueTo: String,
            textview_to: TextView,
            result_showtext: TextView,
            et_from: EditText
        ) {

            if (valueFrom == "calorie [IT]" && valueTo == "calorie [IT]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "calorie [IT]" && valueTo == "calorie [th]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1.0006692160612
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "calorie [IT]" && valueTo == "calorie [mean]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.99923150724818
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "calorie [IT]" && valueTo == "electronvolt") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 2.6131944223391E+19
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "calorie [IT]" && valueTo == "erg") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 41868000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "calorie [IT]" && valueTo == "foot-poundal") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 99.354273161603
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "calorie [IT]" && valueTo == "foot-pound-force") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 3.0880250889131
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "calorie [IT]" && valueTo == "inch-pound-force") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 37.056302479129
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "calorie [IT]" && valueTo == "joule") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 4.1868
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "calorie [IT]" && valueTo == "megajoule") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 4.1868E-6
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "calorie [IT]" && valueTo == "kilocalorie [IT]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.001
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "calorie [IT]" && valueTo == "kilocalorie [th]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.0010006692160612
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "calorie [IT]" && valueTo == "kilocalorie [mean]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.00099923150724818
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "calorie [IT]" && valueTo == "kilowatt-hour") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1.163E-6
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "calorie [IT]" && valueTo == "quad") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 3.968320164996E-18
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "calorie [IT]" && valueTo == "therm (EC)") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 3.968305120088E-8
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "calorie [IT]" && valueTo == "therm (U.S.)") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 3.9692682242388E-8
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "calorie [IT]" && valueTo == "ton-of-coal-equivalent") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1.4285714285714E-10
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "calorie [IT]" && valueTo == "ton-of-oil-equivalent") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1.0E-10
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "calorie [IT]" && valueTo == "ton-of-TNT-equivalent") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1.0006692160612E-9
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "calorie [IT]" && valueTo == "watt-hour") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.001163
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "calorie [IT]" && valueTo == "watt-second") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 4.1868
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }



            if (valueFrom == "calorie [th]" && valueTo == "calorie [IT]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.99933123148944
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "calorie [th]" && valueTo == "calorie [th]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "calorie [th]" && valueTo == "calorie [mean]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.99856325268137
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "calorie [th]" && valueTo == "electronvolt") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 2.6114468001975E+19
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "calorie [th]" && valueTo == "erg") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 41840000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "calorie [th]" && valueTo == "foot-poundal") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 99.287828152323
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "calorie [th]" && valueTo == "foot-pound-force") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 3.0859599149738
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "calorie [th]" && valueTo == "inch-pound-force") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 37.031520390913
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "calorie [th]" && valueTo == "joule") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 4.184
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "calorie [th]" && valueTo == "megajoule") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 4.184E-6
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "calorie [th]" && valueTo == "kilocalorie [IT]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.00099933123148944
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "calorie [th]" && valueTo == "kilocalorie [th]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.001
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "calorie [th]" && valueTo == "kilocalorie [mean]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.00099856325268137
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "calorie [th]" && valueTo == "kilowatt-hour") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1.1622222222222E-6
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "calorie [th]" && valueTo == "quad") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 3.9656662774298E-18
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "calorie [th]" && valueTo == "therm (EC)") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 3.9656512425834E-8
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "calorie [th]" && valueTo == "therm (U.S.)") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 3.9666137026405E-8
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "calorie [th]" && valueTo == "ton-of-coal-equivalent") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1.4276160449849E-10
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "calorie [th]" && valueTo == "ton-of-oil-equivalent") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 9.9933123148944E-11
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "KILcalorie [th]" && valueTo == "ton-of-TNT-equivalent") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1.0E-9
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "calorie [th]" && valueTo == "watt-hour") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.0011622222222222
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "calorie [th]" && valueTo == "watt-second") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 4.184
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }




            if (valueFrom == "calorie [mean]" && valueTo == "calorie [IT]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1.0007690837871
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "calorie [mean]" && valueTo == "calorie [th]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1.0014388145315
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "calorie [mean]" && valueTo == "calorie [mean]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "calorie [mean]" && valueTo == "electronvolt") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 2.615204187802E+19
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "calorie [mean]" && valueTo == "erg") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 41900200
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "calorie [mean]" && valueTo == "foot-poundal") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 99.430684922275
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "calorie [mean]" && valueTo == "foot-pound-force") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 3.0904000389433
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "calorie [mean]" && valueTo == "inch-pound-force") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 37.084801880577
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "calorie [mean]" && valueTo == "joule") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 4.19002
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "calorie [mean]" && valueTo == "megajoule") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 4.19002E-6
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "calorie [mean]" && valueTo == "kilocalorie [IT]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.0010007690837871
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "calorie [mean]" && valueTo == "kilocalorie [th]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.0010014388145315
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "calorie [mean]" && valueTo == "kilocalorie [mean]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.001
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "calorie [mean]" && valueTo == "kilowatt-hour") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1.1638944444444E-6
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "calorie [mean]" && valueTo == "quad") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 3.9713721356971E-18
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "calorie [mean]" && valueTo == "therm (EC)") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 3.9713570792182E-8
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "calorie [mean]" && valueTo == "therm (U.S.)") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 3.9723209240769E-8
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "calorie [mean]" && valueTo == "ton-of-coal-equivalent") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1.4296701196959E-10
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "calorie [mean]" && valueTo == "ton-of-oil-equivalent") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1.0007690837871E-10
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "calorie [mean]" && valueTo == "ton-of-TNT-equivalent") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1.0014388145315E-9
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "calorie [mean]" && valueTo == "watt-hour") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.0011638944444444
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "calorie [mean]" && valueTo == "watt-second") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 4.19002
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }




            if (valueFrom == "electronvolt" && valueTo == "calorie [IT]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 3.8267340212095E-20
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "electronvolt" && valueTo == "calorie [th]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 3.8292949330784E-20
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "electronvolt" && valueTo == "calorie [mean]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 3.8237932038511E-20
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "electronvolt" && valueTo == "electronvolt") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "electronvolt" && valueTo == "erg") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1.602177E-12
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "electronvolt" && valueTo == "foot-poundal") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 3.8020237726005E-18
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "electronvolt" && valueTo == "foot-pound-force") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1.1817050666092E-19
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "electronvolt" && valueTo == "inch-pound-force") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1.4180461339711E-18
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "electronvolt" && valueTo == "joule") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1.602177E-19
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "electronvolt" && valueTo == "megajoule") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1.602177E-25
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "electronvolt" && valueTo == "kilocalorie [IT]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 3.8267340212095E-23
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "electronvolt" && valueTo == "kilocalorie [th]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 3.8292949330784E-23
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "electronvolt" && valueTo == "kilocalorie [mean]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 3.8237932038511E-23
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "electronvolt" && valueTo == "kilowatt-hour") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 4.4504916666667E-26
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "electronvolt" && valueTo == "quad") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1.5185705782442E-37
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "electronvolt" && valueTo == "therm (EC)") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1.518564820958E-27
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "electronvolt" && valueTo == "therm (U.S.)") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1.5189333753001E-27
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "electronvolt" && valueTo == "ton-of-coal-equivalent") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 5.4667628874422E-30
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "electronvolt" && valueTo == "ton-of-oil-equivalent") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 3.8267340212095E-30
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "electronvolt" && valueTo == "ton-of-TNT-equivalent") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 3.8292949330784E-29
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "electronvolt" && valueTo == "watt-hour") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 4.4504916666667E-23
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "electronvolt" && valueTo == "watt-second") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1.602177E-19
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }




            if (valueFrom == "erg" && valueTo == "calorie [IT]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 2.388458966275E-8
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "erg" && valueTo == "calorie [th]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 2.3900573613767E-8
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "erg" && valueTo == "calorie [mean]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 2.3866234528713E-8
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "erg" && valueTo == "electronvolt") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 624150764865.55
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "erg" && valueTo == "erg") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "erg" && valueTo == "foot-poundal") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 2.3730360457056E-6
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "erg" && valueTo == "foot-pound-force") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 7.3756212116966E-8
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "erg" && valueTo == "inch-pound-force") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 8.8507457913272E-7
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "erg" && valueTo == "joule") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1.0E-7
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "erg" && valueTo == "megajoule") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1.0E-13
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "erg" && valueTo == "kilocalorie [IT]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 2.388458966275E-11
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "erg" && valueTo == "kilocalorie [th]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 2.3900573613767E-11
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "erg" && valueTo == "kilocalorie [mean]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 2.3866234528713E-11
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "erg" && valueTo == "kilowatt-hour") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 2.7777777777778E-14
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "erg" && valueTo == "quad") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 9.4781698791344E-26
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "erg" && valueTo == "therm (EC)") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 9.4781339449889E-16
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "erg" && valueTo == "therm (U.S.)") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 9.4804342797335E-16
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "erg" && valueTo == "ton-of-coal-equivalent") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 3.4120842375357E-18
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "erg" && valueTo == "ton-of-oil-equivalent") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 2.388458966275E-18
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "erg" && valueTo == "ton-of-TNT-equivalent") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 2.3900573613767E-17
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "erg" && valueTo == "watt-hour") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 2.7777777777778E-11
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "erg" && valueTo == "watt-second") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1.0E-7
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }




            if (valueFrom == "foot-poundal" && valueTo == "calorie [IT]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.010064992356931
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "foot-poundal" && valueTo == "calorie [th]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.010071728011472
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "foot-poundal" && valueTo == "calorie [mean]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.010057257483258
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "foot-poundal" && valueTo == "electronvolt") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 2.6301781888019E+17
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "foot-poundal" && valueTo == "erg") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 421401.1
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "foot-poundal" && valueTo == "foot-poundal") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "foot-poundal" && valueTo == "foot-pound-force") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.031080948917923
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "foot-poundal" && valueTo == "inch-pound-force") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.37297140122857
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "foot-poundal" && valueTo == "joule") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.04214011
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "foot-poundal" && valueTo == "megajoule") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 4.214011E-8
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "foot-poundal" && valueTo == "kilocalorie [IT]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1.0064992356931E-5
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "foot-poundal" && valueTo == "kilocalorie [th]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1.0071728011472E-5
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "foot-poundal" && valueTo == "kilocalorie [mean]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1.0057257483258E-5
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "foot-poundal" && valueTo == "kilowatt-hour") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1.1705586111111E-8
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "foot-poundal" && valueTo == "quad") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 3.9941112130541E-20
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "foot-poundal" && valueTo == "therm (EC)") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 3.9940960703657E-10
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "foot-poundal" && valueTo == "therm (U.S.)") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 3.9950654339574E-10
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "foot-poundal" && valueTo == "ton-of-coal-equivalent") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1.4378560509902E-12
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "foot-poundal" && valueTo == "ton-of-oil-equivalent") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1.0064992356931E-12
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "foot-poundal" && valueTo == "ton-of-TNT-equivalent") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1.0071728011472E-11
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "foot-poundal" && valueTo == "watt-hour") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1.1705586111111E-5
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "foot-poundal" && valueTo == "watt-second") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.04214011
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }


////////////

            if (valueFrom == "foot-pound-force" && valueTo == "calorie [IT]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.010064992356931
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "foot-pound-force" && valueTo == "calorie [th]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.010071728011472
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "foot-pound-force" && valueTo == "calorie [mean]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.010057257483258
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "foot-pound-force" && valueTo == "electronvolt") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 2.6301781888019E+17
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "foot-pound-force" && valueTo == "erg") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 421401.1
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "foot-pound-force" && valueTo == "foot-poundal") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.031080948917923
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "foot-pound-force" && valueTo == "foot-pound-force") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "foot-pound-force" && valueTo == "inch-pound-force") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.37297140122857
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "foot-pound-force" && valueTo == "joule") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.04214011
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "foot-pound-force" && valueTo == "megajoule") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 4.214011E-8
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "foot-pound-force" && valueTo == "kilocalorie [IT]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1.0064992356931E-5
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "foot-pound-force" && valueTo == "kilocalorie [th]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1.0071728011472E-5
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "foot-pound-force" && valueTo == "kilocalorie [mean]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1.0057257483258E-5
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "foot-pound-force" && valueTo == "kilowatt-hour") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1.1705586111111E-8
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "foot-pound-force" && valueTo == "quad") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 3.9941112130541E-20
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "foot-pound-force" && valueTo == "therm (EC)") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 3.9940960703657E-10
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "foot-pound-force" && valueTo == "therm (U.S.)") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 3.9950654339574E-10
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "foot-pound-force" && valueTo == "ton-of-coal-equivalent") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1.4378560509902E-12
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "foot-pound-force" && valueTo == "ton-of-oil-equivalent") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1.0064992356931E-12
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "foot-pound-force" && valueTo == "ton-of-TNT-equivalent") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1.0071728011472E-11
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "foot-pound-force" && valueTo == "watt-hour") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1.1705586111111E-5
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "foot-pound-force" && valueTo == "watt-second") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.04214011
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }




            if (valueFrom == "inch-pound-force" && valueTo == "calorie [IT]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.026985962794405
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "inch-pound-force" && valueTo == "calorie [th]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.027004022234134
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "inch-pound-force" && valueTo == "calorie [mean]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.026965224277597
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "inch-pound-force" && valueTo == "electronvolt") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 7.051956745579E+17
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "inch-pound-force" && valueTo == "erg") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1129848.2902762
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "inch-pound-force" && valueTo == "foot-poundal") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 2.6811707190042
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "inch-pound-force" && valueTo == "foot-pound-force") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.083333330157599
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "inch-pound-force" && valueTo == "inch-pound-force") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "inch-pound-force" && valueTo == "joule") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.11298482902762
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "inch-pound-force" && valueTo == "megajoule") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.11298482902762
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "inch-pound-force" && valueTo == "kilocalorie [IT]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.11298482902762
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "inch-pound-force" && valueTo == "kilocalorie [th]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 2.7004022234134E-5
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "inch-pound-force" && valueTo == "kilocalorie [mean]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 2.6965224277597E-5
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "inch-pound-force" && valueTo == "kilowatt-hour") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 3.1384674729893E-8
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "inch-pound-force" && valueTo == "quad") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1.0708894032887E-19
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "inch-pound-force" && valueTo == "therm (EC)") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1.0708853432754E-9
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "inch-pound-force" && valueTo == "therm (U.S.)") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1.0711452462032E-9
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "inch-pound-force" && valueTo == "ton-of-coal-equivalent") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 3.8551375420579E-12
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "inch-pound-force" && valueTo == "ton-of-oil-equivalent") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 2.6985962794405E-12
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "inch-pound-force" && valueTo == "ton-of-TNT-equivalent") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 2.7004022234134E-11
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "inch-pound-force" && valueTo == "watt-hour") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 3.1384674729893E-5
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "inch-pound-force" && valueTo == "watt-second") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.11298482902762
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }




            if (valueFrom == "joule" && valueTo == "calorie [IT]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.2388458966275
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "joule" && valueTo == "calorie [th]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.23900573613767
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "joule" && valueTo == "calorie [mean]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.23866234528713
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "joule" && valueTo == "electronvolt") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 6.2415076486555E+18
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "joule" && valueTo == "erg") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 10000000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "joule" && valueTo == "foot-poundal") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 23.730360457056
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "joule" && valueTo == "foot-pound-force") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.73756212116966
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "joule" && valueTo == "inch-pound-force") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 8.8507457913272
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "joule" && valueTo == "joule") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "joule" && valueTo == "megajoule") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1.0E-6
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "joule" && valueTo == "kilocalorie [IT]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.0002388458966275
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "joule" && valueTo == "kilocalorie [th]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.00023900573613767
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "joule" && valueTo == "kilocalorie [mean]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.00023866234528713
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "joule" && valueTo == "kilowatt-hour") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 2.7777777777778E-7
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "joule [IT]" && valueTo == "quad") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 9.4781698791344E-19
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "joule" && valueTo == "therm (EC)") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 9.4781339449889E-9
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "joule" && valueTo == "therm (U.S.)") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 9.4804342797335E-9
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "joule" && valueTo == "ton-of-coal-equivalent") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 2.388458966275E-11
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "joule" && valueTo == "ton-of-oil-equivalent") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 2.388458966275E-11
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "joule" && valueTo == "ton-of-TNT-equivalent") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 2.3900573613767E-10
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "joule" && valueTo == "watt-hour") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.00027777777777778
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "joule" && valueTo == "watt-second") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }




            if (valueFrom == "megajoule" && valueTo == "calorie [IT]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 238845.8966275
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "megajoule" && valueTo == "calorie [th]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 239005.73613767
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "megajoule" && valueTo == "calorie [mean]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 238662.34528713
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "megajoule" && valueTo == "electronvolt") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 6.2415076486555E+24
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "megajoule" && valueTo == "erg") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 10000000000000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "megajoule" && valueTo == "foot-poundal") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 23730360.457056
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "megajoule" && valueTo == "foot-pound-force") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 737562.12116966
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "megajoule" && valueTo == "inch-pound-force") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 8850745.7913272
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "megajoule" && valueTo == "joule") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1000000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "megajoule" && valueTo == "megajoule") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "megajoule" && valueTo == "kilocalorie [IT]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 238.8458966275
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "megajoule" && valueTo == "kilocalorie [th]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 239.00573613767
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "megajoule" && valueTo == "kilocalorie [mean]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 238.66234528713
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "megajoule" && valueTo == "kilowatt-hour") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.27777777777778
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "megajoule" && valueTo == "quad") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 9.4781698791344E-13
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "megajoule" && valueTo == "therm (EC)") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.0094781339449889
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "megajoule" && valueTo == "therm (U.S.)") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.0094804342797335
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "megajoule" && valueTo == "ton-of-coal-equivalent") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 3.4120842375357E-5
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "megajoule" && valueTo == "ton-of-oil-equivalent") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 2.388458966275E-5
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "megajoule" && valueTo == "ton-of-TNT-equivalent") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.00023900573613767
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "megajoule" && valueTo == "watt-hour") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 277.77777777778
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "megajoule" && valueTo == "watt-second") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1000000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }



            if (valueFrom == "kilocalorie [IT]" && valueTo == "calorie [IT]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "kilocalorie [IT]" && valueTo == "calorie [th]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1000.6692160612
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "kilocalorie [IT]" && valueTo == "calorie [mean]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 999.23150724818
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "kilocalorie [IT]" && valueTo == "electronvolt") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 2.6131944223391E+22
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "kilocalorie [IT]" && valueTo == "erg") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 41868000000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "kilocalorie [IT]" && valueTo == "foot-poundal") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 99354.273161603
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "kilocalorie [IT]" && valueTo == "foot-pound-force") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 3088.0250889131
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "kilocalorie [IT]" && valueTo == "inch-pound-force") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 37056.302479129
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "kilocalorie [IT]" && valueTo == "joule") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 4186.8
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "kilocalorie [IT]" && valueTo == "megajoule") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.0041868
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "kilocalorie [IT]" && valueTo == "kilocalorie [IT]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "kilocalorie [IT]" && valueTo == "kilocalorie [th]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1.0006692160612
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "kilocalorie [IT]" && valueTo == "kilocalorie [mean]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.99923150724818
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "kilocalorie [IT]" && valueTo == "kilowatt-hour") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.001163
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "kilocalorie [IT]]" && valueTo == "quad") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 3.968320164996E-15
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "kilocalorie [IT]" && valueTo == "therm (EC)") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 3.968305120088E-5
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "kilocalorie [IT]" && valueTo == "therm (U.S.)") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 3.9692682242388E-5
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "kilocalorie [IT]" && valueTo == "ton-of-coal-equivalent") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1.0E-7
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "kilocalorie [IT]" && valueTo == "ton-of-oil-equivalent") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1.0E-7
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "kilocalorie [IT]" && valueTo == "ton-of-TNT-equivalent") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1.0006692160612E-6
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "kilocalorie [IT]" && valueTo == "watt-hour") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1.163
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "kilocalorie [IT]" && valueTo == "watt-second") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 4186.8
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }

///


            if (valueFrom == "kilocalorie [th]" && valueTo == "calorie [IT]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 999.33123148944
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "kilocalorie [th]" && valueTo == "calorie [th]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "kilocalorie [th]" && valueTo == "calorie [mean]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 998.56325268137
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "kilocalorie [th]" && valueTo == "electronvolt") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 2.6114468001975E+22
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "kilocalorie [th]" && valueTo == "erg") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 41840000000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "kilocalorie [th]" && valueTo == "foot-poundal") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 99287.828152323
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "kilocalorie [th]" && valueTo == "foot-pound-force") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 3085.9599149738
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "kilocalorie [th]" && valueTo == "inch-pound-force") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 37031.520390913
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "kilocalorie [th]" && valueTo == "joule") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 4184
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "kilocalorie [th]" && valueTo == "megajoule") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.004184
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "kilocalorie [th]" && valueTo == "kilocalorie [IT]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.99933123148944
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "kilocalorie [th]" && valueTo == "kilocalorie [th]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "kilocalorie [th]" && valueTo == "kilocalorie [mean]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.99856325268137
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "kilocalorie [th]" && valueTo == "kilowatt-hour") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.0011622222222222
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "kilocalorie [th]" && valueTo == "quad") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 3.9656662774298E-15
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "kilocalorie [th]" && valueTo == "therm (EC)") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 3.9656512425834E-5
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "kilocalorie [th]" && valueTo == "therm (U.S.)") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 3.9666137026405E-5
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "kilocalorie [th]" && valueTo == "ton-of-coal-equivalent") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1.4276160449849E-7
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "kilocalorie [th]" && valueTo == "ton-of-oil-equivalent") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 9.9933123148944E-8
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "kilocalorie [th]" && valueTo == "ton-of-TNT-equivalent") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1.0E-6
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "kilocalorie [th]" && valueTo == "watt-hour") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1.1622222222222
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "kilocalorie [th]" && valueTo == "watt-second") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 4184
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }

//////

            if (valueFrom == "kilocalorie [mean]" && valueTo == "calorie [IT]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1000.7690837871
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "kilocalorie [mean]" && valueTo == "calorie [th]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1001.4388145315
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "kilocalorie [mean]" && valueTo == "calorie [mean]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "kilocalorie [mean]" && valueTo == "electronvolt") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 2.615204187802E+22
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "kilocalorie [mean]" && valueTo == "erg") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 41900200000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "kilocalorie [mean]" && valueTo == "foot-poundal") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 99430.684922275
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "kilocalorie [mean]" && valueTo == "foot-pound-force") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 3090.4000389433
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "kilocalorie [mean]" && valueTo == "inch-pound-force") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 37084.801880577
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "kilocalorie [mean]" && valueTo == "joule") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 4190.02
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "kilocalorie [mean]" && valueTo == "megajoule") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.00419002
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "kilocalorie [mean]" && valueTo == "kilocalorie [IT]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1.0007690837871
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "kilocalorie [mean]" && valueTo == "kilocalorie [th]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1.0014388145315
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "kilocalorie [mean]" && valueTo == "kilocalorie [mean]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "kilocalorie [mean]" && valueTo == "kilowatt-hour") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.0011638944444444
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "kilocalorie [mean]" && valueTo == "quad") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 3.9713721356971E-15
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "kilocalorie [mean]" && valueTo == "therm (EC)") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 3.9713570792182E-5
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "kilocalorie [mean]" && valueTo == "therm (U.S.)") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 3.9723209240769E-5
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "kilocalorie [mean]" && valueTo == "ton-of-coal-equivalent") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1.4296701196959E-7
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "kilocalorie [mean]" && valueTo == "ton-of-oil-equivalent") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1.0007690837871E-7
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "kilocalorie [mean]" && valueTo == "ton-of-TNT-equivalent") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1.0014388145315E-6
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "kilocalorie [mean]" && valueTo == "watt-hour") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1.1638944444444
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "kilocalorie [mean]" && valueTo == "watt-second") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 4190.02
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }

///

            if (valueFrom == "kilowatt-hour" && valueTo == "calorie [IT]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 859845.22785899
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "kilowatt-hour" && valueTo == "calorie [th]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 860420.6500956
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "kilowatt-hour" && valueTo == "calorie [mean]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 859184.44303368
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "kilowatt-hour" && valueTo == "electronvolt") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 2.246942753516E+25
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "kilowatt-hour" && valueTo == "erg") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 36000000000000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "kilowatt-hour" && valueTo == "foot-poundal") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 85429297.645402
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "kilowatt-hour" && valueTo == "foot-pound-force") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 2655223.6362108
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "kilowatt-hour" && valueTo == "inch-pound-force") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 31862684.848778
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "kilowatt-hour" && valueTo == "joule") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 3600000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "kilowatt-hour" && valueTo == "megajoule") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 3.6
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "kilowatt-hour" && valueTo == "kilocalorie [IT]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 859.84522785899
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "kilowatt-hour" && valueTo == "kilocalorie [th]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 860.4206500956
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "kilowatt-hour" && valueTo == "kilocalorie [mean]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 859.18444303368
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "kilowatt-hour" && valueTo == "kilowatt-hour") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "kilowatt-hour" && valueTo == "quad") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 33.4121411564884E-12
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "kilowatt-hour" && valueTo == "therm (EC)") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.03412128220196
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "kilowatt-hour" && valueTo == "therm (U.S.)") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.034129563407041
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "kilowatt-hour" && valueTo == "ton-of-coal-equivalent") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.00012283503255128
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "kilowatt-hour" && valueTo == "ton-of-oil-equivalent") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 8.5984522785899E-5
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "kilowatt-hour" && valueTo == "ton-of-TNT-equivalent") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.0008604206500956
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "kilowatt-hour" && valueTo == "watt-hour") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "kilowatt-hour" && valueTo == "watt-second") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 3600000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }

///////

            if (valueFrom == "quad" && valueTo == "calorie [IT]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 2.5199579631222E+17
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "quad" && valueTo == "calorie [th]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 2.5216443594646E+17
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "quad" && valueTo == "calorie [mean]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 2.5180213936926E+17
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "quad" && valueTo == "electronvolt") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 6.5851400937599E+36
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "quad" && valueTo == "erg") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1.055056E+25
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "quad" && valueTo == "foot-poundal") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 2.503685918238E+19
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "quad" && valueTo == "foot-pound-force") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 7.7816934131277E+17
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "quad" && valueTo == "inch-pound-force") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 9.3380324516146E+18
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "quad" && valueTo == "joule") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1.055056E+18
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "quad" && valueTo == "megajoule") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1055056000000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "quad" && valueTo == "kilocalorie [IT]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 2.5199579631222E+14
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "quad" && valueTo == "kilocalorie [th]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 2.5216443594646E+14
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "quad" && valueTo == "kilocalorie [mean]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 2.5180213936926E+14
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "quad" && valueTo == "kilowatt-hour") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 293071111111.11
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "quad" && valueTo == "quad") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "quad" && valueTo == "therm (EC)") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 9999962087.4642
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "quad" && valueTo == "therm (U.S.)") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 10002389069.438
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "quad" && valueTo == "ton-of-coal-equivalent") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 35999399.473174
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "quad" && valueTo == "ton-of-oil-equivalent") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 25199579.631222
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "quad" && valueTo == "ton-of-TNT-equivalent") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 252164435.94646
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "quad" && valueTo == "watt-hour") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 2.9307111111111E+14
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "quad" && valueTo == "watt-second") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1.055056E+18
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }

///////

            if (valueFrom == "therm (EC)" && valueTo == "calorie [IT]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 25199675.169581
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "therm (EC)" && valueTo == "calorie [th]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 25216539.196941
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "therm (EC)" && valueTo == "calorie [mean]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 25180309.401864
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "therm (EC)" && valueTo == "electronvolt") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 6.5851650597905E+26
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "therm (EC)" && valueTo == "erg") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1.05506E+15
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "therm (EC)" && valueTo == "foot-poundal") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 2503695410.3822
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "therm (EC)" && valueTo == "foot-pound-force") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 77817229.156126
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "therm (EC)" && valueTo == "inch-pound-force") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 933806785.45977
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "therm (EC)" && valueTo == "joule") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 105506000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "therm (EC)" && valueTo == "megajoule") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 105.506
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "therm (EC)" && valueTo == "kilocalorie [IT]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 25199.675169581
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "therm (EC)" && valueTo == "kilocalorie [th]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 25216.539196941
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "therm (EC)" && valueTo == "kilocalorie [mean]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 25180.309401864
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "therm (EC)" && valueTo == "kilowatt-hour") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 29.307222222222
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "therm (EC)" && valueTo == "quad") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1.000003791268E-10
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "therm (EC)" && valueTo == "therm (EC)") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "therm (EC)" && valueTo == "therm (U.S.)") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1.0002426991176
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "therm (EC)" && valueTo == "ton-of-coal-equivalent") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.0035999535956544
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "therm (EC)" && valueTo == "ton-of-oil-equivalent") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.0025199675169581
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "therm (EC)" && valueTo == "ton-of-TNT-equivalent") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.025216539196941
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "therm (EC)" && valueTo == "watt-hour") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 29307.222222222
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "therm (EC)" && valueTo == "watt-second") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 105506000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }


///
            if (valueFrom == "therm (U.S.)" && valueTo == "calorie [IT]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 25193560.714627
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "therm (U.S.)" && valueTo == "calorie [th]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 25210420.650096
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "therm (U.S.)" && valueTo == "calorie [mean]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 25174199.645825
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "therm (U.S.)" && valueTo == "electronvolt") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 6.5835672338325E+26
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "therm (U.S.)" && valueTo == "erg") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1.054804E+15
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "therm (U.S.)" && valueTo == "foot-poundal") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 2503087913.1545
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "therm (U.S.)" && valueTo == "foot-pound-force") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 77798347.565824
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "therm (U.S.)" && valueTo == "inch-pound-force") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 933580206.36751
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "therm (U.S.)" && valueTo == "joule") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 105480400
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "therm (U.S.)" && valueTo == "megajoule") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 105.4804
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "therm (U.S.)" && valueTo == "kilocalorie [IT]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 25193.560714627
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "therm (U.S.)" && valueTo == "kilocalorie [th]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 25210.420650096
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "therm (U.S.)" && valueTo == "kilocalorie [mean]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 25174.199645825
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "therm (U.S.)" && valueTo == "kilowatt-hour") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 29.300111111111
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "therm (U.S.)" && valueTo == "quad") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 9.9976115011905E-11
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "therm (U.S.)" && valueTo == "therm (EC)") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.99975735977101
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "therm (U.S.)" && valueTo == "therm (U.S.)") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "therm (U.S.)" && valueTo == "ton-of-coal-equivalent") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.0035990801020896
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "therm (U.S.)" && valueTo == "ton-of-oil-equivalent") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.0025193560714627
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "therm (U.S.)" && valueTo == "ton-of-TNT-equivalent") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.025210420650096
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "therm (U.S.)" && valueTo == "watt-hour") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 29300.111111111
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "therm (U.S.)" && valueTo == "watt-second") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 105480400
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
//


            if (valueFrom == "ton-of-coal-equivalent" && valueTo == "calorie [IT]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 7000000000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "ton-of-coal-equivalent" && valueTo == "calorie [th]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 7004684512.4283
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "ton-of-coal-equivalent" && valueTo == "calorie [mean]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 6994620550.7372
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "ton-of-coal-equivalent" && valueTo == "electronvolt") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1.8292360956374E+29
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "ton-of-coal-equivalent" && valueTo == "erg") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 2.93076E+17
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "ton-of-coal-equivalent" && valueTo == "foot-poundal") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 695479912131.22
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "ton-of-coal-equivalent" && valueTo == "foot-pound-force") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 21616175622.392
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "ton-of-coal-equivalent" && valueTo == "inch-pound-force") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 259394117353.9
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "ton-of-coal-equivalent" && valueTo == "joule") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 29307600000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "ton-of-coal-equivalent" && valueTo == "megajoule") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 29307.6
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "ton-of-coal-equivalent" && valueTo == "kilocalorie [IT]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 7000000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "ton-of-coal-equivalent" && valueTo == "kilocalorie [th]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 7004684.5124283
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "ton-of-coal-equivalent" && valueTo == "kilocalorie [mean]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 6994620.5507372
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "ton-of-coal-equivalent" && valueTo == "kilowatt-hour") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 8141
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "ton-of-coal-equivalent" && valueTo == "quad") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 2.7778241154972E-8
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "ton-of-coal-equivalent" && valueTo == "therm (EC)") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 277.78135840616
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "ton-of-coal-equivalent" && valueTo == "therm (U.S.)") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 277.84877569672
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "ton-of-coal-equivalent" && valueTo == "ton-of-coal-equivalent") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "ton-of-coal-equivalent" && valueTo == "ton-of-oil-equivalent") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.7
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "ton-of-coal-equivalent" && valueTo == "ton-of-TNT-equivalent") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 7.0046845124283
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "ton-of-coal-equivalent" && valueTo == "watt-hour") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 8141000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "ton-of-coal-equivalent" && valueTo == "watt-second") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 29307600000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }

////

            if (valueFrom == "ton-of-oil-equivalent" && valueTo == "calorie [IT]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 10000000000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "ton-of-oil-equivalent" && valueTo == "calorie [th]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 10006692160.612
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "ton-of-oil-equivalent" && valueTo == "calorie [mean]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 9992315072.4818
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "ton-of-oil-equivalent" && valueTo == "electronvolt") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 2.6131944223391E+29
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "ton-of-oil-equivalent" && valueTo == "erg") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 4.1868E+17
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "ton-of-oil-equivalent" && valueTo == "foot-poundal") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 993542731616.03
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "ton-of-oil-equivalent" && valueTo == "foot-pound-force") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 30880250889.131
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "ton-of-oil-equivalent" && valueTo == "inch-pound-force") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 370563024791.29
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "ton-of-oil-equivalent" && valueTo == "joule") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 41868000000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "ton-of-oil-equivalent" && valueTo == "megajoule") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 41868
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "ton-of-oil-equivalent" && valueTo == "kilocalorie [IT]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 10000000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "ton-of-oil-equivalent" && valueTo == "kilocalorie [th]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 10006692.160612
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "ton-of-oil-equivalent" && valueTo == "kilocalorie [mean]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 9992315.0724818
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "ton-of-oil-equivalent" && valueTo == "kilowatt-hour") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 11630
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "ton-of-oil-equivalent" && valueTo == "quad") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 3.968320164996E-8
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "ton-of-oil-equivalent" && valueTo == "therm (EC)") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 396.8305120088
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "ton-of-oil-equivalent" && valueTo == "therm (U.S.)") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 396.92682242388
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "ton-of-oil-equivalent" && valueTo == "ton-of-coal-equivalent") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1.4285714285714
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "ton-of-oil-equivalent" && valueTo == "ton-of-oil-equivalent") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "ton-of-oil-equivalent" && valueTo == "ton-of-TNT-equivalent") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 10.006692160612
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "ton-of-oil-equivalent" && valueTo == "watt-hour") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 11630000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "ton-of-oil-equivalent" && valueTo == "watt-second") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 41868000000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }

/////

            if (valueFrom == "ton-of-TNT-equivalent" && valueTo == "calorie [IT]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 999331231.48944
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "ton-of-TNT-equivalent" && valueTo == "calorie [th]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1000000000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "ton-of-TNT-equivalent" && valueTo == "calorie [mean]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 998563252.68137
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "ton-of-TNT-equivalent" && valueTo == "electronvolt") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 2.6114468001975E+28
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "ton-of-TNT-equivalent" && valueTo == "erg") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 4.184E+16
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "ton-of-TNT-equivalent" && valueTo == "foot-poundal") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 99287828152.323
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "ton-of-TNT-equivalent" && valueTo == "foot-pound-force") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 3085959914.9738
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "ton-of-TNT-equivalent" && valueTo == "inch-pound-force") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 37031520390.913
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "ton-of-TNT-equivalent" && valueTo == "joule") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 4184000000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "ton-of-TNT-equivalent" && valueTo == "megajoule") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 4184
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "ton-of-TNT-equivalent" && valueTo == "kilocalorie [IT]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 999331.23148944
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "ton-of-TNT-equivalent" && valueTo == "kilocalorie [th]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1000000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "ton-of-TNT-equivalent" && valueTo == "kilocalorie [mean]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 998563.25268137
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "ton-of-TNT-equivalent" && valueTo == "kilowatt-hour") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1162.2222222222
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "ton-of-TNT-equivalent" && valueTo == "quad") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 3.9656662774298E-9
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "ton-of-TNT-equivalent" && valueTo == "therm (EC)") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 39.656512425834
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "ton-of-TNT-equivalent" && valueTo == "therm (U.S.)") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 39.666137026405
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "ton-of-TNT-equivalent" && valueTo == "ton-of-coal-equivalent") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.14276160449849
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "ton-of-TNT-equivalent" && valueTo == "ton-of-oil-equivalent") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 0.099933123148944
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "ton-of-TNT-equivalent" && valueTo == "ton-of-TNT-equivalent") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "ton-of-TNT-equivalent" && valueTo == "watt-hour") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1162222.2222222
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "ton-of-TNT-equivalent" && valueTo == "watt-second") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 4184000000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }

/////////


            if (valueFrom == "watt-hour" && valueTo == "calorie [IT]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "watt-hour" && valueTo == "calorie [th]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "watt-hour" && valueTo == "calorie [mean]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 10000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "watt-hour" && valueTo == "electronvolt") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 35.27396
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "watt-hour" && valueTo == "erg") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1000000000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "watt-hour" && valueTo == "foot-poundal") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 2.2046226218
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "watt-hour" && valueTo == "foot-pound-force") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "watt-hour" && valueTo == "inch-pound-force") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "watt-hour" && valueTo == "joule") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "watt-hour" && valueTo == "megajoule") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 10000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "watt-hour" && valueTo == "kilocalorie [IT]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 35.27396
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "watt-hour" && valueTo == "kilocalorie [th]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1000000000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "watt-hour" && valueTo == "kilocalorie [mean]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 2.2046226218
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "watt-hour" && valueTo == "kilowatt-hour") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "watt-hour" && valueTo == "quad") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 3.968320164996E-18
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "watt-hour" && valueTo == "therm (EC)") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "watt-hour" && valueTo == "therm (U.S.)") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "watt-hour" && valueTo == "ton-of-coal-equivalent") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 10000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "watt-hour" && valueTo == "ton-of-oil-equivalent") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 35.27396
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "watt-hour" && valueTo == "ton-of-TNT-equivalent") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1000000000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "watt-hour" && valueTo == "watt-hour") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 2.2046226218
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "watt-hour" && valueTo == "watt-second") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }




            if (valueFrom == "watt-second" && valueTo == "calorie [IT]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "watt-second" && valueTo == "calorie [th]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "watt-second" && valueTo == "calorie [mean]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 10000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "watt-second" && valueTo == "electronvolt") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 35.27396
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "watt-second" && valueTo == "erg") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1000000000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "watt-second" && valueTo == "foot-poundal") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 2.2046226218
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "watt-second" && valueTo == "foot-pound-force") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "watt-second" && valueTo == "inch-pound-force") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "watt-second" && valueTo == "joule") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "watt-second" && valueTo == "megajoule") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 10000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "watt-second" && valueTo == "kilocalorie [IT]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 35.27396
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "watt-second" && valueTo == "kilocalorie [th]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1000000000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "watt-second" && valueTo == "kilocalorie [mean]") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 2.2046226218
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "watt-second" && valueTo == "kilowatt-hour") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "watt-second" && valueTo == "quad") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 3.968320164996E-18
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "watt-second" && valueTo == "therm (EC)") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "watt-second" && valueTo == "therm (U.S.)") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "watt-second" && valueTo == "ton-of-coal-equivalent") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 10000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "watt-second" && valueTo == "ton-of-oil-equivalent") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 35.27396
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "watt-second" && valueTo == "ton-of-TNT-equivalent") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1000000000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "watt-second" && valueTo == "watt-hour") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 2.2046226218
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }
            if (valueFrom == "watt-second" && valueTo == "watt-second") {
                val from: Float = et_from.text.toString().toFloat()
                Log.d(TAG, "onCreate: FT $valueFrom : $valueTo")
                val result = from * 1000
                textview_to.text = result.toString()
                result_showtext.text = result.toString()
            }


        }


    }
}