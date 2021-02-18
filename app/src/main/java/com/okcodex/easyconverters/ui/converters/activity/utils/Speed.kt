package com.okcodex.easyconverters.ui.converters.activity.utils

import android.util.Log
import android.widget.TextView

class Speed {

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

            if (valueFrom == "CENTIMETER PER SECOND" && valueTo == "CENTIMETER PER SECOND") {
                getValue(1.0)
            }
            if (valueFrom == "CENTIMETER PER SECOND" && valueTo == "CENTIMETER PER MINUTE") {
                getValue(59.99999988)
            }
            if (valueFrom == "CENTIMETER PER SECOND" && valueTo == "FOOT PER HOUR") {
                getValue(118.11023157046)
            }
            if (valueFrom == "CENTIMETER PER SECOND" && valueTo == "FOOT PER MINUTES") {
                getValue(1.9685039370079)
            }
            if (valueFrom == "CENTIMETER PER SECOND" && valueTo == "FOOT PER SECOND") {
                getValue(0.032808398950131)
            }
            if (valueFrom == "CENTIMETER PER SECOND" && valueTo == "INCH PER MINUTE") {
                getValue(23.622065844146)
            }
            if (valueFrom == "CENTIMETER PER SECOND" && valueTo == "INCH PER SECOND") {
                getValue(0.39370078740157)
            }
            if (valueFrom == "CENTIMETER PER SECOND" && valueTo == "KILOMETRE PER HOUR") {
                getValue(0.03599999712)
            }
            if (valueFrom == "CENTIMETER PER SECOND" && valueTo == "KILOMETRE PER SECOND") {
                getValue(0.00001)
            }
            if (valueFrom == "CENTIMETER PER SECOND" && valueTo == "METER PER HOUR") {
                getValue(35.99999712)
            }
            if (valueFrom == "CENTIMETER PER SECOND" && valueTo == "METER PER MINUTE") {
                getValue(0.5998800239952)
            }
            if (valueFrom == "CENTIMETER PER SECOND" && valueTo == "METER PER SECOND") {
                getValue(0.01)
            }
            if (valueFrom == "CENTIMETER PER SECOND" && valueTo == "YARD PER HOUR") {
                getValue(39.370078740157)
            }
            if (valueFrom == "CENTIMETER PER SECOND" && valueTo == "YARD PER MINUTE") {
                getValue(0.65616797900262)
            }
            if (valueFrom == "CENTIMETER PER SECOND" && valueTo == "YARD PER SECOND") {
                getValue(0.01)
            }
            if (valueFrom == "CENTIMETER PER SECOND" && valueTo == "MILE PER HOUR") {
                getValue(0.022369362920544)
            }
            if (valueFrom == "CENTIMETER PER SECOND" && valueTo == "MILE PER MINUTE") {
                getValue(0.0003728227153424)
            }
            if (valueFrom == "CENTIMETER PER SECOND" && valueTo == "MILE PER SECOND") {
                getValue(0.0000062137119223733)
            }


            //CENTIMETER PER MINUTE

            if (valueFrom == "CENTIMETER PER MINUTE" && valueTo == "CENTIMETER PER SECOND") {
                getValue(0.0166666667)
            }
            if (valueFrom == "CENTIMETER PER MINUTE" && valueTo == "CENTIMETER PER MINUTE") {
                getValue(1.0)
            }
            if (valueFrom == "CENTIMETER PER MINUTE" && valueTo == "FOOT PER HOUR") {
                getValue(1.9685038634447)
            }
            if (valueFrom == "CENTIMETER PER MINUTE" && valueTo == "FOOT PER MINUTES") {
                getValue(0.032808399015748)
            }
            if (valueFrom == "CENTIMETER PER MINUTE" && valueTo == "FOOT PER SECOND") {
                getValue(0.00054680665026247)
            }
            if (valueFrom == "CENTIMETER PER MINUTE" && valueTo == "INCH PER MINUTE") {
                getValue(0.39370109818984)
            }
            if (valueFrom == "CENTIMETER PER MINUTE" && valueTo == "INCH PER SECOND") {
                getValue(0.0065616798031496)
            }
            if (valueFrom == "CENTIMETER PER MINUTE" && valueTo == "KILOMETRE PER HOUR") {
                getValue(0.0005999999532)
            }
            if (valueFrom == "CENTIMETER PER MINUTE" && valueTo == "KILOMETRE PER SECOND") {
                getValue(0.000000166666667)
            }
            if (valueFrom == "CENTIMETER PER MINUTE" && valueTo == "METER PER HOUR") {
                getValue(0.5999999532)
            }
            if (valueFrom == "CENTIMETER PER MINUTE" && valueTo == "METER PER MINUTE") {
                getValue(0.009998000419916)
            }
            if (valueFrom == "CENTIMETER PER SECOND" && valueTo == "METER PER SECOND") {
                getValue(0.000166666667)
            }
            if (valueFrom == "CENTIMETER PER MINUTE" && valueTo == "MILE PER HOUR") {
                getValue(0.00037282271608805)
            }
            if (valueFrom == "CENTIMETER PER MINUTE" && valueTo == "MILE PER MINUTE") {
                getValue(0.0000062137119348008)
            }
            if (valueFrom == "CENTIMETER PER MINUTE" && valueTo == "MILE PER SECOND") {
                getValue(0.00000010356186558001)
            }
            if (valueFrom == "CENTIMETER PER MINUTE" && valueTo == "YARD PER HOUR") {
                getValue(0.65616798031496)
            }
            if (valueFrom == "CENTIMETER PER MINUTE" && valueTo == "YARD PER MINUTE") {
                getValue(0.010936133005249)
            }
            if (valueFrom == "CENTIMETER PER SECOND" && valueTo == "YARD PER SECOND") {
                getValue(.000166666667)
            }


            //FOOT PER HOUR

