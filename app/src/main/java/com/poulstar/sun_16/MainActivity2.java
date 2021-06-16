package com.poulstar.sun_16;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView result = findViewById(R.id.txt);
        Intent intent = getIntent();
        String mytxt= intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        result.setText(mytxt);
    }
}