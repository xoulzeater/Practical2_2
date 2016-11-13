package com.example.user.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
    }

    public void getMessage(View v){

        Intent intent = new Intent(this,Main5Activity.class);
        startActivityForResult(intent,2);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == 2 ){
            if(data != null){

                String message = data.getStringExtra("MESSAGE");

                TextView textViewMessage = (TextView)findViewById(R.id.textViewMessage);
                textViewMessage.setText("Message is :"+message);
            }
        }
    }
}
