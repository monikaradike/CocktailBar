package com.example.cocktailbar.network

import com.example.cocktailbar.models.Cocktail
import com.example.cocktailbar.models.Drinks
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

private const val BASE_URL = "https://www.thecocktaildb.com/api/json/v1/1/"

private val moshi = Moshi.Builder()
    .add(KotlinJsonAdapterFactory())
    .build()

private val retrofit = Retrofit.Builder()
        .addConverterFactory(MoshiConverterFactory.create(moshi))
        .baseUrl(BASE_URL)
        .build()

interface NetworkService {
    @GET("search.php?f=a")
    suspend fun getAllCocktails():
            Drinks

    @GET("lookup.php")
    suspend fun getCocktailById(@Query("i") id: Int):
            Cocktail
}

object CocktailApi {
    val retrofitService : NetworkService by lazy {
        retrofit.create(NetworkService::class.java) }
}
