package com.mj.capcoffee.model

import com.google.firebase.firestore.FirebaseFirestore
import com.mj.capcoffee.datas.CoffeeItem

object FirebaseRepository {

    suspend fun getBrandCoffee(brand : String) : ArrayList<Coffee> {

        val coffeeList = ArrayList<Coffee>()
        val db : FirebaseFirestore = FirebaseFirestore.getInstance()

        db.collection(brand)
            .get()
            .addOnSuccessListener { result ->
                for (document in result) {
                    var coffee : Coffee = document.toObject(Coffee::class.java)
                    coffeeList.add(coffee)
                }
            }

        return coffeeList
    }
}