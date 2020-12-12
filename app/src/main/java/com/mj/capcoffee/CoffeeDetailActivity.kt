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




        setBrandTexts(brand)
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

    private fun setBrandTexts(brand: String){

        // 일리 브랜드
        if (brand == getString(R.string.illy)){
            binding.tvDescription2Title.text = "주석 합금캔을 이용한 질수 압축공법"
            binding.tvDescription3Title.text = "파트너쉽을 통한 구품질 생두 공급"
            binding.tvDescription4Title.text = "9가지 100% 아라비카 원드 블랜딩"
            binding.tvDescription5Title.text = "정보"
        }

        // 던킨 브랜드
        if (brand == getString(R.string.dunkin)){
            binding.tvDescription2Title.text = "원재료명 및 함량"
            binding.tvDescription3Title.text = "내용량"
            binding.tvDescription4Title.text = "Aroma Sealing"
            binding.tvDescription5Title.visibility = View.GONE
            binding.description5.visibility = View.GONE
        }

        // 스타벅스 브랜드
        if(brand == getString(R.string.starbucks)){
            binding.tvDescription2Title.text = "스타벅스 알루미늄을 사용하는 이유가 뭘까요?"
            binding.tvDescription3Title.text = "캡슐을 재활용하세요"
            binding.tvDescription4Title.text = "커피에 관련해 궁금한 점이 있나요?"
            binding.tvDescription5Title.visibility = View.GONE
        }

        // 폴바셋 브랜드
        if(brand == getString(R.string.paulBassett)){
            binding.tvDescription2Title.text = "완전히 새로워진 폴 바셋 바리스타 캡슐"
            binding.tvDescription3Title.text = "이제 당신의 네스프레소 마신에서도"
            binding.tvDescription4Title.text = "풍부한 플레이버를 담은 캡슐 한 잔"
            binding.tvDescription5Title.visibility = View.GONE
        }

    }
}


