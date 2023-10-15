package com.route.domain.usecases

import com.route.domain.module.Category
import com.route.domain.repository.CategoriesRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

import javax.inject.Inject


class getCategoriesInUseCase @Inject constructor (val repository: CategoriesRepository)
//بما ان الدومبين مش معتمد علي حاجه فهنا مفيش مكان في الغلط يعني عمره مما جيبلك حاجه برا الدومين

{

   suspend fun invoke():List<Category?>?{
       return repository.getAllCategories()
    }
}