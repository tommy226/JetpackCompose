package com.sungbin.jetpackcomposestudy

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sungbin.jetpackcomposestudy.ui.theme.JetpackComposeStudyTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeStudyTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    StudyApp()
                }
            }
        }
    }
}

@Composable
fun StudyApp(modifier: Modifier = Modifier) {
    GridSolution()
}

@Composable
fun GridSolution(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        Row(modifier = Modifier.weight(1f)) {
            CardSection(
                title = stringResource(id = R.string.grid_title_1),
                text = stringResource(id = R.string.grid_text_1),
                backgroundColor = Color.Green,
                modifier = Modifier.weight(1f)
            )
            CardSection(
                title = stringResource(id = R.string.grid_title_2),
                text = stringResource(id = R.string.grid_text_2),
                backgroundColor = Color.Yellow,
                modifier = Modifier.weight(1f)
            )
        }
        Row(modifier = Modifier.weight(1f)) {
            CardSection(
                title = stringResource(id = R.string.grid_title_3),
                text = stringResource(id = R.string.grid_text_3),
                backgroundColor = Color.Cyan,
                modifier = Modifier.weight(1f)
            )
            CardSection(
                title = stringResource(id = R.string.grid_title_4),
                text = stringResource(id = R.string.grid_text_4),
                backgroundColor = Color.LightGray,
                modifier = Modifier.weight(1f)
            )
        }
    }
}

@Composable
fun CardSection(
    modifier: Modifier = Modifier,
    title: String,
    text: String,
    backgroundColor: Color
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(backgroundColor)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = title,
            modifier = Modifier.padding(bottom = 16.dp),
            fontWeight = FontWeight.Bold
        )
        Text(text = text, textAlign = TextAlign.Justify)
    }
}

@Composable
fun TaskManagerCheck(modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_task_completed),
            contentDescription = null
        )
        Text(
            modifier = Modifier.padding(top = 24.dp, bottom = 8.dp),
            text = stringResource(id = R.string.check_1),
            fontWeight = FontWeight.Bold
        )
        Text(
            modifier = modifier,
            text = stringResource(id = R.string.check_2), fontSize = 16.sp
        )
    }
}

@Composable
fun Tutorials(modifier: Modifier = Modifier) {
    Column() {
        Image(
            modifier = modifier.fillMaxWidth(),
            painter = painterResource(id = R.drawable.bg_compose_background),
            contentDescription = null
        )
        Text(
            modifier = modifier.padding(16.dp),
            text = stringResource(id = R.string.line_1), fontSize = 24.sp
        )
        Text(
            modifier = modifier.padding(start = 16.dp, end = 16.dp),
            text = stringResource(id = R.string.line_2),
            textAlign = TextAlign.Justify
        )
        Text(
            modifier = modifier.padding(16.dp),
            text = stringResource(id = R.string.line_3),
            textAlign = TextAlign.Justify
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JetpackComposeStudyTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colors.background
        ) {
            StudyApp()
        }
    }
}