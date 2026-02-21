package com.example.kidsdrawingapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.kidsdrawingapp.R.id.drawing_view

class MainActivity : AppCompatActivity() {

    private var drawingView: DrawingView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        drawingView = findViewById(drawing_view)
        drawingView?.setSizeForBrush(20.toFloat())
    }
}
