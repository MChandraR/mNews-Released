package com.mcr.mnews.util

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class clientAPI {
    var serverURL = "https://c18s8vkx-3000.asse.devtunnels.ms/"

    fun getClientAPI():Retrofit{
        return Retrofit.Builder().baseUrl(serverURL).addConverterFactory(GsonConverterFactory.create()).build()
    }
}