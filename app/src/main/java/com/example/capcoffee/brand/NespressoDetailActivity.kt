package com.example.capcoffee.brand

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.capcoffee.R
import kotlinx.android.synthetic.main.activity_coffee_detail.*

class NespressoDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coffee_detail)

        var intent = intent
        val name = intent.getStringExtra("CoffeeName")


        back_btn.setOnClickListener { finish() }
    }
}
