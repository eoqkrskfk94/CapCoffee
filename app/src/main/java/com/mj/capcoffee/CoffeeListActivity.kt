package com.mj.capcoffee

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.mj.capcoffee.databinding.ActivityCoffeeListBinding
import com.mj.capcoffee.datas.CoffeeItem
import com.mj.capcoffee.viewModel.CoffeeListViewModel
import kotlinx.android.synthetic.main.activity_coffee_detail.*
import kotlinx.android.synthetic.main.activity_nespresso.*

class CoffeeListActivity : AppCompatActivity() {

    private lateinit var brand: String

    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        val binding : ActivityCoffeeListBinding = DataBindingUtil.setContentView(this, R.layout.activity_coffee_list)

        var intent = intent
        brand = intent.getStringExtra("brand")

        val viewModel = ViewModelProvider(this)[CoffeeListViewModel::class.java]
        binding.viewModel = viewModel
        binding.lifecycleOwner = this


        viewModel.setBrand(brand)

        viewModel.getCoffeeList().observe(this, Observer {
            it -> println(it.size)

            binding.recyclerView.adapter =
                CoffeeAdapter(this, it) { coffeeItem ->
                    val intent = Intent(
                        this,
                        CoffeeDetailActivity::class.java
                    )
                    intent.putExtra("brand", brand)

                    intent.putExtra("coffee", coffeeItem)
                    startActivity(intent)

                }
            recycler_view.layoutManager = LinearLayoutManager(this)
            recycler_view.setHasFixedSize(true)
        })


    }
}