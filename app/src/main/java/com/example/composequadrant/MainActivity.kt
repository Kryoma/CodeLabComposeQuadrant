package com.example.composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composequadrant.ui.theme.ComposeQuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeQuadrantTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background
                ) {
                    MyApp()

                }
            }
        }
    }
}

@Composable
fun MyApp() {
    Column(modifier = Modifier.fillMaxWidth()) {
        Row(Modifier.weight(1F)) {
            Manufacture(
                title = stringResource(id = R.string.text1),
                color = Color.Green,
                description = stringResource(R.string.description1),
                modifier = Modifier.weight(1F)
            )
            Manufacture(
                title = stringResource(id = R.string.text2),
                color = Color.Yellow,
                description = stringResource(R.string.description2),
                modifier = Modifier.weight(1F)
            )

        }
        Row(Modifier.weight(1F)) {
            Manufacture(
                title = stringResource(id = R.string.text3),
                color = Color.Cyan,
                description = stringResource(R.string.description3),
                modifier = Modifier.weight(1F)
            )
            Manufacture(
                title = stringResource(id = R.string.text4),
                color = Color.LightGray,
                description = stringResource(R.string.description4),
                modifier = Modifier.weight(1F)
            )
        }

    }
}

@Composable
fun Manufacture(
    title: String, color: Color, description: String, modifier: Modifier
) {
    Column(
        modifier = modifier
            .background(color)
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,

        ) {
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp),
        )
        Text(
            text = description,
            textAlign = TextAlign.Justify,
        )
    }


}

@Preview
@Composable
fun PreviewDisplay() {
    Surface(
        modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background
    ) {
        MyApp()

    }
}

