package vn.tiki.sampleapp

import retrofit2.http.GET
import retrofit2.http.Query


interface ProductService {
    @GET("/api/v2/widget/deals/collection")
    suspend fun getProducts(
        @Query("per_page") perPage: Int,
        @Query("trackity_id") trackityId: String
    ): ProductResponse
}