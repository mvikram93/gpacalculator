package com.example.rahul.newdp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by rahul on 26-07-2017.
 */

public class Main3Activity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        String gpafinal=getIntent().getStringExtra("gpa");
        TextView tv=(TextView)findViewById(R.id.tvshowgpa);
        tv.setText(gpafinal);
    }
}
