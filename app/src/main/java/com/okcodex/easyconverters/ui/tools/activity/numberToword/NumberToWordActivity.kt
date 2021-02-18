package com.okcodex.easyconverters.ui.tools.activity.numberToword

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

import com.okcodex.easyconverters.R


class NumberToWordActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_number_to_word)


      val res =  Converter.convertToIndianCurrency("3434")

        Log.e("xyz",res)


    }




}