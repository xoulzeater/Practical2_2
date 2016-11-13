package com.example.user.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




    }


    public void sendMessage(View view){
            Intent intent = new Intent(this,Main2Activity.class);
        EditText username = (EditText) findViewById(R.id.editText3);
        EditText password = (EditText)findViewById(R.id.editText4);
        intent.putExtra("username",username.getText().toString());
        intent.putExtra("password",password.getText().toString());
        startActivity(intent);





    }
}
