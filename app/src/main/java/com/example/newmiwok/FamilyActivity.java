package com.example.newmiwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);
        ArrayList<Word> familyM = new ArrayList<Word>();
        familyM.add(new Word("father","epe",R.drawable.family_father));
        familyM.add(new Word("mother","eta",R.drawable.family_mother));
        familyM.add(new Word("son","angsi",R.drawable.family_son));
        familyM.add(new Word("daughter","tune",R.drawable.family_daughter));
        familyM.add(new Word("older brother","taachi",R.drawable.family_older_brother));
        familyM.add(new Word("younger brother","chalitti",R.drawable.family_younger_brother));
        familyM.add(new Word("older sister","tete",R.drawable.family_older_sister));
        familyM.add(new Word("younger sister","kolliti",R.drawable.family_younger_sister));
        familyM.add(new Word("grandmother","ama",R.drawable.family_grandmother));
        familyM.add(new Word("grandfather","paapa",R.drawable.family_grandfather));

     WordAdapter adapter = new WordAdapter(this,familyM,R.color.category_family);

        ListView view = (ListView)findViewById(R.id.familyView);
        view.setAdapter(adapter);

    }
}