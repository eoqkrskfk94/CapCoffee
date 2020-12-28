package com.mj.capcoffee

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.*
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.gms.ads.AdRequest
import com.mj.capcoffee.databinding.ActivityCoffeeListBinding
import com.mj.capcoffee.viewModel.CoffeeListViewModel
import kotlinx.android.synthetic.main.activity_coffee_detail.*
import kotlinx.android.synthetic.main.activity_coffee_list.*
import kotlinx.android.synthetic.main.activity_coffee_list.av_kakao

class CoffeeListActivity : AppCompatActivity() {

    private lateinit var brand: String

    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        val binding : ActivityCoffeeListBinding = DataBindingUtil.setContentView(this, R.layout.activity_coffee_list)

        var intent = intent
        brand = intent.getStringExtra("brand")

        val viewModel = ViewModelProvider(this)[CoffeeListViewModel::class.java]
        binding.viewModel = viewModel
        binding.lifecycleOwner = this


        viewModel.setBrand(brand)

        viewModel.getCoffeeList().observe(this, Observer {
            it ->

            binding.recyclerView.adapter =
                CoffeeAdapter(this, it) { coffeeItem ->
                    val intent = Intent(
                        this,
                        CoffeeDetailActivity::class.java
                    )
                    intent.putExtra("brand", brand)

                    intent.putExtra("coffee", coffeeItem)
                    startActivity(intent)

                }
            recycler_view.layoutManager = LinearLayoutManager(this)
            recycler_view.setHasFixedSize(true)
        })


//        val adRequest = AdRequest.Builder().build()
//        binding.adView.loadAd(adRequest)

        setKakaoAdView()


    }

    private fun setKakaoAdView(){
        av_kakao.setClientId("DAN-kmIyQjxV39rrz2Vr")

        lifecycle.addObserver(object : LifecycleObserver {

            @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
            fun onResume() {
                av_kakao.resume()
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
            fun onPause() {
                av_kakao.pause()
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
            fun onDestroy() {
                av_kakao.destroy()
            }

        })

        av_kakao.loadAd()  // 광고 요청
    }
}