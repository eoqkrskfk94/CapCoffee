package com.example.capcoffee.brand

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.capcoffee.CoffeeAdapter
import com.example.capcoffee.CoffeeDetailActivity
import com.example.capcoffee.R
import com.example.capcoffee.datas.CoffeeItem
import kotlinx.android.synthetic.main.activity_nespresso.*

class DunkinActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dunkin)

        recycler_view.adapter =
            CoffeeAdapter(this, dunkinList) { coffeeItem ->
                val intent = Intent(
                    this,
                    CoffeeDetailActivity::class.java
                )
                intent.putExtra("Brand", "Dunkin")

                intent.putExtra("coffee", coffeeItem)
                startActivity(intent)

            }
        recycler_view.layoutManager = LinearLayoutManager(this)
        recycler_view.setHasFixedSize(true)


        back_btn.setOnClickListener { finish() }
    }

    var dunkinList = arrayListOf<CoffeeItem>(
        CoffeeItem(
            R.drawable.dunkin_espresso,
            "에스프레소 블렌드", 0, R.drawable.nes_0, 1, 1, 0, 0,0,0,0,
            "Espresso Blend",
            "던킨 에스프레소 고유의 다크초콜렛, 카카오의 풍미를 느낄 수 있는 커피",
            "집에서도 던킨 커피를 그대로 즐기세요",
            "커피원두 100% :\n니카라과산 50%\n콜롬비아산 25%\n파푸아뉴기니산 25%",
            "30g (5g x 6개입)",
            "특허를 받은 이중캡슐 구조로, 외부로부터 산소의 침투를 차단하여 Aroma의 보존력이 뛰어나, 타제품대비 맛과 향이 오래 보존",
            "",
            "알루미늄캡슐"
        ),
        CoffeeItem(
            R.drawable.dunkin_chelsea,
            "첼시 바이브", 0, R.drawable.nes_0, 1, 1, 0, 0,0,0,0,
            "Chelsea Vibe",
            "도시 속 자유로움이 빛나는 첼시, 뉴욕",
            "과거의 다이나믹함과 현재의 세련됨을 느끼고 싶다면, \n첼시바이브와 함께하세요\n마지막까지 부드러운 커피",
            "커피원두 100% :\n브라질산 50%\n파푸아뉴기니산 30%",
            "30g (5g x 6개입)",
            "특허를 받은 이중캡슐 구조로, 외부로부터 산소의 침투를 차단하여 Aroma의 보존력이 뛰어나, 타제품대비 맛과 향이 오래 보존",
            "",
            "알루미늄캡슐"
        ),
        CoffeeItem(
            R.drawable.dunkin_longbeach,
            "롱 비치 블루 블랜드", 0, R.drawable.nes_0, 1, 1, 0, 0,0,0,0,
            "Long Beach Blue",
            "아이스 커피로 마셨을 때 가장 맛있는 블렌딩",
            "#미디움로스팅 #산뜻하고 부드러운맛",
            "커피원두 100% :\n브라질산 40%\n콜롬비아산 30%\n우간다산 30%)",
            "30g (5g x 6개입)",
            "특허를 받은 이중캡슐 구조로, 외부로부터 산소의 침투를 차단하여 Aroma의 보존력이 뛰어나, 타제품대비 맛과 향이 오래 보존",
            "",
            "알루미늄캡슐"
        ),
        CoffeeItem(
            R.drawable.dunkin_esksta,
            "에스키스타뮤즈", 0, R.drawable.nes_0, 1, 1, 0, 0,0,0,0,
            "Esksta Muse Blend",
            "",
            "",
            "커피원두 100% :\n브라질산 60%\n에티오피아산 40%)",
            "30g (5g x 6개입)",
            "특허를 받은 이중캡슐 구조로, 외부로부터 산소의 침투를 차단하여 Aroma의 보존력이 뛰어나, 타제품대비 맛과 향이 오래 보존",
            "",
            "알루미늄캡슐"
        )
    )
}

