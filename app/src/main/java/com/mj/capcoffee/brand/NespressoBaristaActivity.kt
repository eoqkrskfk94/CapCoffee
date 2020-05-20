package com.mj.capcoffee.brand

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.mj.capcoffee.CoffeeAdapter
import com.mj.capcoffee.CoffeeDetailActivity
import com.mj.capcoffee.R
import com.mj.capcoffee.datas.CoffeeItem
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.android.synthetic.main.activity_nespresso.*


class NespressoBaristaActivity : AppCompatActivity() {

    var nespressoList = ArrayList<CoffeeItem>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nespresso_barista)

        val db: FirebaseFirestore = FirebaseFirestore.getInstance()


        db.collection("nespresso_barista")
            .get()
            .addOnSuccessListener { result ->
                for (document in result) {
                    var coffee: CoffeeItem = document.toObject(CoffeeItem::class.java)
                    nespressoList.add(coffee)

                }

                recycler_view.adapter =
                    CoffeeAdapter(this, nespressoList) { coffeeItem ->
                        val intent = Intent(
                            this,
                            CoffeeDetailActivity::class.java
                        )
                        intent.putExtra("Brand", "Nespresso")

                        intent.putExtra("coffee", coffeeItem)
                        startActivity(intent)

                    }
                recycler_view.layoutManager = LinearLayoutManager(this)
                recycler_view.setHasFixedSize(true)


            }
            .addOnFailureListener { exception ->
                Log.w("no exist", "Error getting documents.", exception)
            }

        back_btn.setOnClickListener { finish() }

    }



}
