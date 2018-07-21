package com.example.kowshick.dummyapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.webkit.WebView;
import android.widget.LinearLayout;

public class AboutusActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutus);
        WebView view = new WebView(this);
        view.setVerticalScrollBarEnabled(false);

        ((LinearLayout)findViewById(R.id.inset_web_view)).addView(view);

        view.loadData(getString(R.string.hello), "text/html; charset=utf-8", "utf-8");
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.back_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.back:
                startActivity(new Intent(AboutusActivity.this,HomeActivity.class));
        }
        return super.onOptionsItemSelected(item);
    }
}
