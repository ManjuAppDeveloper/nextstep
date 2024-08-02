package com.manju.nextstep.Quiz

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {
    private const val BaseURl="https://www.jsonkeeper.com/b/"
    val instance : Retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(BaseURl)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}