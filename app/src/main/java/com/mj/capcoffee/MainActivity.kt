package com.mj.capcoffee

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.MobileAds
import com.google.android.gms.ads.RequestConfiguration
import com.google.firebase.analytics.FirebaseAnalytics
import com.google.firebase.analytics.ktx.analytics
import com.google.firebase.ktx.Firebase
import com.mj.capcoffee.databinding.ActivityMainBinding
import com.mj.capcoffee.viewModel.MainViewModel
import java.util.*

class MainActivity : AppCompatActivity() {

    private lateinit var firebaseAnalytics: FirebaseAnalytics

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.viewModel = MainViewModel()

        firebaseAnalytics = Firebase.analytics


        val testDeviceIds = Arrays.asList("3E8875544BD4208F7F910D68F0522601")
        val configuration = RequestConfiguration.Builder().setTestDeviceIds(testDeviceIds).build()
        MobileAds.setRequestConfiguration(configuration)


        MobileAds.initialize(this) {}
        val adRequest = AdRequest.Builder().build()

        binding.adView.loadAd(adRequest)





    }
}
