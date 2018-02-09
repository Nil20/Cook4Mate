package com.example.user.Cook4Mate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ConfirmBuy extends AppCompatActivity {
    private TextView text1;
    private TextView text2;
    private Button Home;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm_buy);

        text1 = (TextView) findViewById(R.id.conf_text1);
        text2 = (TextView) findViewById(R.id.conf_text2);
        Home = (Button) findViewById(R.id.conf_home);

        Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toy2 = new Intent(ConfirmBuy.this, Home.class);
                startActivity(toy2);
            }
        });
    }
}
