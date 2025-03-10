package com.example.webviewapp;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    public void showExternalWebPage(){

        myWebView.loadUrl("https://his.se");
    }

    public void showInternalWebPage(){

        myWebView.loadUrl("file:///android_asset/about.html");
    }
    WebView myWebView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        myWebView = findViewById(R.id.my_webview);
        myWebView.setWebViewClient(new WebViewClient());
        myWebView.getSettings().setJavaScriptEnabled(true);


        /*
        x* Rename your App. Tip: Values->Strings
        x* Enable Internet access for your App. Tip: Manifest
        x* Create a WebView element in the layout file main_activity.xml
        x* Give the WebView element ID "my_webview"
        x-- Commit and push to your github fork
        x* Create a private member variable called "myWebView" of type WebView
        x* Locate the WebView element created in step 1 using the ID created in step 2
        x* Create a new WebViewClient to attach to our WebView. This allows us to
        x  browse the web inside our app.
        x-- Commit and push to your github fork
        x* Enable Javascript execution in your WebViewClient
        x* Enter the url to load in our WebView
        x-- Commit and push to your github fork
        x* Move the code that loads a URL into your WebView into the two methods
        x "showExternalWebPage()" and "showInternalWebPage()".
        x* Call the "showExternalWebPage()" / "showInternalWebPage()" methods
        x  when you select menu options "External Web Page" or "Internal Web Page"
        x  respectively
        x-- Commit and push to your github fork
        x* Take two screenshots using the "Take a screenshot" tool in the AVD
        x   showing your App. One (1) screenshot showing your internal web page and
        x   one (1) screenshot showing your external web page.
        x*/
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_external_web) {
            Log.d("==>","Will display external web page");
            showExternalWebPage();
            return true;
        }

        if (id == R.id.action_internal_web) {
            Log.d("==>","Will display internal web page");
            showInternalWebPage();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