            if (valueFrom == "FOOT PER HOUR" && valueTo == "CENTIMETER PER SECOND") {
                getValue(0.008466667)
            }
            if (valueFrom == "FOOT PER HOUR" && valueTo == "CENTIMETER PER MINUTE") {
                getValue(0.508000018984)
            }
            if (valueFrom == "FOOT PER HOUR" && valueTo == "FOOT PER HOUR") {
                getValue(1.0)
            }
            if (valueFrom == "FOOT PER HOUR" && valueTo == "FOOT PER MINUTES") {
                getValue(0.016666667322835)
            }
            if (valueFrom == "FOOT PER HOUR" && valueTo == "FOOT PER SECOND") {
                getValue(0.00027777778871391)
            }
            if (valueFrom == "FOOT PER HOUR" && valueTo == "INCH PER MINUTE") {
                getValue(0.20000016535446)
            }
            if (valueFrom == "FOOT PER HOUR" && valueTo == "INCH PER SECOND") {
                getValue(0.0033333334645669)
            }
            if (valueFrom == "FOOT PER HOUR" && valueTo == "KILOMETRE PER HOUR") {
                getValue(0.000304799987616)
            }
            if (valueFrom == "FOOT PER HOUR" && valueTo == "KILOMETRE PER SECOND") {
                getValue(0.00000008466667)
            }
            if (valueFrom == "FOOT PER HOUR" && valueTo == "METER PER HOUR") {
                getValue(0.304799987616)
            }
            if (valueFrom == "FOOT PER HOUR" && valueTo == "METER PER MINUTE") {
                getValue(0.0050789844031194)
            }
            if (valueFrom == "FOOT PER HOUR" && valueTo == "METER PER SECOND") {
                getValue(0.00008466667)
            }
            if (valueFrom == "FOOT PER HOUR" && valueTo == "MILE PER HOUR") {
                getValue(0.00018939394685039)
            }
            if (valueFrom == "FOOT PER HOUR" && valueTo == "MILE PER MINUTE") {
                getValue(0.0000031565657808399)
            }
            if (valueFrom == "FOOT PER HOUR" && valueTo == "MILE PER SECOND") {
                getValue(0.000000052609429680665)
            }
            if (valueFrom == "FOOT PER HOUR" && valueTo == "YARD PER HOUR") {
                getValue(0.33333334645669)
            }
            if (valueFrom == "FOOT PER HOUR" && valueTo == "YARD PER MINUTE") {
                getValue(0.0055555557742782)
            }
            if (valueFrom == "FOOT PER HOUR" && valueTo == "YARD PER SECOND") {
                getValue(0.00008466667)
            }


//FOOT PER MINUTE


            if (valueFrom == "FOOT PER MINUTE" && valueTo == "CENTIMETER PER SECOND") {
                getValue(0.508)
            }
            if (valueFrom == "FOOT PER MINUTE" && valueTo == "CENTIMETER PER MINUTE") {
                getValue(30.47999993904)
            }
            if (valueFrom == "FOOT PER MINUTE" && valueTo == "FOOT PER HOUR") {
                getValue(59.999997637795)
            }
            if (valueFrom == "FOOT PER MINUTE" && valueTo == "FOOT PER MINUTES") {
                getValue(1.0)
            }
            if (valueFrom == "FOOT PER MINUTE" && valueTo == "FOOT PER SECOND") {
                getValue(0.016666666666667)
            }
            if (valueFrom == "FOOT PER MINUTE" && valueTo == "INCH PER MINUTE") {
                getValue(12.000009448826)
            }
            if (valueFrom == "FOOT PER MINUTE" && valueTo == "INCH PER SECOND") {
                getValue(0.2)
            }
            if (valueFrom == "FOOT PER MINUTE" && valueTo == "KILOMETRE PER HOUR") {
                getValue(0.01828799853696)
            }
            if (valueFrom == "FOOT PER MINUTE" && valueTo == "KILOMETRE PER SECOND") {
                getValue(0.00000508)
            }
            if (valueFrom == "FOOT PER MINUTE" && valueTo == "METER PER HOUR") {
                getValue(18.28799853696)
            }
            if (valueFrom == "FOOT PER MINUTE" && valueTo == "METER PER MINUTE") {
                getValue(0.30473905218956)
            }
            if (valueFrom == "FOOT PER MINUTE" && valueTo == "METER PER SECOND") {
                getValue(0.00508)
            }
            if (valueFrom == "FOOT PER MINUTE" && valueTo == "MILE PER HOUR") {
                getValue(0.011363636363636)
            }
            if (valueFrom == "FOOT PER MINUTE" && valueTo == "MILE PER MINUTE") {
                getValue(0.00018939393939394)
            }
            if (valueFrom == "FOOT PER MINUTE" && valueTo == "MILE PER SECOND") {
                getValue(0.0000031565656565657)
            }
            if (valueFrom == "FOOT PER MINUTE" && valueTo == "YARD PER HOUR") {
                getValue(20.0)
            }
            if (valueFrom == "FOOT PER MINUTE" && valueTo == "YARD PER MINUTE") {
                getValue(0.33333333333333)
            }
            if (valueFrom == "FOOT PER MINUTE" && valueTo == "YARD PER SECOND") {
                getValue(0.00508)
            }

//FOOT PER SECOND

