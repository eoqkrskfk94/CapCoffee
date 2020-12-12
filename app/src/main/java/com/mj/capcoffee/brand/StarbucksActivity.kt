package com.mj.capcoffee.brand

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import androidx.databinding.ObservableArrayList
import androidx.recyclerview.widget.LinearLayoutManager
import com.mj.capcoffee.CoffeeAdapter
import com.mj.capcoffee.CoffeeDetailActivity
import com.mj.capcoffee.R
import com.mj.capcoffee.datas.CoffeeItem
import com.google.firebase.firestore.FirebaseFirestore
import com.mj.capcoffee.databinding.ActivityStarbucksBinding
import kotlinx.android.synthetic.main.activity_nespresso.*

class StarbucksActivity : AppCompatActivity() {

    var starbucksList: ObservableArrayList<CoffeeItem> = ObservableArrayList()

    //var starbucksList = ArrayList<CoffeeItem>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding : ActivityStarbucksBinding = DataBindingUtil.setContentView(this, R.layout.activity_starbucks)

        val db: FirebaseFirestore = FirebaseFirestore.getInstance()


        db.collection("starbucks")
            .get()
            .addOnSuccessListener { result ->
                for (document in result) {
                    var coffee: CoffeeItem = document.toObject(CoffeeItem::class.java)
                    starbucksList.add(coffee)

                }

                binding.recyclerView.adapter =
                    CoffeeAdapter(this, starbucksList) { coffeeItem ->
                        val intent = Intent(
                            this,
                            CoffeeDetailActivity::class.java
                        )
                        intent.putExtra("Brand", "Starbucks")

                        intent.putExtra("coffee", coffeeItem)
                        startActivity(intent)

                    }

//                recycler_view.adapter =
//                    CoffeeAdapter(this, starbucksList) { coffeeItem ->
//                        val intent = Intent(
//                            this,
//                            CoffeeDetailActivity::class.java
//                        )
//                        intent.putExtra("Brand", "Starbucks")
//
//                        intent.putExtra("coffee", coffeeItem)
//                        startActivity(intent)
//
//                    }
                recycler_view.layoutManager = LinearLayoutManager(this)
                recycler_view.setHasFixedSize(true)


            }
            .addOnFailureListener { exception ->
                Log.w("no exist", "Error getting documents.", exception)
            }

        back_btn.setOnClickListener { finish() }
    }

}
