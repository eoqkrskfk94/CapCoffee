package com.mj.capcoffee.brand

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.mj.capcoffee.R
import kotlinx.android.synthetic.main.activity_nespresso.back_btn

class NespressoTypeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nespresso_type)

        val imageView1 = findViewById(R.id.barista) as ImageView
        val imageView2 = findViewById(R.id.iltaliano) as ImageView
        val imageView3 = findViewById(R.id.espresso_lungo) as ImageView

        imageView2.setOnClickListener {
            val intent = Intent(this, NespressoItalianoActivity::class.java)
            startActivity(intent) }


        imageView1.setOnClickListener {
            val intent = Intent(this, NespressoBaristaActivity::class.java)
            startActivity(intent) }



        back_btn.setOnClickListener { finish() }
    }
}
