package com.example.user.Cook4Mate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class AddMember extends AppCompatActivity {
    private TextView text1;
    private Spinner spin;
    private EditText search;
    private CheckBox check1;
    private CheckBox check2;
    private CheckBox check3;
    private Button done;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_member);

        text1 = (TextView) findViewById(R.id.add_mem_text1);
        spin = (Spinner) findViewById(R.id.spinnerIICT1);
        search = (EditText) findViewById(R.id.add_mem_text2);
        check1 = (CheckBox) findViewById(R.id.add_mem_checkBox1);
        check2 = (CheckBox) findViewById(R.id.add_mem_checkBox2);
        check3 = (CheckBox) findViewById(R.id.add_mem_checkBox3);
        done = (Button) findViewById(R.id.add_mem_done);

        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toy2 = new Intent(AddMember.this, MyCommunity.class);
                startActivity(toy2);

    }
});}}
