package eu.thomaskuenneth.composebook.sandbox

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview

class SandboxActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            // invoke your composable functions here
        }
    }

    @Composable
    @Preview
    fun ColumnWithTexts() {
        Column {
            Text(
                text = "Android UI development with Jetpack Compose",
                style = MaterialTheme.typography.h3
            )
            Text(
                text = "Hello Compose",
                style = MaterialTheme.typography.h5.merge(TextStyle(color = Color.Red))
            )
        }
    }
}
