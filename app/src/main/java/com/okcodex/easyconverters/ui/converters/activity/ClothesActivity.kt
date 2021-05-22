package com.okcodex.easyconverters.ui.converters.activity

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.okcodex.easyconverters.R
import kotlinx.android.synthetic.main.activity_clothes.*
import kotlinx.android.synthetic.main.activity_hat_size.*
import kotlinx.android.synthetic.main.toolbar_menu.*
import kotlinx.android.synthetic.main.toolbar_menu.view.*

class ClothesActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_clothes)



        supportActionBar?.hide()
        initToolbar()
        toolbar_clothes_size.tvHeader.text="Clothes Size"


    }

    private fun initToolbar() {


        ivBack.setOnClickListener {
            onBackPressed()
            finish()
        }

    }
}