package com.mj.capcoffee

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent
import com.mj.capcoffee.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_coffee_detail.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val binding: ActivityMainBinding = DataBindingUtil.setContentView(
            this,
            R.layout.activity_main
        )
        binding.lifecycleOwner = this

        setBottomNavigation(binding)
        setKakaoAdView()
    }

    /**
     * bottom navigation 세팅
     */
    private fun setBottomNavigation(binding : ActivityMainBinding){

        val fragment = NespressoCapsuleFragment()
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.frame_layout, fragment)
            .commit()


        binding.bnMenu.setOnNavigationItemSelectedListener { item ->
            when(item.itemId){
                R.id.page_1 -> {
                    val fragment = NespressoCapsuleFragment()
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.frame_layout, fragment)
                        .commit()
                    true
                }
                R.id.page_2 -> {
                    val fragment = DolceCapsuleFragment()
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.frame_layout, fragment)
                        .commit()
                    true
                }

                else -> false
            }
        }
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