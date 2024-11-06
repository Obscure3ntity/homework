// MainActivity.kt
package com.example.midtermbtueasy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.homework.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etName = findViewById<EditText>(R.id.etName)
        val tvHello = findViewById<TextView>(R.id.tvHello)
        val btnOkay = findViewById<Button>(R.id.btnOkay)
        val btnNext = findViewById<Button>(R.id.btnNext)

        btnOkay.setOnClickListener {
            val name = etName.text.toString()
            tvHello.text = "Hello, $name"
        }

        btnNext.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
    }
}
