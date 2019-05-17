package com.dicoding.dicodingsubmission;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.dicoding.dicodingsubmission.Adapter.ViewAdapter;
import com.dicoding.dicodingsubmission.Object.President;
import com.dicoding.dicodingsubmission.Object.PresidentData;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<President> presidentArrayList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);

        presidentArrayList.addAll(PresidentData.getListData());
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ViewAdapter viewAdapter = new ViewAdapter(this, presidentArrayList);
        viewAdapter.setPresidentList(presidentArrayList);
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
