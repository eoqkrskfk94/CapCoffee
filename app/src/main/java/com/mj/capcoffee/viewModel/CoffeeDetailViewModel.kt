package com.mj.capcoffee.viewModel

import android.content.Intent
import android.view.View
import com.mj.capcoffee.WebViewActivity

class CoffeeDetailViewModel {

    fun clickNaverViewBtn(coffee : String, brand : String, view : View){
        val intent = Intent(view.context, WebViewActivity::class.java)
        intent.putExtra("coffee", coffee)
        intent.putExtra("brand", brand)
        view.context.startActivity(intent)
    }

    fun clickNaverPriceBtn(coffee : String,brand : String, view : View){
        val intent = Intent(view.context, WebViewActivity::class.java)
        intent.putExtra("coffee", coffee)
        intent.putExtra("brand", brand)
        view.context.startActivity(intent)
    }


}