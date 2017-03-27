package com.example.user.timetable;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;


public class MainActivity extends AppCompatActivity implements OnClickListener {

    Button btn;
    Calendar cal = Calendar.getInstance();
  // ImageView view;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {
            Thread.sleep(100);
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

      btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(this);
       /* view = (ImageView) findViewById(R.id.iview);
        view.setImageResource(R.drawable.carlogo); */

       /* try {
            ImageView i = (ImageView)findViewById(R.id.image);
            Bitmap bitmap = BitmapFactory.decodeStream((InputStream)new URL("https://pp.userapi.com/c604727/v604727400/34293/HU1-fAcl01s.jpg").getContent());
            i.setImageBitmap(bitmap);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } */
    }

    @Override
    public void onClick(View v) {
switch(cal.get(Calendar.DAY_OF_WEEK)){
            case 1:
                Intent intent = new Intent(this,btn1Pr.class);
                startActivity(intent);
                break;
            case 2:
                Intent intent2 = new Intent(this,btn2Pr.class);
                startActivity(intent2);
                break;
            case 3:
                Intent intent3 = new Intent(this,btn3Pr.class);
                startActivity(intent3);
                break;
            case 4:
                Intent intent4 = new Intent(this,btn4Pr.class);
                startActivity(intent4);
                break;
            case 5:
                Intent intent5 = new Intent(this,btn5Pr.class);
                startActivity(intent5);
                break;
            default:
                break;
        }

    }
}
