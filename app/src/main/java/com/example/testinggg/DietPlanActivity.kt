package com.example.testinggg

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DietPlanActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_diet_plan)

        val dateText: TextView = findViewById(R.id.date_text)
        val selectedDate = intent.getStringExtra("selectedDate")

        // 받아온 날짜를 TextView에 표시
        dateText.text = selectedDate ?: "No date selected"
    }
}