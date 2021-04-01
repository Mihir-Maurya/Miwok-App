package com.example.newmiwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color);
        ArrayList<Word> color = new ArrayList<>();
        color.add(new Word("red","wetetti",R.drawable.color_red));
        color.add(new Word("green","chokokki",R.drawable.color_green));
        color.add(new Word("brown","takaaki",R.drawable.color_brown));
        color.add(new Word("gray","topoppi",R.drawable.color_gray));
        color.add(new Word("black","kululli",R.drawable.color_black));
        color.add(new Word("white","kelelli",R.drawable.color_white));
        color.add(new Word("dusty yellow","topiise",R.drawable.color_dusty_yellow));
        color.add(new Word("mustard yellow","chiwiite",R.drawable.color_mustard_yellow));

        WordAdapter adapter = new WordAdapter(this,color,R.color.category_colors);
        ListView view = (ListView)findViewById(R.id.colorView);
        view.setAdapter(adapter);

    }
}