package com.mj.capcoffee.view

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.recyclerview.widget.GridLayoutManager
import com.mj.capcoffee.R
import com.mj.capcoffee.adapter.CoffeeBrandAdapter
import com.mj.capcoffee.databinding.FragmentDolceCapsuleBinding
import com.mj.capcoffee.datas.CoffeeBrandItem


class DolceCapsuleFragment : Fragment() {

    private lateinit var brands: ArrayList<CoffeeBrandItem>


    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(inflater : LayoutInflater, container : ViewGroup?, savedInstanceState : Bundle?) : View? {
        // Inflate the layout for this fragment
        val binding: FragmentDolceCapsuleBinding = FragmentDolceCapsuleBinding.inflate(inflater, container, false)
        binding.lifecycleOwner = this

        setBrands()
        setBrandRecyclerView(binding)


        return binding.root
    }


    private fun setBrands(){

        brands = ArrayList()

        //brands.add(CoffeeBrandItem(R.drawable.dolce_gusto, "dolce_gusto_dolce", "", ""))
        brands.add(CoffeeBrandItem(R.drawable.starbucks, "starbucks_dolce", "", ""))
        brands.add(CoffeeBrandItem(R.drawable.hisbeans, "hisbeans_dolce", "", ""))


    }

    private fun setBrandRecyclerView(binding : FragmentDolceCapsuleBinding){

        binding.rvCoffeeBrand.adapter =
            context?.let {
                CoffeeBrandAdapter(it, brands) { brandItem, cardView, imageView ->

                    if(brandItem.brandName == "nespresso"){
                        val intent = Intent(this@DolceCapsuleFragment.context, NespressoTypeActivity::class.java)
                        startActivity(intent)
                    } else{
                        val intent = Intent(this@DolceCapsuleFragment.context, CoffeeListActivity::class.java)
                        intent.putExtra("brand", brandItem.brandName)
                        startActivity(intent)
                    }

                    activity?.overridePendingTransition(R.anim.fadein, R.anim.fadeout)

                }
            }

        binding.rvCoffeeBrand.apply {
            layoutAnimation = AnimationUtils.loadLayoutAnimation(
                context,
                R.anim.layout_animation_fall_down
            )
            scheduleLayoutAnimation()

        }

        binding.rvCoffeeBrand.layoutManager = GridLayoutManager(this@DolceCapsuleFragment.context, 2, GridLayoutManager.VERTICAL, false)
        binding.rvCoffeeBrand.setHasFixedSize(true)


    }


}