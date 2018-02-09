package com.example.user.Cook4Mate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SuretoLeave extends AppCompatActivity {

    private TextView text1;
    private TextView text2;
    private Button yes;
    private Button no;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sureto_leave);

        text1 = (TextView) findViewById(R.id.sureto_leave_text1);
        text2 = (TextView) findViewById(R.id.sureto_leave_text2);
        yes = (Button) findViewById(R.id.sureto_leave_button1);
        no = (Button) findViewById(R.id.sureto_leave_button2);

        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toy2 = new Intent(SuretoLeave.this, Home.class);
                startActivity(toy2);
            }
        });

        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toy2 = new Intent(SuretoLeave.this, Home.class);
                startActivity(toy2);
            }
        });
    }
}
