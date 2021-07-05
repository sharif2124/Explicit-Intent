package com.sharif.explicityintent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tv=findViewById(R.id.tv1);
        String output;
        output = getIntent().getStringExtra("MSG");
        tv.setText(output);
    }
}