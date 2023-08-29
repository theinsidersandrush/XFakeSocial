package com.x.android

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.x.android.ui.theme.XTheme
import androidx.compose.foundation.Image
import androidx.compose.ui.graphics.painter.Painter
import androidx.appcompat.app.AppCompatActivity
import android.widget.Toast

class MainActivity : ComponentActivity() {

    class MainActivity : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            XTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                )
                {
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally,
                    ) {
                        image(painterResource(id = R.drawable.logo))

                        Text(text = "This is X. The Everything App.")

                        Button(
                            onClick = {
                                val url = "https://www.youtube.com/watch?v=dQw4w9WgXcQ"
                                val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
                                startActivity(browserIntent)
                            }
                        ) {
                            Text(text = "Start exploring X today!")
                        }

                        Button(
                            onClick = {
                                val url = "https://twitter.com/"
                                val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
                                startActivity(browserIntent)
                            }
                        ) {
                            Text(text = "Go back to Twitter")
                        }
                }
                
                }
            }
        }
    }

    private fun image(painter: Painter) {

    }
}