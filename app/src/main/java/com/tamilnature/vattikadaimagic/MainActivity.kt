
package com.tamilnature.vattikadaimagic

import android.app.Activity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import android.webkit.WebChromeClient
import android.webkit.WebResourceRequest
import android.content.Intent
import android.net.Uri
import android.graphics.Color

class MainActivity : Activity() {

    private lateinit var webView: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        window.statusBarColor = Color.rgb(20, 55, 45)

        webView = WebView(this)

        webView.settings.javaScriptEnabled = true
        webView.settings.domStorageEnabled = true

        webView.webViewClient = object : WebViewClient() {

            override fun shouldOverrideUrlLoading(
                view: WebView?,
                request: WebResourceRequest?
            ): Boolean {
                val url = request?.url ?: return false
                return handlePhoneLink(url.toString())
            }

            @Deprecated("Deprecated")
            override fun shouldOverrideUrlLoading(
                view: WebView?,
                url: String?
            ): Boolean {
                return handlePhoneLink(url ?: return false)
            }
        }

        webView.webChromeClient = WebChromeClient()

        setContentView(webView)

        webView.loadUrl("file:///android_asset/index.html")
    }

    private fun handlePhoneLink(url: String): Boolean {
        try {
            if (url.startsWith("tel:", ignoreCase = true)) {
                val dialIntent = Intent(
                    Intent.ACTION_DIAL,
                    Uri.parse(url)
                )
                startActivity(dialIntent)
                return true
            }

            if (url.startsWith("intent://", ignoreCase = true)) {
                val parsedIntent = Intent.parseUri(
                    url,
                    Intent.URI_INTENT_SCHEME
                )

                val phoneUri = parsedIntent.data

                if (phoneUri?.scheme == "tel") {
                    val dialIntent = Intent(
                        Intent.ACTION_DIAL,
                        phoneUri
                    )
                    startActivity(dialIntent)
                    return true
                }

                return true
            }

        } catch (e: Exception) {
            e.printStackTrace()
            return true
        }

        return false
    }

    @Deprecated("Deprecated")
    override fun onBackPressed() {
        if (webView.canGoBack()) {
            webView.goBack()
        } else {
            super.onBackPressed()
        }
    }
}
