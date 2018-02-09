package com.example.user.Cook4Mate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CreatingCommunity extends AppCompatActivity {

    private TextView text1;
    private EditText text2;
    private EditText text3;
    private EditText text4;
    private EditText text5;
    private Button confirm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creating_community);

        text1 = (TextView) findViewById(R.id.creating_comm_text1);
        text2 = (EditText) findViewById(R.id.creating_comm_text2);
        text3 = (EditText) findViewById(R.id.creating_comm_text3);
        text4 = (EditText) findViewById(R.id.creating_comm_text4);
        text5 = (EditText) findViewById(R.id.creating_conn_text5);
        confirm = (Button) findViewById(R.id.creating_comm_create);

        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toy2 = new Intent(CreatingCommunity.this, Home.class);
                startActivity(toy2);

            }
        });

    }
}
