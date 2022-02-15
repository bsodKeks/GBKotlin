package com.als.gbkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.als.gbkotlin.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Repository.getWeatherList()
        val btn = findViewById<Button>(R.id.button)
        btn.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View?) {
                Toast.makeText(this@MainActivity, "click", Toast.LENGTH_SHORT).show()
            }
        })
        btn.setOnClickListener {
            Toast.makeText(this@MainActivity, "click", Toast.LENGTH_SHORT).show()
        }
    }

    companion object {
        val TAG = "Activity"

        fun doIt(){

        }
    }
}