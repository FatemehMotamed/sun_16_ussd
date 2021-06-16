package com.poulstar.sun_16;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText username;
    String txt;
    Button btn;
    public final static String EXTRA_MESSAGE= "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        CustomLayout layout = new CustomLayout(getApplicationContext());
        setContentView(layout);
//        setContentView(R.layout.activity_main);
//
//        username = findViewById(R.id.username);
//        btn = findViewById(R.id.btn);
//
//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                txt = username.getText().toString();
//                Intent intent =  new Intent(MainActivity.this, MainActivity2.class);
//                intent.putExtra(EXTRA_MESSAGE,txt);
//                startActivity(intent);
//
//
//            }
//        });

    }
}