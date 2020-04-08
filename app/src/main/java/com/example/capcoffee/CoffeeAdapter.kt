package com.example.capcoffee

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.capcoffee.datas.NespressoItem
import kotlinx.android.synthetic.main.coffee_item.view.*

class CoffeeAdapter(val context: Context, val coffeelist: List<NespressoItem>, val itemClick: (NespressoItem) -> Unit) : RecyclerView.Adapter<CoffeeAdapter.CoffeeViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CoffeeViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.coffee_item,
            parent,false)

        return CoffeeViewHolder(itemView, itemClick)
    }

    override fun onBindViewHolder(holder: CoffeeViewHolder, position: Int) {
        holder?.bind(coffeelist[position], context)
    }

    override fun getItemCount() = coffeelist.size

    inner class CoffeeViewHolder(itemView: View, itemClick: (NespressoItem) -> Unit) : RecyclerView.ViewHolder(itemView){
        val imageView: ImageView = itemView.image_view
        val intensityView: ImageView = itemView.intensity_view
        val nameView: TextView = itemView.item_name
        val ristretto: ImageView = itemView.ristrettoView
        val espresso: ImageView = itemView.espressoView
        val lungo: ImageView = itemView.lungoView
        val sideName: TextView = itemView.short_description
        val intensityLay: LinearLayout = itemView.intensityLayout

        fun bind(coffeeitem: NespressoItem, context: Context){
            imageView.setImageResource(coffeeitem.imageResourse)
            intensityView.setImageResource(coffeeitem.intensityImage)
            if(coffeeitem.intensity == 0){
                intensityLay.visibility = View.GONE
            }
            nameView.text = coffeeitem.capsuleName
            sideName.text = coffeeitem.side_name

            if(coffeeitem.ristretto == 0) ristretto.setImageAlpha(50)
            if(coffeeitem.espresso == 0) espresso.setImageAlpha(50)
            if(coffeeitem.lungo == 0) lungo.setImageAlpha(50)


            itemView.setOnClickListener { itemClick(coffeeitem) }
        }

    }




}