package com.example.lab_week_02_c

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    companion object { private const val DEBUG = "DEBUG" }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(DEBUG, "onCreate")

        val clicker = View.OnClickListener { v ->
            when (v.id) {
                R.id.button_standard   -> startActivity(Intent(this, StandardActivity::class.java))
                R.id.button_single_top -> startActivity(Intent(this, SingleTopActivity::class.java))
            }
        }
        findViewById<Button>(R.id.button_standard).setOnClickListener(clicker)
        findViewById<Button>(R.id.button_single_top).setOnClickListener(clicker)
    }
}