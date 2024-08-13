package com.example.notificationapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var notificationText: EditText
    private lateinit var buttonNotificationText: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        notificationText = findViewById(R.id.notificationText)
        buttonNotificationText = findViewById(R.id.buttonNotificationText)

        buttonNotificationText.setOnClickListener {
            val data = notificationText.text.toString()
            val intent = Intent(this, TextActivity::class.java)
            intent.putExtra("extra_data", data)
            startActivity(intent)
        }
    }
}
