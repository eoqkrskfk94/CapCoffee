package com.mj.capcoffee

import android.app.ActivityOptions
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.view.View
import android.view.Window
import android.view.WindowManager
import android.view.animation.AnimationUtils
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityOptionsCompat
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.*
import androidx.recyclerview.widget.LinearLayoutManager
import com.mj.capcoffee.databinding.ActivityCoffeeListBinding
import com.mj.capcoffee.viewModel.CoffeeListViewModel
import kotlinx.android.synthetic.main.activity_coffee_detail.*
import kotlinx.android.synthetic.main.activity_coffee_list.*
import kotlinx.android.synthetic.main.activity_coffee_list.av_kakao
import kotlinx.android.synthetic.main.coffee_item_small.*


class CoffeeListActivity : AppCompatActivity() {

    private lateinit var brand: String

    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        val binding : ActivityCoffeeListBinding = DataBindingUtil.setContentView(
            this,
            R.layout.activity_coffee_list
        )
        setKakaoAdView()

        var intent = intent
        brand = intent.getStringExtra("brand")

        val viewModel = ViewModelProvider(this)[CoffeeListViewModel::class.java]
        binding.viewModel = viewModel
        binding.lifecycleOwner = this


        viewModel.setBrand(brand)
        setBrandImage(brand)

        viewModel.getCoffeeList().observe(this, Observer { it ->

            binding.recyclerView.adapter =
                CoffeeAdapter(this, it) { coffeeItem, imageView ->
                    val intent = Intent(
                        this,
                        CoffeeDetailActivity::class.java
                    )
                    intent.putExtra("brand", brand)
                    intent.putExtra("coffee", coffeeItem)


                    if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
                        val activityOptions = ActivityOptions.makeSceneTransitionAnimation(this, imageView, "transitionImage")
                        startActivity(intent, activityOptions.toBundle())
                    }

                    else{
                        startActivity(intent)
                    }
                }

            recycler_view.apply {
                layoutAnimation = AnimationUtils.loadLayoutAnimation(
                    context,
                    R.anim.layout_animation_fall_down
                )
                scheduleLayoutAnimation()
            }

            recycler_view.layoutManager = LinearLayoutManager(this)
            recycler_view.setHasFixedSize(true)
        })


