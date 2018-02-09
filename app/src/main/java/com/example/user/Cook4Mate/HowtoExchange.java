package com.example.user.Cook4Mate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class HowtoExchange extends AppCompatActivity {

    private TextView text2;
    private EditText text1;
    private EditText text3;
    private Button done;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_howto_exchange);

        text2 = (TextView) findViewById(R.id.howto_exchange_text2);
        text1 = (EditText) findViewById(R.id.howto_exchange_text1);
        text3 = (EditText) findViewById(R.id.howto_exchange_text3);
        done = (Button) findViewById(R.id.howto_exchange_done);

        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toy2 = new Intent(HowtoExchange.this, Exchange1.class);
                startActivity(toy2);
    }
});}}
