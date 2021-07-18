package com.trian.moviesappcompose.ui.common

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.trian.moviesappcompose.ui.pages.Dashboard
import com.trian.moviesappcompose.ui.pages.DetailMovie
import com.trian.moviesappcompose.ui.pages.Library

enum class Router {
    Dashboard,Library,DetailMovie
}

@Composable
fun Router(navController: NavHostController){
    NavHost(navController = navController, startDestination = Router.Dashboard.name){
        composable(Router.Dashboard.name){
            Dashboard()
        }
        composable(Router.Library.name){
            Library()
        }
        composable(Router.DetailMovie.name){
            DetailMovie()
        }
    }
}