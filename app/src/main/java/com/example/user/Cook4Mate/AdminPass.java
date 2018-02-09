package com.example.user.Cook4Mate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AdminPass extends AppCompatActivity {


    private TextView text;
    private EditText password;
    private Button done;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_pass);


        text = (TextView) findViewById(R.id.adminpass_text);
        password = (EditText) findViewById(R.id.adminpass_password);
        done = (Button) findViewById(R.id.adminpass_done);

        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toy2 = new Intent(AdminPass.this, CreatedCommunity.class);
                startActivity(toy2);
            }
        });
    }
}
