package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ElearningAdapter adapter;
    private ArrayList<Elearning> elearningArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(" E-Learning ");

        addData();

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        adapter = new ElearningAdapter(elearningArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);

    }
        void addData() {
        elearningArrayList = new ArrayList<>();
        elearningArrayList.add(new Elearning("Bahasa Inggris", "Jumlah E-Learning : 2"));
        elearningArrayList.add(new Elearning("Fisika", "Jumlah E-Learning : 0"));

    }

}