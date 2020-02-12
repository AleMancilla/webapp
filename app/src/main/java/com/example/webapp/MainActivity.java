package com.example.webapp;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private WebView myWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myWebView = (WebView)findViewById(R.id.webView);
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        myWebView.loadUrl("http://tienda.isibolivia.com/");
        myWebView.setWebViewClient(new WebViewClient());

    }

    @Override
    public void onBackPressed() {
        if(myWebView.canGoBack()){
            myWebView.goBack();
        } else {
            super.onBackPressed();
        }
    }

   // @Override
   // public boolean onCreateOptionsMenu(Menu menu) {
// //Inflate the menu; this adds items to the action bar if it is present.
   //     getMenuInflater().inflate(R.menu.menu_main, menu);
   //     return true;
   // }

   // @Override
   // public boolean onOptionsItemSelected(MenuItem item) {
// //Handle action bar item clicks here. The action bar will
// //automatically handle clicks on the Home/Up button, so long
// //as you specify a parent activity in AndroidManifest.xml.
   //     int id = item.getItemId();
//
//n//oinspection SimplifiableIfStatement
   // //    if (id == R.id.action_settings) {
   // //        return true;
   // //    }
//
   //     return super.onOptionsItemSelected(item);
   // }
}
