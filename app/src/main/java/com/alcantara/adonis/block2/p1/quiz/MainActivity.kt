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
import java.text.SimpleDateFormat
import java.util.Locale

class MainActivity : ComponentActivity() {
    private lateinit var nextButton: Button
    private var userSelectedDate: Long = 0
    private val maxBookingsPerTimeSlot = 1  // Limit one booking per time slot
    private val maxBookingsPerDate = 5  // Limit 5 bookings per day
    private val bookedTimeSlots = mutableMapOf<String, Int>()
    private val bookedDates = mutableMapOf<String, Int>()

    private val timeZone = java.util.TimeZone.getTimeZone("Asia/Manila")
    private val format = SimpleDateFormat("yyyy-MM-dd h:mm a", Locale.US)
    private val dateFormat = SimpleDateFormat("yyyy-MM-dd", Locale.US)
}