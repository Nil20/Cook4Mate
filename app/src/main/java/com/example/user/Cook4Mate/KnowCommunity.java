package com.example.user.Cook4Mate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class KnowCommunity extends AppCompatActivity {
    private SearchView srch;
    private Button search;
    private Button createcommunity;
    private EditText searchText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_know_community);

        srch = (SearchView) findViewById(R.id.knowcommunity_searchbar);
        search = (Button) findViewById(R.id.knowcommunity_search);
        createcommunity = (Button) findViewById(R.id.knowcommunity_createcommunity);
        searchText = (EditText) findViewById(R.id.searchComm);

        createcommunity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toy2 = new Intent(KnowCommunity.this, CreatingCommunity.class);
                startActivity(toy2);

            }
        });

    }

}
