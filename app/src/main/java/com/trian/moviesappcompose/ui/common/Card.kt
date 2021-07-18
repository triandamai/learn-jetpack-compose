package com.trian.moviesappcompose.ui.common

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.transform.CircleCropTransformation
import com.trian.moviesappcompose.R


@Composable
fun ImageScroll(index:Int){
    Image(
        contentScale= ContentScale.FillWidth,
        painter = painterResource(id = R.drawable.marvel),
        contentDescription = "",
        modifier = Modifier
            .clip(shape = MaterialTheme.shapes.medium)
            .width(300.dp)
            .height(200.dp)
    )
    if (index > 0){
        Spacer(modifier = Modifier.width(10.dp))
    }

}


@Composable
fun Section(title:String, content: @Composable ColumnScope.() -> Unit = {},){
    Column {
        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(top = 8.dp, bottom = 8.dp),horizontalArrangement = Arrangement.SpaceBetween) {
            Text(text = title,style = MaterialTheme.typography.subtitle1)
            Text(text = "View All",style = MaterialTheme.typography.subtitle2,color = Color.Blue)
        }
    }
}

