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

        for(illy in dunkinList){
            db.collection("dunkin").document()
                .set(illy)
                .addOnSuccessListener { Log.d("TAG", "DocumentSnapshot successfully written!") }
                .addOnFailureListener { e -> Log.w("TAG", "Error writing document", e) }
        }

    }
        var dunkinList = arrayListOf<CoffeeItem>(
        CoffeeItem(
            "https://firebasestorage.googleapis.com/v0/b/capcoffee-681ba.appspot.com/o/dunkin_espresso.png?alt=media&token=33f76e68-0935-407f-a272-65f49aa53eb9",
            "에스프레소 블렌드", 0, "https://firebasestorage.googleapis.com/v0/b/capcoffee-681ba.appspot.com/o/nes_0.png?alt=media&token=da321304-7b47-4901-910d-51d3d7261f2f", 1, 1, 0, 0,0,0,0,
            "Espresso Blend",
            "던킨 에스프레소 고유의 다크초콜렛, 카카오의 풍미를 느낄 수 있는 커피",
            "집에서도 던킨 커피를 그대로 즐기세요",
            "커피원두 100% :\n니카라과산 50%\n콜롬비아산 25%\n파푸아뉴기니산 25%",
            "30g (5g x 6개입)",
            "특허를 받은 이중캡슐 구조로, 외부로부터 산소의 침투를 차단하여 Aroma의 보존력이 뛰어나, 타제품대비 맛과 향이 오래 보존",
            "",
            "알루미늄캡슐",
            "https://firebasestorage.googleapis.com/v0/b/capcoffee-681ba.appspot.com/o/dunkin_espresso_com1.png?alt=media&token=630b4006-98dc-4989-996b-70969519cf00",
            "https://firebasestorage.googleapis.com/v0/b/capcoffee-681ba.appspot.com/o/dunkin_espresso_com2.png?alt=media&token=14288e05-061d-4918-8dda-30552b8bef3d",
            "https://firebasestorage.googleapis.com/v0/b/capcoffee-681ba.appspot.com/o/dunkin_com3.png?alt=media&token=cf672ca3-acf0-43ab-8d8b-c29bfe4a53e4"
        ),
        CoffeeItem(
            "https://firebasestorage.googleapis.com/v0/b/capcoffee-681ba.appspot.com/o/dunkin_chelsea.png?alt=media&token=c7edca11-ccf8-4049-aea1-4e90cd582ab9",
            "첼시 바이브", 0, "https://firebasestorage.googleapis.com/v0/b/capcoffee-681ba.appspot.com/o/nes_0.png?alt=media&token=da321304-7b47-4901-910d-51d3d7261f2f", 1, 1, 0, 0,0,0,0,
            "Chelsea Vibe",
            "도시 속 자유로움이 빛나는 첼시, 뉴욕",
            "과거의 다이나믹함과 현재의 세련됨을 느끼고 싶다면, \n첼시바이브와 함께하세요\n마지막까지 부드러운 커피",
            "커피원두 100% :\n브라질산 50%\n파푸아뉴기니산 30%",
            "30g (5g x 6개입)",
            "특허를 받은 이중캡슐 구조로, 외부로부터 산소의 침투를 차단하여 Aroma의 보존력이 뛰어나, 타제품대비 맛과 향이 오래 보존",
            "",
            "알루미늄캡슐",
            "https://firebasestorage.googleapis.com/v0/b/capcoffee-681ba.appspot.com/o/dunkin_chelsea_com1.png?alt=media&token=e7f62663-f0f3-4930-9dd2-04d903f878ad",
            "https://firebasestorage.googleapis.com/v0/b/capcoffee-681ba.appspot.com/o/dunkin_chelsea_com2.png?alt=media&token=c3473c47-b89d-445f-b7fd-ccef073dc254",
            "https://firebasestorage.googleapis.com/v0/b/capcoffee-681ba.appspot.com/o/dunkin_com3.png?alt=media&token=cf672ca3-acf0-43ab-8d8b-c29bfe4a53e4"
        ),
        CoffeeItem(
            "https://firebasestorage.googleapis.com/v0/b/capcoffee-681ba.appspot.com/o/dunkin_longbeach.png?alt=media&token=e6be071f-fb56-43d7-be9f-73ef6772ccaf",
            "롱 비치 블루 블랜드", 0, "https://firebasestorage.googleapis.com/v0/b/capcoffee-681ba.appspot.com/o/nes_0.png?alt=media&token=da321304-7b47-4901-910d-51d3d7261f2f", 1, 1, 0, 0,0,0,0,
            "Long Beach Blue",
            "아이스 커피로 마셨을 때 가장 맛있는 블렌딩",
            "#미디움로스팅 #산뜻하고 부드러운맛",
            "커피원두 100% :\n브라질산 40%\n콜롬비아산 30%\n우간다산 30%)",
            "30g (5g x 6개입)",
            "특허를 받은 이중캡슐 구조로, 외부로부터 산소의 침투를 차단하여 Aroma의 보존력이 뛰어나, 타제품대비 맛과 향이 오래 보존",
            "",
            "알루미늄캡슐",
            "https://firebasestorage.googleapis.com/v0/b/capcoffee-681ba.appspot.com/o/dunkin_long_com1.png?alt=media&token=9a050573-f2b6-46bb-a30a-59fdff8299aa",
            "https://firebasestorage.googleapis.com/v0/b/capcoffee-681ba.appspot.com/o/dunkin_long_com2.png?alt=media&token=8e56d5cc-2b3e-4b6e-8313-ae7c8a36839a",
            "https://firebasestorage.googleapis.com/v0/b/capcoffee-681ba.appspot.com/o/dunkin_com3.png?alt=media&token=cf672ca3-acf0-43ab-8d8b-c29bfe4a53e4"
        ),
        CoffeeItem(
            "https://firebasestorage.googleapis.com/v0/b/capcoffee-681ba.appspot.com/o/dunkin_esksta.png?alt=media&token=875c41c6-e75a-460d-a2ea-e561ef2c0372",
            "에스키스타뮤즈", 0, "https://firebasestorage.googleapis.com/v0/b/capcoffee-681ba.appspot.com/o/nes_0.png?alt=media&token=da321304-7b47-4901-910d-51d3d7261f2f", 1, 1, 0, 0,0,0,0,
            "Esksta Muse Blend",
            "",
            "",
            "커피원두 100% :\n브라질산 60%\n에티오피아산 40%)",
            "30g (5g x 6개입)",
            "특허를 받은 이중캡슐 구조로, 외부로부터 산소의 침투를 차단하여 Aroma의 보존력이 뛰어나, 타제품대비 맛과 향이 오래 보존",
            "",
            "알루미늄캡슐",
            "https://firebasestorage.googleapis.com/v0/b/capcoffee-681ba.appspot.com/o/dunkin_esta_com2.png?alt=media&token=4bfbcf4c-f1d8-4e3f-a6f5-d3f84a514763",
            "https://firebasestorage.googleapis.com/v0/b/capcoffee-681ba.appspot.com/o/dunkin_esta_com1.png?alt=media&token=a942ebcf-48f6-43b7-aedc-e93f0c59973f",
            "https://firebasestorage.googleapis.com/v0/b/capcoffee-681ba.appspot.com/o/dunkin_com3.png?alt=media&token=cf672ca3-acf0-43ab-8d8b-c29bfe4a53e4"
        )
    )


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
            "알루미늄캡슐",
            "https://firebasestorage.googleapis.com/v0/b/capcoffee-681ba.appspot.com/o/illy_com1.png?alt=media&token=5425bc87-e63d-4174-934a-18b5620ecb67",
            "https://firebasestorage.googleapis.com/v0/b/capcoffee-681ba.appspot.com/o/illy_com2.png?alt=media&token=8e9296d1-4dc0-4287-add5-2e1ecc1e612f",
            "https://firebasestorage.googleapis.com/v0/b/capcoffee-681ba.appspot.com/o/illy_com3.png?alt=media&token=f808c112-8cd3-400e-8643-b94acee91d7c"
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
            "알루미늄캡슐",
            "https://firebasestorage.googleapis.com/v0/b/capcoffee-681ba.appspot.com/o/illy_com1.png?alt=media&token=5425bc87-e63d-4174-934a-18b5620ecb67",
            "https://firebasestorage.googleapis.com/v0/b/capcoffee-681ba.appspot.com/o/illy_com2.png?alt=media&token=8e9296d1-4dc0-4287-add5-2e1ecc1e612f",
            "https://firebasestorage.googleapis.com/v0/b/capcoffee-681ba.appspot.com/o/illy_com3.png?alt=media&token=f808c112-8cd3-400e-8643-b94acee91d7c"
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
            "알루미늄캡슐",
            "https://firebasestorage.googleapis.com/v0/b/capcoffee-681ba.appspot.com/o/illy_com1.png?alt=media&token=5425bc87-e63d-4174-934a-18b5620ecb67",
            "https://firebasestorage.googleapis.com/v0/b/capcoffee-681ba.appspot.com/o/illy_com2.png?alt=media&token=8e9296d1-4dc0-4287-add5-2e1ecc1e612f",
            "https://firebasestorage.googleapis.com/v0/b/capcoffee-681ba.appspot.com/o/illy_com3.png?alt=media&token=f808c112-8cd3-400e-8643-b94acee91d7c"
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
            "알루미늄캡슐",
            "https://firebasestorage.googleapis.com/v0/b/capcoffee-681ba.appspot.com/o/illy_com1.png?alt=media&token=5425bc87-e63d-4174-934a-18b5620ecb67",
            "https://firebasestorage.googleapis.com/v0/b/capcoffee-681ba.appspot.com/o/illy_com2.png?alt=media&token=8e9296d1-4dc0-4287-add5-2e1ecc1e612f",
            "https://firebasestorage.googleapis.com/v0/b/capcoffee-681ba.appspot.com/o/illy_com3.png?alt=media&token=f808c112-8cd3-400e-8643-b94acee91d7c"
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
            "알루미늄캡슐",
            "https://firebasestorage.googleapis.com/v0/b/capcoffee-681ba.appspot.com/o/illy_com1.png?alt=media&token=5425bc87-e63d-4174-934a-18b5620ecb67",
            "https://firebasestorage.googleapis.com/v0/b/capcoffee-681ba.appspot.com/o/illy_com2.png?alt=media&token=8e9296d1-4dc0-4287-add5-2e1ecc1e612f",
            "https://firebasestorage.googleapis.com/v0/b/capcoffee-681ba.appspot.com/o/illy_com3.png?alt=media&token=f808c112-8cd3-400e-8643-b94acee91d7c"
        )
    )
}
