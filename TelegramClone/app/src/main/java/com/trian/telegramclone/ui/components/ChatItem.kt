package com.trian.telegramclone.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Divider
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.google.accompanist.coil.rememberCoilPainter


import com.trian.telegramclone.data.ChatModel
import com.trian.telegramclone.ui.theme.GrayPrimary


@ExperimentalMaterialApi
@Composable
fun ChatItem(chatModel: ChatModel?,onClick:()->Unit){


    Surface(onClick =onClick ,modifier = Modifier.fillMaxWidth()) {

        Row(modifier = Modifier.padding(start = 8.dp,end = 8.dp,top = 10.dp,bottom = 10.dp),horizontalArrangement = Arrangement.SpaceBetween,verticalAlignment = Alignment.CenterVertically) {
            Row(horizontalArrangement = Arrangement.Start,modifier = Modifier.width(250.dp)){
                Surface(color = GrayPrimary,shape = CircleShape,modifier = Modifier
                    .width(50.dp)
                    .height(50.dp)) {
                    Image(painter = rememberCoilPainter(request = ""), contentDescription = "Profil" )
                }
                Spacer(modifier = Modifier.width(10.dp))
                Column(
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.Start,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(text = "BP")
                    Text(text = "You: ini adalah testing",modifier = Modifier.fillMaxWidth())
                }
            }
            Column(modifier = Modifier.width(50.dp)) {
                Text(text = "103")
            }
        }
    }
    Divider()

}

@ExperimentalMaterialApi
@Preview
@Composable
fun previtem(){
    ChatItem(chatModel = null,onClick = {});
}