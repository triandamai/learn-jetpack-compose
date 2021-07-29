package com.trian.telegramclone.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun AppBar(actionClick:()->Unit,navigationClick:()->Unit){
    TopAppBar(
        title = { Text(text = "Telegram",style = TextStyle(fontWeight = FontWeight.Bold,fontFamily = FontFamily.Default))},
        elevation = 0.dp,
        backgroundColor = MaterialTheme.colors.primary,
        navigationIcon = {
            IconButton(onClick = { /* doSomething() */ }) {
                Icon(Icons.Filled.Menu, contentDescription = null)
            }
        },
        actions = {
            IconButton(onClick = { /* doSomething() */ }) {
                Icon(Icons.Filled.Search, contentDescription = "Localized description")
            }
        }
    )
}

@Composable
fun TabBar(selected:Int,onTabSelect:(Int)->Unit){
    val titles = listOf("All Chats","Unread")
    TabRow(selectedTabIndex = selected) {
        titles.forEachIndexed{
            index: Int, title: String ->
            Tab(
                text = {
                    Text(
                        title,
                        style = TextStyle(fontWeight = FontWeight.SemiBold,fontFamily = FontFamily.Default)
                    )
                },
                selected = selected == index,
                onClick = { onTabSelect(index) }
            )
        }
    }
}

@Preview
@Composable
fun prev(){
    Column {
        AppBar(actionClick = {},navigationClick = {})
        TabBar(selected = 1){}
    }
}