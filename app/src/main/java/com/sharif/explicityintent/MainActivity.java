package com.sharif.explicityintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText et;
Button bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et=findViewById(R.id.et1);
        bt=findViewById(R.id.bt1);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input;
                input=et.getText().toString();

                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("MSG",input);
                startActivity(intent);

            }
        });
    }
}