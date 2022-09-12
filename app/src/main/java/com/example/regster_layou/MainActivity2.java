package com.example.regster_layou;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {
Button button1,button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        button1=findViewById(R.id.buttonlogin);
        button2=findViewById(R.id.buttonregsterlog);

        button1.setOnClickListener(view -> {
            startActivity(new Intent(MainActivity2.this,MainActivity3.class));
        });
        button2.setOnClickListener(view -> {
            startActivity(new Intent(MainActivity2.this,MainActivity.class));
        });
    }
}