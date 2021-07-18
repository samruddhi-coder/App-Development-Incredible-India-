package com.example.exam.incredibleindiaa;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public  class main extends AppCompatActivity {
    ImageView b8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        b8=(ImageView) findViewById(R.id.in);
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(main.this,Slider.class);
                startActivity(i);
            }
        });
    }
}

