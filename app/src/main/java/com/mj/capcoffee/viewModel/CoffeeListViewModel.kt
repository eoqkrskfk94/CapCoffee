package com.mj.capcoffee.viewModel

import android.app.Activity
import android.view.View
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.google.firebase.firestore.FirebaseFirestore
import com.mj.capcoffee.datas.CoffeeItem
import com.mj.capcoffee.model.FirebaseRepository

class CoffeeListViewModel: ViewModel() {

    private lateinit var brand: String
    private val coffeeList = ArrayList<CoffeeItem>()
    private val db: FirebaseFirestore = FirebaseFirestore.getInstance()

    fun setBrand(brand : String){
        this.brand = brand
    }

    private val coffeeCapsules = MutableLiveData<ArrayList<CoffeeItem>>()




    fun getCoffeeList() : LiveData<ArrayList<CoffeeItem>>{

        if(coffeeCapsules.value == null){
            db.collection(brand)
            .get()
                .addOnSuccessListener { result ->
                    for (document in result) {
                        var coffee : CoffeeItem = document.toObject(CoffeeItem::class.java)
                        coffeeList.add(coffee)
                        coffeeCapsules.postValue(coffeeList)

                    }
                }
        }

        return coffeeCapsules
    }

    fun clickBackBtn(view : View){
        (view.context as Activity).finish()

    }


}




