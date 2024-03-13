package com.example.careplace

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DocOrPat : AppCompatActivity() {
    lateinit var pateint_btn : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_doc_or_pat)
        pateint_btn = findViewById(R.id.Pateint_btn)
        pateint_btn.setOnClickListener {

            val myintent = Intent(this , LogandSign ::class.java)
            startActivity(myintent)

        }

    }
}