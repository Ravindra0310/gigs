package com.velmurugan.gigs_assigment_2

import com.velmurugan.gigs_assigment_2.data.Movie
import com.velmurugan.gigs_assigment_2.data.NetworkState
import com.velmurugan.gigs_assigment_2.data.RetrofitService
import com.velmurugan.gigs_assigment_2.data.repository.MainRepository
import kotlinx.coroutines.runBlocking
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.MockitoAnnotations
import retrofit2.Response

@RunWith(JUnit4::class)
class MainRepositoryTest {

    lateinit var mainRepository: MainRepository

    @Mock
    lateinit var apiService: RetrofitService

    @Before
    fun setup() {
        MockitoAnnotations.initMocks(this)
        mainRepository = MainRepository(apiService)
    }

    @Test
    fun `get all movie test`() {
        runBlocking {
            Mockito.`when`(apiService.getAllMovies()).thenReturn(Response.success(listOf<Movie>()))
            val response = mainRepository.getAllMovies()
            assertEquals(listOf<Movie>(),  NetworkState.Success(response).data)
        }

    }

}