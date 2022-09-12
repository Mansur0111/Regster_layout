package com.example.regster_layou;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {
    EditText editText,editText2,editText3;
    ProgressBar progressBar;
    Spinner spinner;
    RadioGroup radioGroup;
    Button button;
    RadioButton radioButton,radioButton2;
    Switch switch1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=findViewById(R.id.edittext1);
        editText2=findViewById(R.id.edittext2);
        editText3=findViewById(R.id.edittext3);
        spinner=findViewById(R.id.spinner1);

        radioGroup=findViewById(R.id.radiogroup1);
        radioButton=findViewById(R.id.radiobutton1);
        radioButton2=findViewById(R.id.radiobutton2);
        switch1=findViewById(R.id.switch1);
        button=findViewById(R.id.button1);
        progressBar=findViewById(R.id.progressbar);



        button.setOnClickListener(view ->{
            progressBar.setVisibility(View.VISIBLE);
            editText.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    editText.getText().toString().isEmpty();
                    editText.setError("ismingni yoz");
                }
            });
            editText2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    editText.getText().toString().isEmpty();
                    editText.setError("familyangni yoz");
                }
            });
            editText3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    editText.getText().toString().isEmpty();
                    editText.setError("yinlingni yoz");
                }
            });
            startActivity(new Intent(MainActivity.this,MainActivity2.class));
        });
        progressBar.setVisibility(View.INVISIBLE);

    
    }
}