package com.example.myapplication;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
private Button start,stop;
private TextView zero;
    boolean m;
    int z;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        zero=findViewById(R.id.textView);
        start=findViewById(R.id.start);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m = true;
                z = 0;
                try {
                    while (m == true) {
                        Thread.sleep(1000);
                        z++;
                        zero.setText(String.valueOf(z).toString());


                    catch(InterruptedException e){
                            throw new RuntimeException(e);
                        }
                }
            }
        });
        stop=findViewById(R.id.stop);
        stop.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                m=false;



            }
        });


    }
    }
