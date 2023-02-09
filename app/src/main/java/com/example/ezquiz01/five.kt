package com.example.ezquiz01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_one.*

class five : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_five)

        a.setOnClickListener{

        }
        b.setOnClickListener{

        }
        c.setOnClickListener{
            val intent = Intent(this@five, six::class.java)
            startActivity(intent)
        }
        d.setOnClickListener{

        }
    }
}