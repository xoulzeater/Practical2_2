package com.example.user.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Main5Activity extends AppCompatActivity {

    EditText editTextMessage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        editTextMessage = (EditText)findViewById(R.id.editTextMessage);
    }

    public void submitMessage(View v){
        String message = editTextMessage.getText().toString();
        Intent intentMessage = new Intent();
        intentMessage.putExtra("MESSAGE",message);
        setResult(2,intentMessage);
        finish();
    }

}


