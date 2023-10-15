package com.route.data.api

import com.route.data.module.CategoryResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface WebServices {
    @GET("api/v1/categories")
    suspend fun getAllCategories(@Query("page") page:Int=1):CategoryResponse
}