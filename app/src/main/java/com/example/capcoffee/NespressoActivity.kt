package com.example.capcoffee

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.capcoffee.brand.NespressoDetailActivity
import com.example.capcoffee.datas.NespressoItem
import kotlinx.android.synthetic.main.activity_nespresso.*


class NespressoActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nespresso)

        recycler_view.adapter = CoffeeAdapter(this,nespressoList){
            coffeeItem ->  val intent = Intent(this, NespressoDetailActivity::class.java)
            intent.putExtra("Brand", "Nespresso")

            intent.putExtra("coffee",coffeeItem)
            startActivity(intent)

        }
        recycler_view.layoutManager = LinearLayoutManager(this)
        recycler_view.setHasFixedSize(true)


        back_btn.setOnClickListener { finish() }

    }



    var nespressoList = arrayListOf<NespressoItem>(
        NespressoItem(R.drawable.nes_kazaar,
            "팔레르모 카자르", 12, R.drawable.nes_12, 1, 1, 0, 4,5,1,5,
            "우디향",
            "오랜 시간 다크로스팅한 스파이시향을 지닌 커피",
            "오랜 시간 정성 들여 다크 로스팅한 커피로 아프리카와 아라비아 문화에서 영향을 받은 시칠리아 커피 예술에서 영감을 받아 완성되었습니다.",
            "팔레르모의 역사에서 영감을 받아 4종류의 원두를 엄선 했습니다. 전통적으로 커피의 강한 맛은 무세척 로부스타에서 나옵니다. 이는 이탈리아 남부 지역의 커피 블렌드 특징 입니다. 그러나 이스피라치오네 팔레르모 카자르는 세척 가공 로부스타를 더해 깔끔한 맛과 부드러운 질감을 선사하는 균형감 있는 귀한 커피 입니다. 그 밖에 남미산 아라비카를 블렌딩하여 천연이 단맛도 함께 느끼 실 수 있습니다.",
            "이스피라치오네 팔레르모 카자르는 각 원두의 개성을 살리기 위해 개별 로스팅 합니다. 대부분의 아라비카와 로부스타는 쓴맛과 진한 바디감을 이끌어내기 위해 강하게 로스팅 합니다. 여기에 아로마의 섬세함을 이끌어내기 위해 무세척 로부스타를 블렌딩 해 더욱 짧은 시간 동안 라이트 로스팅 했습니다. 이러한 이스피라치오네 팔레르모 카자르의 로스팅 스타일은 이탈리아 남부의 진하고 강렬한 커피에 영향을 준 아랍과 아프리카의 커피 문화를 반영 합니다.",
            "팔레르모의 해안 생활과 풍부한 역사에서 영감을 얻어 완성된 커피 입니다. 아라비카와 로부스타가 균형을 이루며 농후한 바디감이 선사하는 와일드한 풍미와 스파이시 향을 느끼실 수 있습니다. 뜨거운 태양 아래 테라스에 앉아 이스피라치오네 팔레르모 카자르를 즐겨보세요. 이 커피 한잔은 접시 위 음식부터 팔레르모를 스쳐지나간 모든 사람들의 이야기를 속삭여주는 건축물까지 고대 커피 무역의 중심지, 팔레르모의 모든 것을 담고 있습니다.",
            " 네스프레소 커피머신과 함께 사용 가능한 커피 캡슐 10개\n\n 주요 성분\n 로스팅된 분쇄 커피 원두 100%\n\n 중량 (10개 커피 캡슐)\n 60g\n\n 원산지 : 스위스"
            )
//        NespressoItem(R.drawable.nes_italiano, "리스트레토 이탈리아노",10,R.drawable.nes_10,1,1,0),
//        NespressoItem(R.drawable.nes_arpeggio, "피렌체 아르페지오",9,R.drawable.nes_9,1,1,0),
//        NespressoItem(R.drawable.nes_roma, "로마",8,R.drawable.nes_8,1,1,0),
//        NespressoItem(R.drawable.nes_livanto, "제노바 리반토",6,R.drawable.nes_6,0,1,0),
//        NespressoItem(R.drawable.nes_bluto, "불루토",5,R.drawable.nes_5,0,1,0),
//        NespressoItem(R.drawable.nes_indonesia, "인도네시아",8,R.drawable.nes_8,0,1,1),
//        NespressoItem(R.drawable.nes_nikara, "니카라과",5,R.drawable.nes_5,0,1,1),
//        NespressoItem(R.drawable.nes_linigio, "리니지오 룽고",4,R.drawable.nes_4,0,0,1),
//        NespressoItem(R.drawable.nes_arpegio_decaf, "피렌체 아르페지오 decaf",9,R.drawable.nes_9,1,1,0),
//        NespressoItem(R.drawable.nes_caramel, "캐러멜향 크렘 브륄레",0,R.drawable.nes_0,1,1,0),
//        NespressoItem(R.drawable.nes_vanila, "바닐라향 에클레어",0,R.drawable.nes_0,1,1,0)

    )

}
