package com.example.newmiwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);
        ArrayList<Word> phrases = new ArrayList<>();
        phrases.add(new Word("Where are you going?","minto wuksus"));
        phrases.add(new Word("What is your name?","tinna oyaase'ne"));
        phrases.add(new Word("My name is..","oyaaset"));
        phrases.add(new Word("How are you?","michakses?"));
        phrases.add(new Word("How are you feeling?","kuchi ahcit"));
        phrases.add(new Word("i'm feeling good.","eenem"));
        phrases.add(new Word("Are you coming?","mhadus"));
        phrases.add(new Word("Yes,i'm coming.","ksus"));
        phrases.add(new Word("Let,s go.","minto "));
        phrases.add(new Word("Come here.","minto wuksus"));

        WordAdapter adapter = new WordAdapter(this,phrases,R.color.category_phrases);
        ListView view = (ListView)findViewById(R.id.phrasesId);
        view.setAdapter(adapter);

    }
}