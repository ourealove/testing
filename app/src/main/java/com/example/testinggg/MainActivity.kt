package com.example.testinggg

import android.content.Intent
import java.util.Calendar
import android.os.Bundle
import android.widget.CalendarView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dayText: TextView = findViewById(R.id.day_text)
        val calendarView: CalendarView = findViewById(R.id.calendarView)

        // 오늘 날짜로 CalendarView 초기화
        val today = Calendar.getInstance()
        calendarView.date = today.timeInMillis

        // 날짜 형식 설정
        val dateFormat: DateFormat = SimpleDateFormat("yyyy년 MM월 dd일", Locale.getDefault())

        // 초기 텍스트뷰 업데이트
        dayText.text = dateFormat.format(Date(today.timeInMillis))

        // CalendarView 날짜 변경 이벤트
        calendarView.setOnDateChangeListener { _, year, month, dayOfMonth ->
            val calendar = Calendar.getInstance()
            calendar.set(year, month, dayOfMonth)
            val selectedDate = dateFormat.format(calendar.time)
            dayText.text = selectedDate

            val intent = Intent(this, DietPlanActivity::class.java).apply {
                putExtra("selectedDate", selectedDate)
            }
            startActivity(intent)
        }
    }
}