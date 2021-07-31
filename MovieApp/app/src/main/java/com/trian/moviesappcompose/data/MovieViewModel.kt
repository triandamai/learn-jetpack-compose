/*
 *
 *  Created At   31/7/2021
 *  Created By Trian Damai
 *  www.github.com/triandamai
 *  www.trian.app
 * /
 *
 */

package com.trian.moviesappcompose.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.trian.moviesappcompose.data.models.MovieModel

class MovieViewModel:ViewModel() {
    private val listMovie= MutableLiveData<List<MovieModel>>()
    val getListMovie:LiveData<List<MovieModel>> get() = listMovie

    fun addMovie(movie:MovieModel){

    }
}