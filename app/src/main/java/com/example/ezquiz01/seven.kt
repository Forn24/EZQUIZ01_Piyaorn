package com.example.ezquiz01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_one.*

class seven : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seven)

        a.setOnClickListener{

        }
        b.setOnClickListener{

        }
        c.setOnClickListener{
            val intent = Intent(this@seven, eight::class.java)
            startActivity(intent)
        }
        d.setOnClickListener{

        }
    }
}