package com.example.capcoffee

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.capcoffee.brand.DunkinActivity
import com.example.capcoffee.brand.IllyActivity
import com.example.capcoffee.brand.NespressoActivity
import com.example.capcoffee.brand.StarbucksActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nespressoBtn.setOnClickListener {
            val intent = Intent(this, NespressoActivity::class.java)
            startActivity(intent)
        }

        illyBtn.setOnClickListener {
            val intent = Intent(this, IllyActivity::class.java)
            startActivity(intent)
        }

        dunkinBtn.setOnClickListener {
            val intent = Intent(this, DunkinActivity::class.java)
            startActivity(intent)
        }

        starbucksBtn.setOnClickListener {
            val intent = Intent(this, StarbucksActivity::class.java)
            startActivity(intent)
        }
    }
}
