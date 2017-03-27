package com.example.user.timetable;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by user on 26.03.2017.
 */

public class btn4Pr extends MainActivity {

    ListView lView;
    ListView lView2;

    String[] subs1 = {"Электротехника л","Термех с","Термех л"};
    String[] subs2 = {"Электротехника л","Сопромат с","Термех л"};

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout4);

        lView = (ListView) findViewById(R.id.lView3);
        lView2 = (ListView) findViewById(R.id.lView4);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,subs1);
        lView.setAdapter(adapter);

        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,subs2);
        lView2.setAdapter(adapter2);
    }
}
