package com.mj.capcoffee.brand

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.mj.capcoffee.CoffeeAdapter
import com.mj.capcoffee.CoffeeDetailActivity
import com.mj.capcoffee.R
import com.mj.capcoffee.datas.CoffeeItem
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.android.synthetic.main.activity_nespresso.*


class IllyActivity : AppCompatActivity() {

    var illyList = ArrayList<CoffeeItem>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_illy)
        val db: FirebaseFirestore = FirebaseFirestore.getInstance()



        db.collection("illy")
            .get()
            .addOnSuccessListener { result ->
                for (document in result) {
                    var coffee: CoffeeItem = document.toObject(CoffeeItem::class.java)
                    illyList.add(coffee)

                }

                recycler_view.adapter =
                    CoffeeAdapter(this, illyList) { coffeeItem ->
                        val intent = Intent(
                            this,
                            CoffeeDetailActivity::class.java
                        )
                        intent.putExtra("Brand", "Illy")

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





//    var illyList = arrayListOf<CoffeeItem>(
//        CoffeeItem(
//            R.drawable.illy_classico_lungo,
//            "클라스코", 5, R.drawable.illy_5, 1, 1, 0, 0,0,0,0,
//            "Classico",
//            "가장 고전적인 일리맛을 느끼는 맛으로 달콤한 카라멜, 오렌지 꽃, 자스민의 향긋한 조화가 균형있게 어우리전 로스트",
//            "*본 제품은 Nespresso 커피 머신용으로 일리 머신에서는 사용하실 수 없습니다. \n캡슐 커피 구매시 이점 참고바랍니다.",
//            "일리 커피는 1930년대 특허 받은 압축 포장 방식을 이용해 일리만의 진하고 풍부한 향을 보증합니다.",
//            "과학적인 분석을 통해 최고 품질의 생두를 가려낸 후 상을 수여하며, 수상자들은 상금과 함께 시장가격보다 더 높은 가격으로 생두를 공급하게 됩니다.",
//            "일리커피는 아라비카 원두만을 사용하여 독보적인 블랜딩으로 탄생했습니다.",
//            "아라비카 원두커피 100%\n원산지 : 프링스\n용량 : 57g (5.7g x 10ea) \n보관방법 : 직사광선을 피하여, 건조하고 서능한 곳에 보관.",
//            "알루미늄캡슐"
//        )
//        CoffeeItem(
//            R.drawable.illy_classico,
//            "클라스코 룽고", 5,
//            R.drawable.illy_5, 0, 0, 1, 0,0,0,0,
//            "Classico Lungo",
//            "롱 에스프레소를 추출하는 캡슐 커피로 달콤한 카라멜, 오렌지 꽃, 자스민의 향긋한 조화가 균형있게 많은 양의 커피를 즐길 수 있는 로스트",
//            "*본 제품은 Nespresso 커피 머신용으로 일리 머신에서는 사용하실 수 없습니다. \n캡슐 커피 구매시 이점 참고바랍니다.",
//            "일리 커피는 1930년대 특허 받은 압축 포장 방식을 이용해 일리만의 진하고 풍부한 향을 보증합니다.",
//            "과학적인 분석을 통해 최고 품질의 생두를 가려낸 후 상을 수여하며, 수상자들은 상금과 함께 시장가격보다 더 높은 가격으로 생두를 공급하게 됩니다.",
//            "일리커피는 아라비카 원두만을 사용하여 독보적인 블랜딩으로 탄생했습니다.",
//            "아라비카 원두커피 100%\n원산지 : 프링스\n용량 : 57g (5.7g x 10ea) \n보관방법 : 직사광선을 피하여, 건조하고 서능한 곳에 보관.",
//            "알루미늄캡슐"
//        ),
//        CoffeeItem(
//            R.drawable.illy_intenso,
//        "인텐소", 7, R.drawable.illy_7, 1, 1, 0, 0,0,0,0,
//        "Intenso",
//        "다크 로스팅으로 코코아와 말린 과일향이 나며, 강렬한 뒷 맛의 로스트으로 감칠맛이 나는 향긋함을 느끼게 하는 맛",
//        "*본 제품은 Nespresso 커피 머신용으로 일리 머신에서는 사용하실 수 없습니다. \n캡슐 커피 구매시 이점 참고바랍니다.",
//        "일리 커피는 1930년대 특허 받은 압축 포장 방식을 이용해 일리만의 진하고 풍부한 향을 보증합니다.",
//        "과학적인 분석을 통해 최고 품질의 생두를 가려낸 후 상을 수여하며, 수상자들은 상금과 함께 시장가격보다 더 높은 가격으로 생두를 공급하게 됩니다.",
//        "일리커피는 아라비카 원두만을 사용하여 독보적인 블랜딩으로 탄생했습니다.",
//        "아라비카 원두커피 100%\n원산지 : 프링스\n용량 : 57g (5.7g x 10ea) \n보관방법 : 직사광선을 피하여, 건조하고 서능한 곳에 보관.",
//            "알루미늄캡슐"
//        ),
//        CoffeeItem(
//            R.drawable.illy_forte,
//            "포르테", 9, R.drawable.illy_9, 1, 1, 0, 0,0,0,0,
//           "Forte",
//            "풍부한 향과 진한 맛으로 다크 초코릿과 토스트의 강렬한 향을 느낄 수 있는 로스트으로 오래 지속되는 됫맛을 가진 강력하고 아로마틱한 맛의 경험을 느끼게 하는 맛",
//            "*본 제품은 Nespresso 커피 머신용으로 일리 머신에서는 사용하실 수 없습니다. \n캡슐 커피 구매시 이점 참고바랍니다.",
//            "일리 커피는 1930년대 특허 받은 압축 포장 방식을 이용해 일리만의 진하고 풍부한 향을 보증합니다.",
//            "과학적인 분석을 통해 최고 품질의 생두를 가려낸 후 상을 수여하며, 수상자들은 상금과 함께 시장가격보다 더 높은 가격으로 생두를 공급하게 됩니다.",
//            "일리커피는 아라비카 원두만을 사용하여 독보적인 블랜딩으로 탄생했습니다.",
//            "아라비카 원두커피 100%\n원산지 : 프링스\n용량 : 57g (5.7g x 10ea) \n보관방법 : 직사광선을 피하여, 건조하고 서능한 곳에 보관.",
//            "알루미늄캡슐"
//        ),
//        CoffeeItem(
//            R.drawable.illy_decaf,
//            "디카페인", 9, R.drawable.illy_5, 1, 1, 0, 0,0,0,0,
//            "Decaf",
//            "카페인 함량이 0.1% 미만인 디카페인 캡슐로 신맛과 쓴맛의 균형이 일품",
//            "*본 제품은 Nespresso 커피 머신용으로 일리 머신에서는 사용하실 수 없습니다. \n캡슐 커피 구매시 이점 참고바랍니다.",
//            "일리 커피는 1930년대 특허 받은 압축 포장 방식을 이용해 일리만의 진하고 풍부한 향을 보증합니다.",
//            "과학적인 분석을 통해 최고 품질의 생두를 가려낸 후 상을 수여하며, 수상자들은 상금과 함께 시장가격보다 더 높은 가격으로 생두를 공급하게 됩니다.",
//            "일리커피는 아라비카 원두만을 사용하여 독보적인 블랜딩으로 탄생했습니다.",
//            "아라비카 원두커피 100%\n원산지 : 프링스\n용량 : 57g (5.7g x 10ea) \n보관방법 : 직사광선을 피하여, 건조하고 서능한 곳에 보관.",
//            "알루미늄캡슐"
//        )
//    )
}
