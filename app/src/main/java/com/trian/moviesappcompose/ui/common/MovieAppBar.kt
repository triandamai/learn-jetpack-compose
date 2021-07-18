package com.trian.moviesappcompose.ui.common

import android.widget.ToggleButton
import androidx.compose.foundation.layout.Row
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.TextStyle
import com.trian.moviesappcompose.ui.theme.Black
import com.trian.moviesappcompose.ui.theme.Red

@Composable
fun DashboardAppBar(onNavigation:()->Unit){
    TopAppBar(
        modifier = Modifier,
        title ={
            Row {
                Text(text = "Play",style = MaterialTheme.typography.h6,color = Black)
                Text(text = " Movies",style = MaterialTheme.typography.h6,color = Red)
            }
        },
        navigationIcon = {
            IconButton(onClick = onNavigation) {
              Icon(Icons.Default.Menu,contentDescription = "")
            }
        },
        backgroundColor = Color.White,
        actions = {
            IconButton(onClick = onNavigation) {
                Icon(Icons.Default.Share,contentDescription = "")
            }
            IconButton(onClick = onNavigation) {
                Icon(Icons.Default.Search,contentDescription = "")
            }
        }
    )
}

@Composable
fun LibraryAppBar(onNavigation:()->Unit){
    TopAppBar(
        modifier = Modifier,
        title ={
            Row {
                Text(text = "My Library",style = MaterialTheme.typography.h6,color = Black)
            }
        },
        navigationIcon = {
            IconButton(onClick = onNavigation) {
                Icon(Icons.Default.ArrowDropDown,contentDescription = "")
            }
        },
        backgroundColor = Color.White,
        actions = {
            IconButton(onClick = onNavigation) {
                Icon(Icons.Default.MoreVert,contentDescription = "")
            }
        }
    )
}

@Composable
fun DetailAppBar(onNavigation:()->Unit){
    TopAppBar(
        modifier = Modifier,
        title ={
        },
        navigationIcon = {
            IconButton(onClick = onNavigation) {
                Icon(Icons.Default.ArrowBack,contentDescription = "")
            }
        },
        backgroundColor = Color.White,
        actions = {
            IconButton(onClick = onNavigation) {
                Icon(Icons.Filled.Favorite,contentDescription = "")
            }
            IconButton(onClick = onNavigation) {
                Icon(Icons.Filled.Email,contentDescription = "")
            }
        }
    )
}