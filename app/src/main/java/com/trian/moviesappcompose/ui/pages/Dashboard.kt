package com.trian.moviesappcompose.ui.pages

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.trian.moviesappcompose.ui.common.*

@Composable
fun Dashboard(modifier: Modifier =Modifier){
    Surface(color = Color.White) {
        Column(modifier = modifier.fillMaxHeight()) {
            DashboardAppBar{

            }
            Column(Modifier.fillMaxWidth().padding(start = 16.dp,end = 16.dp)) {
                LazyRow(modifier = modifier.fillMaxWidth().padding(top = 8.dp,bottom = 8.dp)) {
                    items(count = 4,itemContent = {
                            index: Int -> ImageScroll(index)
                    })
                }
                Section(title = "Whats's New"){
                    LazyRow(modifier = modifier.fillMaxWidth()) {
                        items(count = 4,itemContent = {
                                index: Int -> ImageScroll(index)
                        })
                    }
                }
            }
        }
    }
}

@Preview
@Composable
fun previewDashboard(){
    Dashboard()
}