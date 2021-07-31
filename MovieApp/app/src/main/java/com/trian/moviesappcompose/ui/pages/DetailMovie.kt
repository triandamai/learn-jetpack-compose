package com.trian.moviesappcompose.ui.pages

import android.widget.Space
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.MoreVert
import androidx.compose.material.icons.outlined.Star
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.trian.moviesappcompose.ui.common.DetailAppBar
import com.trian.moviesappcompose.ui.common.ImageHeaderDetailMovie
import com.trian.moviesappcompose.ui.common.Section
import kotlinx.coroutines.CoroutineScope
/*
* Created by: Trian Damai
* Created at: 31/07/2021
* www.github.com/triandamai
* www.trian.app
* */
@Composable
fun DetailMovie(nav: NavHostController,scope:CoroutineScope){
    Scaffold(
        topBar = {
            DetailAppBar(onNavigation = {})
        },
        content = {
            Column(
                modifier = Modifier.padding(start = 16.dp, end = 16.dp,top = 8.dp,bottom = 8.dp),
                content = {
                    ImageHeaderDetailMovie()
                    Spacer(modifier = Modifier.height(24.dp))
                    Row(
                        modifier= Modifier
                            .fillMaxWidth()
                            .padding(start = 16.dp, end = 8.dp),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment=Alignment.CenterVertically,
                        content = {
                        Text(
                            text = "Marvel's Avengers: Infinity War",
                            textAlign=TextAlign.Start,
                            style = MaterialTheme.typography.h6
                        )
                        IconToggleButton(
                            checked = true, onCheckedChange = {}, content = {
                            Icon(Icons.Outlined.MoreVert,contentDescription = "")
                        })
                    })
                    Spacer(modifier = Modifier.height(8.dp))
                    Row(
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment=Alignment.CenterVertically,
                        modifier= Modifier
                            .fillMaxWidth()
                            .padding(start = 16.dp, end = 16.dp),
                        content={
                        Column(
                            content = {
                            Text(text = "Action & Adventure",style = MaterialTheme.typography.body1)
                            Row(content = {
                                Text(text = "2018, 149 Mins 4.3")
                                Icon(Icons.Outlined.Star,contentDescription = "")
                            })
                        })
                        Button(onClick = { /*TODO*/ },content = {
                            Text(text = "Watch Now")
                        })
                    })
                    Spacer(modifier = Modifier.height(24.dp))
                    Divider(modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 16.dp, end = 16.dp))
                    Text(
                        text = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.",
                        style = MaterialTheme.typography.body2,
                        modifier = Modifier.padding(start = 16.dp,end = 16.dp,top = 16.dp),
                        textAlign = TextAlign.Start,
                    )
                    Text(text = "READ MORE",modifier = Modifier.padding(start = 16.dp,end = 16.dp,top = 16.dp,bottom = 16.dp))
                    Divider(modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 16.dp, end = 16.dp))
                    Section(title = "Related to this movie", onClick ={

                    })
                })
        })
}
@Preview
@Composable
fun previewDetail(){
    DetailMovie(nav = rememberNavController()
        , scope = rememberCoroutineScope() )
}