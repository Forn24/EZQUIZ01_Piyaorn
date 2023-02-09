package com.example.ezquiz01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_one.*

class two : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_two)

        a.setOnClickListener {

        }
        b.setOnClickListener {

        }
        c.setOnClickListener {

        }
        d.setOnClickListener {
            val intent = Intent(this@two, three::class.java)
            startActivity(intent)
        }
    }
}