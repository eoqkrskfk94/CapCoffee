package com.example.capcoffee

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.capcoffee.datas.CoffeeItem
import kotlinx.android.synthetic.main.activity_coffee_detail.*

class CoffeeDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coffee_detail)

        var intent = intent
        val coffee = intent.getParcelableExtra<CoffeeItem>("coffee")

        //coffee_image.setImageResource(coffee.imageResourse)
        coffee_name.text = coffee.capsule_name
        short_description.text = coffee.side_name
        //intensity_view.setImageResource(coffee.intensityImage)
        if (coffee.intensity == 0) intensityView.visibility = View.GONE
        if (coffee.ristretto == 0) ristretto_view.setImageAlpha(50)
        if (coffee.espresso == 0) espresso_view.setImageAlpha(50)
        if (coffee.lungo == 0) lungo_view.setImageAlpha(50)
        side_title.text = coffee.side_title
        capTypetxt.text = coffee.capType
        description_1.text = coffee.description1
        description_2.text = coffee.description2
        description_3.text = coffee.description3
        description_4.text = coffee.description4
        description_5.text = coffee.description5

        val brand = intent.getStringExtra("Brand")


        // 일리 브랜드
        if (brand == "Illy"){
            textView8.text = "주석 합금캔을 이용한 질수 압축공법"
            textView9.text = "파트너쉽을 통한 구품질 생두 공급"
            textView10.text = "9가지 100% 아라비카 원드 블랜딩"
            textView11.text = "정보"
        }

        // 던킨 브랜드
        if (brand == "Dunkin"){
            textView8.text = "원재료명 및 함량"
            textView9.text = "내용량"
            textView10.text = "Aroma Sealing"
            textView11.visibility = View.GONE
            description_5.visibility = View.GONE
        }

        // 스타벅스 브랜드
        if(brand == "Starbucks"){
            textView8.text = "스타벅스 알루미늄을 사용하는 이유가 뭘까요?"
            textView9.text = "캡슐을 재활용하세요"
            textView10.text = "커피에 관련해 궁금한 점이 있나요?"
            textView11.visibility = View.GONE
        }

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

        back_btn.setOnClickListener { finish() }
    }
}
