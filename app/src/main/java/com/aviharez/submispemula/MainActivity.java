package com.aviharez.submispemula;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rv_laptop;
    private ArrayList<Laptop> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        rv_laptop = findViewById(R.id.rv_laptop);
        rv_laptop.setHasFixedSize(true);

        list.addAll(LaptopData.getListData());
        showRecyclerList();

    }

    private void showRecyclerList() {
        rv_laptop.setLayoutManager(new LinearLayoutManager(this));
        ListLaptopAdapter listLaptopAdapter = new ListLaptopAdapter(this);
        listLaptopAdapter.setListLaptop(list);
        rv_laptop.setAdapter(listLaptopAdapter);

        RecyclerTouchListener.addTo(rv_laptop).setOnItemClickListener(new RecyclerTouchListener.OnItemClickListener() {
            @Override
            public void onItemClicked(RecyclerView recyclerView, int position, View v) {
                Intent i = new Intent(MainActivity.this, DetailActivity.class);
                //i.putExtra("pos", (Parcelable) list.get(position));
                i.putExtra("pos", list.get(position));
                startActivity(i);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.about, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.about:
                Intent i = new Intent(MainActivity.this, AboutActivity.class);
                startActivity(i);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
