package com.mj.capcoffee.brand

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import com.mj.capcoffee.CoffeeAdapter
import com.mj.capcoffee.CoffeeDetailActivity
import com.mj.capcoffee.R
import com.mj.capcoffee.datas.CoffeeItem
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.android.synthetic.main.activity_nespresso.*

class StarbucksActivity : AppCompatActivity() {

    var starbucksList = ArrayList<CoffeeItem>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_starbucks)

        val db: FirebaseFirestore = FirebaseFirestore.getInstance()


        db.collection("starbucks")
            .get()
            .addOnSuccessListener { result ->
                for (document in result) {
                    var coffee: CoffeeItem = document.toObject(CoffeeItem::class.java)
                    starbucksList.add(coffee)

                }

                recycler_view.adapter =
                    CoffeeAdapter(this, starbucksList) { coffeeItem ->
                        val intent = Intent(
                            this,
                            CoffeeDetailActivity::class.java
                        )
                        intent.putExtra("Brand", "Starbucks")

                        intent.putExtra("coffee", coffeeItem)
                        startActivity(intent)

                    }
                recycler_view.layoutManager = LinearLayoutManager(this)
                recycler_view.setHasFixedSize(true)


            }
            .addOnFailureListener { exception ->
                Log.w("no exist", "Error getting documents.", exception)
            }

        back_btn.setOnClickListener { finish() }
    }
//
//    var starbucksList = arrayListOf<CoffeeItem>(
//        CoffeeItem(
//            R.drawable.star_espresso,
//            "에스프레소 로스트", 11, R.drawable.nes_11, 1, 1, 0, 0,0,0,0,
//            "리치함 & 캐러멜향",
//            "커피의 강렬함과 캐러멜향의 달콤함이 있는 레시피",
//            "스타벅스의 에스프레소 기반 음료는 모두 여기에서 시작됩니다. 1975년, 원두와 로스팅의 완벽한 조화를 찾기 위해 수개월간 강도높은 연구를 거듭한 결과 오늘날 당신이 손에 든 바로 그 커피가 탄생했습니다. 캐러멜의 달콤함이 있는 레시피 - 너무 완벽해서 지금까지도 바꾸지 않고 사용하고 있습니다.",
//            "알루미늄은 커피를 외부로부터 보호하면서도 향을 안쪽에 가둬줍니다. 오늘날 사용되는 원재료 중 가장 보호력이 뛰어나 커피의 향과 풍미를 신선하게 보존합니다. 경량이면서도 튼튼한 점이 특징으로, 산소나 습기, 빛 등 유해할 수 있는 외부 요소로부터 내용물을 밀폐해줍니다.",
//            "수집 장소: 사용한 캡슐을 폐기물 센터나 가까운 네스프레소 부티크로 가져오세요.\n" +
//                    " \n" +
//                    "\n" +
//                    "집에서 재활용하기:  집에서 재활용하기 서비스를 이용할 경우, 무료 재활용 백을 요청하실 수 있습니다. 고객 서비스: 080-234-0001로 문의해주시기 바랍니다.\n" +
//                    "\n" +
//                    "재활용 백에는 개당 최대 200캡슐을 넣을 수 있습니다.",
//            "스타벅스의 전문가가 기꺼이 도와드립니다. Starbucks® for Nespresso에 대해 궁금한 점이 있으시다면 080-234-0001으로 문의해주시기 바랍니다.",
//            "",
//            "알루미늄캡슐"
//        ))
}
