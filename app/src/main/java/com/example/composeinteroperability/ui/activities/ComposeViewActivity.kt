package com.example.composeinteroperability.ui.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.tooling.preview.Preview
import com.example.composeinteroperability.R

class ComposeViewActivity : AppCompatActivity() {
    private lateinit var containerLayout: ComposeView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.compose_view)
        containerLayout = findViewById(R.id.compose_view)
        containerLayout.setContent {
            ComposeView()
        }
    }
}

@Composable
fun ComposeView() {
    Text(
        text = "Hello World",
        style = MaterialTheme.typography.h1,
    )
}

@Composable
@Preview
fun ComposeViewPreview() {
    ComposeView()
}
