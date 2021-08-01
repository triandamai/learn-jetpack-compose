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
    MovieModel("Marvel's Avenger: Infinity Wars","infinity wars","You must add the Hilt dependencies to take advantage of these integrations. For more information about adding dependencies, see Dependency injection with Hilt.", R.drawable.marvel,"142,mins","4.3"),
    MovieModel("Spider Mam: Homecoming","infinity wars","You must add the Hilt dependencies to take advantage of these integrations. For more information about adding dependencies, see Dependency injection with Hilt.", R.drawable.spiderman,"112,mins","4.2"),
    MovieModel("Ready Player One","Ready Player One","You must add the Hilt dependencies to take advantage of these integrations. For more information about adding dependencies, see Dependency injection with Hilt.", R.drawable.readyplayerone,"132,mins","4.2"),

)