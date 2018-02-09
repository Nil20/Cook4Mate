package com.example.user.Cook4Mate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class NotifiCation extends AppCompatActivity {


    private TextView text1;
    private TextView text2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notifi_cation);

        text1 = (TextView) findViewById(R.id.notification_num1);
        text2 = (TextView) findViewById(R.id.notification_num2);

        text1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent toy2 = new Intent(NotifiCation.this, FilteredCommunity.class);
                startActivity(toy2);
            }
        });
    }
}
