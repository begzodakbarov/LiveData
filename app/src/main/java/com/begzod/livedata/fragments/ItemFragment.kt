package com.begzod.livedata.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.widget.addTextChangedListener
import com.begzod.livedata.R
import com.begzod.livedata.databinding.FragmentItem2Binding
import com.begzod.livedata.databinding.FragmentItemBinding
import com.begzod.livedata.utils.MyData


class ItemFragment : Fragment() {
    private val binding by lazy { FragmentItemBinding.inflate(layoutInflater) }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {

        binding.edt.addTextChangedListener {
            MyData.nameLiveData.postValue(it.toString())
        }

        return binding.root
    }

}