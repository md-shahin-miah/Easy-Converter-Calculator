package com.okcodex.easyconverters.ui.converters.activity

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.style.ForegroundColorSpan
import com.okcodex.easyconverters.R
import kotlinx.android.synthetic.main.activity_age_calculator.*
import kotlinx.android.synthetic.main.activity_hat_size.*
import kotlinx.android.synthetic.main.toolbar_menu.*
import kotlinx.android.synthetic.main.toolbar_menu.view.*

class HatSizeActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hat_size)


        supportActionBar?.hide()
        initToolbar()
        toolbar_hat_size.tvHeader.text="Hat Size"


    }

    private fun initToolbar() {


        ivBack.setOnClickListener {
            onBackPressed()
            finish()
        }

    }
}