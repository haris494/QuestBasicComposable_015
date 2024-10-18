package com.example.appjack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.appjack.ui.theme.AppjackTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppjackTheme  {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    BasicCompose(

                        haris = Modifier.padding(innerPadding)
                        //Mengganti parameter haris menjadi modifier pada fungsi BasicCompose
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
////menambahkan fungsi @Preview untuk menampilkan komponen BasicCompose dengan latar belakang di dalam editor
@Composable
fun BasicCompose(haris: Modifier = Modifier){
//Mengganti nama parameter haris menjadi modifier pada fungsi BasicCompose,
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
//Menambahkan pusat alignment secara vertikal dan horizontal pada Column



        Text(
            text = "Login", modifier =  haris,
            fontSize = 40.sp,
            color = Color.Green,
            fontWeight = FontWeight.Bold
            )
//Mengganti haris menjadi modifier untuk mengikuti konvensi Compose.
        Text(text = "Ini adalah halaman login",
        fontSize = 25.sp,
        color = Color.Blue,
        fontFamily = FontFamily.Serif
        )

        Image(
            painter = painterResource(id = R.drawable.images),
            contentDescription = null,
            modifier = Modifier.size(250.dp)
        )
//Menambahkan penggunaan Image dengan parameter painter
        Text(text = "Nama",
            fontSize = 30.sp,
            color = Color.Blue,
            fontWeight = FontWeight.Bold
            )
//
        Text(text = "Haris Shihab Dzul Firdausi",
            fontSize = 25.sp,
            color = Color.Blue,
            fontFamily = FontFamily.Default
            )

        Text(text = "20220140015",
            fontSize = 25.sp,
            color = Color.Black,
            fontWeight = FontWeight.Bold
            )

        Image(
            painter = painterResource(id = R.drawable.haris),
            contentDescription = null,
            modifier = Modifier.size(250.dp)
        )
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AppjackTheme {
        Greeting("Android", modifier = Modifier)
    }
}