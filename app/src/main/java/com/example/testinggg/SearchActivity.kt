package com.example.testinggg

import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SearchActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)

        val searchInput: EditText = findViewById(R.id.search_input)
        val resultText1: TextView = findViewById(R.id.result_text_1)
        val resultText2: TextView = findViewById(R.id.result_text_2)

        // 키보드의 검색 버튼을 누를 때 이벤트 처리
        searchInput.setOnEditorActionListener { v, actionId, event ->
            // 여기에 검색 로직을 추가합니다. 예시 로직:
            // 사용자가 입력한 텍스트로 검색을 수행하고 결과를 TextView에 표시합니다.
            resultText1.text = "검색된 결과 1: " + v.text.toString()
            resultText2.text = "검색된 결과 2: " + v.text.toString()
            true  // 이벤트 처리 완료
        }
    }
}
