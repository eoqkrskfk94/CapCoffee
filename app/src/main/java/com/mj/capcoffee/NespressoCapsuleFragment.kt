package com.mj.capcoffee

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent
import androidx.recyclerview.widget.GridLayoutManager
import com.mj.capcoffee.adapter.CoffeeBrandAdapter
import com.mj.capcoffee.databinding.FragmentNespressoCapsuleBinding
import com.mj.capcoffee.datas.CoffeeBrandItem
import kotlinx.android.synthetic.main.activity_coffee_detail.*


class NespressoCapsuleFragment : Fragment() {

    private lateinit var brands: ArrayList<CoffeeBrandItem>


    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(inflater : LayoutInflater, container : ViewGroup?, savedInstanceState : Bundle?) : View? {
        // Inflate the layout for this fragment
        val binding: FragmentNespressoCapsuleBinding = FragmentNespressoCapsuleBinding.inflate(inflater, container, false)
        binding.lifecycleOwner = this

        setBrands()
        setBrandRecyclerView(binding)



        return binding.root
    }

    private fun setBrands(){

        brands = ArrayList()

        brands.add(CoffeeBrandItem(R.drawable.nespresso, "nespresso", "", ""))
        brands.add(CoffeeBrandItem(R.drawable.starbucks, "starbucks", "", ""))
        brands.add(CoffeeBrandItem(R.drawable.illy, "illy", "", ""))
        brands.add(CoffeeBrandItem(R.drawable.twosome, "twosome", "", ""))
        brands.add(CoffeeBrandItem(R.drawable.ediya, "ediya", "", ""))
        brands.add(CoffeeBrandItem(R.drawable.lavazza, "lavazza", "", ""))
        brands.add(CoffeeBrandItem(R.drawable.paulbessett, getString(R.string.paulBassett), "", ""))
        brands.add(CoffeeBrandItem(R.drawable.belmio, getString(R.string.belmio), "", ""))
        brands.add(CoffeeBrandItem(R.drawable.borbone, getString(R.string.borbone), "", ""))
        brands.add(CoffeeBrandItem(R.drawable.tom_n_toms, getString(R.string.tom_n_toms), "", ""))
        brands.add(CoffeeBrandItem(R.drawable.coffeebean, getString(R.string.coffeebean), "", ""))

    }

    private fun setBrandRecyclerView(binding : FragmentNespressoCapsuleBinding){

        binding.rvCoffeeBrand.adapter =
            context?.let {
                CoffeeBrandAdapter(it, brands) { brandItem, cardView, imageView ->

                    if(brandItem.brandName == "nespresso"){
                        val intent = Intent(this@NespressoCapsuleFragment.context, NespressoTypeActivity::class.java)
                        startActivity(intent)
                    } else{
                        val intent = Intent(this@NespressoCapsuleFragment.context, CoffeeListActivity::class.java)
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

        binding.rvCoffeeBrand.layoutManager = GridLayoutManager(this@NespressoCapsuleFragment.context, 2, GridLayoutManager.VERTICAL, false)
        binding.rvCoffeeBrand.setHasFixedSize(true)


    }




}