package com.example.user.timetable;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by user on 26.03.2017.
 */

public class btn2Pr extends MainActivity {

    ListView lView3;
    ListView lView4;

    String[] subs3 = {"Правоведение л","Физика л"};
    String[] subs4 = {"Правоведение л","Физика л","Физика с"};

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.layout2);

        lView3 = (ListView) findViewById(R.id.lView1);
        lView4 = (ListView) findViewById(R.id.lView2);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,subs3);
        lView3.setAdapter(adapter);

        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,subs4);
        lView4.setAdapter(adapter2);
    }
}
