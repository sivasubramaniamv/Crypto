package com.example.crypto.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebViewClient
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.example.crypto.databinding.FragmentWebviewBinding

class WebViewFragment: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentWebviewBinding.inflate(inflater)
        val args: WebViewFragmentArgs by navArgs()

        binding.apply {
            webView.webViewClient = WebViewClient()
            webView.loadUrl(args.url)
            webView.settings.javaScriptEnabled = true
        }

        return binding.root
    }
}