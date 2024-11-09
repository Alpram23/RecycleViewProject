package com.example.recycleviewproject;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inisialisasi RecyclerView Vertikal
        RecyclerView verticalRecyclerView = findViewById(R.id.vertical_recyclerView);
        verticalRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        List<ListItem> verticalList = getSampleList();
        ListAdapter verticalAdapter = new ListAdapter(verticalList);
        verticalRecyclerView.setAdapter(verticalAdapter);

        // Inisialisasi RecyclerView Horizontal
        RecyclerView horizontalRecyclerView = findViewById(R.id.horizontal_recyclerView);
        horizontalRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        List<ListItem> horizontalList = getSampleList();
        ListAdapter horizontalAdapter = new ListAdapter(horizontalList);
        horizontalRecyclerView.setAdapter(horizontalAdapter);
    }

    private List<ListItem> getSampleList() {
        List<ListItem> list = new ArrayList<>();
        list.add(new ListItem(R.drawable.image1, "Nah Iki"));
        list.add(new ListItem(R.drawable.image2, "Nah Iku"));
        list.add(new ListItem(R.drawable.image3, "Iku iku iku iku"));
        return list;
    }
}