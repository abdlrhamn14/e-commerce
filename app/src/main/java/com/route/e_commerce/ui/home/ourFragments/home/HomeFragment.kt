package com.route.e_commerce.ui.home.ourFragments.home

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.route.e_commerce.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {


    lateinit var viewBinding:FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.i("h","home fragment is created")
        viewBinding= FragmentHomeBinding.inflate(inflater,container,false)
        return viewBinding.root
    }
}