package com.syndicate.cgpacalculator.mca;

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
import com.syndicate.cgpacalculator.cse.CseSem3List;
import com.syndicate.cgpacalculator.cse.CseSem4List;
import com.syndicate.cgpacalculator.cse.CseSemList;

public class McaSemList extends AppCompatActivity {
    Button sem1, sem2, sem3, sem4, sem5, sem6, sem7, sem8;
    ImageView back;
    GridView gridView;

    @Override


        protected void onCreate (Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_mca_sem_list);

            gridView = findViewById(R.id.gridview);
            gridView.setBackgroundColor(Color.parseColor("#FFFFFF"));
            SemImageAdapter imageAdapter = new SemImageAdapter(this);
            gridView.setAdapter(imageAdapter);
            back = findViewById(R.id.back);

            back.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(McaSemList.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                }
            });
            gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    if (i == 0) {
                        Intent intent = new Intent(McaSemList.this, McaSem1List.class);
                        startActivity(intent);
                    } else if (i == 1) {
                        Intent intent = new Intent(McaSemList.this, McaSem2List.class);
                        startActivity(intent);
                    } else if (i == 2) {
                        Intent intent = new Intent(McaSemList.this, McaSem3List.class);
                        startActivity(intent);
                    } else if (i == 3) {
                        Intent intent = new Intent(McaSemList.this, McaSem4List.class);
                        startActivity(intent);
                    }
                }
            });

        }
    }
}