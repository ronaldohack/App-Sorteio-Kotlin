package br.com.leticia.web

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.webkit.WebView
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_web.*

class webActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web)

        //Ativando o javascript
        wbvSite.settings.javaScriptEnabled = true

        // colocando url

        startActivity(Intent(this@webActivity, MainActivity::class.java))

        //Mantendo sites na webView
        wbvSite.setWebViewClient(WebViewClient())



    }

}

