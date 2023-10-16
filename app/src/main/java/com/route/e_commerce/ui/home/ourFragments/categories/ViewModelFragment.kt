package com.route.e_commerce.ui.home.ourFragments.categories

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.route.domain.module.Category
import com.route.domain.usecases.getCategoriesInUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ViewModelFragment @Inject constructor(val categoryUseCase: getCategoriesInUseCase)
    :ViewModel() {


    }

