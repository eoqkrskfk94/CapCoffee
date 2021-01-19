package com.mj.capcoffee

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.mj.capcoffee.databinding.FragmentDolceCapsuleBinding


class DolceCapsuleFragment : Fragment() {


    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(inflater : LayoutInflater, container : ViewGroup?, savedInstanceState : Bundle?) : View? {
        // Inflate the layout for this fragment
        val binding: FragmentDolceCapsuleBinding = FragmentDolceCapsuleBinding.inflate(inflater, container, false)


        return binding.root
    }


}