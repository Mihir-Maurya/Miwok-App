package com.example.newmiwok;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorActivity extends AppCompatActivity {
    private MediaPlayer mMediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color);
      final  ArrayList<Word> color = new ArrayList<>();
        color.add(new Word("red","wetetti",R.drawable.color_red,R.raw.color_red));
        color.add(new Word("green","chokokki",R.drawable.color_green ,R.raw.color_green));
        color.add(new Word("brown","takaaki",R.drawable.color_brown ,R.raw.color_brown));
        color.add(new Word("gray","topoppi",R.drawable.color_gray ,R.raw.color_gray));
        color.add(new Word("black","kululli",R.drawable.color_black ,R.raw.color_black));
        color.add(new Word("white","kelelli",R.drawable.color_white ,R.raw.color_white));
        color.add(new Word("dusty yellow","topiise",R.drawable.color_dusty_yellow ,R.raw.color_dusty_yellow));
        color.add(new Word("mustard yellow","chiwiite",R.drawable.color_mustard_yellow ,R.raw.color_mustard_yellow));

        WordAdapter adapter = new WordAdapter(this,color,R.color.category_colors);
        ListView view = (ListView)findViewById(R.id.colorView);
        view.setAdapter(adapter);

        view.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Word word = color.get(position);
                mMediaPlayer = MediaPlayer.create(ColorActivity.this,word.getAudioResourceid());
                mMediaPlayer.start();
            }
        });

    }
}