package com.example.capcoffee

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.capcoffee.datas.CoffeeItem
import com.google.firebase.firestore.FirebaseFirestore

class InsertActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_insert)

        val db: FirebaseFirestore = FirebaseFirestore.getInstance()

        for(illy in illyList){
            db.collection("illy").document()
                .set(illy)
                .addOnSuccessListener { Log.d("TAG", "DocumentSnapshot successfully written!") }
                .addOnFailureListener { e -> Log.w("TAG", "Error writing document", e) }
        }

    }


        var illyList = arrayListOf<CoffeeItem>(
        CoffeeItem(
            "https://firebasestorage.googleapis.com/v0/b/capcoffee-681ba.appspot.com/o/illy_classico_lungo.png?alt=media&token=459237f7-3f2c-4751-a398-1ec7057e11a1",
            "클라스코", 5,
            "https://firebasestorage.googleapis.com/v0/b/capcoffee-681ba.appspot.com/o/illy_5.png?alt=media&token=aa492ce3-6754-4bed-9bd0-0a99f3f9f9bb", 1, 1, 0, 0,0,0,0,
            "Classico",
            "가장 고전적인 일리맛을 느끼는 맛으로 달콤한 카라멜, 오렌지 꽃, 자스민의 향긋한 조화가 균형있게 어우리전 로스트",
            "*본 제품은 Nespresso 커피 머신용으로 일리 머신에서는 사용하실 수 없습니다. \n캡슐 커피 구매시 이점 참고바랍니다.",
            "일리 커피는 1930년대 특허 받은 압축 포장 방식을 이용해 일리만의 진하고 풍부한 향을 보증합니다.",
            "과학적인 분석을 통해 최고 품질의 생두를 가려낸 후 상을 수여하며, 수상자들은 상금과 함께 시장가격보다 더 높은 가격으로 생두를 공급하게 됩니다.",
            "일리커피는 아라비카 원두만을 사용하여 독보적인 블랜딩으로 탄생했습니다.",
            "아라비카 원두커피 100%\n원산지 : 프링스\n용량 : 57g (5.7g x 10ea) \n보관방법 : 직사광선을 피하여, 건조하고 서능한 곳에 보관.",
            "알루미늄캡슐"
        ),
        CoffeeItem(
            "https://firebasestorage.googleapis.com/v0/b/capcoffee-681ba.appspot.com/o/illy_classico.png?alt=media&token=0b2dd6af-f1d0-4957-8981-87fba3f26811",
            "클라스코 룽고", 5,
            "https://firebasestorage.googleapis.com/v0/b/capcoffee-681ba.appspot.com/o/illy_5.png?alt=media&token=aa492ce3-6754-4bed-9bd0-0a99f3f9f9bb", 0, 0, 1, 0,0,0,0,
            "Classico Lungo",
            "롱 에스프레소를 추출하는 캡슐 커피로 달콤한 카라멜, 오렌지 꽃, 자스민의 향긋한 조화가 균형있게 많은 양의 커피를 즐길 수 있는 로스트",
            "*본 제품은 Nespresso 커피 머신용으로 일리 머신에서는 사용하실 수 없습니다. \n캡슐 커피 구매시 이점 참고바랍니다.",
            "일리 커피는 1930년대 특허 받은 압축 포장 방식을 이용해 일리만의 진하고 풍부한 향을 보증합니다.",
            "과학적인 분석을 통해 최고 품질의 생두를 가려낸 후 상을 수여하며, 수상자들은 상금과 함께 시장가격보다 더 높은 가격으로 생두를 공급하게 됩니다.",
            "일리커피는 아라비카 원두만을 사용하여 독보적인 블랜딩으로 탄생했습니다.",
            "아라비카 원두커피 100%\n원산지 : 프링스\n용량 : 57g (5.7g x 10ea) \n보관방법 : 직사광선을 피하여, 건조하고 서능한 곳에 보관.",
            "알루미늄캡슐"
        ),
        CoffeeItem(
            "https://firebasestorage.googleapis.com/v0/b/capcoffee-681ba.appspot.com/o/illy_intenso.png?alt=media&token=4b81d7ca-a71b-43cf-a9ff-c4e63f480664",
        "인텐소", 7, "https://firebasestorage.googleapis.com/v0/b/capcoffee-681ba.appspot.com/o/illy_7.png?alt=media&token=dc15ed1d-c48b-4e13-9871-093d0a21714a", 1, 1, 0, 0,0,0,0,
        "Intenso",
        "다크 로스팅으로 코코아와 말린 과일향이 나며, 강렬한 뒷 맛의 로스트으로 감칠맛이 나는 향긋함을 느끼게 하는 맛",
        "*본 제품은 Nespresso 커피 머신용으로 일리 머신에서는 사용하실 수 없습니다. \n캡슐 커피 구매시 이점 참고바랍니다.",
        "일리 커피는 1930년대 특허 받은 압축 포장 방식을 이용해 일리만의 진하고 풍부한 향을 보증합니다.",
        "과학적인 분석을 통해 최고 품질의 생두를 가려낸 후 상을 수여하며, 수상자들은 상금과 함께 시장가격보다 더 높은 가격으로 생두를 공급하게 됩니다.",
        "일리커피는 아라비카 원두만을 사용하여 독보적인 블랜딩으로 탄생했습니다.",
        "아라비카 원두커피 100%\n원산지 : 프링스\n용량 : 57g (5.7g x 10ea) \n보관방법 : 직사광선을 피하여, 건조하고 서능한 곳에 보관.",
            "알루미늄캡슐"
        ),
        CoffeeItem(
            "https://firebasestorage.googleapis.com/v0/b/capcoffee-681ba.appspot.com/o/illy_forte.png?alt=media&token=18bf53c9-affa-4fc6-adb0-48fa8c09c471",
            "포르테", 9, "https://firebasestorage.googleapis.com/v0/b/capcoffee-681ba.appspot.com/o/illy_9.png?alt=media&token=7a15df2b-f26e-493a-9244-bd1702ed417c", 1, 1, 0, 0,0,0,0,
           "Forte",
            "풍부한 향과 진한 맛으로 다크 초코릿과 토스트의 강렬한 향을 느낄 수 있는 로스트으로 오래 지속되는 됫맛을 가진 강력하고 아로마틱한 맛의 경험을 느끼게 하는 맛",
            "*본 제품은 Nespresso 커피 머신용으로 일리 머신에서는 사용하실 수 없습니다. \n캡슐 커피 구매시 이점 참고바랍니다.",
            "일리 커피는 1930년대 특허 받은 압축 포장 방식을 이용해 일리만의 진하고 풍부한 향을 보증합니다.",
            "과학적인 분석을 통해 최고 품질의 생두를 가려낸 후 상을 수여하며, 수상자들은 상금과 함께 시장가격보다 더 높은 가격으로 생두를 공급하게 됩니다.",
            "일리커피는 아라비카 원두만을 사용하여 독보적인 블랜딩으로 탄생했습니다.",
            "아라비카 원두커피 100%\n원산지 : 프링스\n용량 : 57g (5.7g x 10ea) \n보관방법 : 직사광선을 피하여, 건조하고 서능한 곳에 보관.",
            "알루미늄캡슐"
        ),
        CoffeeItem(
            "https://firebasestorage.googleapis.com/v0/b/capcoffee-681ba.appspot.com/o/illy_decaf.png?alt=media&token=572cf156-ec20-436d-b08a-0898fe5ed2ec",
            "디카페인", 5, "https://firebasestorage.googleapis.com/v0/b/capcoffee-681ba.appspot.com/o/illy_5.png?alt=media&token=aa492ce3-6754-4bed-9bd0-0a99f3f9f9bb", 1, 1, 0, 0,0,0,0,
            "Decaf",
            "카페인 함량이 0.1% 미만인 디카페인 캡슐로 신맛과 쓴맛의 균형이 일품",
            "*본 제품은 Nespresso 커피 머신용으로 일리 머신에서는 사용하실 수 없습니다. \n캡슐 커피 구매시 이점 참고바랍니다.",
            "일리 커피는 1930년대 특허 받은 압축 포장 방식을 이용해 일리만의 진하고 풍부한 향을 보증합니다.",
            "과학적인 분석을 통해 최고 품질의 생두를 가려낸 후 상을 수여하며, 수상자들은 상금과 함께 시장가격보다 더 높은 가격으로 생두를 공급하게 됩니다.",
            "일리커피는 아라비카 원두만을 사용하여 독보적인 블랜딩으로 탄생했습니다.",
            "아라비카 원두커피 100%\n원산지 : 프링스\n용량 : 57g (5.7g x 10ea) \n보관방법 : 직사광선을 피하여, 건조하고 서능한 곳에 보관.",
            "알루미늄캡슐"
        )
    )
}