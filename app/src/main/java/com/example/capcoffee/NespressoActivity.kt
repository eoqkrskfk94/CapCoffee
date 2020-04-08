package com.example.capcoffee

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.capcoffee.brand.NespressoDetailActivity
import com.example.capcoffee.datas.CoffeeItem
import kotlinx.android.synthetic.main.activity_nespresso.*


class NespressoActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nespresso)

        recycler_view.adapter = CoffeeAdapter(this,nespressoList){
            coffeeItem ->  val intent = Intent(this, NespressoDetailActivity::class.java)
            intent.putExtra("Brand", "Nespresso")
            intent.putExtra("CoffeeName", coffeeItem.capsuleName)
            startActivity(intent)
        }
        recycler_view.layoutManager = LinearLayoutManager(this)
        recycler_view.setHasFixedSize(true)


        back_btn.setOnClickListener { finish() }

    }



    var nespressoList = arrayListOf<CoffeeItem>(
        CoffeeItem(R.drawable.nes_kazaar,
            "팔레르모 카자르", 12, R.drawable.nes_12, 1, 1, 0),
        CoffeeItem(R.drawable.nes_italiano, "리스트레토 이탈리아노",10,R.drawable.nes_10,1,1,0),
        CoffeeItem(R.drawable.nes_arpeggio, "피렌체 아르페지오",9,R.drawable.nes_9,1,1,0),
        CoffeeItem(R.drawable.nes_roma, "로마",8,R.drawable.nes_8,1,1,0),
        CoffeeItem(R.drawable.nes_livanto, "제노바 리반토",6,R.drawable.nes_6,0,1,0),
        CoffeeItem(R.drawable.nes_bluto, "불루토",5,R.drawable.nes_5,0,1,0),
        CoffeeItem(R.drawable.nes_indonesia, "인도네시아",8,R.drawable.nes_8,0,1,1),
        CoffeeItem(R.drawable.nes_nikara, "니카라과",5,R.drawable.nes_5,0,1,1),
        CoffeeItem(R.drawable.nes_linigio, "리니지오 룽고",4,R.drawable.nes_4,0,0,1),
        CoffeeItem(R.drawable.nes_arpegio_decaf, "피렌체 아르페지오 decaf",9,R.drawable.nes_9,1,1,0),
        CoffeeItem(R.drawable.nes_caramel, "캐러멜향 크렘 브륄레",0,R.drawable.nes_0,1,1,0),
        CoffeeItem(R.drawable.nes_vanila, "바닐라향 에클레어",0,R.drawable.nes_0,1,1,0)

    )

}
