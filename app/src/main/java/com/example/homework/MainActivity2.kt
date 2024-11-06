// SecondActivity.kt
package com.example.midtermbtueasy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.homework.R

class SecondActivity : AppCompatActivity() {

    private var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val tvCounter = findViewById<TextView>(R.id.tvCounter)
        val btnClick = findViewById<Button>(R.id.btnClick)

        btnClick.setOnClickListener {
            counter++
            tvCounter.text = counter.toString()
        }
    }
}
