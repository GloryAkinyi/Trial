package com.example.glory

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class MapActivity : AppCompatActivity() {
    lateinit var web : WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_map)

        web=findViewById(R.id.web)

        web.webViewClient= WebViewClient()
        web.loadUrl("https://www.google.com/maps/@-1.2723647,36.7927116,15z?entry=ttu")
        web.settings.javaScriptEnabled=true
        web.settings.setSupportZoom(true)

    }
}