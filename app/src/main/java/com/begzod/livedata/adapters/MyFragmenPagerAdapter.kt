package com.begzod.livedata.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.begzod.livedata.fragments.Item2Fragment
import com.begzod.livedata.fragments.ItemFragment

class MyFragmenPagerAdapter(fm:FragmentManager):FragmentPagerAdapter(fm) {
    override fun getCount(): Int {
        return 2
    }

    override fun getItem(position: Int): Fragment {
        if (position==0){
            return ItemFragment()
        }else{
            return Item2Fragment()
        }
    }
}