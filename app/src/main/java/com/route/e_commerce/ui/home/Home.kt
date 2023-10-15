package com.route.e_commerce.ui.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.AdapterView
import android.widget.AdapterView.OnItemSelectedListener
import androidx.activity.viewModels
import androidx.fragment.app.Fragment
import com.google.android.material.navigation.NavigationBarView
import com.route.e_commerce.R
import com.route.e_commerce.databinding.ActivityHomeBinding
import com.route.e_commerce.ui.home.ourFragments.categories.CategoryFragment
import com.route.e_commerce.ui.home.ourFragments.favorites.FavoriteFragment
import com.route.e_commerce.ui.home.ourFragments.home.HomeFragment
import com.route.e_commerce.ui.home.ourFragments.profile.ProfileFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class Home : AppCompatActivity(),NavigationBarView.OnItemSelectedListener {
   private lateinit var viewBinding: ActivityHomeBinding
     val viewModel:HomeViewModel by viewModels<HomeViewModel>()
    //when he want to use it he will create it

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding= ActivityHomeBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        viewBinding.bottomNavigationView.setOnItemSelectedListener(this)

      viewBinding.bottomNavigationView.setOnItemSelectedListener{
      var menu =   viewBinding.bottomNavigationView.menu
                changeColorOfSelectedIcon(it,menu) }
        viewBinding.bottomNavigationView.selectedItemId=R.id.categories




    }
//here i writed the logic
    private fun changeColorOfSelectedIcon(it: MenuItem,menu: Menu): Boolean {
        var home=menu.findItem(R.id.home)
        var category=menu.findItem(R.id.categories)
        var profile=menu.findItem(R.id.profile)
        var favorite=menu.findItem(R.id.favorite)
        when(it.itemId){
            R.id.home->{
                it.setIcon(R.drawable.selectedhome)
                category.setIcon(R.drawable.category)
                profile.setIcon(R.drawable.user)
                favorite.setIcon(R.drawable.favorite)

            }R.id.categories->{
            it.setIcon(R.drawable.selectedcategory)
            home.setIcon(R.drawable.home)
            profile.setIcon(R.drawable.user)
            favorite.setIcon(R.drawable.favorite)

        }  R.id.favorite->{
            it.setIcon(R.drawable.selectedfavoirtie)
            category.setIcon(R.drawable.category)
            profile.setIcon(R.drawable.user)
            home.setIcon(R.drawable.home)

        }  R.id.profile->{
            it.setIcon(R.drawable.selecteduser)
            category.setIcon(R.drawable.category)
            home.setIcon(R.drawable.home)
            favorite.setIcon(R.drawable.favorite)

        }

        }
        return true
    }



    private fun navigateToRequiredFragment(fragmentObject: Fragment):Boolean {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_container,fragmentObject)
            .commit()
        return true
    }


    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.home->{
                return navigateToRequiredFragment(HomeFragment())

            }
            R.id.favorite->{
                return  navigateToRequiredFragment(FavoriteFragment())
            }
            R.id.categories->{
                return navigateToRequiredFragment(ProfileFragment())
            }
            R.id.profile->{
                return   navigateToRequiredFragment(CategoryFragment())
            }
        }
        return false

    }
}