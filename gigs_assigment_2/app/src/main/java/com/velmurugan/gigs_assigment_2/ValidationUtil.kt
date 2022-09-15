package com.velmurugan.gigs_assigment_2

import com.velmurugan.gigs_assigment_2.data.Movie

object ValidationUtil {

    fun validateMovie(movie: Movie) : Boolean {
        if (movie.name.isNotEmpty() && movie.category.isNotEmpty()) {
            return true
        }
        return false
    }
}