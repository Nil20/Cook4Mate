package com.example.user.Cook4Mate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CreatedCommunity extends AppCompatActivity {

    private Button addmember;
    private Button memberreq;
    private Button remove;
    private Button edit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_created_community);

        addmember = (Button) findViewById(R.id.createdcommu_addmember);
        memberreq = (Button) findViewById(R.id.createdcommu_memberreq);
        remove = (Button) findViewById(R.id.createdcommu_remove);
        edit = (Button) findViewById(R.id.createdcommu_edt);


        edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toy2 = new Intent(CreatedCommunity.this, Home.class);
                startActivity(toy2);
            }


        });


    }
}
