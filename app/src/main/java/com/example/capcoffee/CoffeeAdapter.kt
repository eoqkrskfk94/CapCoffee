package com.example.capcoffee

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.capcoffee.datas.CoffeeItem
import kotlinx.android.synthetic.main.coffee_item.view.*

class CoffeeAdapter(val context: Context, val coffeelist: List<CoffeeItem>, val itemClick: (CoffeeItem) -> Unit) : RecyclerView.Adapter<CoffeeAdapter.CoffeeViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CoffeeViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.coffee_item,
            parent,false)

        return CoffeeViewHolder(itemView, itemClick)
    }

    override fun onBindViewHolder(holder: CoffeeViewHolder, position: Int) {
        holder?.bind(coffeelist[position], context)
    }

    override fun getItemCount() = coffeelist.size

    inner class CoffeeViewHolder(itemView: View, itemClick: (CoffeeItem) -> Unit) : RecyclerView.ViewHolder(itemView){
        val imageView: ImageView = itemView.image_view
        val intensityView: ImageView = itemView.intensity_view
        val nameView: TextView = itemView.item_name

        fun bind(coffeeitem: CoffeeItem, context: Context){
            imageView.setImageResource(coffeeitem.imageResourse)
            intensityView.setImageResource(coffeeitem.intensityImage)
            nameView.text = coffeeitem.capsuleName

            itemView.setOnClickListener { itemClick(coffeeitem) }
        }

    }




}