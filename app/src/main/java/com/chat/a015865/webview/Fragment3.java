package com.chat.a015865.webview;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

public class Fragment3 extends android.support.v4.app.Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_main1, container, false);
        WebView webView=(WebView)rootView.findViewById(R.id.webView);
        webView.loadUrl("www.google.com");
        return rootView;
    }

}