package com.example.capcoffee

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_coffee_detail.*

class CoffeeDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coffee_detail)

        var intent = intent
        val name = intent.getStringExtra("CoffeeName")

        capsuleNametxt.text = name
    }
}
