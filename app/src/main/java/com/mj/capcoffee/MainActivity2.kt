package com.mj.capcoffee

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent
import androidx.recyclerview.widget.GridLayoutManager
import com.google.firebase.analytics.FirebaseAnalytics
import com.google.firebase.analytics.ktx.analytics
import com.google.firebase.ktx.Firebase
import com.mj.capcoffee.adapter.CoffeeBrandAdapter
import com.mj.capcoffee.databinding.ActivityMain2Binding
import com.mj.capcoffee.datas.CoffeeBrandItem
import com.mj.capcoffee.viewModel.MainViewModel
import kotlinx.android.synthetic.main.activity_coffee_detail.av_kakao

class MainActivity2 : AppCompatActivity() {

    private lateinit var firebaseAnalytics: FirebaseAnalytics

    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)

        val binding : ActivityMain2Binding =
            DataBindingUtil.setContentView(this, R.layout.activity_main2)
        binding.viewModel = MainViewModel()
        binding.lifecycleOwner = this

        firebaseAnalytics = Firebase.analytics

        setKakaoAdView()

        val brands = ArrayList<CoffeeBrandItem>()

        brands.add(CoffeeBrandItem(R.drawable.nespresso, "nespresso", "", ""))
        brands.add(CoffeeBrandItem(R.drawable.starbucks, "starbucks", "", ""))
        brands.add(CoffeeBrandItem(R.drawable.illy, "illy", "", ""))
        brands.add(CoffeeBrandItem(R.drawable.twosome, "twosome", "", ""))
        brands.add(CoffeeBrandItem(R.drawable.ediya, "ediya", "", ""))
        brands.add(CoffeeBrandItem(R.drawable.lavazza, "lavazza", "", ""))
        brands.add(CoffeeBrandItem(R.drawable.paulbessett, getString(R.string.paulBassett), "", ""))
        brands.add(CoffeeBrandItem(R.drawable.belmio, getString(R.string.belmio), "", ""))
        brands.add(CoffeeBrandItem(R.drawable.borbone, getString(R.string.borbone), "", ""))
        brands.add(CoffeeBrandItem(R.drawable.tom_n_toms, getString(R.string.tom_n_toms), "", ""))
        brands.add(CoffeeBrandItem(R.drawable.coffeebean, getString(R.string.coffeebean), "", ""))



        binding.rvCoffeeBrand.adapter = CoffeeBrandAdapter(this, brands) { brandItem, cardView, imageView ->
            println(brandItem.brandName)

            if(brandItem.brandName == "nespresso") intent = Intent(this, NespressoTypeActivity::class.java)
            else{
                intent = Intent(this, CoffeeListActivity::class.java)
                intent.putExtra("brand", brandItem.brandName)
            }

            startActivity(intent)
            overridePendingTransition(R.anim.fadein, R.anim.fadeout)

        }

        binding.rvCoffeeBrand.apply {
            layoutAnimation = AnimationUtils.loadLayoutAnimation(
                context,
                R.anim.layout_animation_fall_down
            )
            scheduleLayoutAnimation()

        }

        binding.rvCoffeeBrand.layoutManager = GridLayoutManager(this, 2, GridLayoutManager.VERTICAL, false)
        binding.rvCoffeeBrand.setHasFixedSize(true)



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