package com.trian.moviesappcompose.ui.pages

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.trian.moviesappcompose.ui.common.DashboardAppBar
import com.trian.moviesappcompose.ui.common.ImageScroll
import com.trian.moviesappcompose.ui.common.Router
import com.trian.moviesappcompose.ui.common.Section

@Composable
fun Dashboard(modifier: Modifier = Modifier, nav: NavHostController) {
    Scaffold(topBar = {
        DashboardAppBar {

        }
    }) {
        Column(Modifier.fillMaxWidth()) {
            LazyRow(
                modifier = modifier
                    .fillMaxWidth()
                    .padding(top = 8.dp, bottom = 8.dp)
            ) {
                items(count = 4, itemContent = { index: Int ->
                    ImageScroll(index)
                })
            }
            Section(title = "Whats's New", onClick = {
                print("ini click")
                nav.navigate(Router.Library.name)
            })
            Section(title = "Recomended for you", onClick = { nav.navigate(Router.Library.name) })

        }

    }
}


@Preview
@Composable
fun previewDashboard() {
    val nav = rememberNavController()
    Dashboard(nav = nav)
}