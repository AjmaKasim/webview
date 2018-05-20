package com.ajmakasim.webview;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button fb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

   /* public void fb(View view){

        WebView fb = (WebView) findViewById(R.id.fb);
        fb.loadUrl("http://www.facebook.com");
    }

    public  void  insta(View view)
    {
        WebView insta = (WebView) findViewById(R.id.insta);
        insta.loadUrl("http://www.instagram.com");
    }*/

    public void fb(View view){

        Intent i=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.facebook.com/"));
        startActivity(i);
    }

}


