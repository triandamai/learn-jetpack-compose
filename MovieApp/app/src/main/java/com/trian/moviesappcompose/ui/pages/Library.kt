package com.trian.moviesappcompose.ui.pages

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.trian.moviesappcompose.ui.common.CardItemLibrary
import com.trian.moviesappcompose.ui.common.LibraryAppBar
import com.trian.moviesappcompose.ui.common.TextTab

@Composable
fun Library(nav:NavHostController){
    Scaffold(topBar = { LibraryAppBar(onNavigation = {}) }) {
        Column {
            TextTab()

        }
    }
}

@Preview
@Composable
fun previewLibrary(){
val nav = rememberNavController()
    Library(nav = nav)
}