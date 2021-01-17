package com.mj.capcoffee.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.mj.capcoffee.R
import com.mj.capcoffee.datas.CoffeeItem
import kotlinx.android.synthetic.main.coffee_item_small.view.*

class CoffeeAdapter(val context: Context, val coffeelist: List<CoffeeItem>, val itemClick: (CoffeeItem, ImageView) -> Unit) : RecyclerView.Adapter<CoffeeAdapter.CoffeeViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CoffeeViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.coffee_item_small, parent,false)

        return CoffeeViewHolder(itemView, itemClick)
    }

    override fun onBindViewHolder(holder: CoffeeViewHolder, position: Int) {
        holder?.onBindViewHolder(coffeelist[position])
    }

    override fun getItemCount() = coffeelist.size

    inner class CoffeeViewHolder(itemView: View, itemClick: (CoffeeItem, ImageView) -> Unit) : RecyclerView.ViewHolder(itemView){


        fun onBindViewHolder(item : CoffeeItem){
            with(itemView){
                Glide.with(context).load(item.imageResourse).into(iv_image)
                Glide.with(context).load(item.intensityImage).into(iv_intensity)
                if(item.intensity == 0){
                    iv_intensity.visibility = View.GONE
                }
                tv_coffee_name.text = item.capsule_name
                tv_coffee_description.text = item.side_name

                if(item.ristretto == 0)ristrettoView.imageAlpha = 50
                else ristrettoView.imageAlpha = 255

                if(item.espresso == 0) espressoView.imageAlpha = 50
                else espressoView.imageAlpha = 255

                if(item.lungo == 0) lungoView.imageAlpha = 50
                else lungoView.imageAlpha = 255


                itemView.setOnClickListener { itemClick(item, iv_image) }
            }
        }



    }


}