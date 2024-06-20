package com.lightricks.adtcompose.exercise2

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier

@Composable
fun Exercise2Screen() {
    Box(modifier = Modifier.fillMaxSize()) {

        var text by remember { mutableStateOf("") }

        LazyColumn {
            items(3) { index ->
                Text("Suggestion $index")
            }
        }
        BasicTextField(value = text, onValueChange = { text = it })
    }
}

