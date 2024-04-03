package com.example.tugas6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private Adapter clubAdapter;
    private ArrayList<Model> clubModel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getData();

        recyclerView = findViewById(R.id.recycleview);
        clubAdapter = new Adapter(clubModel);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(clubAdapter);

    }

    private void getData() {
        clubModel = new ArrayList<>();
        clubModel.add(new Model(  "Manchester City", R.drawable.mc));
        clubModel.add(new Model(  "Manchester United", R.drawable.mu));
        clubModel.add(new Model(  "Arsenal", R.drawable.arsenal));
        clubModel.add(new Model(  "Aston Vila", R.drawable.aston));
        clubModel.add(new Model(  "Tottenham Hotspur", R.drawable.tottenham));
        clubModel.add(new Model(  "Real Madrid", R.drawable.rm));
        clubModel.add(new Model(  "Barcelona", R.drawable.barcelona));
        clubModel.add(new Model(  "AC Milan", R.drawable.ac));
        clubModel.add(new Model(  "Inter Milan", R.drawable.inter));
        clubModel.add(new Model(  "Chelsea", R.drawable.chelsea));
        clubModel.add(new Model(  "Liverpool", R.drawable.liverpool));
        clubModel.add(new Model(  "PSG", R.drawable.psg));
        clubModel.add(new Model(  "Borrusia Dortmund", R.drawable.dortmund));
        clubModel.add(new Model(  "Bayern Munchen", R.drawable.munchen));
        clubModel.add(new Model(  "Olympique Marsiele", R.drawable.om));
    }
}