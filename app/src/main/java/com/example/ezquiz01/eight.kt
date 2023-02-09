package com.example.ezquiz01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_one.*

class eight : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_eight)

        a.setOnClickListener{
            val intent = Intent(this@eight, nine::class.java)
            startActivity(intent)
        }
        b.setOnClickListener{

        }
        c.setOnClickListener{

        }
        d.setOnClickListener{

        }
    }
}