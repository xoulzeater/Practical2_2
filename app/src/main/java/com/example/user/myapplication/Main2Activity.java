package com.example.user.myapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);



        TextView textview = new TextView(this);
        textview.setTextSize(40);

        String name = "";
        String password = "";


        String message = "Username:";
        Bundle extras = getIntent().getExtras();
        if(!extras.isEmpty()) {
            message+= (String) extras.getString("username")+"\n";
           message += "Password:" +(String) extras.getString("password")+ "\n";


        }
        textview.setText(message);
        setContentView(textview);
    }

}
