package com.example.activities

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ComputeActivity: AppCompatActivity(),TextWatcher {
    private lateinit var edit1: EditText
    private lateinit var edit2: EditText
    private lateinit var textView : TextView
    private lateinit var calculButton : Button
    private var resultat = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.compute_activity)

        edit1 = findViewById(R.id.field_1)
        edit2 = findViewById(R.id.field_2)
        textView = findViewById(R.id.resultat)
        calculButton = findViewById(R.id.btn_calculer)

        edit2.addTextChangedListener(this)
        edit1.addTextChangedListener(this)

        calculButton.setOnClickListener {
            resultat = Integer.parseInt(edit1.text.toString())+ Integer.parseInt(edit2.text.toString())
            textView.text = "$resultat"
        }
    }

    override fun afterTextChanged(s: Editable?) {

    }

    override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

    }

    override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
        calculButton.isEnabled = edit1.text.isNotEmpty() && edit2.text.isNotEmpty()
    }
}