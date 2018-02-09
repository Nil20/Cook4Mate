package com.example.user.Cook4Mate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Exchange1 extends AppCompatActivity {
    private TextView exchng;
    private Button exchangeList;
    private Button addToExchangeList;
    private Button requestOfExchange;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exchange1);

        exchng = (TextView)findViewById(R.id.exchangeText);
        exchangeList = (Button)findViewById(R.id.exchangelist);
        addToExchangeList = (Button)findViewById(R.id.addToExchange);
        requestOfExchange = (Button)findViewById(R.id.requestofex);

        addToExchangeList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toy2 = new Intent(Exchange1.this, AddFoodToExchangeList.class);
                startActivity(toy2);
            }
        });

        exchangeList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toy2 = new Intent(Exchange1.this, ExchangeList.class);
                startActivity(toy2);
            }
        });

        requestOfExchange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toy2 = new Intent(Exchange1.this, ExchangeReq.class);
                startActivity(toy2);
    }
});


    }
}
