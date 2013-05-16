package com.example.hellogap;
import org.apache.cordova.DroidGap;
import org.apache.cordova.api.CallbackContext;
import org.json.JSONArray;
import org.json.JSONException;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends DroidGap {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.loadUrl("file:///android_asset/www/index.html");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    

    
}
