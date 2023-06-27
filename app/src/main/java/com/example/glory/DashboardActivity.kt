package com.example.glory

import android.app.AlertDialog
import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.SearchView
import android.widget.Toast
import androidx.cardview.widget.CardView
import kotlinx.coroutines.NonCancellable
import kotlinx.coroutines.NonCancellable.cancel

class DashboardActivity : AppCompatActivity() {
    lateinit var home: CardView
    lateinit var chat: CardView
    lateinit var profile: CardView
    lateinit var widgets: CardView
    lateinit var settings: CardView
    lateinit var logout: CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)


        home=findViewById(R.id.cardHome)
        chat=findViewById(R.id.cardChat)
        profile=findViewById(R.id.cardProfile)
        widgets=findViewById(R.id.cardWidgets)
        settings=findViewById(R.id.cardSettings)
        logout=findViewById(R.id.cardLogout)

        home.setOnClickListener {
            Toast.makeText(applicationContext,"You have clicked Home", Toast.LENGTH_LONG).show()
        }
        chat.setOnClickListener {
            Toast.makeText(applicationContext,"You have clicked Home", Toast.LENGTH_LONG).show()
            val intent=Intent(this, WebViewActivity::class.java)
            startActivity(intent)

        }
        profile.setOnClickListener {
            Toast.makeText(applicationContext,"You have clicked profile", Toast.LENGTH_LONG).show()
        }
        widgets.setOnClickListener {
            Toast.makeText(applicationContext,"You have clicked widgets", Toast.LENGTH_LONG).show()
            val intent=Intent(this, ScrollViewActivity::class.java)
            startActivity(intent)
        }
        settings.setOnClickListener {
            Toast.makeText(applicationContext,"You have clicked on settings", Toast.LENGTH_LONG).show()
        }
        logout.setOnClickListener {
            Toast.makeText(applicationContext,"You have just Logged out", Toast.LENGTH_LONG).show()
            var box= AlertDialog.Builder(this)

            box.setMessage("Do you want to close this application?")
            box.setPositiveButton("PROCEED", DialogInterface.OnClickListener { dialog, id -> finish() })
            box.setNegativeButton("CANCEL", DialogInterface.OnClickListener { dialog, id -> cancel() })

            var alert=box.create()
            alert.setTitle("Glory app")
            alert.show()


        }


    }
}