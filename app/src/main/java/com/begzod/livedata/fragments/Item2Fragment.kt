package com.begzod.livedata.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.begzod.livedata.R
import com.begzod.livedata.databinding.FragmentItem2Binding
import com.begzod.livedata.databinding.FragmentItemBinding
import com.begzod.livedata.utils.MyData

class Item2Fragment : Fragment() {
private val binding by lazy { FragmentItem2Binding.inflate(layoutInflater) }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {

        MyData.nameLiveData.observe(viewLifecycleOwner){
            binding.tvName.text = it
        }

        return binding.root
    }
}