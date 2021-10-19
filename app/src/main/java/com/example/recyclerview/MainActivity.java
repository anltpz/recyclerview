package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<String> ulkelerList;
    private Adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.rv);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ulkelerList=new ArrayList<>();
        ulkelerList.add("Turkiye");
        ulkelerList.add("İtalya");
        ulkelerList.add("japonya");
        ulkelerList.add("bulgaristan");
        ulkelerList.add("Amerika");
        adapter=new Adapter(getApplicationContext(),ulkelerList);


        recyclerView.setAdapter(adapter);

        
    }


}