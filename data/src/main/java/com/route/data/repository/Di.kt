package com.route.data.repository

import com.route.domain.repository.CategoriesRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
abstract class Di{
    //for any one need CategoriesRepository it will be implemented and return obj from CategoriesRepository which is
    //CategoriesRepository
    @Binds
   abstract fun bindCategoriesRepository(repo:CategoriesRepositoryImpl):CategoriesRepository
}