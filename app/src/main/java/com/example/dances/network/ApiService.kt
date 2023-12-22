package com.example.dances.network

import com.example.dances.model.Dance
import retrofit2.http.GET

interface ApiService {
    @GET("dances")
    suspend fun getDances(): List<Dance>
}