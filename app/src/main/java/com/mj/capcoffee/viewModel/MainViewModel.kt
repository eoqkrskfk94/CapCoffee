package com.mj.capcoffee.viewModel

import android.content.Context
import android.content.Intent
import android.view.View
import androidx.core.content.ContextCompat.startActivity
import com.mj.capcoffee.CoffeeListActivity
import com.mj.capcoffee.R
import com.mj.capcoffee.brand.*

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

        }

        if (intent != null) view.context.startActivity(intent)




    }

}