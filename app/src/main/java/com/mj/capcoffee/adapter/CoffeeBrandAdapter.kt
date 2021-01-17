package com.mj.capcoffee.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.mj.capcoffee.R
import com.mj.capcoffee.datas.CoffeeBrandItem
import kotlinx.android.synthetic.main.item_brand.view.*

class CoffeeBrandAdapter(val context: Context, val brandList: List<CoffeeBrandItem>, val itemClick: (CoffeeBrandItem, CardView, ImageView) -> Unit) : RecyclerView.Adapter<CoffeeBrandAdapter.CoffeeBrandViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CoffeeBrandViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(
            R.layout.item_brand,
            parent,false)

        return CoffeeBrandViewHolder(itemView, itemClick)
    }

    override fun onBindViewHolder(holder: CoffeeBrandViewHolder, position: Int) {
        holder?.bind(brandList[position], context)
    }

    override fun getItemCount() = brandList.size

    inner class CoffeeBrandViewHolder(itemView: View, itemClick: (CoffeeBrandItem, CardView, ImageView) -> Unit) : RecyclerView.ViewHolder(itemView){
        private val imageView: ImageView = itemView.iv_brand
        private val cardView: CardView = itemView.cv_brand


        fun bind(brandItem: CoffeeBrandItem, context: Context){

            imageView.setImageResource(brandItem.imageResourse)


            itemView.setOnClickListener { itemClick(brandItem, cardView, imageView) }
        }

    }


}