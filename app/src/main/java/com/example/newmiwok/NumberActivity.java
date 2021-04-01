package com.example.newmiwok;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class NumberActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number);
        final ArrayList<Word> words = new ArrayList<Word>();

//        words.add("one");
//        Word n = new Word("one","lutti");
//        words.add(n);
        words.add(new Word("one","lutti",R.drawable.number_one));
        words.add(new Word("two","otiiko",R.drawable.number_two));
        words.add(new Word("three","tolookosu",R.drawable.number_three));
        words.add(new Word("four","oyyisa",R.drawable.number_four));
        words.add(new Word("five","massokka",R.drawable.number_five));
        words.add(new Word("six","temmokka",R.drawable.number_six));
        words.add(new Word("seven","kenekaku",R.drawable.number_seven));
        words.add(new Word("eight","kawinta",R.drawable.number_eight));
        words.add(new Word("nine","wo'e",R.drawable.number_nine));
        words.add(new Word("ten","na aacha",R.drawable.number_ten));

        WordAdapter adapter = new WordAdapter(this,words,R.color.category_numbers);
        ListView listView = (ListView) findViewById(R.id.rootView);
        listView.setAdapter(adapter);
//        MediaPlayer media = MediaPlayer.create(this,R.raw.number_one);
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//            media.start();
//            }
//        });

//        LinearLayout rootView = (LinearLayout)findViewById(R.id.rootView);
//       for(int i = 0; i<word.size();i++) {
//           TextView wordView = new TextView(this);
//           wordView.setText(word.get(i));
//           rootView.addView(wordView);
////       }
    }
}