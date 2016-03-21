package com.example.richardmpanga.smartdrunk;

import android.app.SearchManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class SearchableActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_searchable);


        //Retrieving Intent that launched the search activity
        Intent intent = this.getIntent();

        if (Intent.ACTION_SEARCH.equals(intent.getAction())){
            String searchQuery = intent.getStringExtra(SearchManager.QUERY);
        }



    }

}
