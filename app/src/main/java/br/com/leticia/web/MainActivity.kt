package br.com.leticia.web

import android.app.usage.UsageEvents
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.EventLog
import android.view.KeyEvent
import android.webkit.WebView
import android.widget.Button
import android.widget.Toolbar
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_web.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btnVoltar.setOnClickListener {
            wbvGoogle.loadUrl("http://br.cellep.com")

        }

        btnVoltar.setOnClickListener {
            wbvGoogle.loadUrl("http://br.cellep.com")
        }
    }
}