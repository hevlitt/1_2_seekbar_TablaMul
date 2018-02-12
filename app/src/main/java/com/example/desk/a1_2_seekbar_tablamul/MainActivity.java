package com.example.desk.a1_2_seekbar_tablamul;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SeekBar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    SeekBar sk;
    ListView lw;
    ArrayAdapter ad;
    ArrayList al;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sk=(SeekBar)findViewById(R.id.seekBar);
        lw=(ListView)findViewById(R.id.listView);

        al=new ArrayList<>();
        ad=new ArrayAdapter<String>(this,R.layout.custom,R.id.listTxt,al);
        lw.setAdapter(ad);

        sk.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                int x=sk.getProgress();
                int r=0;
                String s="";
                for(int j=10;j>0;j--){
                    r=x*j;
                    s=+x+"X"+j+"="+r;
                    al.add(s);
                    ad.notifyDataSetChanged();
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                
            }
        });
    }
}
