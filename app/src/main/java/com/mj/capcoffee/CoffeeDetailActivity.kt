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


        Glide.with(this).load(coffee.imageResourse).into(binding.coffeeImage)
        binding.coffeeName.text = coffee.capsule_name
        binding.shortDescription.text = coffee.side_name.replace("\\n","\n")
        Glide.with(this).load(coffee.intensityImage).into(intensity_view)


        if (coffee.intensity == 0) binding.intensityView.visibility = View.GONE
        if (coffee.ristretto == 0) binding.ristrettoView.imageAlpha = 50
        if (coffee.espresso == 0) binding.espressoView.imageAlpha = 50
        if (coffee.lungo == 0) binding.lungoView.imageAlpha = 50



        binding.sideTitle.text = coffee.side_title.replace("\\n","\n")
        binding.capTypetxt.text = coffee.capType
        binding.description1.text = coffee.description1.replace("\\n","\n")
        binding.description2.text = coffee.description2.replace("\\n","\n")
        binding.description3.text = coffee.description3.replace("\\n","\n")
        binding.description4.text = coffee.description4.replace("\\n","\n")
        binding.description5.text = coffee.description5.replace("\\n","\n")



        if(coffee.com_image1 != "") Glide.with(this).load(coffee.com_image1).into(binding.description2Image)
        if(coffee.com_image2 != "") Glide.with(this).load(coffee.com_image2).into(binding.description3Image)
        if(coffee.com_image3 != "") Glide.with(this).load(coffee.com_image3).into(binding.description4Image)
        if(coffee.com_image3 == "")binding.description4Image.visibility = View.GONE




        setBrandTexts()
        setCoffeeRange()


        back_btn.setOnClickListener { finish() }
    }

    private fun setCoffeeRange(){
        when (coffee.roasting){
            0 -> styleView1.visibility = View.GONE
            1 -> roasting.setImageResource(R.drawable.inten_1)
            2 -> roasting.setImageResource(R.drawable.inten_2)
            3 -> roasting.setImageResource(R.drawable.inten_3)
            4 -> roasting.setImageResource(R.drawable.inten_4)
            5 -> roasting.setImageResource(R.drawable.inten_5)
        }

        when (coffee.bitterness){
            1 -> bitterness.setImageResource(R.drawable.inten_1)
            2 -> bitterness.setImageResource(R.drawable.inten_2)
            3 -> bitterness.setImageResource(R.drawable.inten_3)
            4 -> bitterness.setImageResource(R.drawable.inten_4)
            5 -> bitterness.setImageResource(R.drawable.inten_5)
        }

        when (coffee.sourness){
            0 -> styleView2.visibility = View.GONE
            1 -> sourness.setImageResource(R.drawable.inten_1)
            2 -> sourness.setImageResource(R.drawable.inten_2)
            3 -> sourness.setImageResource(R.drawable.inten_3)
            4 -> sourness.setImageResource(R.drawable.inten_4)
            5 -> sourness.setImageResource(R.drawable.inten_5)
        }

        when (coffee.body){
            1 -> body.setImageResource(R.drawable.inten_1)
            2 -> body.setImageResource(R.drawable.inten_2)
            3 -> body.setImageResource(R.drawable.inten_3)
            4 -> body.setImageResource(R.drawable.inten_4)
            5 -> body.setImageResource(R.drawable.inten_5)
        }
    }

    private fun setBrandTexts(){

        binding.tvDescription2Title.text = coffee.description2_title
        binding.tvDescription3Title.text = coffee.description3_title
        binding.tvDescription4Title.text = coffee.description4_title

        if(coffee.description5 == "") binding.description5.visibility = View.GONE
        if(coffee.description5_title == "") binding.tvDescription5Title.visibility = View.GONE

        binding.tvDescription5Title.text = coffee.description5_title

    }
}