            if (valueFrom == "FOOT PER SECOND" && valueTo == "CENTIMETER PER SECOND") {
                getValue(30.48)
            }
            if (valueFrom == "FOOT PER SECOND" && valueTo == "CENTIMETER PER MINUTE") {
                getValue(1828.7999963424)
            }
            if (valueFrom == "FOOT PER SECOND" && valueTo == "FOOT PER HOUR") {
                getValue(3599.9998582677)
            }
            if (valueFrom == "FOOT PER SECOND" && valueTo == "FOOT PER MINUTES") {
                getValue(60.0)
            }
            if (valueFrom == "FOOT PER SECOND" && valueTo == "FOOT PER SECOND") {
                getValue(1.0)
            }
            if (valueFrom == "FOOT PER SECOND" && valueTo == "INCH PER MINUTE") {
                getValue(720.00056692958)
            }
            if (valueFrom == "FOOT PER SECOND" && valueTo == "INCH PER SECOND") {
                getValue(12.0)
            }
            if (valueFrom == "FOOT PER SECOND" && valueTo == "KILOMETRE PER HOUR") {
                getValue(1.0972799122176)
            }
            if (valueFrom == "FOOT PER SECOND" && valueTo == "KILOMETRE PER SECOND") {
                getValue(0.0003048)
            }
            if (valueFrom == "FOOT PER SECOND" && valueTo == "METER PER HOUR") {
                getValue(1097.2799122176)
            }
            if (valueFrom == "FOOT PER SECOND" && valueTo == "METER PER MINUTE") {
                getValue(18.284343131374)
            }
            if (valueFrom == "FOOT PER SECOND" && valueTo == "METER PER SECOND") {
                getValue(0.3048)
            }
            if (valueFrom == "FOOT PER SECOND" && valueTo == "MILE PER HOUR") {
                getValue(0.68181818181818)
            }
            if (valueFrom == "FOOT PER SECOND" && valueTo == "MILE PER MINUTE") {
                getValue(0.011363636363636)
            }
            if (valueFrom == "FOOT PER SECOND" && valueTo == "MILE PER SECOND") {
                getValue(0.00018939393939394)
            }
            if (valueFrom == "FOOT PER SECOND" && valueTo == "YARD PER HOUR") {
                getValue(1200.0)
            }
            if (valueFrom == "FOOT PER SECOND" && valueTo == "YARD PER MINUTE") {
                getValue(20.0)
            }
            if (valueFrom == "FOOT PER SECOND" && valueTo == "YARD PER SECOND") {
                getValue(0.3048)
            }
//INCH PER M1NUTE
            if (valueFrom == "INCH PER M1NUTE" && valueTo == "CENTIMETER PER SECOND") {
                getValue(0.0423333)
            }
            if (valueFrom == "INCH PER M1NUTE" && valueTo == "CENTIMETER PER MINUTE") {
                getValue(2.53999799492)
            }
            if (valueFrom == "INCH PER M1NUTE" && valueTo == "FOOT PER HOUR") {
                getValue(3599.9998582677)
            }
            if (valueFrom == "INCH PER M1NUTE" && valueTo == "FOOT PER MINUTES") {
                getValue(0.083333267716535)
            }
            if (valueFrom == "INCH PER M1NUTE" && valueTo == "FOOT PER SECOND") {
                getValue(0.0013888877952756)
            }
            if (valueFrom == "INCH PER M1NUTE" && valueTo == "INCH PER MINUTE") {
                getValue(1.0)
            }
            if (valueFrom == "INCH PER M1NUTE" && valueTo == "INCH PER SECOND") {
                getValue(0.016666653543307)
            }
            if (valueFrom == "INCH PER M1NUTE" && valueTo == "KILOMETRE PER HOUR") {
                getValue(0.0015239986780801)
            }
            if (valueFrom == "INCH PER M1NUTE" && valueTo == "KILOMETRE PER SECOND") {
                getValue(0.000000423333)
            }
            if (valueFrom == "INCH PER M1NUTE" && valueTo == "METER PER HOUR") {
                getValue(1.5239986780801)
            }
            if (valueFrom == "INCH PER M1NUTE" && valueTo == "METER PER MINUTE") {
                getValue(0.025394901019796)
            }
            if (valueFrom == "INCH PER M1NUTE" && valueTo == "METER PER SECOND") {
                getValue(0.000423333)
            }
            if (valueFrom == "INCH PER M1NUTE" && valueTo == "MILE PER HOUR") {
                getValue(0.00094696895132427)
            }
            if (valueFrom == "INCH PER M1NUTE" && valueTo == "MILE PER MINUTE") {
                getValue(0.000015782815855404)
            }
            if (valueFrom == "INCH PER M1NUTE" && valueTo == "MILE PER SECOND") {
                getValue(0.00000026304693092341)
            }
            if (valueFrom == "INCH PER M1NUTE" && valueTo == "YARD PER HOUR") {
                getValue(1.666665354330)
            }
            if (valueFrom == "INCH PER M1NUTE" && valueTo == "YARD PER MINUTE") {
                getValue(0.027777755905512)
            }
            if (valueFrom == "INCH PER M1NUTE" && valueTo == "YARD PER SECOND") {
                getValue(0.000423333)
            }
//INCH PER SECOND

