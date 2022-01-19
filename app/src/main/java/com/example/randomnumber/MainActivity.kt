package com.example.randomnumber

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.buttonRandom)
        val toast = Toast.makeText(this, "Duck dep trai", Toast.LENGTH_SHORT)
        rollButton.setOnClickListener {
            toast.show()
        }
    }
}