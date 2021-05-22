package com.okcodex.easyconverters.ui.converters.activity

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.okcodex.easyconverters.R
import kotlinx.android.synthetic.main.activity_clothes.*
import kotlinx.android.synthetic.main.activity_shoe_size.*
import kotlinx.android.synthetic.main.toolbar_menu.*
import kotlinx.android.synthetic.main.toolbar_menu.view.*

class ShoeSizeActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shoe_size)


        supportActionBar?.hide()
        initToolbar()
        toolbar_shoe_size.tvHeader.text="Shoe Size"


    }

    private fun initToolbar() {


        ivBack.setOnClickListener {
            onBackPressed()
            finish()
        }

    }
}