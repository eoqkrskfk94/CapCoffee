package com.mj.capcoffee

import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.view.View
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent
import com.bumptech.glide.Glide
import com.google.android.gms.ads.AdView
import com.mj.capcoffee.databinding.ActivityCoffeeDetailBinding
import com.mj.capcoffee.datas.CoffeeItem
import com.mj.capcoffee.viewModel.CoffeeDetailViewModel
import kotlinx.android.synthetic.main.activity_coffee_detail.*


class CoffeeDetailActivity : AppCompatActivity() {

    lateinit var binding: ActivityCoffeeDetailBinding
    lateinit var coffee: CoffeeItem

    lateinit var mAdView : AdView

    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coffee_detail)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_coffee_detail)
        binding.viewModel = CoffeeDetailViewModel()


        //setSupportActionBar(binding.tbCoffeeDetail)

        var intent = intent
        coffee = intent.getParcelableExtra<CoffeeItem>("coffee")
        val brand = intent.getStringExtra("brand")

        binding.coffee = coffee
        binding.brand = brand

        setActionBarTransparent()


        Glide.with(this).load(coffee.imageResourse).into(binding.ivCoffeeImage)
        binding.tvCoffeeName.text = coffee.capsule_name
        binding.tvShortDescription.text = coffee.side_name?.replace("\\n", "\n")
        Glide.with(this).load(coffee.intensityImage).into(iv_intensity_view)


        if (coffee.intensity == 0) binding.llIntensityView.visibility = View.GONE
        if (coffee.ristretto == 0) binding.ivRistretto.imageAlpha = 50
        if (coffee.espresso == 0) binding.ivEspresso.imageAlpha = 50
        if (coffee.lungo == 0) binding.ivLungo.imageAlpha = 50



        binding.tvSideTitle.text = coffee.side_title?.replace("\\n", "\n")
        binding.tvCapType.text = coffee.capType
        binding.tvDescription1.text = coffee.description1?.replace("\\n", "\n")
        binding.tvDescription2.text = coffee.description2?.replace("\\n", "\n")
        binding.tvDescription3.text = coffee.description3?.replace("\\n", "\n")
        binding.tvDescription4.text = coffee.description4?.replace("\\n", "\n")
        binding.tvDescription5.text = coffee.description5?.replace("\\n", "\n")



        if(coffee.com_image1 != "") Glide.with(this).load(coffee.com_image1).into(binding.ivDescription2)
        else binding.ivDescription2.visibility = View.GONE
        if(coffee.com_image2 != "") Glide.with(this).load(coffee.com_image2).into(binding.ivDescription3)
        else binding.ivDescription3.visibility = View.GONE
        if(coffee.com_image3 != "") Glide.with(this).load(coffee.com_image3).into(binding.ivDescription4)
        else binding.ivDescription4.visibility = View.GONE



        //setAdView()
        setKakaoAdView()
        setBrandTexts()
        setCoffeeRange()


        binding.btnBack.setOnClickListener {
            supportFinishAfterTransition()
        }


    }

    private fun setCoffeeRange(){
        when (coffee.roasting) {
            0 -> binding.llStyleView1.visibility = View.GONE
            1 -> binding.ivRoasting.setImageResource(R.drawable.inten_1)
            2 -> binding.ivRoasting.setImageResource(R.drawable.inten_2)
            3 -> binding.ivRoasting.setImageResource(R.drawable.inten_3)
            4 -> binding.ivRoasting.setImageResource(R.drawable.inten_4)
            5 -> binding.ivRoasting.setImageResource(R.drawable.inten_5)
        }

        when (coffee.bitterness){
            1 -> binding.ivBitterness.setImageResource(R.drawable.inten_1)
            2 -> binding.ivBitterness.setImageResource(R.drawable.inten_2)
            3 -> binding.ivBitterness.setImageResource(R.drawable.inten_3)
            4 -> binding.ivBitterness.setImageResource(R.drawable.inten_4)
            5 -> binding.ivBitterness.setImageResource(R.drawable.inten_5)
        }

        when (coffee.sourness){
            0 -> binding.llStyleView2.visibility = View.GONE
            1 -> iv_sourness.setImageResource(R.drawable.inten_1)
            2 -> iv_sourness.setImageResource(R.drawable.inten_2)
            3 -> iv_sourness.setImageResource(R.drawable.inten_3)
            4 -> iv_sourness.setImageResource(R.drawable.inten_4)
            5 -> iv_sourness.setImageResource(R.drawable.inten_5)
        }

        when (coffee.body){
            1 -> iv_body.setImageResource(R.drawable.inten_1)
            2 -> iv_body.setImageResource(R.drawable.inten_2)
            3 -> iv_body.setImageResource(R.drawable.inten_3)
            4 -> iv_body.setImageResource(R.drawable.inten_4)
            5 -> iv_body.setImageResource(R.drawable.inten_5)
        }
    }

    private fun setBrandTexts(){

        binding.tvDescription2Title.text = coffee.description2_title
        binding.tvDescription3Title.text = coffee.description3_title
        binding.tvDescription4Title.text = coffee.description4_title

        if(coffee.description5 == "") binding.tvDescription5.visibility = View.GONE
        if(coffee.description5_title == "") binding.tvDescription5Title.visibility = View.GONE

        binding.tvDescription5Title.text = coffee.description5_title

    }

//    private fun setAdView(){
//
//        MobileAds.initialize(this) {}
//
//        mAdView = findViewById(R.id.adView)
//        val adRequest = AdRequest.Builder().build()
//
//        mAdView.loadAd(adRequest)
//    }

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


    @RequiresApi(Build.VERSION_CODES.M)
    private fun setActionBarTransparent(){

        binding.svCoffeeDetail.setOnScrollChangeListener { v, scrollX, scrollY, oldScrollX, oldScrollY ->
            //println("$scrollX $scrollY")

            if(scrollY >= 0){
                if(scrollY <= 500){
                    binding.actionBar.setBackgroundColor(Color.rgb(255, 255, 255))
                    binding.actionBar.background.alpha = (scrollY.toFloat()/500.0 * 255.0).toInt()
                    println(binding.actionBar.background.alpha)
                }
                else{
                    binding.actionBar.setBackgroundColor(Color.rgb(255, 255, 255))
                    binding.actionBar.background.alpha = 255
                }
            }
        }

    }


    override fun onBackPressed() {
        super.onBackPressed()
        supportFinishAfterTransition()
    }




}


