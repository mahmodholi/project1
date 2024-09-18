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
private TextView zero;
    int counter=0;
    Thread counterThread;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      zero=findViewById(R.id.textView);
    }

    public void STARTCOUNT (View view){
        counterThread=new Thread(()->{
            try {
                while (true){
                    counter++;
                    zero.setText(String.valueOf(counter).toString());
                    Thread.sleep(1000);
                }
            }
            catch (InterruptedException e){

            }
        });
        counterThread.start();
    }

    public void stopCount(View view){
        counterThread.interrupt();
    }
    }
