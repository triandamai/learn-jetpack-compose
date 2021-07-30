package com.trian.moviesappcompose.ui.common

import android.content.res.Configuration
import android.widget.ToggleButton
import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material.icons.outlined.ArrowBack
import androidx.compose.material.icons.outlined.Favorite
import androidx.compose.material.icons.outlined.KeyboardArrowDown
import androidx.compose.material.icons.outlined.Refresh
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.debugInspectorInfo
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
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
                Icon(Icons.Outlined.KeyboardArrowDown,contentDescription = "")
            }
        },
        backgroundColor = Color.White,
        actions = {
            IconButton(onClick = onNavigation) {
                Icon(Icons.Default.MoreVert,contentDescription = "")
            }
        },
        elevation = 0.dp
    )
}

@Composable
fun TextTab(){
    var tabIndex by remember {
        mutableStateOf(0)
    }

    val tabData = listOf(
        "Movies",
        "Tv Shows"
    )
    TabRow(
        backgroundColor= Color.White,
        selectedTabIndex = tabIndex,
        indicator = {
        tabPositions ->
        TabRowDefaults.Indicator(
            modifier = Modifier.customTabIndicatorOffset(tabPositions[tabIndex]).clip(shape = RoundedCornerShape(topStart = 16.dp,topEnd = 16.dp)),
            height = 4.dp,
            color = Color.Red
        )
        },
        tabs = {
            tabData.forEachIndexed{
                    index, text ->
                Tab(
                    selected = tabIndex == index,
                    onClick = { tabIndex = index },
                    text = {
                        Text(
                            text = text,
                            color = when(tabIndex){
                                index-> Color.Red
                                else -> Color.DarkGray
                            },
                            style = MaterialTheme.typography.subtitle2
                        )
                    }
                )
            }
        })
}
@Composable
fun DetailAppBar(onNavigation:()->Unit){
    TopAppBar(
        modifier = Modifier,
        title ={
        },
        navigationIcon = {
            IconButton(onClick = onNavigation) {
                Icon(Icons.Outlined.ArrowBack,contentDescription = "")
            }
        },
        backgroundColor = Color.White,
        actions = {
            IconButton(onClick = onNavigation) {
                Icon(Icons.Outlined.Favorite,contentDescription = "")
            }
            IconButton(onClick = onNavigation) {
                Icon(Icons.Outlined.Refresh,contentDescription = "")
            }
        }
    )
}
/*
* custom indicator
* */
fun Modifier.customTabIndicatorOffset(
    currentTabPosition: TabPosition
): Modifier = composed(
    inspectorInfo = debugInspectorInfo {
        name = "tabIndicatorOffset"
        value = currentTabPosition
    }
) {
    val indicatorWidth = 80.dp
    val currentTabWidth = currentTabPosition.width
    val indicatorOffset by animateDpAsState(
        targetValue = currentTabPosition.left + currentTabWidth / 2 - indicatorWidth / 2,
        animationSpec = tween(durationMillis = 1000, easing = FastOutSlowInEasing)
    )
    fillMaxWidth()
        .wrapContentSize(Alignment.BottomStart)
        .offset(x = indicatorOffset)
        .width(indicatorWidth)
}
@Preview
@Composable
fun previewTextTab() {
    TextTab()
}
@Preview
@Composable
fun previewDashAppBar(){
    DashboardAppBar {

    }
}

@Preview
@Composable
fun previewLibAppBar(){
   LibraryAppBar {

   }
}

@Preview
@Composable
fun previewDetailAppBar(){
    DetailAppBar {

    }
}