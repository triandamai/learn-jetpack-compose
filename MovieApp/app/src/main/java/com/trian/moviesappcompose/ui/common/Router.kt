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

enum class Router {
    Dashboard,Library,DetailMovie
}

@ExperimentalPagerApi
@Composable
fun Router(navController: NavHostController,coroutineScope: CoroutineScope){
    NavHost(navController = navController, startDestination = Router.Dashboard.name){
        composable(Router.Dashboard.name){
            Dashboard(nav = navController)
        }
        composable(Router.Library.name){
            Library(nav = navController,coroutineScope=coroutineScope)
        }
        composable(Router.DetailMovie.name){
            DetailMovie(nav = navController,scope=coroutineScope)
        }
    }
}