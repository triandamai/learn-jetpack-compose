package com.trian.moviesappcompose.ui.pages

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.rememberPagerState
import com.trian.moviesappcompose.ui.common.CardItemLibrary
import com.trian.moviesappcompose.ui.common.LibraryAppBar
import com.trian.moviesappcompose.ui.common.TextTab
import kotlinx.coroutines.*
/*
* Created by: Trian Damai
* Created at: 31/07/2021
* www.github.com/triandamai
* www.trian.app
* */
@ExperimentalPagerApi
@Composable
fun Library(nav: NavHostController, coroutineScope: CoroutineScope){
    val pagerState = rememberPagerState(pageCount = 2)
    fun movePage(index:Int){
      coroutineScope.launch {
          pagerState.animateScrollToPage(page = index)
      }
    }
    Scaffold(topBar = { LibraryAppBar(onNavigation = {}) }) {
        Column {
            TextTab(tabSelected = pagerState.currentPage,onSelected ={index -> movePage(index = index) })
            HorizontalPager(state = pagerState) {
                page: Int ->
                when(page){
                    1-> PageListMovie()
                    else -> PageListMovie()
                }
            }
        }
    }
}

@Composable
fun PageListMovie(){
    LazyColumn(content = {
        items(count = 20,itemContent = {
            index: Int -> CardItemLibrary()
        })
    })
}

@ExperimentalPagerApi
@Preview
@Composable
fun previewLibrary(){
val nav = rememberNavController()
    val scope= rememberCoroutineScope()
    Library(nav = nav, coroutineScope = scope)
}