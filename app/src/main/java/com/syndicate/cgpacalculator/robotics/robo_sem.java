package com.syndicate.cgpacalculator.robotics;

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
import com.syndicate.cgpacalculator.cse.CseSem1List;
import com.syndicate.cgpacalculator.cse.CseSem2List;
import com.syndicate.cgpacalculator.mech.MechSem3List;
import com.syndicate.cgpacalculator.mech.MechSem4List;
import com.syndicate.cgpacalculator.mech.MechSem5List;
import com.syndicate.cgpacalculator.mech.MechSem6List;
import com.syndicate.cgpacalculator.mech.MechSem7List;
import com.syndicate.cgpacalculator.mech.MechSem8List;
import com.syndicate.cgpacalculator.mech.MechSemList;
import com.syndicate.cgpacalculator.mtr.mtr_sem;

public class robo_sem extends AppCompatActivity {
    Button sem1,sem2,sem3,sem4,sem5,sem6,sem7,sem8;
    ImageView back;
    GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.robo_sem);
        gridView = findViewById(R.id.gridview);
        gridView.setBackgroundColor(Color.parseColor("#FFFFFF"));
        SemImageAdapter imageAdapter = new SemImageAdapter(this);
        gridView.setAdapter(imageAdapter);
        back = findViewById(R.id.back);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(robo_sem.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i==0) {
                    Intent intent = new Intent(robo_sem.this, CseSem1List.class);
                    startActivity(intent);
                }else if(i==1) {
                    Intent intent = new Intent(robo_sem.this, CseSem2List.class);
                    startActivity(intent);
                }else if(i==2) {
                    Intent intent = new Intent(robo_sem.this, robo_sem3.class);
                    startActivity(intent);
                }else if(i==3) {
                    Intent intent = new Intent(robo_sem.this, robo_sem4.class);
                    startActivity(intent);
                }else if(i==4) {
                    Intent intent = new Intent(robo_sem.this, robo_sem5.class);
                    startActivity(intent);
                }else if(i==5) {
                    Intent intent = new Intent(robo_sem.this, robo_sem6.class);
                    startActivity(intent);
                }else if(i==6) {
                    Intent intent = new Intent(robo_sem.this, robo_sem7.class);
                    startActivity(intent);
                }else if(i==7) {
                    Intent intent = new Intent(robo_sem.this, robo_sem8.class);
                    startActivity(intent);
                }
            }
        });
//        sem1 = findViewById(R.id.sem1Id);
//        sem2 = findViewById(R.id.sem2Id);
//        sem3 = findViewById(R.id.sem3Id);
//        sem4 = findViewById(R.id.sem4Id);
//        sem5 = findViewById(R.id.sem5Id);
//        sem6 = findViewById(R.id.sem6Id);
//        sem7 = findViewById(R.id.sem7Id);
//        sem8 = findViewById(R.id.sem8Id);
//        back = findViewById(R.id.back);
//
//        back.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(MechSemList.this,MainActivity.class);
//                startActivity(intent);
//                finish();
//            }
//        });
//
//        sem1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(MechSemList.this,CseSem1List.class);
//                startActivity(intent);
//            }
//        });
//
//        sem2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(MechSemList.this,CseSem2List.class);
//                startActivity(intent);
//            }
//        });
//
//        sem3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(MechSemList.this,MechSem3List.class);
//                startActivity(intent);
//            }
//        });
//
//        sem4.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(MechSemList.this,MechSem4List.class);
//                startActivity(intent);
//            }
//        });
//
//        sem5.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(MechSemList.this,MechSem5List.class);
//                startActivity(intent);
//            }
//        });
//
//        sem6.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(MechSemList.this,MechSem6List.class);
//                startActivity(intent);
//            }
//        });
//        sem7.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(MechSemList.this,MechSem7List.class);
//                startActivity(intent);
//            }
//        });
//
//        sem8.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(MechSemList.this,MechSem8List.class);
//                startActivity(intent);
//            }
//        });


    }


}
