package com.example.tabbedactivitytry1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class welcome extends AppCompatActivity {
    TextView tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        tv2=findViewById(R.id.textView2);
        String user=getIntent().getStringExtra("Name");
        tv2.setText(user);
    }
}
