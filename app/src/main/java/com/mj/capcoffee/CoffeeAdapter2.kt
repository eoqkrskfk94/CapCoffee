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
import com.mj.capcoffee.model.Coffee
import kotlinx.android.synthetic.main.coffee_item.view.*

class CoffeeAdapter2(val context: Context, val coffeelist: List<Coffee>, val itemClick: (Coffee) -> Unit) : RecyclerView.Adapter<CoffeeAdapter2.CoffeeViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CoffeeViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.coffee_item,
            parent,false)

        return CoffeeViewHolder(itemView, itemClick)
    }

    override fun onBindViewHolder(holder: CoffeeViewHolder, position: Int) {
        holder?.bind(coffeelist[position], context)
    }

    override fun getItemCount() = coffeelist.size

    inner class CoffeeViewHolder(itemView: View, itemClick: (Coffee) -> Unit) : RecyclerView.ViewHolder(itemView){
        private val imageView: ImageView = itemView.image_view
        private val intensityView: ImageView = itemView.intensity_view
        private val nameView: TextView = itemView.item_name
        private val ristretto: ImageView = itemView.ristrettoView
        private val espresso: ImageView = itemView.espressoView
        private val lungo: ImageView = itemView.lungoView
        private val sideName: TextView = itemView.short_description
        private val intensityLay: LinearLayout = itemView.intensityLayout

        fun bind(coffee: Coffee, context: Context){
            Glide.with(context).load(coffee.imageResourse).into(imageView)
            Glide.with(context).load(coffee.intensityImage).into(intensityView)
            if(coffee.intensity == 0){
                intensityLay.visibility = View.GONE
            }
            nameView.text = coffee.capsuleName
            sideName.text = coffee.sideName

            if(coffee.ristretto == 0) ristretto.setImageAlpha(50)
            if(coffee.espresso == 0) espresso.setImageAlpha(50)
            if(coffee.lungo == 0) lungo.setImageAlpha(50)


            itemView.setOnClickListener { itemClick(coffee) }
        }

    }




}