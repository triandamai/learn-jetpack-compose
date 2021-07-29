package com.trian.telegramclone.ui.pages

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.trian.telegramclone.data.Routes
import com.trian.telegramclone.data.UiStateMdel
import com.trian.telegramclone.data.dummyChat
import com.trian.telegramclone.ui.components.AppBar
import com.trian.telegramclone.ui.components.ChatItem
import com.trian.telegramclone.ui.components.TabBar

@ExperimentalMaterialApi
@Composable
fun MainPages(uiStateMdel: UiStateMdel){
    var selectedTab by remember{ mutableStateOf(0)}
    Column(modifier = Modifier.fillMaxWidth()) {
        AppBar(
            actionClick = {},
            navigationClick = {}
        )
        TabBar(selected = selectedTab) {
            selectedTab = it
        }
        LazyColumn {
            items(count = dummyChat.size){
                    index -> ChatItem(chatModel = dummyChat[index],onClick = {uiStateMdel.route.navigate(Routes.CHAT_SCREEN)})
            }
        }
    }
}


@Preview
@Composable
fun prev(){
    Column(modifier = Modifier.fillMaxWidth()) {
        AppBar(
            actionClick = {},
            navigationClick = {}
        )
        TabBar(selected = 0) {

        }
    }
}
