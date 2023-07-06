package com.example.tourguide

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button

class OtherplacesActivity : AppCompatActivity() {
    lateinit var web: WebView
    lateinit var location: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_otherplaces)

        web=findViewById(R.id.web)
        location=findViewById(R.id.locate)

        web.webViewClient= WebViewClient()
        web.loadUrl("https://www.listchallenges.com/the-ultimate-1000-travel-list")
        web.settings.javaScriptEnabled=true
        web.settings.setSupportZoom(true)

        location.setOnClickListener {
            val intent= Intent(this,MapActivity::class.java)
            startActivity(intent)
        }

    }
}