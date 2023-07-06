package com.example.tourguide

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button

class HotelActivity : AppCompatActivity() {
    lateinit var web: WebView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hotel)

        web=findViewById(R.id.web1)

        web.webViewClient= WebViewClient()
        web.loadUrl("https://www.trip.com/hot/top-10-1000-hotels/")
        web.settings.javaScriptEnabled=true
        web.settings.setSupportZoom(true)


    }
}