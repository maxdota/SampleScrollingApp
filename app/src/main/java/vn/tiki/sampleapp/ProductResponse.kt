package vn.tiki.sampleapp

import com.google.gson.annotations.SerializedName

data class ProductResponse(
    @SerializedName("data")
    val products: List<ProductModel>
)