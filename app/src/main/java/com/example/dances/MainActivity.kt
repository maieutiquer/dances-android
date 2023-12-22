package com.example.dances

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.dances.ui.theme.DancesTheme
import com.example.dances.viewmodel.DanceViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DancesTheme {
                // A surface container using the 'background' color from the theme
                // Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                //     Greeting("Android")
                // }
                DanceListScreen()
            }
        }
    }
}

@Composable
fun DanceListScreen() {
    val viewModel: DanceViewModel = viewModel()
    LazyColumn {
        items(viewModel.dances) { dance ->
            Text(text = dance.name)
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
            text = "Hello test $name!",
            modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    DancesTheme {
        Greeting("Android")
    }
}