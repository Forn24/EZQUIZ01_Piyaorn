package com.example.ezquiz01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_one.*

class ten : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ten)

        a.setOnClickListener{

        }
        b.setOnClickListener{

        }
        c.setOnClickListener{
            val intent = Intent(this@ten, eng::class.java)
            startActivity(intent)
        }
        d.setOnClickListener{

        }
    }
}