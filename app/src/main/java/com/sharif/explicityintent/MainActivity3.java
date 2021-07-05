package com.sharif.explicityintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity3 extends AppCompatActivity {
    EditText et;
    Button bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        et = findViewById(R.id.et2);
        bt = findViewById(R.id.bt2);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input;
                input = et.getText().toString();
                Intent myintent = new Intent(MainActivity3.this,MainActivity4.class);
                myintent.putExtra("SHA",input);
                startActivity(myintent);
            }
        });
    }
}