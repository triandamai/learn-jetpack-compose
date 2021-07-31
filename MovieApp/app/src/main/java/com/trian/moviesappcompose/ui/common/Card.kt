package com.trian.moviesappcompose.ui.common

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.MailOutline
import androidx.compose.material.icons.outlined.MoreVert
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.trian.moviesappcompose.R
/*
* Created by: Trian Damai
* Created at: 31/07/2021
* www.github.com/triandamai
* www.trian.app
* */

@Composable
fun ItemLibrary(index: Int,onClick: (index: Int) -> Unit){
    Row(
        Modifier
            .background(color = Color.White)
            .fillMaxWidth()
            .padding(start = 16.dp, end = 16.dp)) {
        Image(
            contentScale = ContentScale.FillHeight,
            painter = painterResource(id = R.drawable.marvel),
            contentDescription = "",
            modifier = Modifier
                .width(130.dp)
                .height(180.dp)
                .padding(top = 4.dp, bottom = 4.dp)
                .clip(shape = RoundedCornerShape(6.dp))
        )
        Spacer(modifier = Modifier.width(10.dp))
        Column(verticalArrangement = Arrangement.Center,horizontalAlignment = Alignment.Start,modifier = Modifier.height(180.dp)) {
            Text(text = "Marvel's Avengers: Infinity War")
            Text(text = "2018,149 mins")
            Spacer(modifier = Modifier.height(10.dp))
            Row(Modifier.fillMaxWidth(),horizontalArrangement = Arrangement.SpaceBetween,verticalAlignment = Alignment.CenterVertically) {
                Button(onClick = { onClick(index) },colors = ButtonDefaults.textButtonColors(backgroundColor = Color.Red,contentColor = Color.White
                )) {
                    Text(text = "Watch Now")
                }
                Row {
                    IconToggleButton(checked = true, onCheckedChange = {}) {
                        Icon(Icons.Outlined.MailOutline,contentDescription = "")
                    }
                    IconToggleButton(checked = true, onCheckedChange = {}) {
                        Icon(Icons.Outlined.MoreVert,contentDescription = "")
                    }
                }
            }
        }
    }
}
@Composable
fun ItemCorousel(index: Int) {
    if (index == 0) {
        Spacer(modifier = Modifier.width(16.dp))
    }
    Image(
        contentScale = ContentScale.FillBounds,
        painter = painterResource(id = R.drawable.marvel),
        contentDescription = "",
        modifier = Modifier
            .clickable { }
            .width(300.dp)
            .height(150.dp)
            .padding(top = 4.dp, bottom = 4.dp)
            .clip(shape = RoundedCornerShape(6.dp))
    )
    Spacer(modifier = Modifier.width(16.dp))

}
@Composable
fun HeaderDetailMovie() {

    Image(
        contentScale = ContentScale.FillBounds,
        painter = painterResource(id = R.drawable.marvel),
        contentDescription = "",
        modifier = Modifier
            .clickable { }
            .fillMaxWidth()
            .height(200.dp)
            .padding(top = 4.dp, bottom = 4.dp)
            .clip(shape = RoundedCornerShape(6.dp))
    )


}
@Composable
fun ItemSection(index: Int, title:String, onClick:(index:Int)->Unit){
    if (index == 0) {
        Spacer(modifier = Modifier.width(16.dp))
    }
    Column(
        Modifier
            .padding(top = 16.dp, bottom = 16.dp)
            .clickable { onClick(index) }) {
        Image(
            contentScale = ContentScale.FillHeight,
            painter = painterResource(id = R.drawable.marvel),
            contentDescription = "",
            modifier = Modifier
                .width(130.dp)
                .height(180.dp)
                .padding(top = 4.dp, bottom = 4.dp)
                .clip(shape = RoundedCornerShape(6.dp))
        )
        Text(text = title,style = MaterialTheme.typography.body2)
    }
    Spacer(modifier = Modifier.width(16.dp))
}

@Composable
fun ItemSectionRelatedMovie(index: Int, title:String, onClick:(index:Int)->Unit){
    if (index == 0) {
        Spacer(modifier = Modifier.width(16.dp))
    }
    Column(
        Modifier
            .padding(top = 16.dp, bottom = 16.dp)
            .clickable { onClick(index) }) {
        Image(
            contentScale = ContentScale.FillHeight,
            painter = painterResource(id = R.drawable.marvel),
            contentDescription = "",
            modifier = Modifier
                .width(130.dp)
                .height(130.dp)
                .padding(top = 4.dp, bottom = 4.dp)
                .clip(shape = RoundedCornerShape(6.dp))
        )
        Text(text = title,style = MaterialTheme.typography.body2)
    }
    Spacer(modifier = Modifier.width(16.dp))
}

@Preview
@Composable
fun previewScrollImage() {
    LazyRow(modifier = Modifier.background(Color.White)) {
        items(5) { index: Int ->
            ItemCorousel(index = index)
        }
    }
}

@Preview
@Composable
fun previewScrollImagePortrait() {
    LazyRow(modifier = Modifier.background(Color.White)) {
        items(5) { index: Int ->
            ItemSection(index = index,"A",onClick = {})
        }
    }
}
@Preview
@Composable
fun previewCardItemLibrary(){
    ItemLibrary(1){}
}

