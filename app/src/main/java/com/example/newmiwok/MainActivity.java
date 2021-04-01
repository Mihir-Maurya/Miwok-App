package com.example.newmiwok;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView number = (TextView) findViewById(R.id.numbers);
        number.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent s = new Intent(MainActivity.this, NumberActivity.class);
                startActivity(s);
            }
        });

        TextView family = (TextView) findViewById(R.id.family);
        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent s = new Intent(MainActivity.this, FamilyActivity.class);
                startActivity(s);
            }
        });


    TextView phrases = (TextView) findViewById(R.id.phrases);
        phrases.setOnClickListener(new View.OnClickListener()

    {
        @Override
        public void onClick (View v){
        Intent s = new Intent(MainActivity.this, PhrasesActivity.class);
        startActivity(s);
    }
    });

        TextView colors = (TextView)findViewById(R.id.colors);
        colors.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {
        Intent s = new Intent(MainActivity.this,ColorActivity.class);
        startActivity(s);
        }
        });




}
        }