            if (valueFrom == "INCH PER SECOND" && valueTo == "CENTIMETER PER SECOND") {
                getValue(2.54)
            }
            if (valueFrom == "INCH PER SECOND" && valueTo == "CENTIMETER PER MINUTE") {
                getValue(152.3999996952)
            }
            if (valueFrom == "INCH PER SECOND" && valueTo == "FOOT PER HOUR") {
                getValue(299.99998818898)
            }
            if (valueFrom == "INCH PER SECOND" && valueTo == "FOOT PER MINUTES") {
                getValue(5.0)
            }
            if (valueFrom == "INCH PER SECOND" && valueTo == "FOOT PER SECOND") {
                getValue(0.083333333333333)
            }
            if (valueFrom == "INCH PER SECOND" && valueTo == "INCH PER MINUTE") {
                getValue(60.000047244132)
            }
            if (valueFrom == "INCH PER SECOND" && valueTo == "INCH PER SECOND") {
                getValue(1.0)
            }
            if (valueFrom == "INCH PER SECOND" && valueTo == "KILOMETRE PER HOUR") {
                getValue(0.091439992684801)
            }
            if (valueFrom == "INCH PER SECOND" && valueTo == "KILOMETRE PER SECOND") {
                getValue(0.0000254)
            }
            if (valueFrom == "INCH PER SECOND" && valueTo == "METER PER HOUR") {
                getValue(91.439992684801)
            }
            if (valueFrom == "INCH PER SECOND" && valueTo == "METER PER MINUTE") {
                getValue(1.5236952609478)
            }
            if (valueFrom == "INCH PER SECOND" && valueTo == "METER PER SECOND") {
                getValue(0.0254)
            }
            if (valueFrom == "INCH PER SECOND" && valueTo == "MILE PER HOUR") {
                getValue(0.056818181818182)
            }
            if (valueFrom == "INCH PER SECOND" && valueTo == "MILE PER MINUTE") {
                getValue(0.0009469696969697)
            }
            if (valueFrom == "INCH PER SECOND" && valueTo == "MILE PER SECOND") {
                getValue(0.000015782828282828)
            }
            if (valueFrom == "INCH PER SECOND" && valueTo == "YARD PER HOUR") {
                getValue(100.0)
            }
            if (valueFrom == "INCH PER SECOND" && valueTo == "YARD PER MINUTE") {
                getValue(1.6666666666667)
            }
            if (valueFrom == "INCH PER SECOND" && valueTo == "YARD PER SECOND") {
                getValue(0.0254)
            }
//KILOMETRE PER HOUR
            if (valueFrom == "KILOMETRE PER HOUR" && valueTo == "CENTIMETER PER SECOND") {
                getValue(2.54)
            }
            if (valueFrom == "KILOMETRE PER HOUR" && valueTo == "CENTIMETER PER MINUTE") {
                getValue(152.3999996952)
            }
            if (valueFrom == "KILOMETRE PER HOUR" && valueTo == "FOOT PER HOUR") {
                getValue(299.99998818898)
            }
            if (valueFrom == "KILOMETRE PER HOUR" && valueTo == "FOOT PER MINUTES") {
                getValue(5.0)
            }
            if (valueFrom == "KILOMETRE PER HOUR" && valueTo == "FOOT PER SECOND") {
                getValue(0.083333333333333)
            }
            if (valueFrom == "KILOMETRE PER HOUR" && valueTo == "INCH PER MINUTE") {
                getValue(60.000047244132)
            }
            if (valueFrom == "KILOMETRE PER HOUR" && valueTo == "INCH PER SECOND") {
                getValue(1.0)
            }
            if (valueFrom == "KILOMETRE PER HOUR" && valueTo == "KILOMETRE PER HOUR") {
                getValue(0.091439992684801)
            }
            if (valueFrom == "KILOMETRE PER HOUR" && valueTo == "KILOMETRE PER SECOND") {
                getValue(0.0000254)
            }
            if (valueFrom == "KILOMETRE PER HOUR" && valueTo == "METER PER HOUR") {
                getValue(91.439992684801)
            }
            if (valueFrom == "KILOMETRE PER HOUR" && valueTo == "METER PER MINUTE") {
                getValue(1.5236952609478)
            }
            if (valueFrom == "KILOMETRE PER HOUR" && valueTo == "METER PER SECOND") {
                getValue(0.0254)
            }
            if (valueFrom == "KILOMETRE PER HOUR" && valueTo == "MILE PER HOUR") {
                getValue(0.056818181818182)
            }
            if (valueFrom == "KILOMETRE PER HOUR" && valueTo == "MILE PER MINUTE") {
                getValue(0.0009469696969697)
            }
            if (valueFrom == "KILOMETRE PER HOUR" && valueTo == "MILE PER SECOND") {
                getValue(0.000015782828282828)
            }
            if (valueFrom == "KILOMETRE PER HOUR" && valueTo == "YARD PER HOUR") {
                getValue(100.0)
            }
            if (valueFrom == "KILOMETRE PER HOUR" && valueTo == "YARD PER MINUTE") {
                getValue(1.6666666666667)
            }
            if (valueFrom == "KILOMETRE PER HOUR" && valueTo == "YARD PER SECOND") {
                getValue(0.0254)
            }
//KILOMETRE PER SECOND
            if (valueFrom == "KILOMETRE PER SECOND" && valueTo == "CENTIMETER PER SECOND") {
                getValue(2.54)
            }
            if (valueFrom == "KILOMETRE PER SECOND" && valueTo == "CENTIMETER PER MINUTE") {
                getValue(152.3999996952)
            }
            if (valueFrom == "KILOMETRE PER SECOND" && valueTo == "FOOT PER HOUR") {
                getValue(299.99998818898)
            }
            if (valueFrom == "KILOMETRE PER SECOND" && valueTo == "FOOT PER MINUTES") {
                getValue(5.0)
            }
            if (valueFrom == "KILOMETRE PER SECOND" && valueTo == "FOOT PER SECOND") {
                getValue(0.083333333333333)
            }
            if (valueFrom == "KILOMETRE PER SECOND" && valueTo == "INCH PER MINUTE") {
                getValue(60.000047244132)
            }
            if (valueFrom == "KILOMETRE PER SECOND" && valueTo == "INCH PER SECOND") {
                getValue(1.0)
            }
            if (valueFrom == "KILOMETRE PER SECOND" && valueTo == "KILOMETRE PER HOUR") {
                getValue(0.091439992684801)
            }
            if (valueFrom == "KILOMETRE PER SECOND" && valueTo == "KILOMETRE PER SECOND") {
                getValue(0.0000254)
            }
            if (valueFrom == "KILOMETRE PER SECOND" && valueTo == "METER PER HOUR") {
                getValue(91.439992684801)
            }
            if (valueFrom == "KILOMETRE PER SECOND" && valueTo == "METER PER MINUTE") {
                getValue(1.5236952609478)
            }
            if (valueFrom == "KILOMETRE PER SECOND" && valueTo == "METER PER SECOND") {
                getValue(0.0254)
            }
            if (valueFrom == "KILOMETRE PER SECOND" && valueTo == "MILE PER HOUR") {
                getValue(0.056818181818182)
            }
            if (valueFrom == "KILOMETRE PER SECOND" && valueTo == "MILE PER MINUTE") {
                getValue(0.0009469696969697)
            }
            if (valueFrom == "KILOMETRE PER SECOND" && valueTo == "MILE PER SECOND") {
                getValue(0.000015782828282828)
            }
            if (valueFrom == "KILOMETRE PER SECOND" && valueTo == "YARD PER HOUR") {
                getValue(100.0)
            }
            if (valueFrom == "KILOMETRE PER SECOND" && valueTo == "YARD PER MINUTE") {
                getValue(1.6666666666667)
            }
            if (valueFrom == "KILOMETRE PER SECOND" && valueTo == "YARD PER SECOND") {
                getValue(0.0254)
            }

//METER PER HOUR
            if (valueFrom == "METER PER HOUR" && valueTo == "CENTIMETER PER SECOND") {
                getValue(0.02777778)
            }
            if (valueFrom == "METER PER HOUR" && valueTo == "CENTIMETER PER MINUTE") {
                getValue(1.6666667966667)
            }
            if (valueFrom == "METER PER HOUR" && valueTo == "FOOT PER HOUR") {
                getValue(3.2808400283134)
            }
            if (valueFrom == "METER PER HOUR" && valueTo == "FOOT PER MINUTES") {
                getValue(0.054680669291339)
            }
            if (valueFrom == "METER PER HOUR" && valueTo == "FOOT PER SECOND") {
                getValue(0.00091134448818898)
            }
            if (valueFrom == "METER PER HOUR" && valueTo == "INCH PER MINUTE") {
                getValue(0.65616854816421)
            }
            if (valueFrom == "METER PER HOUR" && valueTo == "INCH PER SECOND") {
                getValue(0.010936133858268)
            }
            if (valueFrom == "METER PER HOUR" && valueTo == "KILOMETRE PER HOUR") {
                getValue(0.001)
            }
            if (valueFrom == "METER PER HOUR" && valueTo == "KILOMETRE PER SECOND") {
                getValue(0.0000002777778)
            }
            if (valueFrom == "METER PER HOUR" && valueTo == "METER PER HOUR") {
                getValue(1.0)
            }
            if (valueFrom == "METER PER HOUR" && valueTo == "METER PER MINUTE") {
                getValue(0.016663335332933)
            }
            if (valueFrom == "METER PER HOUR" && valueTo == "METER PER SECOND") {
                getValue(0.0254)
            }
            if (valueFrom == "METER PER HOUR" && valueTo == "MILE PER HOUR") {
                getValue(0.00062137124194703)
            }
            if (valueFrom == "METER PER HOUR" && valueTo == "MILE PER MINUTE") {
                getValue(0.000010356187365784)
            }
            if (valueFrom == "METER PER HOUR" && valueTo == "MILE PER SECOND") {
                getValue(0.00000017260312276306)
            }
            if (valueFrom == "METER PER HOUR" && valueTo == "YARD PER HOUR") {
                getValue(1.0936133858268)
            }
            if (valueFrom == "METER PER HOUR" && valueTo == "YARD PER MINUTE") {
                getValue(0.01822688976378)
            }
            if (valueFrom == "METER PER HOUR" && valueTo == "YARD PER SECOND") {
                getValue(0.0002777778)
            }

//METER PER MINUTE
            if (valueFrom == "METER PER MINUTE" && valueTo == "CENTIMETER PER SECOND") {
                getValue(100.01999979996)
            }
            if (valueFrom == "METER PER MINUTE" && valueTo == "CENTIMETER PER MINUTE") {
                getValue(1.667)
            }
            if (valueFrom == "METER PER MINUTE" && valueTo == "FOOT PER HOUR") {
                getValue(196.88975602796)
            }
            if (valueFrom == "METER PER MINUTE" && valueTo == "FOOT PER MINUTES") {
                getValue(3.2814960629921)
            }
            if (valueFrom == "METER PER MINUTE" && valueTo == "FOOT PER SECOND") {
                getValue(0.054691601049869)
            }
            if (valueFrom == "METER PER MINUTE" && valueTo == "INCH PER MINUTE") {
                getValue(39.377983762192)
            }
            if (valueFrom == "METER PER MINUTE" && valueTo == "INCH PER SECOND") {
                getValue(0.65629921259843)
            }
            if (valueFrom == "METER PER MINUTE" && valueTo == "KILOMETRE PER HOUR") {
                getValue(0.06001199519904)
            }
            if (valueFrom == "METER PER MINUTE" && valueTo == "KILOMETRE PER SECOND") {
                getValue(0.00001667)
            }
            if (valueFrom == "METER PER MINUTE" && valueTo == "METER PER HOUR") {
                getValue(60.01199519904)
            }
            if (valueFrom == "METER PER MINUTE" && valueTo == "METER PER MINUTE") {
                getValue(1.0)
            }
            if (valueFrom == "METER PER MINUTE" && valueTo == "METER PER SECOND") {
                getValue(0.01667)
            }
            if (valueFrom == "METER PER MINUTE" && valueTo == "MILE PER HOUR") {
                getValue(0.037289727988547)
            }
            if (valueFrom == "METER PER MINUTE" && valueTo == "MILE PER MINUTE") {
                getValue(0.00062149546647578)
            }
            if (valueFrom == "METER PER MINUTE" && valueTo == "MILE PER SECOND") {
                getValue(0.000010358257774596)
            }
            if (valueFrom == "METER PER MINUTE" && valueTo == "YARD PER HOUR") {
                getValue(65.629921259843)
            }
            if (valueFrom == "METER PER MINUTE" && valueTo == "YARD PER MINUTE") {
                getValue(1.0938320209974)
            }
            if (valueFrom == "METER PER MINUTE" && valueTo == "YARD PER SECOND") {
                getValue(0.01667)
            }
//METER PER SECOND
            if (valueFrom == "METER PER SECOND" && valueTo == "CENTIMETER PER SECOND") {
                getValue(100.0)
            }
            if (valueFrom == "METER PER SECOND" && valueTo == "CENTIMETER PER MINUTE") {
                getValue(5999.999988)
            }
            if (valueFrom == "METER PER SECOND" && valueTo == "FOOT PER HOUR") {
                getValue(11811.023157046)
            }
            if (valueFrom == "METER PER SECOND" && valueTo == "FOOT PER MINUTES") {
                getValue(196.85039370079)
            }
            if (valueFrom == "METER PER SECOND" && valueTo == "FOOT PER SECOND") {
                getValue(3.2808398950131)
            }
            if (valueFrom == "METER PER SECOND" && valueTo == "INCH PER MINUTE") {
                getValue(2362.2065844146)
            }
            if (valueFrom == "METER PER SECOND" && valueTo == "INCH PER SECOND") {
                getValue(39.370078740157)
            }
            if (valueFrom == "METER PER SECOND" && valueTo == "KILOMETRE PER HOUR") {
                getValue(3.599999712)
            }
            if (valueFrom == "METER PER SECOND" && valueTo == "KILOMETRE PER SECOND") {
                getValue(0.001)
            }
            if (valueFrom == "METER PER SECOND" && valueTo == "METER PER HOUR") {
                getValue(3599.999712)
            }
            if (valueFrom == "METER PER SECOND" && valueTo == "METER PER MINUTE") {
                getValue(59.98800239952)
            }
            if (valueFrom == "METER PER SECOND" && valueTo == "METER PER SECOND") {
                getValue(1.0)
            }
            if (valueFrom == "METER PER SECOND" && valueTo == "MILE PER HOUR") {
                getValue(2.2369362920544)
            }
            if (valueFrom == "METER PER SECOND" && valueTo == "MILE PER MINUTE") {
                getValue(0.03728227153424)
            }
            if (valueFrom == "METER PER SECOND" && valueTo == "MILE PER SECOND") {
                getValue(0.00062137119223733)
            }
            if (valueFrom == "METER PER SECOND" && valueTo == "YARD PER HOUR") {
                getValue(3937.0078740157)
            }
            if (valueFrom == "METER PER SECOND" && valueTo == "YARD PER MINUTE") {
                getValue(65.616797900262)
            }
            if (valueFrom == "METER PER SECOND" && valueTo == "YARD PER SECOND") {
                getValue(1.09361)
            }

//YARD PER HOUR
            if (valueFrom == "YARD PER HOUR" && valueTo == "CENTIMETER PER SECOND") {
                getValue(0.0254)
            }
            if (valueFrom == "YARD PER HOUR" && valueTo == "CENTIMETER PER MINUTE") {
                getValue(1.523999996952)
            }
            if (valueFrom == "YARD PER HOUR" && valueTo == "FOOT PER HOUR") {
                getValue(2.9999998818898)
            }
            if (valueFrom == "YARD PER HOUR" && valueTo == "FOOT PER MINUTES") {
                getValue(0.05)
            }
            if (valueFrom == "YARD PER HOUR" && valueTo == "FOOT PER SECOND") {
                getValue(0.00083333333333333)
            }
            if (valueFrom == "YARD PER HOUR" && valueTo == "INCH PER MINUTE") {
                getValue(0.60000047244132)
            }
            if (valueFrom == "YARD PER HOUR" && valueTo == "INCH PER SECOND") {
                getValue(0.01)
            }
            if (valueFrom == "YARD PER HOUR" && valueTo == "KILOMETRE PER HOUR") {
                getValue(0.00091439992684801)
            }
            if (valueFrom == "YARD PER HOUR" && valueTo == "KILOMETRE PER SECOND") {
                getValue(0.000000254)
            }
            if (valueFrom == "YARD PER HOUR" && valueTo == "METER PER HOUR") {
                getValue(0.91439992684801)
            }
            if (valueFrom == "YARD PER HOUR" && valueTo == "METER PER MINUTE") {
                getValue(0.015236952609478)
            }
            if (valueFrom == "YARD PER HOUR" && valueTo == "METER PER SECOND") {
                getValue(0.000254)
            }
            if (valueFrom == "YARD PER HOUR" && valueTo == "MILE PER HOUR") {
                getValue(0.00056818181818182)
            }
            if (valueFrom == "YARD PER HOUR" && valueTo == "MILE PER MINUTE") {
                getValue(0.000009469696969697)
            }
            if (valueFrom == "YARD PER HOUR" && valueTo == "MILE PER SECOND") {
                getValue(0.00000015782828282828)
            }
            if (valueFrom == "YARD PER HOUR" && valueTo == "YARD PER HOUR") {
                getValue(1.0)
            }
            if (valueFrom == "YARD PER HOUR" && valueTo == "YARD PER MINUTE") {
                getValue(0.016666666666667)
            }
            if (valueFrom == "YARD PER HOUR" && valueTo == "YARD PER SECOND") {
                getValue(0.000254)
            }
//YARD PER MINUTE
            if (valueFrom == "YARD PER MINUTE" && valueTo == "CENTIMETER PER SECOND") {
                getValue(1.524)
            }
            if (valueFrom == "YARD PER MINUTE" && valueTo == "CENTIMETER PER MINUTE") {
                getValue(91.43999981712)
            }
            if (valueFrom == "YARD PER MINUTE" && valueTo == "FOOT PER HOUR") {
                getValue(179.99999291339)
            }
            if (valueFrom == "YARD PER MINUTE" && valueTo == "FOOT PER MINUTES") {
                getValue(3.0)
            }
            if (valueFrom == "YARD PER MINUTE" && valueTo == "FOOT PER SECOND") {
                getValue(0.05)
            }
            if (valueFrom == "YARD PER MINUTE" && valueTo == "INCH PER MINUTE") {
                getValue(36.000028346479)
            }
            if (valueFrom == "YARD PER MINUTE" && valueTo == "INCH PER SECOND") {
                getValue(0.6)
            }
            if (valueFrom == "YARD PER MINUTE" && valueTo == "KILOMETRE PER HOUR") {
                getValue(0.05486399561088)
            }
            if (valueFrom == "YARD PER MINUTE" && valueTo == "KILOMETRE PER SECOND") {
                getValue(0.00001524)
            }
            if (valueFrom == "YARD PER MINUTE" && valueTo == "METER PER HOUR") {
                getValue(54.86399561088)
            }
            if (valueFrom == "YARD PER MINUTE" && valueTo == "METER PER MINUTE") {
                getValue(0.91421715656869)
            }
            if (valueFrom == "YARD PER MINUTE" && valueTo == "METER PER SECOND") {
                getValue(0.01524)
            }
            if (valueFrom == "YARD PER MINUTE" && valueTo == "MILE PER HOUR") {
                getValue(0.034090909090909)
            }
            if (valueFrom == "YARD PER MINUTE" && valueTo == "MILE PER MINUTE") {
                getValue(0.00056818181818182)
            }
            if (valueFrom == "YARD PER MINUTE" && valueTo == "MILE PER SECOND") {
                getValue(0.000009469696969697)
            }
            if (valueFrom == "YARD PER MINUTE" && valueTo == "YARD PER HOUR") {
                getValue(60.0)
            }
            if (valueFrom == "YARD PER MINUTE" && valueTo == "YARD PER MINUTE") {
                getValue(1.0)
            }
            if (valueFrom == "YARD PER MINUTE" && valueTo == "YARD PER SECOND") {
                getValue(0.01524)
            }

//YARD PER SECOND
            if (valueFrom == "YARD PER SECOND" && valueTo == "CENTIMETER PER SECOND") {
                getValue(1.0)
            }
            if (valueFrom == "YARD PER SECOND" && valueTo == "CENTIMETER PER MINUTE") {
                getValue(5999.999988)
            }
            if (valueFrom == "YARD PER SECOND" && valueTo == "FOOT PER HOUR") {
                getValue(11811.023157046)
            }
            if (valueFrom == "YARD PER SECOND" && valueTo == "FOOT PER MINUTES") {
                getValue(196.85039370079)
            }
            if (valueFrom == "YARD PER SECOND" && valueTo == "FOOT PER SECOND") {
                getValue(3.2808398950131)
            }
            if (valueFrom == "YARD PER SECOND" && valueTo == "INCH PER MINUTE") {
                getValue(2362.2065844146)
            }
            if (valueFrom == "YARD PER SECOND" && valueTo == "INCH PER SECOND") {
                getValue(39.370078740157)
            }
            if (valueFrom == "YARD PER SECOND" && valueTo == "KILOMETRE PER HOUR") {
                getValue(3.599999712)
            }
            if (valueFrom == "YARD PER SECOND" && valueTo == "KILOMETRE PER SECOND") {
                getValue(0.001)
            }
            if (valueFrom == "YARD PER SECOND" && valueTo == "METER PER HOUR") {
                getValue(3599.999712)
            }
            if (valueFrom == "YARD PER SECOND" && valueTo == "METER PER MINUTE") {
                getValue(59.98800239952)
            }
            if (valueFrom == "YARD PER SECOND" && valueTo == "METER PER SECOND") {
                getValue(1.0)
            }
            if (valueFrom == "YARD PER SECOND" && valueTo == "MILE PER HOUR") {
                getValue(2.2369362920544)
            }
            if (valueFrom == "YARD PER SECOND" && valueTo == "MILE PER MINUTE") {
                getValue(0.03728227153424)
            }
            if (valueFrom == "YARD PER SECOND" && valueTo == "MILE PER SECOND") {
                getValue(0.00062137119223733)
            }
            if (valueFrom == "YARD PER SECOND" && valueTo == "YARD PER HOUR") {
                getValue(3937.0078740157)
            }
            if (valueFrom == "YARD PER SECOND" && valueTo == "YARD PER MINUTE") {
                getValue(65.616797900262)
            }
            if (valueFrom == "YARD PER SECOND" && valueTo == "YARD PER SECOND") {
                getValue(1.09361)
            }


