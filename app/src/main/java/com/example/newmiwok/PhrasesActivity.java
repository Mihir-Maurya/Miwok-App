package com.example.newmiwok;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {
    private MediaPlayer mMediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);
       final  ArrayList<Word> phrases = new ArrayList<>();
        phrases.add(new Word("Where are you going?","minto wuksus",R.raw.phrase_where_are_you_going));
        phrases.add(new Word("What is your name?","tinna oyaase'ne" ,R.raw.phrase_what_is_your_name));
        phrases.add(new Word("My name is..","oyaaset" ,R.raw.phrase_my_name_is));
        phrases.add(new Word("How are you?","michakses?" ,R.raw.phrase_how_are_you_feeling));
        phrases.add(new Word("How are you feeling?","kuchi ahcit" ,R.raw.phrase_how_are_you_feeling));
        phrases.add(new Word("i'm feeling good.","eenem" ,R.raw.phrase_im_feeling_good));
        phrases.add(new Word("Are you coming?","mhadus" ,R.raw.phrase_are_you_coming));
        phrases.add(new Word("Yes,i'm coming.","ksus" ,R.raw.phrase_yes_im_coming));
        phrases.add(new Word("Let,s go.","minto " ,R.raw.phrase_lets_go));
        phrases.add(new Word("Come here.","minto wuksus" ,R.raw.phrase_come_here));

        WordAdapter adapter = new WordAdapter(this,phrases,R.color.category_phrases);
        ListView view = (ListView)findViewById(R.id.phrasesId);
        view.setAdapter(adapter);
        view.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Word word = phrases.get(position);
                mMediaPlayer = MediaPlayer.create(PhrasesActivity.this,word.getAudioResourceid());
                mMediaPlayer.start();
            }
        });

    }
}