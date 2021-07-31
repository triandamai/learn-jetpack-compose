package com.trian.moviesappcompose.ui.common

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.google.accompanist.pager.ExperimentalPagerApi
import com.trian.moviesappcompose.ui.pages.Dashboard
import com.trian.moviesappcompose.ui.pages.DetailMovie
import com.trian.moviesappcompose.ui.pages.Library
import kotlinx.coroutines.CoroutineScope

/*
* Created by: Trian Damai
* Created at: 31/07/2021
* www.github.com/triandamai
* www.trian.app
* */
enum class Router {
    Dashboard,Library,DetailMovie
}

@ExperimentalPagerApi
@Composable
fun Router(navController: NavHostController,coroutineScope: CoroutineScope){
    NavHost(navController = navController, startDestination = Router.Dashboard.name){
        composable(Router.Dashboard.name){
            Dashboard(nav = navController,scope = coroutineScope)
        }
        composable(Router.Library.name){
            Library(nav = navController,scope=coroutineScope)
        }
        composable(Router.DetailMovie.name){
            DetailMovie(nav = navController,scope=coroutineScope)
        }
    }
}