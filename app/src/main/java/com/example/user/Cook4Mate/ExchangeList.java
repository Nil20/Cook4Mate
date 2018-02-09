package com.example.user.Cook4Mate;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ExchangeList extends AppCompatActivity {
    private TextView text1;
    private TextView text2;
    private TextView text3;
    private TextView text4;
    private Button exxchange;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exchange_list);

        text1 = (TextView) findViewById(R.id.exchange_list_text1);
        text2 = (TextView) findViewById(R.id.exchange_list_text2);
        text3 = (TextView) findViewById(R.id.exchange_list_text3);
        text4 = (TextView) findViewById(R.id.exchange_list_text4);
        exxchange = (Button) findViewById(R.id.exchange_list_exchange);

        exxchange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toy2 = new Intent(ExchangeList.this, HowtoExchange.class);
                startActivity(toy2);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

});
    }
}
