package com.example.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var clickButton: Button
    private lateinit var textView1: TextView
    private lateinit var btn_compute:Button
    private var nbClick = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        clickButton = findViewById(R.id.btn_click_me)
        textView1 = findViewById(R.id.textView)
        btn_compute = findViewById(R.id.btn_compute)
//        clickButton.setOnClickListener {
//            Toast.makeText(baseContext, "Tu m'as cliqué", Toast.LENGTH_LONG).show()
//        }
        clickButton.setOnClickListener {
            nbClick++
            textView1.visibility = View.VISIBLE
            val newText = "Cliquez moi $nbClick"
            if (nbClick>5) {textView1.visibility = View.INVISIBLE}
            textView1.text = newText
        }
        btn_compute.setOnClickListener {
            val intent = Intent(baseContext, ComputeActivity::class.java)
            startActivity(intent)
        }
    }
}