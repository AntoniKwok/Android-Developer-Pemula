package com.dicoding.dicodingsubmission;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.dicoding.dicodingsubmission.Adapter.ViewAdapter;
import com.dicoding.dicodingsubmission.Object.Skincare;
import com.dicoding.dicodingsubmission.Object.SkincareData;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<Skincare> skincareArrayList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);

        skincareArrayList.addAll(SkincareData.getListData());
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ViewAdapter viewAdapter = new ViewAdapter(this, skincareArrayList);
        viewAdapter.setSkincareList(skincareArrayList);
        recyclerView.setAdapter(viewAdapter);

        ItemClickSupport.addTo(recyclerView).setOnItemClickListener(new ItemClickSupport.OnItemClickListener() {
            @Override
            public void onItemClicked(RecyclerView recyclerView, int position, View v) {
                Intent i = new Intent(MainActivity.this, DetailDataActivity.class);
                i.putExtra("id", position);
                startActivity(i);
            }
        });
    }


}
