/*
 *
 *  Created At   31/7/2021
 *  Created By Trian Damai
 *  www.github.com/triandamai
 *  www.trian.app
 * /
 *
 */

package com.trian.moviesappcompose.data.models

import com.trian.moviesappcompose.R

data class MovieModel(var title:String,var subtitle:String,var description:String,var thumbnails:Int,var duration:String,var rating:String)

val datumMovie = listOf<MovieModel>(
    MovieModel("","","", R.drawable.marvel,"","")
)