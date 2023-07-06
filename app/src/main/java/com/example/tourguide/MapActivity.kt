package com.example.tourguide

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button

class MapActivity : AppCompatActivity() {
    lateinit var mymap: WebView
    lateinit var contact: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_map)

        mymap = findViewById(R.id.web1)
        contact = findViewById(R.id.contact)


        mymap.webViewClient = WebViewClient()
        mymap.loadUrl("https://www.google.com/maps/@-1.2723647,36.7927116,15z?entry=ttu")
        mymap.settings.javaScriptEnabled = true
        mymap.settings.setSupportZoom(true)


        contact.setOnClickListener {
            val myintent=Intent(this, TourGuideActivity::class.java)
            startActivity(myintent)
        }

    }
}
