package com.example.todoappkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.todoappkotlin.adapter.StudentAdapter
import com.example.todoappkotlin.model.Student

class HomePage : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var listStudent: List<Student>
    private lateinit var studentAdapter: StudentAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)

        recyclerView = findViewById(R.id.recyclerView)
        listStudent = mutableListOf(
            Student("1", "Long", R.drawable.fpt),
            Student("2", "Hiếu", R.drawable.fpt),
            Student("3", "Trường", R.drawable.fpt),
            Student("4", "Test", R.drawable.fpt),
            Student("5", "Test 2", R.drawable.fpt),
            Student("6", "Test 3", R.drawable.fpt),
            Student("7", "Test 4", R.drawable.fpt),
            Student("8", "Test 5", R.drawable.fpt),
            Student("9", "Test 6", R.drawable.fpt),
            Student("10", "Test 7", R.drawable.fpt),
            Student("11", "Test 8", R.drawable.fpt),
            Student("12", "Test 9", R.drawable.fpt),
            Student("13", "JTest 10", R.drawable.fpt),
            Student("14", "Test 11", R.drawable.fpt),
            Student("15", "Test 9", R.drawable.fpt),
        )

        studentAdapter = StudentAdapter(listStudent)
        recyclerView.adapter = studentAdapter
        val linearLayoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = linearLayoutManager
        val itemDecoration = DividerItemDecoration(this, DividerItemDecoration.VERTICAL)
        recyclerView.addItemDecoration(itemDecoration)
    }
}
