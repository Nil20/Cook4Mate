package com.example.user.Cook4Mate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SearchCommunity extends AppCompatActivity {

    private Button searchComm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_community);

        searchComm = (Button)findViewById(R.id.search);

        searchComm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toy2 = new Intent(SearchCommunity.this, SearchResults.class);
                startActivity(toy2);
            }


        });

    }
}
