package com.mj.capcoffee

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.mj.capcoffee.databinding.ActivityWebViewBinding


class WebViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityWebViewBinding = DataBindingUtil.setContentView(this, R.layout.activity_web_view)

        var intent = intent
        var coffeeName = intent.getStringExtra("coffee")
        var brand = intent.getStringExtra("brand")

        if(brand == getString(R.string.starbucks)) brand = getString(R.string.starbucks_kr)
        else if(brand == getString(R.string.illy)) brand = getString(R.string.illy_kr)
        else if(brand == getString(R.string.nespresso)) brand = getString(R.string.nespresso_kr)
        else if(brand == getString(R.string.dunkin)) brand = getString(R.string.dunkin_kr)


        coffeeName = "$brand $coffeeName 캡슐"
        coffeeName = coffeeName.replace("\\s".toRegex(), "+")

        println(coffeeName)

        binding.wvNaver.loadUrl("https://search.naver.com/search.naver?where=view&sm=tab_jum&query=$coffeeName")
        finish()


    }
}