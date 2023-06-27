package com.example.glory

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button

class WebViewActivity : AppCompatActivity() {
    lateinit var web:WebView
    lateinit var location:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view)

        web=findViewById(R.id.web)
        location=findViewById(R.id.btn_location)

            web.webViewClient= WebViewClient()
            web.loadUrl("https://www.planetware.com/tourist-attractions/kenya-ken.htm")
            web.settings.javaScriptEnabled=true
            web.settings.setSupportZoom(true)


        location.setOnClickListener {
            val intent=Intent(this,MapActivity::class.java)
            startActivity(intent)
        }
        
    }
}