package com.mj.capcoffee.viewModel

import android.content.Intent
import android.view.View
import com.mj.capcoffee.CoffeeListActivity
import com.mj.capcoffee.NespressoTypeActivity
import com.mj.capcoffee.R

class MainViewModel {

    fun brandBtnClick(brand : String, view : View){

        var intent: Intent? = null

        when(brand){

            view.context.getString(R.string.nespresso) -> {
                intent = Intent(view.context, NespressoTypeActivity::class.java)
            }
            view.context.getString(R.string.starbucks) -> {
                intent = Intent(view.context, CoffeeListActivity::class.java)
                intent.putExtra("brand", view.context.getString(R.string.starbucks))
            }
            view.context.getString(R.string.illy) -> {
                intent = Intent(view.context, CoffeeListActivity::class.java)
                intent.putExtra("brand", view.context.getString(R.string.illy))
            }
            view.context.getString(R.string.dunkin) -> {
                intent = Intent(view.context, CoffeeListActivity::class.java)
                intent.putExtra("brand", view.context.getString(R.string.dunkin))
            }
            view.context.getString(R.string.paulBassett) -> {
                intent = Intent(view.context, CoffeeListActivity::class.java)
                intent.putExtra("brand", view.context.getString(R.string.paulBassett))
            }
            view.context.getString(R.string.twosome) -> {
                intent = Intent(view.context, CoffeeListActivity::class.java)
                intent.putExtra("brand", view.context.getString(R.string.twosome))
            }
            view.context.getString(R.string.belmio) -> {
                intent = Intent(view.context, CoffeeListActivity::class.java)
                intent.putExtra("brand", view.context.getString(R.string.belmio))
            }
            view.context.getString(R.string.lavazza) -> {
                intent = Intent(view.context, CoffeeListActivity::class.java)
                intent.putExtra("brand", view.context.getString(R.string.lavazza))
            }
            view.context.getString(R.string.borbone) -> {
                intent = Intent(view.context, CoffeeListActivity::class.java)
                intent.putExtra("brand", view.context.getString(R.string.borbone))
            }
            view.context.getString(R.string.ediya) -> {
                intent = Intent(view.context, CoffeeListActivity::class.java)
                intent.putExtra("brand", view.context.getString(R.string.ediya))
            }
            view.context.getString(R.string.tom_n_toms) -> {
                intent = Intent(view.context, CoffeeListActivity::class.java)
                intent.putExtra("brand", view.context.getString(R.string.tom_n_toms))
            }
            view.context.getString(R.string.coffeebean) -> {
                intent = Intent(view.context, CoffeeListActivity::class.java)
                intent.putExtra("brand", view.context.getString(R.string.coffeebean))
            }

        }

        if (intent != null) view.context.startActivity(intent)




    }

}