package com.mj.capcoffee.viewModel

import android.app.Activity
import android.content.Intent
import android.view.View
import com.mj.capcoffee.CoffeeListActivity
import com.mj.capcoffee.R

class NespressoTypeViewModel {

    fun nespressoTypeBtnClick(type : String, view : View){

        var intent: Intent? = null

        when(type){

            view.context.getString(R.string.nespresso) -> {
                intent = Intent(view.context, CoffeeListActivity::class.java)
                intent.putExtra("brand", view.context.getString(R.string.nespresso))
            }
            view.context.getString(R.string.nespresso_barista) -> {
                intent = Intent(view.context, CoffeeListActivity::class.java)
                intent.putExtra("brand", view.context.getString(R.string.nespresso_barista))
            }
            view.context.getString(R.string.nespresso_espresso) -> {
                intent = Intent(view.context, CoffeeListActivity::class.java)
                intent.putExtra("brand", view.context.getString(R.string.nespresso_espresso))
            }

            }

        if (intent != null) view.context.startActivity(intent)


        }


    fun backBtnClick(view : View){
        (view.context as Activity).finish()
    }

    }
