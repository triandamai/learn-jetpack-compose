/*
 *
 *  Created At   31/7/2021
 *  Created By Trian Damai
 *  www.github.com/triandamai
 *  www.trian.app
 * /
 *
 */

package com.trian.moviesappcompose.ui.common

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.trian.moviesappcompose.data.models.MovieModel


@Composable
fun BaseSection(title: String,onViewAll:()->Unit) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 8.dp, bottom = 8.dp, start = 16.dp, end = 16.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = title, style = MaterialTheme.typography.subtitle1)
            Text(text = "View All", style = MaterialTheme.typography.subtitle2, color = Color.Blue,modifier = Modifier.clickable { onViewAll() })
        }

}

@Composable
fun DashboardSection(title: String,listmovie:List<MovieModel>, onClick: (index: Int) -> Unit,onViewAll:()->Unit) {
    Column(modifier = Modifier.background(color = Color.White)) {
       BaseSection(title = title,onViewAll = {onViewAll()})
        LazyRow{
            items(listmovie.size){
                    index:Int->
                ItemSection(index = index,listmovie!![index].thumbnails,listmovie!![index].title,onClick = {onClick(index)})
            }
        }
        Divider(
            Modifier
                .fillMaxWidth()
                .padding(start = 16.dp, end = 16.dp))
        Spacer(modifier = Modifier.width(16.dp))
    }
}

@Composable
fun SectionRelatedMovie(title:String, listmovie: List<MovieModel>, onClick: (index: Int) -> Unit, onViewAll:()->Unit) {
    Column(modifier = Modifier.background(color = Color.White)) {
        BaseSection(title = title,onViewAll = {onViewAll()})
        LazyRow{
            items(listmovie.size){
                    index:Int->
                ItemSectionRelatedMovie(index = index,"Ini Judul",onClick = {onClick(index)})
            }
        }
        Divider(
            Modifier
                .fillMaxWidth()
                .padding(start = 16.dp, end = 16.dp))
        Spacer(modifier = Modifier.width(16.dp))
    }
}

@Preview
@Composable
fun previewSection() {
    BaseSection(title = "ini Section") {}
}
@Preview
@Composable
fun previewDashSection() {
    DashboardSection(title = "ini Section", listOf(),{}){}
}
@Preview
@Composable
fun previewSectionRelated() {
    SectionRelatedMovie(title = "", listOf(),{}){}
}
