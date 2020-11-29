package com.mj.capcoffee.viewModel

import android.app.Activity
import android.content.Intent
import android.view.View
import com.mj.capcoffee.R
import com.mj.capcoffee.brand.NespressoBaristaActivity
import com.mj.capcoffee.brand.NespressoItalianoActivity

class NespressoTypeViewModel {

    fun nespressoTypeBtnClick(type : String, view : View){

        var intent: Intent? = null

        when(type){

            view.context.getString(R.string.barista) -> intent = Intent(view.context, NespressoBaristaActivity::class.java)
            view.context.getString(R.string.iltaliano) -> intent = Intent(view.context, NespressoItalianoActivity::class.java)
            //view.context.getString(R.string.espresso_lungo) -> intent = Intent(view.context, NespressoBaristaActivity::class.java)

            }

        if (intent != null) view.context.startActivity(intent)


        }


    fun backBtnClick(view : View){
        (view.context as Activity).finish()
    }

    }
