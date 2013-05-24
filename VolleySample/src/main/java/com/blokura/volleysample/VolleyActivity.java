package com.blokura.volleysample;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class VolleyActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volley);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.volley, menu);
        return true;
    }
    
}
