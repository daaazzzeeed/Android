package com.example.user.timetable;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by user on 26.03.2017.
 */

public class btn3Pr extends MainActivity {

    ListView lView;
    ListView lView2;

    String[] subs1 = {"ПСАССУ","ПСАССУ","Сопромат л","УПиНИП"};
    String[] subs2 = {"---","Электротехника с","Сопромат л","Сопромат КСР"};

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout3);

        lView = (ListView) findViewById(R.id.lView);
        lView2 = (ListView) findViewById(R.id.lView2);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,subs1);
        lView.setAdapter(adapter);

        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,subs2);
        lView2.setAdapter(adapter2);
    }
}
