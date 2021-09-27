package com.compose.vanilla
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.compose.yoghurt.R
import com.compose.yoghurt.ui.theme.YoghurtTheme

class MainActivity : ComponentActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContent {
			YoghurtTheme {
				// A surface container using the 'background' color from the theme
				Surface(color = MaterialTheme.colors.background) {
					val message=getString(R.string.message)
					Greeting(message)
				}
			}
		}
	}
}

@Composable
fun Greeting(message: String) {
	Text(text = message)
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
	YoghurtTheme {
		Greeting("Android")
	}
}