//        val adRequest = AdRequest.Builder().build()
//        binding.adView.loadAd(adRequest)

    }


    private fun setBrandImage(brand : String){


        val window : Window = getWindow()
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)


        when(brand){
            getString(R.string.nespresso) -> {
                iv_brand.setImageResource(R.drawable.nespresso)
                window.statusBarColor = ContextCompat.getColor(this, R.color.nespresso)
                cl_box.setBackgroundColor(ContextCompat.getColor(this, R.color.nespresso))
                tv_brand.text = getString(R.string.nespresso_kr)
                tv_brand_description.text = "브랜드 국적: 스위스"
                tv_brand_description2.text = "설립연도: 1866년 (네슬레)"
            }
            getString(R.string.nespresso_barista) -> {
                iv_brand.setImageResource(R.drawable.nespresso)
                window.statusBarColor = ContextCompat.getColor(this, R.color.nespresso)
                cl_box.setBackgroundColor(ContextCompat.getColor(this, R.color.nespresso))
                tv_brand.text = getString(R.string.nespresso_kr)
                tv_brand_description.text = "브랜드 국적: 스위스"
                tv_brand_description2.text = "설립연도: 1866년 (네슬레)"
            }
            getString(R.string.nespresso_espresso) -> {
                iv_brand.setImageResource(R.drawable.nespresso)
                window.statusBarColor = ContextCompat.getColor(this, R.color.nespresso)
                cl_box.setBackgroundColor(ContextCompat.getColor(this, R.color.nespresso))
                tv_brand.text = getString(R.string.nespresso_kr)
                tv_brand_description.text = "브랜드 국적: 스위스"
                tv_brand_description2.text = "설립연도: 1866년 (네슬레)"
            }
            getString(R.string.nespresso_master) -> {
                iv_brand.setImageResource(R.drawable.nespresso)
                window.statusBarColor = ContextCompat.getColor(this, R.color.nespresso)
                cl_box.setBackgroundColor(ContextCompat.getColor(this, R.color.nespresso))
                tv_brand.text = getString(R.string.nespresso_kr)
                tv_brand_description.text = "브랜드 국적: 스위스"
                tv_brand_description2.text = "설립연도: 1866년 (네슬레)"
            }
            getString(R.string.starbucks) -> {
                iv_brand.setImageResource(R.drawable.starbucks)
                window.statusBarColor = ContextCompat.getColor(this, R.color.starbucks)
                cl_box.setBackgroundColor(ContextCompat.getColor(this, R.color.starbucks))
                tv_brand.text = getString(R.string.starbucks_kr)
                tv_brand_description.text = "브랜드 국적: 미국"
                tv_brand_description2.text = "설립연도: 1971년"
            }
            getString(R.string.illy) -> {
                iv_brand.setImageResource(R.drawable.illy)
                window.statusBarColor = ContextCompat.getColor(this, R.color.illy)
                cl_box.setBackgroundColor(ContextCompat.getColor(this, R.color.illy))
                tv_brand.text = getString(R.string.illy_kr)
                tv_brand_description.text = "브랜드 국적: 이탈리아"
                tv_brand_description2.text = "설립연도: 1933년"
            }
            getString(R.string.dunkin) -> {
                iv_brand.setImageResource(R.drawable.dunkin)
                window.statusBarColor = ContextCompat.getColor(this, R.color.dunkin)
                cl_box.setBackgroundColor(ContextCompat.getColor(this, R.color.dunkin))
                tv_brand.text = getString(R.string.dunkin_kr)
                tv_brand_description.text = "브랜드 국적: 미국"
                tv_brand_description2.text = "설립연도: 1950년"
            }
            getString(R.string.twosome) -> {
                iv_brand.setImageResource(R.drawable.twosome)
                window.statusBarColor = ContextCompat.getColor(this, R.color.twosome)
                cl_box.setBackgroundColor(ContextCompat.getColor(this, R.color.twosome))
                tv_brand.text = "투썸 플레이스"
                tv_brand_description.text = "브랜드 국적: 대한민국"
                tv_brand_description2.text = "설립연도: 2002년"
            }
            getString(R.string.paulBassett) -> {
                iv_brand.setImageResource(R.drawable.paulbessett)
                window.statusBarColor = ContextCompat.getColor(this, R.color.paulBassett)
                cl_box.setBackgroundColor(ContextCompat.getColor(this, R.color.paulBassett))
                tv_brand.text = getString(R.string.paulBassett_kr)
                tv_brand_description.text = "브랜드 국적: 대한민국 (매일유업 자회사)"
                tv_brand_description2.text = "설립연도: 2013년"
            }
            getString(R.string.belmio) -> {
                iv_brand.setImageResource(R.drawable.belmio)
                window.statusBarColor = ContextCompat.getColor(this, R.color.belmio)
                cl_box.setBackgroundColor(ContextCompat.getColor(this, R.color.belmio))
                tv_brand.text = getString(R.string.belmio_kr)
                tv_brand_description.text = "브랜드 국적: 벨기에"
                tv_brand_description2.text = "설립연도: 2018년"
            }
            getString(R.string.lavazza) -> {
                iv_brand.setImageResource(R.drawable.lavazza)
                window.statusBarColor = ContextCompat.getColor(this, R.color.lavazza)
                cl_box.setBackgroundColor(ContextCompat.getColor(this, R.color.lavazza))
                tv_brand.text = getString(R.string.lavazza_kr)
                tv_brand_description.text = "브랜드 국정: 이탈리아"
                tv_brand_description2.text = "설립연도: 1895년"
            }
            getString(R.string.borbone) -> {
                iv_brand.setImageResource(R.drawable.borbone)
                window.statusBarColor = ContextCompat.getColor(this, R.color.borbone)
                cl_box.setBackgroundColor(ContextCompat.getColor(this, R.color.borbone))
                tv_brand.text = getString(R.string.borbone_kr)
                tv_brand_description.text = "브랜드 국적: 이탈리아"
                tv_brand_description2.text = "설립연도:"
            }
            getString(R.string.ediya) -> {
                iv_brand.setImageResource(R.drawable.ediya)
                window.statusBarColor = ContextCompat.getColor(this, R.color.ediya)
                cl_box.setBackgroundColor(ContextCompat.getColor(this, R.color.ediya))
                tv_brand.text = "이디야 커피"
                tv_brand_description.text = "브랜드 국적: 대한민국"
                tv_brand_description2.text = "설립연도: 2001년"
            }
            getString(R.string.tom_n_toms) -> {
                iv_brand.setImageResource(R.drawable.tom_n_toms)
                window.statusBarColor = ContextCompat.getColor(this, R.color.tom_n_toms)
                cl_box.setBackgroundColor(ContextCompat.getColor(this, R.color.tom_n_toms))
                tv_brand.text = getString(R.string.tom_n_toms_kr)
                tv_brand_description.text = "브랜드 국정: 대한민국"
                tv_brand_description2.text = "설립연도: 1999년"
            }
            getString(R.string.coffeebean) -> {
                iv_brand.setImageResource(R.drawable.coffeebean)
                window.statusBarColor = ContextCompat.getColor(this, R.color.coffeebean)
                cl_box.setBackgroundColor(ContextCompat.getColor(this, R.color.coffeebean))
                tv_brand.text = getString(R.string.coffeebean_kr)
                tv_brand_description.text = "브랜드 국적: 미국"
                tv_brand_description2.text = "설립연도: 1963년"
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