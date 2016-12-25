package com.acadgild.com.session5_assignment1;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private TextView txtViewOption;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtViewOption = (TextView)findViewById(R.id.txtView1);
        getSupportActionBar();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater MI = getMenuInflater();
        MI.inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
       int id = item.getItemId();
        if(id==R.id.red)
        {
            txtViewOption.setTextColor(Color.RED);
            return true;
        }
        else if(id==R.id.green)
        {
            txtViewOption.setTextColor(Color.GREEN);
            return true;
        }
        else if(id==R.id.blue)
        {
            txtViewOption.setTextColor(Color.BLUE);
            return true;
        }
        else
        {
            return false;
        }


    }
}
