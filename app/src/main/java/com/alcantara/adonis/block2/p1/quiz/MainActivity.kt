package com.alcantara.adonis.block2.p1.quiz

import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.alcantara.adonis.block2.p1.quiz.ui.theme.AdonisAlcantaraBlock2QuizTheme

class MainActivity : ComponentActivity() {
    private lateinit var nextButton: Button

    private val timeZone = java.util.TimeZone.getTimeZone("Asia/Manila")
}