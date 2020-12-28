package com.mj.capcoffee

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.MobileAds
import com.google.android.gms.ads.RequestConfiguration
import com.google.firebase.analytics.FirebaseAnalytics
import com.google.firebase.analytics.ktx.analytics
import com.google.firebase.ktx.Firebase
import com.mj.capcoffee.databinding.ActivityMainBinding
import com.mj.capcoffee.viewModel.MainViewModel
import kotlinx.android.synthetic.main.activity_coffee_detail.*
import java.util.*

class MainActivity : AppCompatActivity() {

    private lateinit var firebaseAnalytics: FirebaseAnalytics

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.viewModel = MainViewModel()

        firebaseAnalytics = Firebase.analytics


//        val testDeviceIds = Arrays.asList("3E8875544BD4208F7F910D68F0522601")
//        val configuration = RequestConfiguration.Builder().setTestDeviceIds(testDeviceIds).build()
//        MobileAds.setRequestConfiguration(configuration)
//
//
//        MobileAds.initialize(this) {}
//        val adRequest = AdRequest.Builder().build()
//
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
