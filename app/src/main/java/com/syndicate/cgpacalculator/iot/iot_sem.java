package com.syndicate.cgpacalculator.iot;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;

import com.syndicate.cgpacalculator.MainActivity;
import com.syndicate.cgpacalculator.R;
import com.syndicate.cgpacalculator.adapters.SemImageAdapter;
import com.syndicate.cgpacalculator.ece.EceSem1List;
import com.syndicate.cgpacalculator.ece.EceSem2List;
import com.syndicate.cgpacalculator.ice.ice_sem;
import com.syndicate.cgpacalculator.ice.ice_sem3;
import com.syndicate.cgpacalculator.ice.ice_sem4;
import com.syndicate.cgpacalculator.ice.ice_sem5;
import com.syndicate.cgpacalculator.ice.ice_sem6;
import com.syndicate.cgpacalculator.ice.ice_sem7;
import com.syndicate.cgpacalculator.ice.ice_sem8;

public class iot_sem extends AppCompatActivity {
    Button sem1,sem2,sem3,sem4,sem5,sem6,sem7,sem8;
    ImageView back;
    GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.iot_sem);

        gridView = findViewById(R.id.gridview);
        gridView.setBackgroundColor(Color.parseColor("#FFFFFF"));
        SemImageAdapter imageAdapter = new SemImageAdapter(this);
        gridView.setAdapter(imageAdapter);
        back = findViewById(R.id.back);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(iot_sem.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i==0) {
                    Intent intent = new Intent(iot_sem.this, EceSem1List.class);
                    startActivity(intent);
                }else if(i==1) {
                    Intent intent = new Intent(iot_sem.this, EceSem2List.class);
                    startActivity(intent);
                }else if(i==2) {
                    Intent intent = new Intent(iot_sem.this, iot_sem3.class);
                    startActivity(intent);
                }else if(i==3) {
                    Intent intent = new Intent(iot_sem.this, iot_sem4.class);
                    startActivity(intent);
                }else if(i==4) {
                    Intent intent = new Intent(iot_sem.this, iot_sem5.class);
                    startActivity(intent);
                }else if(i==5) {
                    Intent intent = new Intent(iot_sem.this, ice_sem6.class);
                    startActivity(intent);
                }else if(i==6) {
                    Intent intent = new Intent(iot_sem.this, ice_sem7.class);
                    startActivity(intent);
                }else if(i==7) {
                    Intent intent = new Intent(iot_sem.this, ice_sem8.class);
                    startActivity(intent);
                }
            }
        });
    }
}
