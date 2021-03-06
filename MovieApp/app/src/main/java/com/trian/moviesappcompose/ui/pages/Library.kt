package com.trian.moviesappcompose.ui.pages

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.rememberPagerState
import com.trian.moviesappcompose.ui.common.ItemLibrary
import com.trian.moviesappcompose.ui.common.LibraryAppBar
import com.trian.moviesappcompose.ui.common.Router
import com.trian.moviesappcompose.ui.common.TextTab
import kotlinx.coroutines.*
import androidx.lifecycle.viewmodel.compose.viewModel
import com.trian.moviesappcompose.data.MovieViewModel

/*
* Created by: Trian Damai
* Created at: 31/07/2021
* www.github.com/triandamai
* www.trian.app
* */
@ExperimentalPagerApi
@Composable
fun Library(nav: NavHostController, scope: CoroutineScope,viewModel: MovieViewModel = viewModel()){
    val pagerState = rememberPagerState(pageCount = 2)
    val listMovie by viewModel.getListMovie.observeAsState()
    fun movePage(index:Int){
      scope.launch {
          pagerState.animateScrollToPage(page = index)
      }
    }
    Scaffold(topBar = { LibraryAppBar(onNavigation = {}) }) {
        Column {
            TextTab(tabSelected = pagerState.currentPage,onSelected ={index -> movePage(index = index) })
            HorizontalPager(state = pagerState) {
                page: Int ->
                when(page){
                    1->  LazyColumn(content = {
                        items(count = listMovie!!.size,itemContent = {
                                index: Int ->
                                    ItemLibrary(index = index,listMovie!![index].thumbnails,onClick = {
                                        nav.navigate(Router.DetailMovie.name)
                                    })
                        })
                    })
                    else ->  LazyColumn(content = {
                        items(count = listMovie!!.size, itemContent = {
                                index: Int ->
                                    ItemLibrary(index = index,listMovie!![index].thumbnails, onClick = {
                                        nav.navigate(Router.DetailMovie.name)
                                    })
                        })
                    })
                }
            }
        }
    }
}


@ExperimentalPagerApi
@Preview
@Composable
fun previewLibrary(){
val nav = rememberNavController()
    val scope= rememberCoroutineScope()
    Library(nav = nav, scope = scope)
}