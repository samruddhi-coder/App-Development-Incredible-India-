package com.example.exam.incredibleindiaa;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MyLinks extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7;
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.links);

        b1=(Button) findViewById(R.id.here);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://en.wikipedia.org/wiki/History_of_India"));
                startActivity(intent);
            }
        });
        b2=(Button) findViewById(R.id.here1);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://en.wikipedia.org/wiki/Culture_of_India"));
                startActivity(intent);
            }
        });
        b3=(Button) findViewById(R.id.here3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://en.wikipedia.org/wiki/Indian_cuisine"));
                startActivity(intent);
            }
        });
        b4=(Button) findViewById(R.id.here4);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://en.wikipedia.org/wiki/Demographics_of_India"));
                startActivity(intent);
            }
        });
        b5=(Button) findViewById(R.id.here5);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://en.wikipedia.org/wiki/Cartography_of_India"));
                startActivity(intent);
            }
        });
        b6=(Button) findViewById(R.id.here2);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.holidify.com/blog/cultural-festivals-in-india/"));
                startActivity(intent);
            }
        });
        b7=(Button) findViewById(R.id.prr);
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MyLinks.this, Fourth.class);
                startActivity(i);
            }

    });
    }
}






