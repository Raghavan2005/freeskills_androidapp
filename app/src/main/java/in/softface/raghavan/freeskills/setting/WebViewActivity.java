/*
 *   *************************************************************
 *   Created by Raghavan at softface.in on 17/08/23, 8:34 pm
 *    funwithmetamil@gmail.com
 *     Last modified 17/08/23, 8:34 pm
 *     Copyright (c) 2023.
 *     All rights reserved.
 *   *************************************************************
 */

package in.softface.raghavan.freeskills.setting;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

import in.softface.raghavan.freeskills.R;

public class WebViewActivity extends AppCompatActivity {
    String url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);
        WebView webView = findViewById(R.id.webview);
        url = getIntent().getStringExtra("urltoopen");
        // Enble JavaScript (if needed)
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        webView.loadUrl(url);
    }
}