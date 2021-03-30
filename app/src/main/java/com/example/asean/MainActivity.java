package com.example.asean;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    RecyclerView rv;

    Integer[] drawableArray = {R.drawable.icon1, R.drawable.icon2, R.drawable.icon3,
            R.drawable.icon4, R.drawable.icon5,R.drawable.icon6, R.drawable.icon7, R.drawable.icon8,
            R.drawable.icon9, R.drawable.icon10};
    String[] titleArray = {"Thailand","Filipina","Indonesia","Malaysia","Singapura","Brunei Darussalam","Vietnam","Laos","Kamboja","Myanmar"};
    String[] subtitleArray = {"Ibu Kota: Bangkok","Ibu Kota: Manila","Ibu Kota: Jakarta","Ibu Kota: Kuala Lumpur","Ibu Kota: Singapura","Ibu Kota: Bandar Seri Begawan","Ibu Kota: Hanoi","Ibu Kota: Vientiane","Ibu Kota: Phnom Penh","Ibu Kota: Nay Pyi Taw"};
    CustomAdapter ad;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv = (RecyclerView)findViewById(R.id.rv);
        ad = new CustomAdapter(MainActivity.this,drawableArray,titleArray,subtitleArray);
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setHasFixedSize(true);
        rv.setAdapter(ad);
    }
}