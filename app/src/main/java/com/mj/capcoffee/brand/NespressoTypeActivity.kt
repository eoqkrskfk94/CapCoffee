package com.mj.capcoffee.brand

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.databinding.DataBindingUtil
import com.mj.capcoffee.R
import com.mj.capcoffee.databinding.ActivityNespressoTypeBinding
import com.mj.capcoffee.viewModel.NespressoTypeViewModel
import kotlinx.android.synthetic.main.activity_nespresso.back_btn

class NespressoTypeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityNespressoTypeBinding = DataBindingUtil.setContentView(this, R.layout.activity_nespresso_type)
        binding.viewModel = NespressoTypeViewModel()

    }
}
