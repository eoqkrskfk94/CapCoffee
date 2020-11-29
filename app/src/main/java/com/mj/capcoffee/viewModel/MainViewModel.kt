package com.mj.capcoffee.viewModel

import android.content.Context
import android.content.Intent
import android.view.View
import androidx.core.content.ContextCompat.startActivity
import com.mj.capcoffee.R
import com.mj.capcoffee.brand.DunkinActivity
import com.mj.capcoffee.brand.IllyActivity
import com.mj.capcoffee.brand.NespressoTypeActivity
import com.mj.capcoffee.brand.StarbucksActivity

class MainViewModel {

    fun brandBtnClick(brand : String, view : View){

        var intent: Intent? = null

        when(brand){

            view.context.getString(R.string.nespresso) -> intent = Intent(view.context, NespressoTypeActivity::class.java)
            view.context.getString(R.string.starbucks) -> intent = Intent(view.context, StarbucksActivity::class.java)
            view.context.getString(R.string.illy) -> intent = Intent(view.context, IllyActivity::class.java)
            view.context.getString(R.string.dunkin) -> intent = Intent(view.context, DunkinActivity::class.java)

        }

        if (intent != null) view.context.startActivity(intent)




    }

}