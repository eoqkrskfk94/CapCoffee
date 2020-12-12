package com.mj.capcoffee.brand

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import com.mj.capcoffee.CoffeeAdapter
import com.mj.capcoffee.CoffeeAdapter2
import com.mj.capcoffee.CoffeeDetailActivity
import com.mj.capcoffee.R
import com.mj.capcoffee.databinding.ActivityPaulBassettBinding
import com.mj.capcoffee.viewModel.PaulBassettViewModel

class PaulBassettActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityPaulBassettBinding = DataBindingUtil.setContentView(this, R.layout.activity_paul_bassett)
        binding.viewModel = PaulBassettViewModel()


//        binding.viewModel.paulBassettCapsules.observe(this, Observer {
//
//            binding.recyclerView.adapter =
//                CoffeeAdapter2(this, it) { coffee ->
//                    val intent = Intent(
//                        this,
//                        CoffeeDetailActivity::class.java
//                    )
//                    intent.putExtra("Brand", "Starbucks")
//
//                    intent.putExtra("coffee", coffee)
//                    startActivity(intent)
//
//                }
//
//
//        })
    }
}