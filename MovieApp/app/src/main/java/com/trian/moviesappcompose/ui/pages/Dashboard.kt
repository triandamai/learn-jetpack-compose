package com.trian.moviesappcompose.ui.pages

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.trian.moviesappcompose.data.MovieViewModel
import com.trian.moviesappcompose.ui.common.*
import kotlinx.coroutines.CoroutineScope
import androidx.lifecycle.viewmodel.compose.viewModel

/*
* Created by: Trian Damai
* Created at: 31/07/2021
* www.github.com/triandamai
* www.trian.app
* */
@Composable
fun Dashboard(modifier: Modifier = Modifier, nav: NavHostController,scope:CoroutineScope,viewModel: MovieViewModel = viewModel()) {
    val listMovie by viewModel.getListMovie.observeAsState()
    Scaffold(topBar = {
        DashboardAppBar {

        }
    }) {
        Column(
            Modifier
                .fillMaxWidth()
                .verticalScroll(rememberScrollState())) {
            LazyRow(
                modifier = modifier
                    .fillMaxWidth()
                    .padding(top = 8.dp, bottom = 8.dp)
            ) {
                items(count = 4, itemContent = { index: Int ->
                    ItemCorousel(index)
                })
            }
            DashboardSection(
                title = "Whats's New",
                listmovie= listMovie,
                onClick = {

                    nav.navigate(Router.DetailMovie.name)
                },
                onViewAll = {
                    nav.navigate(Router.Library.name)
                })
            DashboardSection(
                title = "Recomended for you",
                listmovie= listMovie,
                onClick = {

                    nav.navigate(Router.DetailMovie.name)
                },
                onViewAll = {
                    nav.navigate(Router.Library.name)
                })

        }

    }
}


@Preview
@Composable
fun previewDashboard() {
    val nav = rememberNavController()
    Dashboard(nav = nav,scope = rememberCoroutineScope())
}