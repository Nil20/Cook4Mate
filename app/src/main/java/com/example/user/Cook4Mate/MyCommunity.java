package com.example.user.Cook4Mate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MyCommunity extends AppCompatActivity {

    private TextView joinedcommu;
    private TextView abuilding;
    private TextView bbuilding;
    private TextView iict;
    private Button goto1;
    private Button goto2;
    private Button goto3;
    private Button leave1;
    private Button leave2;
    private Button leave3;
    private Button joincommunities;
    private Button addmates;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_community);

        joinedcommu = (TextView) findViewById(R.id.mycommu_joinedcommunities);
        abuilding = (TextView) findViewById(R.id.mycommu_abuilding);
        bbuilding = (TextView) findViewById(R.id.mycommu_bbuilding);
        iict = (TextView) findViewById(R.id.mycommu_iict);
        goto1 = (Button) findViewById(R.id.mycommu_goto1);
        goto2= (Button) findViewById(R.id.mycommu_goto2);
        goto3 = (Button) findViewById(R.id.mycommu_goto3);
        leave1= (Button) findViewById(R.id.mycommu_leave1);
        leave2 = (Button) findViewById(R.id.mycommu_leave2);
        leave3= (Button) findViewById(R.id.mycommu_leave3);
        joincommunities= (Button) findViewById(R.id.mycommu_join);
        addmates= (Button) findViewById(R.id.mycommu_addmates);


        joincommunities.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toy2 = new Intent(MyCommunity.this, KnowCommunity.class);
                startActivity(toy2);
            }
        });
        leave1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toy2 = new Intent(MyCommunity.this, SuretoLeave.class);
                startActivity(toy2);
            }
        });
        leave2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toy2 = new Intent(MyCommunity.this, SuretoLeave.class);
                startActivity(toy2);
            }
        });
        leave3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toy2 = new Intent(MyCommunity.this, SuretoLeave.class);
                startActivity(toy2);
            }
        });

        addmates.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toy2 = new Intent(MyCommunity.this, AddMember.class);
                startActivity(toy2);
            }
        });

    }
}
