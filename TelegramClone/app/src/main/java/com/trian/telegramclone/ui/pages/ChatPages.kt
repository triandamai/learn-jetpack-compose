package com.trian.telegramclone.ui.pages

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Send

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.trian.telegramclone.data.UiStateMdel

@Composable
fun ChatPages(uiStateMdel: UiStateMdel){
    Column(Modifier.fillMaxSize(),verticalArrangement = Arrangement.SpaceBetween) {
        Box{
            MessageList()
           Box(modifier = Modifier.align(Alignment.BottomStart)){
               FormChat()
           }

        }

    }

}
@Composable
fun MessageList(modifier:Modifier = Modifier){
    Box(modifier = modifier,contentAlignment = Alignment.Center){
        LazyColumn( reverseLayout = true,modifier = Modifier.fillMaxSize().padding(bottom = 50.dp)) {
            items(count = 40){
                index ->
                MessageCard(isMine = index % 2 == 0,index=index < 40)
            }
        }
    }
}

@Composable
fun MessageCard(isMine: Boolean,index:Boolean) { // 1
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 8.dp, vertical = 4.dp),
        horizontalAlignment = when { // 2
            isMine -> Alignment.End
            else -> Alignment.Start
        },
    ) {
        Card(
            modifier = Modifier.widthIn(max = 340.dp),
            shape = cardShapeFor(true), // 3
            backgroundColor = when {
                isMine -> MaterialTheme.colors.primary
                else -> MaterialTheme.colors.secondary
            },
        ) {
            Text(
                modifier = Modifier.padding(8.dp),
                text = "ini isi chat",
                color = when {
                    isMine -> MaterialTheme.colors.onPrimary
                    else -> MaterialTheme.colors.onSecondary
                },
            )
        }
        Text( // 4
            text = "Trian",
            fontSize = 12.sp,
        )
    }

}

@Composable
fun cardShapeFor(isMine:Boolean  ): Shape {
    val roundedCorners = RoundedCornerShape(16.dp)
    return when {
        isMine -> roundedCorners.copy(bottomEnd = CornerSize(0))
        else -> roundedCorners.copy(bottomStart = CornerSize(0))
    }
}
@Composable
fun FormChat(){
    var  inputValue by remember{ mutableStateOf("")}
    Row() {
        TextField(
            modifier = Modifier.weight(1f),
            value = inputValue,
            onValueChange={inputValue = it},
            keyboardOptions=KeyboardOptions(imeAction = ImeAction.Send),
            keyboardActions= KeyboardActions {  },
            enabled=true
        )
        Button(enabled = true,modifier = Modifier.height(56.dp),onClick = { /*TODO*/ }){
            Icon(imageVector = Icons.Default.Send, contentDescription = "none")
        }
    }
}
@Preview
@Composable
fun view(){}