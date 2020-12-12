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


class NespressoItalianoActivity : AppCompatActivity() {

    var nespressoList = ArrayList<CoffeeItem>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nespresso)

        val db: FirebaseFirestore = FirebaseFirestore.getInstance()


        db.collection("nespresso")
            .get()
            .addOnSuccessListener { result ->
                for (document in result) {
                    var coffee: CoffeeItem = document.toObject(CoffeeItem::class.java)
                    nespressoList.add(coffee)

                }

                recycler_view.adapter =
                    CoffeeAdapter(this, nespressoList) { coffeeItem ->
                        val intent = Intent(
                            this,
                            CoffeeDetailActivity::class.java
                        )
                        intent.putExtra("brand", "Nespresso")

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



//    var nespressoList = arrayListOf<CoffeeItem>(
//        CoffeeItem(
//            R.drawable.nes_kazaar,
//            "팔레르모 카자르", 12,
//            R.drawable.nes_12, 1, 1, 0, 4,5,1,5,
//            "우디향",
//            "오랜 시간 다크로스팅한 스파이시향을 지닌 커피",
//            "오랜 시간 정성 들여 다크 로스팅한 커피로 아프리카와 아라비아 문화에서 영향을 받은 시칠리아 커피 예술에서 영감을 받아 완성되었습니다.",
//            "팔레르모의 역사에서 영감을 받아 4종류의 원두를 엄선 했습니다. 전통적으로 커피의 강한 맛은 무세척 로부스타에서 나옵니다. 이는 이탈리아 남부 지역의 커피 블렌드 특징 입니다. 그러나 이스피라치오네 팔레르모 카자르는 세척 가공 로부스타를 더해 깔끔한 맛과 부드러운 질감을 선사하는 균형감 있는 귀한 커피 입니다. 그 밖에 남미산 아라비카를 블렌딩하여 천연이 단맛도 함께 느끼 실 수 있습니다.",
//            "이스피라치오네 팔레르모 카자르는 각 원두의 개성을 살리기 위해 개별 로스팅 합니다. 대부분의 아라비카와 로부스타는 쓴맛과 진한 바디감을 이끌어내기 위해 강하게 로스팅 합니다. 여기에 아로마의 섬세함을 이끌어내기 위해 무세척 로부스타를 블렌딩 해 더욱 짧은 시간 동안 라이트 로스팅 했습니다. 이러한 이스피라치오네 팔레르모 카자르의 로스팅 스타일은 이탈리아 남부의 진하고 강렬한 커피에 영향을 준 아랍과 아프리카의 커피 문화를 반영 합니다.",
//            "팔레르모의 해안 생활과 풍부한 역사에서 영감을 얻어 완성된 커피 입니다. 아라비카와 로부스타가 균형을 이루며 농후한 바디감이 선사하는 와일드한 풍미와 스파이시 향을 느끼실 수 있습니다. 뜨거운 태양 아래 테라스에 앉아 이스피라치오네 팔레르모 카자르를 즐겨보세요. 이 커피 한잔은 접시 위 음식부터 팔레르모를 스쳐지나간 모든 사람들의 이야기를 속삭여주는 건축물까지 고대 커피 무역의 중심지, 팔레르모의 모든 것을 담고 있습니다.",
//            " 네스프레소 커피머신과 함께 사용 가능한 커피 캡슐 10개\n\n 주요 성분\n 로스팅된 분쇄 커피 원두 100%\n\n 중량 (10개 커피 캡슐)\n 60g\n\n 원산지 : 스위스",
//            "알루미늄캡슐"
//            ),
//        CoffeeItem(
//            R.drawable.nes_italiano,
//            "리스트레토 이탈리아노",10,
//            R.drawable.nes_10,1,1,0,4,4,3,4,
//            "진한 로스팅향, 은은한 과일향",
//            "미디엄 다크로스팅한 로스팅향과 과일향이 조화로운 커피",
//            "짧고 진한 커피를 즐기는 이탈리아의 상징적인 커피 문화를 반영한 미디엄 다크 로스팅 커피 입니다. 작은 한 잔으로 균형 잡힌 커피 본연의 맛을 즐길 수 있습니다.",
//            "네스프레소의 커피 전문가들은 이탈리아 최고의 커피 바와 로스터를 조사하고 시음 경험에서 영감을 얻어 세 곳의 커피 생산 대륙에서 아라비카와 로부스타를 가져와 정교한 레시피를 만들었습니다. 브라질산 아라비카를 베이스로 남인도산 로부스타를 더해 스파이시한 풍미를 이끌어내고 남미와 동아프리카산 최상급 아라비카를 더해 신선한 과일향이 은은하게 퍼지는 리스트레토 이탈리아나를 완벽하게 완성했습니다.",
//            "개별 로스팅을 통해 원두 각각의 개성을 살리고 균형감 있는 커피를 완성 했습니다. 로부스타를 오랜 시간 로스팅해 바디감, 로스팅 향, 코코아의 쓴맛을 이끌어내고 아라비카는 빠르게 로스팅 해 산뜻한 산미와 신선한 과일 향을 더했습니다. 이탈리아의 커피의 풍부한 역사를 반영한 이스피라치오네 리스트레토 이탈리아노를 만나보세요.",
//            "로스팅향과 강도가 강한 편이지만 과일향과 은은한 산미가 함께 조화를 이루는 이스피라치오네 리스트레토 이탈리아노는 복합적이면서 신비하고 매력적인 커피 입니다. 이탈리아 사람들의 커피에 대한 열정과 커피가 일상에 뿌리를 내리게 된 이유를 알려주는 이탈리아 대표 커피의 특성을 갖추었습니다. 정통 커피 답게 25 ml로 추출하는 이 커피는 이탈리아 사람들의 지혜를 보여주며 적은 양이지만 최상의 만족감을 선사 합니다.",
//            "네스프레소 커피머신과 함께 사용 가능한 커피 캡슐 10개\n" +
//                    "주요 성분\n" +
//                    "로스팅된 분쇄 커피 원두 100%\n" +
//                    "중량 (10개 커피 캡슐)\n" +
//                    "57g\n" +
//                    "원산지 : 스위스",
//            "알루미늄캡슐"),
//        CoffeeItem(
//            R.drawable.nes_arpeggio,
//            "피렌체 아르페지오",9, R.drawable.nes_9,1,1,0,4,4,2,4,
//            "강렬함, 진한 로스팅향, 코코아향",
//            "짧은 시간 다크로스팅한 코코아향을 지닌 커피",
//            "이탈리아 문화 예술의 중심지인 피렌체에서 영감을 받아 짧은 시간동안 다크 로스팅 해 완성한 예술 작품 같은 커피입니다.",
//            "1993년 아르페지오라는 이름으로 처음 소개된 이스피라치오네 피렌체 아르페지오는 네스프레소 커피 중 가장 사랑받고 있는 커피 입니다. 이 커피는 맥아향이 진한 코스타리카산 원두를 중심으로 강렬하고 순수한 아라비카의 블렌드를 딥 로스팅 하여, 코코아향을 끌어내었으며 이를 매우 정교하게 그라인딩 하여 벨벳처럼 부드럽고 크리미한 질감을 표현했습니다.",
//            "이스피라치오네 피렌체 아르페지오는 이탈리아 북부의 가벼운 풍미와 남부의 진한 풍미가 모두 조화롭게 나타나는 피렌체의 커피 문화에 경의를 표하기 위해 완성한 커피 입니다. 원두는 강하게 로스팅해 맥아향과 코코아향이 균형을 이루며 한잔의 컵에서 각각의 아라비카 원두의 풍미를 느낄 수 있습니다.",
//            "이스피라치오네 피렌체 아르페지오는 진하면서 크리미한 질감과 강렬한 로스팅향과 코코아향이 조화를 이룹니다. 여기에 벨벳처럼 부드러워 거부할 수 없는 질감을 선사하는 크레마까지 더해져 예술 작품 같은 커피를 느낄 수 있습니다.",
//            "네스프레소 커피머신과 함께 사용 가능한 커피 캡슐 10개\n" +
//                    "주요 성분\n" +
//                    "로스팅된 분쇄 커피 원두 100%\n" +
//                    "중량 (10개 커피 캡슐)\n" +
//                    "53g - 5.3g x 10\n" +
//                    "원산지 : 스위스",
//            "알루미늄캡슐"),
//        CoffeeItem(
//            R.drawable.nes_roma,
//            "로마",8, R.drawable.nes_8,1,1,0,3,4,4,3,
//            "우디향, 국물향",
//            "짧은 시간 라이트로스팅한 부드로운 커피",
//            "로마의 찬란한 역사와 현대적인 우아함을 표현하기 위해 짧은 시간 로스팅 해 강렬한 풍미와 우아한 아로마가 균형감 있는 커피로 완성 했습니다. 이제 한잔의 커피로 로마의 휴일을 즐겨보세요.",
//            "균형 잡힌 곡물향을 내는 브라질 산 천연 아라비카와 로부스타를 살짝 블렌딩 해 미묘한 우디향을 이끌어 냅니다. 우아한 아로마를 지닌 멕시코산 아라비카는 비가 내리면 커피 나무의 그늘과 서늘함을 제공해 주는 무성한 숲이 우거진 비옥한 화산토에서 재배 됩니다. 이러한 특별한 테루아의 혜택을 받으며 자라는 멕시코 남동부산 아라비카는 이 블렌드에 고급스러운 아로마를 더해 줍니다.",
//            "강렬한 풍미를 이끌어 내기 위해 라이트 로스팅 한 커피로 진한 풍미와 함께 우아함을 선사하는 은은한 산미와 로스팅 향이 조화롭게 어우러 집니다. 각각의 커피 원두는 개별 로스팅 해 개성을 살립니다. 깊은 로스팅 향을 내는 브라질산 원두를 베이스로 라이트 로스팅한 멕시코 산 아라비카를 살짝 더해 섬세하고 향긋한 아로마를 완성합니다. 이 섬세한 아로마는 커피 원두를 곱게 그라인딩 해 보존 합니다. 이스피라치오네 로마로 강렬하면서도 부드러운 로마의 커피를 경험해보세요.",
//            "고대 시대부터 여러 위대한 문화가 로마라는 대도시를 거쳐갔습니다. 현대의 로마는 이러한 찬란한 역사에 현대적 우아함이 조화를 이루고 있습니다. 이스피라치오네 로마 역시 다양한 아로마가 아름답게 조화를 이루는 커피로서 커피의 강도, 진한 우디향과 곡물향, 그리고 섬세한 산미와 우아한 아로마가 절묘하게 균형을 이룹니다.",
//            "네스프레소 커피머신과 함께 사용 가능한 커피 캡슐 10개\n" +
//                    "주요 성분\n" +
//                    "로스팅된 분쇄 커피 원두 100%\n" +
//                    "중량 (10개 커피 캡슐)\n" +
//                    "50g - 5g x 10\n" +
//                    "원산지 : 스위스",
//            "알루미늄캡슐"),
//        CoffeeItem(
//            R.drawable.nes_livanto,
//            "제노바 리반토",6,
//            R.drawable.nes_6,0,1,0,3,3,3,3,
//            "캐러멜향, 균형감",
//            "오랜 시간 미디엄로스팅한 국물향과 캐러멜향이 조화로운 커피",
//            "이탈리아 북부의 대표 항구 도시인 제노바에서는 최상의 남미산 아라비카를 수입해 달콤한 풍미의 미디엄 로스팅 커피를 즐겨마셨습니다. 이제 집에서도 편히 제노바의 커피 문화를 경험해 보세요.",
//            "북부 이탈리아 커피의 대표적인 특징인 부드러운 질감과 섬세한 아로마를 되살린 이스피라치오네 제노바 리반토는 다양한 맛이 조화로운 아라비카 중심의 블렌드 커피 입니다. 북부 이탈리아 커피를 표현하기 위해 대중적인 맛을 내는 부드러운 브라질산 아라비카를 베이스로 로스팅 과정에서 맥아향과 과일향이 드러나는 중남미 고산 지대의 아라비카를 선택해 블렌딩 했습니다.",
//            "이탈리아 북부 지역에서는 주로 라이트 로스팅한 커피를 즐깁니다. 이스피라치오네 제노바 리반토는 이러한 이탈리아 북부 지역의 커피 문화에 영감을 받고, 또한 다크 로스팅이 특징인 남부 지역보다 더 가볍지만 달콤한 캐러멜향과 고소한 곡물향을 이끌어 내는 다크한 풍미가 유지 될 수 있도록 미디엄 로스팅을 적용 했습니다. 그 결과 입안 가득 균형 잡힌 맛과 부드러운 산미가 특징인 이스피라치오네 제노바 리반토가 탄생 했습니다.",
//            "이스피라치오네 제노바 리반토는 부드러운 질감과 섬세한 아로마가 균형을 이루는 커피입니다. 아주 가볍게 로스팅해 부드러우면서 입안 가득 풀 바디감을 살리고 섬세한 아로마와 함께 고소한 곡물 향과 달콤한 캐러멜 향을 이끌어 냈습니다.",
//            "네스프레소 커피머신과 함께 사용 가능한 커피 캡슐 10개\n" +
//                    "주요 성분\n" +
//                    "로스팅된 분쇄 커피 원두 100%\n" +
//                    "중량 (10개 커피 캡슐)\n" +
//                    "원산지 : 스위스",
//            "알루미늄캡슐")
//        NespressoItem(R.drawable.nes_bluto, "불루토",5,R.drawable.nes_5,0,1,0),
//        NespressoItem(R.drawable.nes_indonesia, "인도네시아",8,R.drawable.nes_8,0,1,1),
//        NespressoItem(R.drawable.nes_nikara, "니카라과",5,R.drawable.nes_5,0,1,1),
//        NespressoItem(R.drawable.nes_linigio, "리니지오 룽고",4,R.drawable.nes_4,0,0,1),
//        NespressoItem(R.drawable.nes_arpegio_decaf, "피렌체 아르페지오 decaf",9,R.drawable.nes_9,1,1,0),
//        NespressoItem(R.drawable.nes_caramel, "캐러멜향 크렘 브륄레",0,R.drawable.nes_0,1,1,0),
//        NespressoItem(R.drawable.nes_vanila, "바닐라향 에클레어",0,R.drawable.nes_0,1,1,0)
//
//    )

}
