package com.trian.telegramclone

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.trian.telegramclone.data.Routes
import com.trian.telegramclone.data.UiStateMdel
import com.trian.telegramclone.ui.pages.ChatPages
import com.trian.telegramclone.ui.pages.MainPages
import com.trian.telegramclone.ui.theme.TelegramCloneTheme

class MainActivity : ComponentActivity() {
    @ExperimentalMaterialApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TelegramCloneTheme {
                // A surface container using the 'background' color from the theme
                    InitNavGraph()
            }
        }
    }

    @ExperimentalMaterialApi
    @Composable
    fun InitNavGraph(){
        val navController= rememberNavController()
        val scaffoldState = rememberScaffoldState()
        val scope= rememberCoroutineScope()
        Scaffold(scaffoldState = scaffoldState) {
            NavHost(navController = navController, Routes.CHAT_SCREEN){
                composable(route = Routes.MAIN_SCREEN){
                    MainPages(UiStateMdel(navController,scope,scaffoldState))
                }
                composable(route = Routes.CHAT_SCREEN){
                    ChatPages(UiStateMdel(navController,scope,scaffoldState))
                }
            }
        }
    }
}


