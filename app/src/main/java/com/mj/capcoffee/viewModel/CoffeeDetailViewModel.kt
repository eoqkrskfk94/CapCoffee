package com.mj.capcoffee.viewModel

import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.view.View
import com.mj.capcoffee.R

class CoffeeDetailViewModel {

    fun clickNaverViewBtn(coffee : String, brand : String, view : View){

        var coffeeName = coffee
        var brandName = brand

        if(brandName == (view.context as Activity).getString(R.string.starbucks)) brandName = (view.context as Activity).getString(R.string.starbucks_kr)
        else if(brandName == (view.context as Activity).getString(R.string.illy)) brandName = (view.context as Activity).getString(R.string.illy_kr)
        else if(brandName == (view.context as Activity).getString(R.string.nespresso)) brandName = (view.context as Activity).getString(R.string.nespresso_kr)
        else if(brandName == (view.context as Activity).getString(R.string.dunkin)) brandName = (view.context as Activity).getString(R.string.dunkin_kr)
        else if(brandName == (view.context as Activity).getString(R.string.paulBassett)) brandName = (view.context as Activity).getString(R.string.paulBassett_kr)
        else if(brandName == (view.context as Activity).getString(R.string.nespresso_espresso)) brandName = (view.context as Activity).getString(R.string.nespresso_kr)
        else if(brandName == (view.context as Activity).getString(R.string.nespresso_master)) brandName = (view.context as Activity).getString(R.string.nespresso_kr)
        else if(brandName == (view.context as Activity).getString(R.string.twosome)) brandName = (view.context as Activity).getString(R.string.twosome_kr)
        else if(brandName == (view.context as Activity).getString(R.string.belmio)) brandName = (view.context as Activity).getString(R.string.belmio_kr)
        else if(brandName == (view.context as Activity).getString(R.string.lavazza)) brandName = (view.context as Activity).getString(R.string.lavazza_kr)
        else if(brandName == (view.context as Activity).getString(R.string.borbone)) brandName = (view.context as Activity).getString(R.string.borbone_kr)
        else if(brandName == (view.context as Activity).getString(R.string.ediya)) brandName = (view.context as Activity).getString(R.string.ediya_kr)
        else if(brandName == (view.context as Activity).getString(R.string.tom_n_toms)) brandName = (view.context as Activity).getString(R.string.tom_n_toms_kr)
        else if(brandName == (view.context as Activity).getString(R.string.coffeebean)) brandName = (view.context as Activity).getString(R.string.coffeebean_kr)

        else if(brandName == (view.context as Activity).getString(R.string.dolce_gusto_dolce)) brandName = (view.context as Activity).getString(R.string.dolce_gusto_dolce_kr)
        else if(brandName == (view.context as Activity).getString(R.string.starbucks_dolce)) brandName = (view.context as Activity).getString(R.string.starbucks_dolce_kr)
        else if(brandName == (view.context as Activity).getString(R.string.hisbeans_dolce)) brandName = (view.context as Activity).getString(R.string.hisbeans_dolce_kr)

        coffeeName = "$brandName $coffeeName 캡슐"
        coffeeName = coffeeName.replace("\\s".toRegex(), "+")

        println(coffeeName)


        val intent =  Intent(Intent.ACTION_VIEW, Uri.parse("https://search.naver.com/search.naver?where=view&sm=tab_jum&query=$coffeeName"))
        view.context.startActivity(intent)


    }

    fun clickNaverPriceBtn(coffee : String,brand : String, view : View){

        var coffeeName = coffee
        var brandName = brand


        if(brandName == (view.context as Activity).getString(R.string.starbucks)) brandName = (view.context as Activity).getString(R.string.starbucks_kr)
        else if(brandName == (view.context as Activity).getString(R.string.illy)) brandName = (view.context as Activity).getString(R.string.illy_kr)
        else if(brandName == (view.context as Activity).getString(R.string.nespresso)) brandName = (view.context as Activity).getString(R.string.nespresso_kr)
        else if(brandName == (view.context as Activity).getString(R.string.dunkin)) brandName = (view.context as Activity).getString(R.string.dunkin_kr)
        else if(brandName == (view.context as Activity).getString(R.string.paulBassett)) brandName = (view.context as Activity).getString(R.string.paulBassett_kr)
        else if(brandName == (view.context as Activity).getString(R.string.nespresso_espresso)) brandName = (view.context as Activity).getString(R.string.nespresso_kr)
        else if(brandName == (view.context as Activity).getString(R.string.nespresso_master)) brandName = (view.context as Activity).getString(R.string.nespresso_kr)
        else if(brandName == (view.context as Activity).getString(R.string.twosome)) brandName = (view.context as Activity).getString(R.string.twosome_kr)
        else if(brandName == (view.context as Activity).getString(R.string.belmio)) brandName = (view.context as Activity).getString(R.string.belmio_kr)
        else if(brandName == (view.context as Activity).getString(R.string.lavazza)) brandName = (view.context as Activity).getString(R.string.lavazza_kr)
        else if(brandName == (view.context as Activity).getString(R.string.borbone)) brandName = (view.context as Activity).getString(R.string.borbone_kr)
        else if(brandName == (view.context as Activity).getString(R.string.ediya)) brandName = (view.context as Activity).getString(R.string.ediya_kr)
        else if(brandName == (view.context as Activity).getString(R.string.tom_n_toms)) brandName = (view.context as Activity).getString(R.string.tom_n_toms_kr)
        else if(brandName == (view.context as Activity).getString(R.string.coffeebean)) brandName = (view.context as Activity).getString(R.string.coffeebean_kr)

        else if(brandName == (view.context as Activity).getString(R.string.dolce_gusto_dolce)) brandName = (view.context as Activity).getString(R.string.dolce_gusto_dolce_kr)
        else if(brandName == (view.context as Activity).getString(R.string.starbucks_dolce)) brandName = (view.context as Activity).getString(R.string.starbucks_dolce_kr)
        else if(brandName == (view.context as Activity).getString(R.string.hisbeans_dolce)) brandName = (view.context as Activity).getString(R.string.hisbeans_dolce_kr)




        coffeeName = "$brandName $coffeeName 캡슐"
        coffeeName = coffeeName.replace("\\s".toRegex(), "+")

        println(coffeeName)


        val intent =  Intent(Intent.ACTION_VIEW, Uri.parse("https://msearch.shopping.naver.com/search/all?query=$coffeeName"))
        view.context.startActivity(intent)


    }

//    fun clickBackBtn(view : View){
//        view.supportFinishAfterTransition()
//        (view.context as Activity).finish()
//
//    }


}