package com.route.e_commerce.ui.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.activity.viewModels
import androidx.fragment.app.Fragment

import com.route.e_commerce.R
import com.route.e_commerce.databinding.ActivityHomeBinding
import com.route.e_commerce.ui.home.ourFragments.categories.CategoryFragment
import com.route.e_commerce.ui.home.ourFragments.favorites.FavoriteFragment
import com.route.e_commerce.ui.home.ourFragments.home.HomeFragment
import com.route.e_commerce.ui.home.ourFragments.profile.ProfileFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class Home : AppCompatActivity() {
    lateinit var viewBinding: ActivityHomeBinding
     val viewModel:HomeViewModel by viewModels<HomeViewModel>()
    //when he want to use it he will create it

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding= ActivityHomeBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)
        viewBinding.bottomNavigationView.setOnItemReselectedListener{item->
            chooseWhereToNavigate(item)
        }
        viewBinding.bottomNavigationView.selectedItemId=R.id.categories

    }

    private fun chooseWhereToNavigate(item: MenuItem) {
        when(item.itemId){
            R.id.home->{
                navigateToRequiredFragment(HomeFragment())
            }
            R.id.favorite->{
                navigateToRequiredFragment(FavoriteFragment())
            }
            R.id.categories->{
                navigateToRequiredFragment(ProfileFragment())
            }
            R.id.profile->{
                navigateToRequiredFragment(CategoryFragment())
            }
        }

    }

    private fun navigateToRequiredFragment(fragmentObject: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_container,fragmentObject)
            .commit()
    }
}