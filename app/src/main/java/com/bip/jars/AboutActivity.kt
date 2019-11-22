package com.bip.jars

import android.os.Build
import android.os.Bundle
import android.webkit.*
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import com.bip.jars.common.Constant
import kotlinx.android.synthetic.main.activity_about.*

class AboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)
        supportActionBar!!.title = getString(R.string.action_about)
        webView.loadUrl(Constant.WEB_SITE)
        webView.setInitialScale(1)

        webView.webViewClient = MyWebViewClient(this)
        webView.webChromeClient = MyWebChormeClient(this)
        val webSetting: WebSettings = webView.settings
        webSetting.useWideViewPort = true
        webSetting.useWideViewPort = true
        webSetting.builtInZoomControls = true

    }

    class MyWebViewClient internal constructor(private val activity: AboutActivity) :
        WebViewClient() {
        @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
        override fun shouldOverrideUrlLoading(
            view: WebView?,
            request: WebResourceRequest?
        ): Boolean {

            val url: String = request?.url.toString()
            view?.loadUrl(url)
            return true
        }

        override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
            view?.loadUrl(url)

            return true
        }

        override fun onReceivedError(
            view: WebView?,
            request: WebResourceRequest?,
            error: WebResourceError?
        ) {
            Toast.makeText(activity, "Have an error occur. Please try again!", Toast.LENGTH_SHORT)
                .show()
        }
    }

    class MyWebChormeClient internal constructor(private val activity: AboutActivity) :
        WebChromeClient() {

        override fun onProgressChanged(view: WebView?, newProgress: Int) {
            super.onProgressChanged(view, newProgress)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }
}
