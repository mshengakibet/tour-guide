package com.example.tourguide

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Button

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Handler().postDelayed({
            val i = Intent(
                this@MainActivity, RegistrationActivity::class.java
            )
            startActivity(i)
            finish()
        }, 2000)


    }
}