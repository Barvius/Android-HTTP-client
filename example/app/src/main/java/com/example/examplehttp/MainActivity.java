package com.example.examplehttp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.examplehttp.HTTP.LoadThread;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LoadThread lt = new LoadThread(this);

        TextView textView = findViewById(R.id.myText);

        textView.setText(lt.GET("http://localhost"));
    }
}
