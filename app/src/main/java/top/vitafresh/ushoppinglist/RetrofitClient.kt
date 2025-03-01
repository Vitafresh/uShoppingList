package top.vitafresh.ushoppinglist

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {
    private const val BAE_URL = "http://maps.googleapis.com/"

    fun create(): GeocodingApiService{
        val retrofit = Retrofit.Builder()
            .baseUrl(BAE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        return retrofit.create(GeocodingApiService::class.java)
    }
}