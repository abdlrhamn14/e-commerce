package com.route.data.datasourceImpl.categoryImpl

import com.route.data.dataSourceContract.categoryContract.CategoryDataSource
import com.route.data.datasourceImpl.categoryImpl.CategoryDataSourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
class Di {
//for any one

    @Provides
    fun provideCategoryDataSource(categoryDataSourceImpl: CategoryDataSourceImpl):CategoryDataSource{
        return categoryDataSourceImpl
    }
}