            //MILE PER HOUR
            if (valueFrom == "MILE PER HOUR" && valueTo == "CENTIMETER PER SECOND") {
                getValue(44.704)
            }
            if (valueFrom == "MILE PER HOUR" && valueTo == "CENTIMETER PER MINUTE") {
                getValue(2682.2399946355)
            }
            if (valueFrom == "MILE PER HOUR" && valueTo == "FOOT PER HOUR") {
                getValue(5279.999792126)
            }
            if (valueFrom == "MILE PER HOUR" && valueTo == "FOOT PER MINUTES") {
                getValue(88.0)
            }
            if (valueFrom == "MILE PER HOUR" && valueTo == "FOOT PER SECOND") {
                getValue(1.4666666666667)
            }
            if (valueFrom == "MILE PER HOUR" && valueTo == "INCH PER MINUTE") {
                getValue(1056.0008314967)
            }
            if (valueFrom == "MILE PER HOUR" && valueTo == "INCH PER SECOND") {
                getValue(17.6)
            }
            if (valueFrom == "MILE PER HOUR" && valueTo == "KILOMETRE PER HOUR") {
                getValue(1.6093438712525)
            }
            if (valueFrom == "MILE PER HOUR" && valueTo == "KILOMETRE PER SECOND") {
                getValue(0.00044704)
            }
            if (valueFrom == "MILE PER HOUR" && valueTo == "METER PER HOUR") {
                getValue(1609.3438712525)
            }
            if (valueFrom == "MILE PER HOUR" && valueTo == "METER PER MINUTE") {
                getValue(26.817036592681)
            }
            if (valueFrom == "MILE PER HOUR" && valueTo == "METER PER SECOND") {
                getValue(0.44704)
            }
            if (valueFrom == "MILE PER HOUR" && valueTo == "MILE PER HOUR") {
                getValue(1.0)
            }
            if (valueFrom == "MILE PER HOUR" && valueTo == "MILE PER MINUTE") {
                getValue(0.016666666666667)
            }
            if (valueFrom == "MILE PER HOUR" && valueTo == "MILE PER SECOND") {
                getValue(0.00027777777777778)
            }
            if (valueFrom == "MILE PER HOUR" && valueTo == "YARD PER HOUR") {
                getValue(1760.0)
            }
            if (valueFrom == "MILE PER HOUR" && valueTo == "YARD PER MINUTE") {
                getValue(29.333333333333)
            }
            if (valueFrom == "MILE PER HOUR" && valueTo == "YARD PER SECOND") {
                getValue(0.44704)
            }


