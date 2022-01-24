package vn.tiki.sampleapp

import com.google.gson.annotations.SerializedName

data class ProductModel(
    @SerializedName("deal_id") val dealId: Long,
    @SerializedName("name") val name: String
)