package com.example.bressani.someapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SomeActivity extends AppCompatActivity {
    public final static String EXTRA_MESSAGE = "com.example.someapp.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_some);



    }

    public void sendMessage(View view){
        Intent intent = new Intent(this,DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.texto);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        intent.putExtra("zuin", message);
        startActivity(intent);
    }
}
