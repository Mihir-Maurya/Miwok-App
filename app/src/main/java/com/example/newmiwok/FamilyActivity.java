package com.example.newmiwok;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {
    private MediaPlayer mMediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);
       final ArrayList<Word> familyM = new ArrayList<Word>();
        familyM.add(new Word("father","epe",R.drawable.family_father ,R.raw.family_father));
        familyM.add(new Word("mother","eta",R.drawable.family_mother ,R.raw.family_mother));
        familyM.add(new Word("son","angsi",R.drawable.family_son ,R.raw.family_son));
        familyM.add(new Word("daughter","tune",R.drawable.family_daughter ,R.raw.family_daughter));
        familyM.add(new Word("older brother","taachi",R.drawable.family_older_brother ,R.raw.family_older_brother));
        familyM.add(new Word("younger brother","chalitti",R.drawable.family_younger_brother ,R.raw.family_younger_brother));
        familyM.add(new Word("older sister","tete",R.drawable.family_older_sister ,R.raw.family_older_sister));
        familyM.add(new Word("younger sister","kolliti",R.drawable.family_younger_sister ,R.raw.family_younger_sister));
        familyM.add(new Word("grandmother","ama",R.drawable.family_grandmother ,R.raw.family_grandmother));
        familyM.add(new Word("grandfather","paapa",R.drawable.family_grandfather ,R.raw.family_grandfather));

     WordAdapter adapter = new WordAdapter(this,familyM,R.color.category_family);

        ListView view = (ListView)findViewById(R.id.familyView);
        view.setAdapter(adapter);
        view.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Word word = familyM.get(position);
                mMediaPlayer = MediaPlayer.create(FamilyActivity.this,word.getAudioResourceid());
                mMediaPlayer.start();
            }
        });
    }
}