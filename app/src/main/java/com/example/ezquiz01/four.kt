package com.example.ezquiz01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_one.*

class four : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_four)

        a.setOnClickListener{

        }
        b.setOnClickListener{

        }
        c.setOnClickListener{

        }
        d.setOnClickListener{
            val intent = Intent(this@four, five::class.java)
            startActivity(intent)
        }
    }
}