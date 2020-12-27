package com.mj.capcoffee

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.mj.capcoffee.datas.CoffeeItem
import kotlinx.android.synthetic.main.coffee_item.view.*

class CoffeeAdapter(val context: Context, val coffeelist: List<CoffeeItem>, val itemClick: (CoffeeItem) -> Unit) : RecyclerView.Adapter<CoffeeAdapter.CoffeeViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CoffeeViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.coffee_item,
            parent,false)

        return CoffeeViewHolder(itemView, itemClick)
    }

    override fun onBindViewHolder(holder: CoffeeViewHolder, position: Int) {
        holder?.onBindViewHolder(coffeelist[position])
    }

    override fun getItemCount() = coffeelist.size

    inner class CoffeeViewHolder(itemView: View, itemClick: (CoffeeItem) -> Unit) : RecyclerView.ViewHolder(itemView){


        fun onBindViewHolder(item : CoffeeItem){
            with(itemView){
                Glide.with(context).load(item.imageResourse).into(image_view)
                Glide.with(context).load(item.intensityImage).into(intensity_view)
                if(item.intensity == 0){
                    intensityLayout.visibility = View.GONE
                }
                item_name.text = item.capsule_name
                short_description.text = item.side_name

                if(item.ristretto == 0)ristrettoView.imageAlpha = 50
                else ristrettoView.imageAlpha = 255

                if(item.espresso == 0) espressoView.imageAlpha = 50
                else espressoView.imageAlpha = 255

                if(item.lungo == 0) lungoView.imageAlpha = 50
                else lungoView.imageAlpha = 255


                itemView.setOnClickListener { itemClick(item) }
            }
        }



    }


}