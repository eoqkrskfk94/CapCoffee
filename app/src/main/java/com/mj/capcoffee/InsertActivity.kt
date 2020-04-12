package com.mj.capcoffee

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.mj.capcoffee.datas.CoffeeItem
import com.google.firebase.firestore.FirebaseFirestore

class InsertActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_insert)

        val db: FirebaseFirestore = FirebaseFirestore.getInstance()

        for(coffee in nespresso_barista){
            db.collection("nespresso_barista").document(coffee.capsule_name)
                .set(coffee)
                .addOnSuccessListener { Log.d("TAG", "DocumentSnapshot successfully written!") }
                .addOnFailureListener { e -> Log.w("TAG", "Error writing document", e) }
        }

    }

        var nespresso_barista = arrayListOf<CoffeeItem>(
        CoffeeItem(
            "https://firebasestorage.googleapis.com/v0/b/capcoffee-681ba.appspot.com/o/starbucks%2Fstar_espresso.png?alt=media&token=be0f14bc-0900-4cf5-b5a2-7b0bf5345b1b",
            "에스프레소 로스트", 11, "https://firebasestorage.googleapis.com/v0/b/capcoffee-681ba.appspot.com/o/nes_11.png?alt=media&token=8c1c73dc-4983-4995-86de-91cf1e03be18", 1, 1, 0, 0,0,0,0,
            "리치함 & 캐러멜향",
            "커피의 강렬함과 캐러멜향의 달콤함이 있는 레시피",
            "스타벅스의 에스프레소 기반 음료는 모두 여기에서 시작됩니다. 1975년, 원두와 로스팅의 완벽한 조화를 찾기 위해 수개월간 강도높은 연구를 거듭한 결과 오늘날 당신이 손에 든 바로 그 커피가 탄생했습니다. 캐러멜의 달콤함이 있는 레시피 - 너무 완벽해서 지금까지도 바꾸지 않고 사용하고 있습니다.",
            "알루미늄은 커피를 외부로부터 보호하면서도 향을 안쪽에 가둬줍니다. 오늘날 사용되는 원재료 중 가장 보호력이 뛰어나 커피의 향과 풍미를 신선하게 보존합니다. 경량이면서도 튼튼한 점이 특징으로, 산소나 습기, 빛 등 유해할 수 있는 외부 요소로부터 내용물을 밀폐해줍니다.",
            "수집 장소: 사용한 캡슐을 폐기물 센터나 가까운 네스프레소 부티크로 가져오세요.\n" +
                    " \n" +
                    "\n" +
                    "집에서 재활용하기:  집에서 재활용하기 서비스를 이용할 경우, 무료 재활용 백을 요청하실 수 있습니다. 고객 서비스: 080-234-0001로 문의해주시기 바랍니다.\n" +
                    "\n" +
                    "재활용 백에는 개당 최대 200캡슐을 넣을 수 있습니다.",
            "스타벅스의 전문가가 기꺼이 도와드립니다. Starbucks® for Nespresso에 대해 궁금한 점이 있으시다면 080-234-0001으로 문의해주시기 바랍니다.",
            "",
            "알루미늄캡슐",
            "https://firebasestorage.googleapis.com/v0/b/capcoffee-681ba.appspot.com/o/starbucks%2Fstar_esp_com1.png?alt=media&token=7d3d70bf-4b51-477e-9127-ac292365a42f",
            "https://firebasestorage.googleapis.com/v0/b/capcoffee-681ba.appspot.com/o/starbucks%2Fstar_esp_com2.png?alt=media&token=f63964cd-a68a-49fe-acbd-8af46a16f6de",
            "https://firebasestorage.googleapis.com/v0/b/capcoffee-681ba.appspot.com/o/starbucks%2Fstar_com3.png?alt=media&token=e17facee-5713-45b3-b718-f370ae3d723f"
        ))

        var starbucksList = arrayListOf<CoffeeItem>(
        CoffeeItem(
            "https://firebasestorage.googleapis.com/v0/b/capcoffee-681ba.appspot.com/o/starbucks%2Fstar_espresso.png?alt=media&token=be0f14bc-0900-4cf5-b5a2-7b0bf5345b1b",
            "에스프레소 로스트", 11, "https://firebasestorage.googleapis.com/v0/b/capcoffee-681ba.appspot.com/o/nes_11.png?alt=media&token=8c1c73dc-4983-4995-86de-91cf1e03be18", 1, 1, 0, 0,0,0,0,
            "리치함 & 캐러멜향",
            "커피의 강렬함과 캐러멜향의 달콤함이 있는 레시피",
            "스타벅스의 에스프레소 기반 음료는 모두 여기에서 시작됩니다. 1975년, 원두와 로스팅의 완벽한 조화를 찾기 위해 수개월간 강도높은 연구를 거듭한 결과 오늘날 당신이 손에 든 바로 그 커피가 탄생했습니다. 캐러멜의 달콤함이 있는 레시피 - 너무 완벽해서 지금까지도 바꾸지 않고 사용하고 있습니다.",
            "알루미늄은 커피를 외부로부터 보호하면서도 향을 안쪽에 가둬줍니다. 오늘날 사용되는 원재료 중 가장 보호력이 뛰어나 커피의 향과 풍미를 신선하게 보존합니다. 경량이면서도 튼튼한 점이 특징으로, 산소나 습기, 빛 등 유해할 수 있는 외부 요소로부터 내용물을 밀폐해줍니다.",
            "수집 장소: 사용한 캡슐을 폐기물 센터나 가까운 네스프레소 부티크로 가져오세요.\n" +
                    " \n" +
                    "\n" +
                    "집에서 재활용하기:  집에서 재활용하기 서비스를 이용할 경우, 무료 재활용 백을 요청하실 수 있습니다. 고객 서비스: 080-234-0001로 문의해주시기 바랍니다.\n" +
                    "\n" +
                    "재활용 백에는 개당 최대 200캡슐을 넣을 수 있습니다.",
            "스타벅스의 전문가가 기꺼이 도와드립니다. Starbucks® for Nespresso에 대해 궁금한 점이 있으시다면 080-234-0001으로 문의해주시기 바랍니다.",
            "",
            "알루미늄캡슐",
            "https://firebasestorage.googleapis.com/v0/b/capcoffee-681ba.appspot.com/o/starbucks%2Fstar_esp_com1.png?alt=media&token=7d3d70bf-4b51-477e-9127-ac292365a42f",
            "https://firebasestorage.googleapis.com/v0/b/capcoffee-681ba.appspot.com/o/starbucks%2Fstar_esp_com2.png?alt=media&token=f63964cd-a68a-49fe-acbd-8af46a16f6de",
            "https://firebasestorage.googleapis.com/v0/b/capcoffee-681ba.appspot.com/o/starbucks%2Fstar_com3.png?alt=media&token=e17facee-5713-45b3-b718-f370ae3d723f"
        ),
            CoffeeItem(
                "https://firebasestorage.googleapis.com/v0/b/capcoffee-681ba.appspot.com/o/starbucks%2Fstar_espresso_decaf.png?alt=media&token=22e398e7-a6e8-4848-8c60-ec9b67801edd",
                "에스프레소 로스트 디카페인", 11, "https://firebasestorage.googleapis.com/v0/b/capcoffee-681ba.appspot.com/o/nes_11.png?alt=media&token=8c1c73dc-4983-4995-86de-91cf1e03be18", 1, 1, 0, 0,0,0,0,
                "리치함 & 캐러멜향",
                "커피의 강렬함과 캐러멜향의 달콤함이 있는 레시피, 이 모든 것을 디카페인으로",
                "스타벅스의 에스프레소 기반 음료는 모두 여기에서 시작됩니다. 1975년, 원두와 로스팅의 완벽한 조화를 찾기 위해 수개월간 강도높은 연구를 거듭한 결과 오늘날 당신이 손에 든 바로 그 커피가 탄생했습니다. 캐러멜의 달콤함이 있는 레시피 - 너무 완벽해서 지금까지도 바꾸지 않고 사용하고 있습니다.  이 모든 것을 디카페인으로 즐겨보세요.",
                "알루미늄은 커피를 외부로부터 보호하면서도 향을 안쪽에 가둬줍니다. 오늘날 사용되는 원재료 중 가장 보호력이 뛰어나 커피의 향과 풍미를 신선하게 보존합니다. 경량이면서도 튼튼한 점이 특징으로, 산소나 습기, 빛 등 유해할 수 있는 외부 요소로부터 내용물을 밀폐해줍니다.",
                "수집 장소: 사용한 캡슐을 폐기물 센터나 가까운 네스프레소 부티크로 가져오세요.\n" +
                        " \n" +
                        "\n" +
                        "집에서 재활용하기:  집에서 재활용하기 서비스를 이용할 경우, 무료 재활용 백을 요청하실 수 있습니다. 고객 서비스: 080-234-0001로 문의해주시기 바랍니다.\n" +
                        "\n" +
                        "재활용 백에는 개당 최대 200캡슐을 넣을 수 있습니다.",
                "스타벅스의 전문가가 기꺼이 도와드립니다. Starbucks® for Nespresso에 대해 궁금한 점이 있으시다면 080-234-0001으로 문의해주시기 바랍니다.",
                "",
                "알루미늄캡슐",
                "https://firebasestorage.googleapis.com/v0/b/capcoffee-681ba.appspot.com/o/starbucks%2Fstar_def_com1.png?alt=media&token=956194ea-34aa-482a-848a-55b2528d5fc6",
                "https://firebasestorage.googleapis.com/v0/b/capcoffee-681ba.appspot.com/o/starbucks%2Fstar_def_com2.png?alt=media&token=c7211539-2f6d-4eda-9fb3-a275c53192c4",
                "https://firebasestorage.googleapis.com/v0/b/capcoffee-681ba.appspot.com/o/starbucks%2Fstar_com3.png?alt=media&token=e17facee-5713-45b3-b718-f370ae3d723f"
            ),
            CoffeeItem(
                "https://firebasestorage.googleapis.com/v0/b/capcoffee-681ba.appspot.com/o/starbucks%2Fstar_blonde_espresso.png?alt=media&token=b9fed890-cb64-4ad0-bf19-d9c3531fc2fa",
                "블론드 에스프레소", 6, "https://firebasestorage.googleapis.com/v0/b/capcoffee-681ba.appspot.com/o/nes_6.png?alt=media&token=722df499-ca39-4d6f-b178-103e96b4b151", 1, 1, 0, 0,0,0,0,
                "부드러움 & 달콤함",
                "부드럽고 풍부한 풍미. 가장 라이트한 에스프레소 로스트",
                "소싱부터 블렌딩, 로스팅까지, 거의 50년의 노력으로 찾아낸 - 부드러운 보디감을 가진 두 번째 에스프레소입니다. 라틴 아메리카산 원두로 만든 이 특별한 블렌드는 달콤함과 생동감 있는 향을 잘 살려 로스팅하였습니다. 이 커피는 부드럽고 균형감이 있어, 우유의 달콤한 면을 부각시켜 줍니다. 또한 클래식 에스프레소도 날카로움없이 한층 더 부드럽게 즐기실 수 있습니다.",
                "알루미늄은 커피를 외부로부터 보호하면서도 향을 안쪽에 가둬줍니다. 오늘날 사용되는 원재료 중 가장 보호력이 뛰어나 커피의 향과 풍미를 신선하게 보존합니다. 경량이면서도 튼튼한 점이 특징으로, 산소나 습기, 빛 등 유해할 수 있는 외부 요소로부터 내용물을 밀폐해줍니다.",
                "수집 장소: 사용한 캡슐을 폐기물 센터나 가까운 네스프레소 부티크로 가져오세요.\n" +
                        " \n" +
                        "\n" +
                        "집에서 재활용하기:  집에서 재활용하기 서비스를 이용할 경우, 무료 재활용 백을 요청하실 수 있습니다. 고객 서비스: 080-234-0001로 문의해주시기 바랍니다.\n" +
                        "\n" +
                        "재활용 백에는 개당 최대 200캡슐을 넣을 수 있습니다.",
                "스타벅스의 전문가가 기꺼이 도와드립니다. Starbucks® for Nespresso에 대해 궁금한 점이 있으시다면 080-234-0001으로 문의해주시기 바랍니다.",
                "",
                "알루미늄캡슐",
                "https://firebasestorage.googleapis.com/v0/b/capcoffee-681ba.appspot.com/o/starbucks%2Fstar_blon_com1.png?alt=media&token=b4ef66bc-7127-45f7-96c4-5d7e6ae80b55",
                "https://firebasestorage.googleapis.com/v0/b/capcoffee-681ba.appspot.com/o/starbucks%2Fstar_blon_com2.png?alt=media&token=a4fd6638-f3fb-4a21-b226-d30c6085dceb",
                "https://firebasestorage.googleapis.com/v0/b/capcoffee-681ba.appspot.com/o/starbucks%2Fstar_com3.png?alt=media&token=e17facee-5713-45b3-b718-f370ae3d723f"
            ),
            CoffeeItem(
                "https://firebasestorage.googleapis.com/v0/b/capcoffee-681ba.appspot.com/o/starbucks%2Fstar_columbia.png?alt=media&token=2371abf9-bb40-4c4e-9f06-d3bbe3f4a51d",
                "싱글 오리진 콜롬비아", 7, "https://firebasestorage.googleapis.com/v0/b/capcoffee-681ba.appspot.com/o/nes_7.png?alt=media&token=1812831a-9f1d-49f0-9782-a33d87511716", 0, 1, 1, 0,0,0,0,
                "조화로움 & 견과향",
                "견과향과 꽃향. 복잡다단함과 균형감이 공존하는 특별한 커피",
                "저희는 늘 콜롬비아 커피를 사랑해왔습니다. 그리고 그 콜롬비아 커피 농장으로 향하는 여정만큼 이 커피를 향한 사랑을 떠오르게 하는 건 없습니다. 깎아지른 듯한 암벽과 수천 미터 낭떠러지로 둘러싸인 위험한 비포장도로를 지나는 그 여정. 조화로운 보디감, 상큼한 풍미, 시그너쳐인 견과 맛이 마지막에 감도는 100% 콜롬비아 커피를 얻기 위해서라면, 저희에게는 언제나 그 여정이 가치 있습니다.",
                "알루미늄은 커피를 외부로부터 보호하면서도 향을 안쪽에 가둬줍니다. 오늘날 사용되는 원재료 중 가장 보호력이 뛰어나 커피의 향과 풍미를 신선하게 보존합니다. 경량이면서도 튼튼한 점이 특징으로, 산소나 습기, 빛 등 유해할 수 있는 외부 요소로부터 내용물을 밀폐해줍니다.",
                "수집 장소: 사용한 캡슐을 폐기물 센터나 가까운 네스프레소 부티크로 가져오세요.\n" +
                        " \n" +
                        "\n" +
                        "집에서 재활용하기:  집에서 재활용하기 서비스를 이용할 경우, 무료 재활용 백을 요청하실 수 있습니다. 고객 서비스: 080-234-0001로 문의해주시기 바랍니다.\n" +
                        "\n" +
                        "재활용 백에는 개당 최대 200캡슐을 넣을 수 있습니다.",
                "스타벅스의 전문가가 기꺼이 도와드립니다. Starbucks® for Nespresso에 대해 궁금한 점이 있으시다면 080-234-0001으로 문의해주시기 바랍니다.",
                "",
                "알루미늄캡슐",
                "https://firebasestorage.googleapis.com/v0/b/capcoffee-681ba.appspot.com/o/starbucks%2Fstar_col_com1.png?alt=media&token=e7b02f18-4d66-437e-9360-15e4e0b1f66a",
                "https://firebasestorage.googleapis.com/v0/b/capcoffee-681ba.appspot.com/o/starbucks%2Fstar_col_com2.png?alt=media&token=331194d4-d7a1-41d1-b6f1-f1bf97a4421a",
                "https://firebasestorage.googleapis.com/v0/b/capcoffee-681ba.appspot.com/o/starbucks%2Fstar_com3.png?alt=media&token=e17facee-5713-45b3-b718-f370ae3d723f"
            ),
            CoffeeItem(
                "https://firebasestorage.googleapis.com/v0/b/capcoffee-681ba.appspot.com/o/starbucks%2Fstar_house.png?alt=media&token=a80db940-6563-42ad-a41f-0dd358766ca9",
                "하우스 블렌드", 8, "https://firebasestorage.googleapis.com/v0/b/capcoffee-681ba.appspot.com/o/nes_8.png?alt=media&token=edb50a60-4230-46d4-aafd-97748cbd9731", 0, 0, 1, 0,0,0,0,
                "풍부함 & 토피넛향",
                "도드라지는 견과와 코코아맛, 아로마, 바디감, 풍미의 완벽한 균형",
                "놀라운 심플함. 최상의 라틴 아메리카 원두를 블렌딩하여 진한 군밤 색이 돌 때까지 로스팅한 커피. 로스팅할 때 생긴 약간의 달콤함에 견과와 코코아의 풍미를 더했습니다. 1971년 스타벅스가 처음 블렌딩한 스타벅스의 첫 커피. 스타벅스의 역사를 고스란히 담고 있는 커피입니다.",
                "알루미늄은 커피를 외부로부터 보호하면서도 향을 안쪽에 가둬줍니다. 오늘날 사용되는 원재료 중 가장 보호력이 뛰어나 커피의 향과 풍미를 신선하게 보존합니다. 경량이면서도 튼튼한 점이 특징으로, 산소나 습기, 빛 등 유해할 수 있는 외부 요소로부터 내용물을 밀폐해줍니다.",
                "수집 장소: 사용한 캡슐을 폐기물 센터나 가까운 네스프레소 부티크로 가져오세요.\n" +
                        " \n" +
                        "\n" +
                        "집에서 재활용하기:  집에서 재활용하기 서비스를 이용할 경우, 무료 재활용 백을 요청하실 수 있습니다. 고객 서비스: 080-234-0001로 문의해주시기 바랍니다.\n" +
                        "\n" +
                        "재활용 백에는 개당 최대 200캡슐을 넣을 수 있습니다.",
                "스타벅스의 전문가가 기꺼이 도와드립니다. Starbucks® for Nespresso에 대해 궁금한 점이 있으시다면 080-234-0001으로 문의해주시기 바랍니다.",
                "",
                "알루미늄캡슐",
                "https://firebasestorage.googleapis.com/v0/b/capcoffee-681ba.appspot.com/o/starbucks%2Fstar_house_com1.png?alt=media&token=a3f8ee88-b576-4f22-9614-c95ed7c206d8",
                "https://firebasestorage.googleapis.com/v0/b/capcoffee-681ba.appspot.com/o/starbucks%2Fstar_house_com2.png?alt=media&token=95383107-8cc4-4116-a830-4c767f2bf203",
                "https://firebasestorage.googleapis.com/v0/b/capcoffee-681ba.appspot.com/o/starbucks%2Fstar_com3.png?alt=media&token=e17facee-5713-45b3-b718-f370ae3d723f"
            ),
            CoffeeItem(
                "https://firebasestorage.googleapis.com/v0/b/capcoffee-681ba.appspot.com/o/starbucks%2Fstar_pike.png?alt=media&token=cb4dfb80-776a-446d-8d9d-61d0a382f4b3",
                "파이크 플레이스", 7, "https://firebasestorage.googleapis.com/v0/b/capcoffee-681ba.appspot.com/o/nes_7.png?alt=media&token=1812831a-9f1d-49f0-9782-a33d87511716", 0, 0, 1, 0,0,0,0,
                "부드러움 & 초콜릿향",
                "코코아와 구운 견과의 은은한 향, 입안을 감도는 부드러움의 적절한 조화",
                "시애틀의 파이크 플레이스 마켓에 위치한 스타벅스 1호점부터 전 세계 스타벅스 매장에 이르기까지, 저희 고객은 언제나 신선하게 내린 커피를 기대해 왔습니다. 라틴 아메리카 커피의 부드럽고 조화로운 블렌딩에 초콜릿과 구운 견과의 풍미가 은은하게 더해진 커피 - 가까운 스타벅스 매장에서 매일 신선하게 만날 수 있는 그 커피입니다.",
                "알루미늄은 커피를 외부로부터 보호하면서도 향을 안쪽에 가둬줍니다. 오늘날 사용되는 원재료 중 가장 보호력이 뛰어나 커피의 향과 풍미를 신선하게 보존합니다. 경량이면서도 튼튼한 점이 특징으로, 산소나 습기, 빛 등 유해할 수 있는 외부 요소로부터 내용물을 밀폐해줍니다.",
                "수집 장소: 사용한 캡슐을 폐기물 센터나 가까운 네스프레소 부티크로 가져오세요.\n" +
                        " \n" +
                        "\n" +
                        "집에서 재활용하기:  집에서 재활용하기 서비스를 이용할 경우, 무료 재활용 백을 요청하실 수 있습니다. 고객 서비스: 080-234-0001로 문의해주시기 바랍니다.\n" +
                        "\n" +
                        "재활용 백에는 개당 최대 200캡슐을 넣을 수 있습니다.",
                "스타벅스의 전문가가 기꺼이 도와드립니다. Starbucks® for Nespresso에 대해 궁금한 점이 있으시다면 080-234-0001으로 문의해주시기 바랍니다.",
                "",
                "알루미늄캡슐",
                "https://firebasestorage.googleapis.com/v0/b/capcoffee-681ba.appspot.com/o/starbucks%2Fstar_pike_com1.png?alt=media&token=d2dab78b-7084-4373-ada0-480c75d8300e",
                "https://firebasestorage.googleapis.com/v0/b/capcoffee-681ba.appspot.com/o/starbucks%2Fstar_pike_com2.png?alt=media&token=e3ba1a40-8a79-481f-8480-dc9d69f9cde3",
                "https://firebasestorage.googleapis.com/v0/b/capcoffee-681ba.appspot.com/o/starbucks%2Fstar_com3.png?alt=media&token=e17facee-5713-45b3-b718-f370ae3d723f"
            ),
            CoffeeItem(
                "https://firebasestorage.googleapis.com/v0/b/capcoffee-681ba.appspot.com/o/starbucks%2Fstar_sumatra.png?alt=media&token=af2f7d51-5ed3-456c-b717-738f43244b14",
                "싱글 오리진 수마트라", 10, "https://firebasestorage.googleapis.com/v0/b/capcoffee-681ba.appspot.com/o/nes_10.png?alt=media&token=8bf9e0de-884f-488d-88d0-b4329b25d6cf", 0, 1, 0, 0,0,0,0,
                "허브와 자연의 흙 내음",
                "입안의 부드러움, 여운을 남기는 허브향과 풍성한 바디감",
                "이 커피의 기원인 비옥한 인도네시아의 섬처럼 독보적인 커피입니다. 부드럽게 입안을 감도는 풍성한 바디감, 말린 허브와 신선한 흙 내음의 여운을 담고 있으며 신 맛은 거의 없습니다. 수마트라 커피는 스타벅스가 가장 아끼는 블렌드의 근간이 되는 커피로, 지난 사십 년 동안 이 커피를 당신과 함께 나눌 수 있었던 것이 저희의 큰 자랑입니다.",
                "알루미늄은 커피를 외부로부터 보호하면서도 향을 안쪽에 가둬줍니다. 오늘날 사용되는 원재료 중 가장 보호력이 뛰어나 커피의 향과 풍미를 신선하게 보존합니다. 경량이면서도 튼튼한 점이 특징으로, 산소나 습기, 빛 등 유해할 수 있는 외부 요소로부터 내용물을 밀폐해줍니다.",
                "수집 장소: 사용한 캡슐을 폐기물 센터나 가까운 네스프레소 부티크로 가져오세요.\n" +
                        " \n" +
                        "\n" +
                        "집에서 재활용하기:  집에서 재활용하기 서비스를 이용할 경우, 무료 재활용 백을 요청하실 수 있습니다. 고객 서비스: 080-234-0001로 문의해주시기 바랍니다.\n" +
                        "\n" +
                        "재활용 백에는 개당 최대 200캡슐을 넣을 수 있습니다.",
                "스타벅스의 전문가가 기꺼이 도와드립니다. Starbucks® for Nespresso에 대해 궁금한 점이 있으시다면 080-234-0001으로 문의해주시기 바랍니다.",
                "",
                "알루미늄캡슐",
                "https://firebasestorage.googleapis.com/v0/b/capcoffee-681ba.appspot.com/o/starbucks%2Fstar_suma_com1.png?alt=media&token=e9074a38-a8ae-456f-a7bf-e0d2dab22307",
                "https://firebasestorage.googleapis.com/v0/b/capcoffee-681ba.appspot.com/o/starbucks%2Fstar_suma_com2.png?alt=media&token=f70ffa0d-0c0b-4288-9121-080a4cc45979",
                "https://firebasestorage.googleapis.com/v0/b/capcoffee-681ba.appspot.com/o/starbucks%2Fstar_com3.png?alt=media&token=e17facee-5713-45b3-b718-f370ae3d723f"
            ),
            CoffeeItem(
                "https://firebasestorage.googleapis.com/v0/b/capcoffee-681ba.appspot.com/o/starbucks%2Fstar_verona.png?alt=media&token=28871c32-0e74-4c7b-acf2-5c9c20743841",
                "카페 베로나", 10, "https://firebasestorage.googleapis.com/v0/b/capcoffee-681ba.appspot.com/o/nes_10.png?alt=media&token=8bf9e0de-884f-488d-88d0-b4329b25d6cf", 0, 1, 0, 0,0,0,0,
                "로스티한 달콤함 & 다크 코코아",
                "다크코코아 질감의 리치함과 뛰어난 균형감",
                "진정한 사랑과 세 개의 이름에 관한 커피입니다. 이 커피는 1975년, 제이크 블렌드란 이름으로 시애틀 레스토랑에서 첫 선을 보였습니다. 많은 이의 사랑을 받자, 이 레시피는 80/20 블렌드란 이름으로 스타벅스 매장에 소개되었습니다. 고객의 사랑에 힘입어, 이제 이 커피는 많은 이에게 영감을 주는 이탈리아 도시 이름을 따, 베로나로 불리게 되었습니다. ",
                "알루미늄은 커피를 외부로부터 보호하면서도 향을 안쪽에 가둬줍니다. 오늘날 사용되는 원재료 중 가장 보호력이 뛰어나 커피의 향과 풍미를 신선하게 보존합니다. 경량이면서도 튼튼한 점이 특징으로, 산소나 습기, 빛 등 유해할 수 있는 외부 요소로부터 내용물을 밀폐해줍니다.",
                "수집 장소: 사용한 캡슐을 폐기물 센터나 가까운 네스프레소 부티크로 가져오세요.\n" +
                        " \n" +
                        "\n" +
                        "집에서 재활용하기:  집에서 재활용하기 서비스를 이용할 경우, 무료 재활용 백을 요청하실 수 있습니다. 고객 서비스: 080-234-0001로 문의해주시기 바랍니다.\n" +
                        "\n" +
                        "재활용 백에는 개당 최대 200캡슐을 넣을 수 있습니다.",
                "스타벅스의 전문가가 기꺼이 도와드립니다. Starbucks® for Nespresso에 대해 궁금한 점이 있으시다면 080-234-0001으로 문의해주시기 바랍니다.",
                "",
                "알루미늄캡슐",
                "https://firebasestorage.googleapis.com/v0/b/capcoffee-681ba.appspot.com/o/starbucks%2Fstar_ve_com1.png?alt=media&token=fd7a45e3-ca9c-4c4f-bdf2-bcf2744f0771",
                "https://firebasestorage.googleapis.com/v0/b/capcoffee-681ba.appspot.com/o/starbucks%2Fstar_ve_com2.png?alt=media&token=b4396786-5bae-43c6-a894-66c79b0ed379",
                "https://firebasestorage.googleapis.com/v0/b/capcoffee-681ba.appspot.com/o/starbucks%2Fstar_com3.png?alt=media&token=e17facee-5713-45b3-b718-f370ae3d723f"
            )
        )



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
