package com.velmurugan.gigs_assigment_2

import com.velmurugan.gigs_assigment_2.data.Movie
import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class ValidationUtilTest {

    @Test
    fun validateMovieTest() {
        val movie = Movie("test","testUrl","main")
        assertEquals(true, ValidationUtil.validateMovie(movie))
    }

    @Test
    fun validateMovieEmptyTest() {
        val movie = Movie("","testUrl","main")
        assertEquals(false, ValidationUtil.validateMovie(movie))
    }

}