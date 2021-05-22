package com.okcodex.easyconverters.ui.converters.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.okcodex.easyconverters.R
import kotlinx.android.synthetic.main.activity_hat_size.*
import kotlinx.android.synthetic.main.activity_ring_size.*
import kotlinx.android.synthetic.main.toolbar_menu.*
import kotlinx.android.synthetic.main.toolbar_menu.view.*

class RingSizeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ring_size)




        supportActionBar?.hide()
        initToolbar()
        toolbar_Ring_size.tvHeader.text="Ring Size"


    }

    private fun initToolbar() {


        ivBack.setOnClickListener {
            onBackPressed()
            finish()
        }

    }
}