            //MILE PER MINUTE
            if (valueFrom == "MILE PER MINUTE" && valueTo == "CENTIMETER PER SECOND") {
                getValue(100.0)
            }
            if (valueFrom == "MILE PER MINUTE" && valueTo == "CENTIMETER PER MINUTE") {
                getValue(160934.39967813)
            }
            if (valueFrom == "MILE PER MINUTE" && valueTo == "FOOT PER HOUR") {
                getValue(316799.98752756)
            }
            if (valueFrom == "MILE PER MINUTE" && valueTo == "FOOT PER MINUTES") {
                getValue(5280.0)
            }
            if (valueFrom == "MILE PER MINUTE" && valueTo == "FOOT PER SECOND") {
                getValue(88.0)
            }
            if (valueFrom == "MILE PER MINUTE" && valueTo == "INCH PER MINUTE") {
                getValue(63360.049889803)
            }
            if (valueFrom == "MILE PER MINUTE" && valueTo == "INCH PER SECOND") {
                getValue(1056.0)
            }
            if (valueFrom == "MILE PER MINUTE" && valueTo == "KILOMETRE PER HOUR") {
                getValue(96.560632275149)
            }
            if (valueFrom == "MILE PER MINUTE" && valueTo == "KILOMETRE PER SECOND") {
                getValue(0.0268224)
            }
            if (valueFrom == "MILE PER MINUTE" && valueTo == "METER PER HOUR") {
                getValue(96560.632275149)
            }
            if (valueFrom == "MILE PER MINUTE" && valueTo == "METER PER MINUTE") {
                getValue(1609.0221955609)
            }
            if (valueFrom == "MILE PER MINUTE" && valueTo == "METER PER SECOND") {
                getValue(26.8224)
            }
            if (valueFrom == "MILE PER MINUTE" && valueTo == "MILE PER HOUR") {
                getValue(60.0)
            }
            if (valueFrom == "MILE PER MINUTE" && valueTo == "MILE PER MINUTE") {
                getValue(1.0)
            }
            if (valueFrom == "MILE PER MINUTE" && valueTo == "MILE PER SECOND") {
                getValue(0.016666666666667)
            }
            if (valueFrom == "MILE PER MINUTE" && valueTo == "YARD PER HOUR") {
                getValue(105600.0)
            }
            if (valueFrom == "MILE PER MINUTE" && valueTo == "YARD PER MINUTE") {
                getValue(1760.0)
            }
            if (valueFrom == "MILE PER MINUTE" && valueTo == "YARD PER SECOND") {
                getValue(26.8224)
            }


