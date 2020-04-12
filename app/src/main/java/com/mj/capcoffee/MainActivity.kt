package com.mj.capcoffee

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mj.capcoffee.brand.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nespressoBtn.setOnClickListener {
            val intent = Intent(this, NespressoTypeActivity::class.java)
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

//        insert_btn.setOnClickListener{
//            val intent = Intent(this, InsertActivity::class.java)
//            startActivity(intent)
//        }
    }
}
