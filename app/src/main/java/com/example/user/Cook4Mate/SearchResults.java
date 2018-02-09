package com.example.user.Cook4Mate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SearchResults extends AppCompatActivity {

    private TextView searchedcommunities;
    private TextView abuilding;
    private TextView bbuilding;
    private TextView iict;
    private Button join1;
    private Button join2;
    private Button join3;
    private Button done;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_results);

        searchedcommunities = (TextView) findViewById(R.id.searchresults_searchedcommunities);
        abuilding = (TextView) findViewById(R.id.searchresults_abuilding);
        bbuilding = (TextView) findViewById(R.id.searchresults_bbuilding);
        iict = (TextView) findViewById(R.id.searchresults_iict);
        join1 = (Button) findViewById(R.id.searchresults_join1);
        join2 = (Button) findViewById(R.id.searchresults_join2);
        join3 = (Button) findViewById(R.id.searchresults_join3);
        done = (Button) findViewById(R.id.searchresults_done);


        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toy2 = new Intent(SearchResults.this, Home.class);
                startActivity(toy2);
            }

        });
    }
}
