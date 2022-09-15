package com.velmurugan.gigs_assigment_2.data.repository

import com.velmurugan.gigs_assigment_2.data.Movie
import com.velmurugan.gigs_assigment_2.data.NetworkState
import com.velmurugan.gigs_assigment_2.data.RetrofitService

class MainRepository constructor(private val retrofitService: RetrofitService) {

    suspend fun getAllMovies() : NetworkState<List<Movie>> {
            val response = retrofitService.getAllMovies()
            return if (response.isSuccessful) {
                val responseBody = response.body()
                if (responseBody != null) {
                    NetworkState.Success(responseBody)
                } else {
                    NetworkState.Error(response)
                }
            } else {
                NetworkState.Error(response)
            }
        }

}