package com.mj.capcoffee

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.bumptech.glide.Glide
import com.mj.capcoffee.databinding.ActivityCoffeeDetailBinding
import com.mj.capcoffee.datas.CoffeeItem
import com.mj.capcoffee.viewModel.CoffeeDetailViewModel
import kotlinx.android.synthetic.main.activity_coffee_detail.*

class CoffeeDetailActivity : AppCompatActivity() {

    lateinit var binding: ActivityCoffeeDetailBinding
    lateinit var coffee: CoffeeItem

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coffee_detail)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_coffee_detail)
        binding.viewModel = CoffeeDetailViewModel()


        var intent = intent
        coffee = intent.getParcelableExtra<CoffeeItem>("coffee")
        val brand = intent.getStringExtra("brand")

        binding.coffee = coffee
        binding.brand = brand


        Glide.with(this).load(coffee.imageResourse).into(binding.ivCoffeeImage)
        binding.tvCoffeeName.text = coffee.capsule_name
        binding.tvShortDescription.text = coffee.side_name?.replace("\\n","\n")
        Glide.with(this).load(coffee.intensityImage).into(iv_intensity_view)


        if (coffee.intensity == 0) binding.llIntensityView.visibility = View.GONE
        if (coffee.ristretto == 0) binding.ivRistretto.imageAlpha = 50
        if (coffee.espresso == 0) binding.ivEspresso.imageAlpha = 50
        if (coffee.lungo == 0) binding.ivLungo.imageAlpha = 50



        binding.tvSideTitle.text = coffee.side_title?.replace("\\n","\n")
        binding.tvCapType.text = coffee.capType
        binding.tvDescription1.text = coffee.description1?.replace("\\n","\n")
        binding.tvDescription2.text = coffee.description2?.replace("\\n","\n")
        binding.tvDescription3.text = coffee.description3?.replace("\\n","\n")
        binding.tvDescription4.text = coffee.description4?.replace("\\n","\n")
        binding.tvDescription5.text = coffee.description5?.replace("\\n","\n")



        if(coffee.com_image1 != "") Glide.with(this).load(coffee.com_image1).into(binding.ivDescription2)
        if(coffee.com_image2 != "") Glide.with(this).load(coffee.com_image2).into(binding.ivDescription3)
        if(coffee.com_image3 != "") Glide.with(this).load(coffee.com_image3).into(binding.ivDescription4)
        if(coffee.com_image3 == "")binding.tvDescription4.visibility = View.GONE




        setBrandTexts()
        setCoffeeRange()


        btn_back.setOnClickListener { finish() }
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
}


