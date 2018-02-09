package com.example.user.Cook4Mate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ExchangeReq extends AppCompatActivity {
    private TextView text1;
    private TextView text2;
    private TextView text3;
    private Button exchange1;
    private TextView text4;
    private TextView text5;
    private TextView text6;
    private Button exchange2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exchange_req);
        text1 = (TextView) findViewById(R.id.exchangereq_text1);
        text2 = (TextView) findViewById(R.id.exchangereq_text2);
        text3 = (TextView) findViewById(R.id.exchangereq_text3);
        exchange1 = (Button) findViewById(R.id.exchangereq_exchange1);
        text4 = (TextView) findViewById(R.id.exchangereq_text4);
        text5 = (TextView) findViewById(R.id.exchangereq_text5);
        text6 = (TextView) findViewById(R.id.exchangereq_text6);
        exchange2 = (Button) findViewById(R.id.exchangereq_exchange2);

        exchange1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toy2 = new Intent(ExchangeReq.this, ExchangeConfirm.class);
                startActivity(toy2);
            }
        });
                exchange2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent toy2 = new Intent(ExchangeReq.this, ExchangeConfirm.class);
                        startActivity(toy2);


            }

        });
    }
}
