package com.mj.capcoffee.model

import android.util.Log
import com.google.firebase.firestore.FirebaseFirestore
import com.mj.capcoffee.datas.CoffeeItem
import java.lang.Exception

object FirebaseRepository {

    fun getBrandCoffee(brand : String) : List<CoffeeItem> {

        val db : FirebaseFirestore = FirebaseFirestore.getInstance()


        return try {
            db.collection(brand).get().result?.documents?.mapNotNull {
                it.toObject(CoffeeItem::class.java)
            }!!

        } catch (e : Exception) {
            Log.e("TAG", "Error", e)
            emptyList()

        }

    }
}
