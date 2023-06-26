package com.gsusalcaraz.kotlin_articulocompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.gsusalcaraz.kotlin_articulocompose.ui.theme.Kotlin_ArticuloComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Kotlin_ArticuloComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Articulo()
                }
            }
        }
    }
}

@Composable
fun Articulo(modifier: Modifier = Modifier) {
    Column() {
        Image(
            painter = painterResource(id = R.drawable.bg_compose_background),
            contentDescription = "Logo",
            modifier = Modifier

        )

        Text (
            text = stringResource(R.string.Titulo),
            textAlign = TextAlign.Justify,
            fontSize = 24.sp,
            modifier = Modifier
                .padding(16.dp)
        )
        Text(
            text = stringResource(R.string.Texto),
            textAlign = TextAlign.Justify,
            fontSize = 16.sp,
            modifier = Modifier
                .padding(16.dp)
        )
        Text(
            text = stringResource(R.string.Texto2),
            textAlign = TextAlign.Justify,
            fontSize = 16.sp,
            modifier = Modifier
                .padding(16.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Kotlin_ArticuloComposeTheme {
        Articulo()
    }
}