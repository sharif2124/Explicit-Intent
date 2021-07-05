package com.sharif.explicityintent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {
TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        tv=findViewById(R.id.tv1);
        String out;
        out = getIntent().getStringExtra("SHA");
        tv.setText(out);
    }
}