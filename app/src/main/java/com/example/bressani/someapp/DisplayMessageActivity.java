package com.example.bressani.someapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
        Intent intent = getIntent();

        String message = intent.getStringExtra(SomeActivity.EXTRA_MESSAGE);

        TextView text = new TextView(this);
        text.setTextSize(40);
        text.setText(message);

        RelativeLayout layout = (RelativeLayout) findViewById(R.id.idDoLayout);
        layout.addView(text);
    }
}
