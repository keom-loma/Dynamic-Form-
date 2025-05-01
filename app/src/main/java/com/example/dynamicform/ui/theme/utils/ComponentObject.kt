package com.example.dynamicform.ui.theme.utils

import android.widget.Button
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

object ComponentObject {
    private var componentList = ArrayList<@Composable () -> Unit>()
    val composable: List<@Composable () -> Unit> = listOf(
        { Text("First Composable") },
        { Text("Second Composable") }
    )
    private var componentList1 = ArrayList<@Composable () -> Unit>()



    init {
        componentList1.addAll(
            listOf(
                { Text("First Composable") },
                { Text("Second Composable") },
                { Text("Second Composable") },
                { Button(onClick = {})  {
                    Text("onClick")
                }},
                { Text("Second Composable") },
                { Text("Second Composable") }
            )
        )
    }
    // Expose the list as an immutable List
    val resOfComposable: List<@Composable () -> Unit>
        get() = componentList1

    @Composable
    fun AddComponent(component: @Composable () -> Unit) {
     /*  componentList.add(

        )*/
    }

    fun getComponents(): ArrayList<@Composable () -> Unit> {
        return componentList
    }
}


@Preview(showBackground = true)
@Composable
fun GetUserAvatar() {
    Box(
        modifier = Modifier
            .clip(CircleShape)
            .size(50.dp)
            .background(color = Color.Yellow),
        contentAlignment = Alignment.Center
    ) {
      Text(text = "Profile")
    }
}