            //MILE PER SECOND
            if (valueFrom == "MILE PER SECOND" && valueTo == "CENTIMETER PER SECOND") {
                getValue(160934.4)
            }
            if (valueFrom == "MILE PER SECOND" && valueTo == "CENTIMETER PER MINUTE") {
                getValue(9656063.9806879)
            }
            if (valueFrom == "MILE PER SECOND" && valueTo == "FOOT PER HOUR") {
                getValue(19007999.251654)
            }
            if (valueFrom == "MILE PER SECOND" && valueTo == "FOOT PER MINUTES") {
                getValue(316800.0)
            }
            if (valueFrom == "MILE PER SECOND" && valueTo == "FOOT PER SECOND") {
                getValue(316800.0)
            }
            if (valueFrom == "MILE PER SECOND" && valueTo == "INCH PER MINUTE") {
                getValue(3801602.9933882)
            }
            if (valueFrom == "MILE PER SECOND" && valueTo == "INCH PER SECOND") {
                getValue(63360.0)
            }
            if (valueFrom == "MILE PER SECOND" && valueTo == "KILOMETRE PER HOUR") {
                getValue(5793.637936509)
            }
            if (valueFrom == "MILE PER SECOND" && valueTo == "KILOMETRE PER SECOND") {
                getValue(1.609344)
            }
            if (valueFrom == "MILE PER SECOND" && valueTo == "METER PER HOUR") {
                getValue(5793637.936509)
            }
            if (valueFrom == "MILE PER SECOND" && valueTo == "METER PER MINUTE") {
                getValue(96541.331733653)
            }
            if (valueFrom == "MILE PER SECOND" && valueTo == "METER PER SECOND") {
                getValue(1609.344)
            }
            if (valueFrom == "MILE PER SECOND" && valueTo == "MILE PER HOUR") {
                getValue(3600.0)
            }
            if (valueFrom == "MILE PER SECOND" && valueTo == "MILE PER MINUTE") {
                getValue(60.0)
            }
            if (valueFrom == "MILE PER SECOND" && valueTo == "MILE PER SECOND") {
                getValue(1.0)
            }
            if (valueFrom == "MILE PER SECOND" && valueTo == "YARD PER HOUR") {
                getValue(6336000.0)
            }
            if (valueFrom == "MILE PER SECOND" && valueTo == "YARD PER MINUTE") {
                getValue(105600.0)
            }
            if (valueFrom == "MILE PER SECOND" && valueTo == "YARD PER SECOND") {
                getValue(1609.344)
            }


        }

    }
}