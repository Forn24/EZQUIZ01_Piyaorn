package com.example.ezquiz01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_one.*

class three : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_three)

        a.setOnClickListener{

        }
        b.setOnClickListener{
            val intent = Intent(this@three, four::class.java)
            startActivity(intent)
        }
        c.setOnClickListener{

        }
        d.setOnClickListener{

        }
    }
}