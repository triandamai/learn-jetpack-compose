package com.trian.moviesappcompose.ui.common

import androidx.compose.foundation.background
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.trian.moviesappcompose.ui.theme.HeavyGray
import com.trian.moviesappcompose.ui.theme.MoviesAppComposeTheme
import com.trian.moviesappcompose.ui.theme.Red

@Composable
fun MainButton(text:String,onClick:()->Unit = {}){
    Button(onClick = onClick,modifier = Modifier,shape =  MaterialTheme.shapes.small,enabled = true,colors = ButtonDefaults.textButtonColors(backgroundColor = Red)) {
        Text(text = text,style = MaterialTheme.typography.subtitle2,color = HeavyGray)
    }
}

@Preview
@Composable
fun previewButton(){
    MainButton("Ini Button")
}