package com.route.e_commerce.ui.home.ourFragments.favorites

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.route.e_commerce.R
import com.route.e_commerce.databinding.FragmentFavoriteBinding
import com.route.e_commerce.databinding.FragmentProfileBinding


class FavoriteFragment : Fragment() {
    lateinit var viewBinding: FragmentFavoriteBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewBinding= FragmentFavoriteBinding.inflate(inflater,container,false)
        return viewBinding.root
    }
}