package com.example.capcoffee

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.capcoffee.datas.CoffeeItem
import kotlinx.android.synthetic.main.coffee_item.view.*

class CoffeeAdapter(private val coffeelist: List<CoffeeItem>) : RecyclerView.Adapter<CoffeeAdapter.CoffeeViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CoffeeViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.coffee_item,
            parent,false)

        return CoffeeViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: CoffeeViewHolder, position: Int) {
        val currentItem = coffeelist[position]


        holder.imageView.setImageResource(currentItem.imageResourse)
        holder.intensityView.setImageResource(currentItem.intensityImage)
        holder.textView.text = currentItem.text1



    }

    override fun getItemCount() = coffeelist.size

    class CoffeeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val imageView: ImageView = itemView.image_view
        val intensityView: ImageView = itemView.intensity_view
        val textView: TextView = itemView.item_name



    }

}