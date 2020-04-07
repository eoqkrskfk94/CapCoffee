package com.example.capcoffee

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.capcoffee.datas.CoffeeItem
import kotlinx.android.synthetic.main.activity_nespresso.*


class NespressoActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nespresso)

        recycler_view.adapter = CoffeeAdapter(this,nespressoList){
            coffeeItem ->  val intent = Intent(this, CoffeeDetailActivity::class.java)
            intent.putExtra("CoffeeName", coffeeItem.capsuleName)
            startActivity(intent)
        }
        recycler_view.layoutManager = LinearLayoutManager(this)
        recycler_view.setHasFixedSize(true)


    }



    var nespressoList = arrayListOf<CoffeeItem>(
        CoffeeItem(R.drawable.nes_kazaar, "팔레르모 카자르",12,R.drawable.nes_12),
        CoffeeItem(R.drawable.nes_italiano, "리스트레토 이탈리아노",10,R.drawable.nes_10),
        CoffeeItem(R.drawable.nes_arpeggio, "피렌체 아르페지오",9,R.drawable.nes_9),
        CoffeeItem(R.drawable.nes_roma, "로마",8,R.drawable.nes_8),
        CoffeeItem(R.drawable.nes_livanto, "제노바 리반토",6,R.drawable.nes_6)


    )

}
