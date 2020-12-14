package com.mj.capcoffee


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.mj.capcoffee.databinding.ActivityNespressoTypeBinding
import com.mj.capcoffee.viewModel.NespressoTypeViewModel


class NespressoTypeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityNespressoTypeBinding = DataBindingUtil.setContentView(this, R.layout.activity_nespresso_type)
        binding.viewModel = NespressoTypeViewModel()


    }
}
