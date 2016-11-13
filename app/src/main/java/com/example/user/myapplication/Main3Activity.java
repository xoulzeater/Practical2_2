package com.example.user.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }

    public void visitTARUC(View view){
        String uri = "http://www.tarc.edu.my";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(uri));
        startActivity(intent);

    }

    public void showMain(View view){
        Intent intent = new Intent(Intent.ACTION_MAIN);
        startActivity(intent);

    }

    public  void showDial(View view){
        Intent intent = new Intent(Intent.ACTION_DIAL,Uri.parse("tel:"+"0123456789"));
        startActivity(intent);


    }

    public void showSendTo(View view){
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:"+"seekt@acd.tarc.edu.my"));
        startActivity(intent);

    }

    public void sendMessage(View view){
        String message = "This is a new Message!!";
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.putExtra(Intent.EXTRA_TEXT,message);
        intent.setType("text/plain");

        if(intent.resolveActivity(getPackageManager()) != null){
            startActivity(intent);

        }

    }



}
