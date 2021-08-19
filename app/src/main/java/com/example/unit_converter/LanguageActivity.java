package com.example.unit_converter;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.appcompat.widget.Toolbar;

import com.example.unit_converter.adapters.MoreAdapter;
import com.example.unit_converter.dataProviders.LanguageDataProvider;
import com.example.unit_converter.models.DataItemMore;

import java.util.List;
import java.util.Objects;

public class LanguageActivity extends AppCompatActivity {

    private final List<DataItemMore> dataItemLanguageList = LanguageDataProvider.dataItemMoreList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_language);
        Toolbar toolbar = findViewById(R.id.toolbar_language);
        setSupportActionBar(toolbar);
        languageRecyclerViews();

        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onSupportNavigateUp() {
        MainActivity.BACK_FROM_CHILD_KEY = "more_fragment";
        return super.onSupportNavigateUp();
    }

    @Override
    public void onBackPressed() {
        MainActivity.BACK_FROM_CHILD_KEY = "more_fragment";
        super.onSupportNavigateUp();
    }

    private void languageRecyclerViews() {
        MoreAdapter languageAdapter = new MoreAdapter(this, dataItemLanguageList);
        RecyclerView languageRV = findViewById(R.id.rv_language);
        languageRV.setAdapter(languageAdapter);
    }
}