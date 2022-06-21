package com.example.plan2meet


import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClientInstance {
    private var retrofit: Retrofit? = null
    private val BASE_URL = ""

    val retrofitInstance : Retrofit?
    get() {
        // has the object been created yet?
        if (retrofit == null) {
            //create it
            retrofit = retrofit2.Retrofit.Builder()
                .baseURL(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }
        return retrofit
    }
}