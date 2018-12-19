package com.assassin.origins.v2ex.api

import com.assassin.origins.v2ex.api.model.Topic
import retrofit2.http.GET

interface ApiService {
    @GET("https://www.v2ex.com/api/topics/hot.json")
    fun getHostList(): Topic
}