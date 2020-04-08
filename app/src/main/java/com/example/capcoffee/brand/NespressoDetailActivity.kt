package com.example.capcoffee.brand

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.capcoffee.R
import com.example.capcoffee.datas.NespressoItem
import kotlinx.android.synthetic.main.activity_coffee_detail.*

class NespressoDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coffee_detail)

        var intent = intent
        val coffee = intent.getParcelableExtra<NespressoItem>("coffee")

        coffee_image.setImageResource(coffee.imageResourse)
        coffee_name.text = coffee.capsuleName
        short_description.text = coffee.side_name
        intensity_view.setImageResource(coffee.intensityImage)
        if (coffee.ristretto == 0) ristretto_view.setImageAlpha(50)
        if (coffee.espresso == 0) espresso_view.setImageAlpha(50)
        if (coffee.lungo == 0) lungo_view.setImageAlpha(50)
        side_title.text = coffee.side_title
        description_1.text = coffee.description1
        description_2.text = coffee.description2
        description_3.text = coffee.description3
        description_4.text = coffee.description4
        description_5.text = coffee.description5

        when (coffee.roasting){
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
