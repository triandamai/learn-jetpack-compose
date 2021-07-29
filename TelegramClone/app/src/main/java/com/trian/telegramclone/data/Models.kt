package com.trian.telegramclone.data

import androidx.compose.material.ScaffoldState
import androidx.navigation.NavController
import kotlinx.coroutines.CoroutineScope

data class UiStateMdel(var route:NavController,var scope: CoroutineScope,var scaffoldState: ScaffoldState)
data class ChatModel(var image:String,var name:String,var conversation:String,var isMe:Boolean)

class Routes{
    companion object{
        const val CHAT_SCREEN="CHATSCREEN"
        const val MAIN_SCREEN="MAINSCREEN"
    }
}

val dummyChat = listOf<ChatModel>(
    ChatModel("","","",true),
    ChatModel("","","",false),
    ChatModel("","","",false),
    ChatModel("","","",true),
    ChatModel("","","",false),
    ChatModel("","","",true),
    ChatModel("","","",true),
    ChatModel("","","",true),
    ChatModel("","","",true),
    ChatModel("","","",true),


)