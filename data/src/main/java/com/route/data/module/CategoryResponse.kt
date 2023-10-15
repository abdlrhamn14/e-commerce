package com.route.data.module

import com.google.gson.annotations.SerializedName

data class CategoryResponse(

	@field:SerializedName("metadata")
	val metadata: Metadata? = null,

	@field:SerializedName("data")
	val data: List<CategoryDto?>? = null,

	@field:SerializedName("results")
	val results: Int? = null
)