package com.begzod.livedata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.begzod.livedata.adapters.MyFragmenPagerAdapter
import com.begzod.livedata.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.viewPager.adapter = MyFragmenPagerAdapter(supportFragmentManager)
    }
}