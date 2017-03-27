package com.example.user.timetable;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

/**
 * Created by user on 26.03.2017.
 */

public class btn1Pr extends MainActivity {

    ListView lView;
    ListView lView2;

    String[] subs1 = {"Физика лр","Правоведение"};
    String[] subs2 = {"Физика лр","Электротехника","Термех лр"};

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout1);

        lView = (ListView) findViewById(R.id.listView);
        lView2 = (ListView) findViewById(R.id.listView2);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,subs1);
        lView.setAdapter(adapter);

        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,subs2);
        lView2.setAdapter(adapter2);
    }
}
