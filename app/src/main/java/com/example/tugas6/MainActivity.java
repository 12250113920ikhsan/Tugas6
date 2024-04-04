package com.example.tugas6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.content.Intent;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private Adapter clubAdapter;
    static ArrayList<Model> clubModel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getData();

        recyclerView = findViewById(R.id.recycleview);
        clubAdapter = new Adapter(clubModel, new Adapter.OnItemClickListener() {

            public void onItemClick(Model model) {
                // Ketika item RecyclerView diklik, buka DetailActivity dengan data klub yang sesuai
                Intent detailIntent = new Intent(MainActivity.this, DetailActivity.class);
                detailIntent.putExtra("club_name", model.getNamaClub());
                detailIntent.putExtra("club_logo", model.getLogoClub());
                detailIntent.putExtra("Since_detail", model.getSince());
                detailIntent.putExtra("Country_detail", model.getAsalNegara());
                startActivity(detailIntent);
            }
        });
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(clubAdapter);

    }

    private void getData() {
        clubModel = new ArrayList<>();
        clubModel.add(new Model(  "Manchester City", "\n1880", "\nEngland", R.drawable.mc));
        clubModel.add(new Model(  "Manchester United", "\n1878", "\nEngland", R.drawable.mu));
        clubModel.add(new Model(  "Arsenal", "\n1886", "\nEngland", R.drawable.arsenal));
        clubModel.add(new Model(  "Aston Vila", "\n1874", "\nEngland", R.drawable.vila));
        clubModel.add(new Model(  "Tottenham Hotspur", "\n1882", "\nEngland", R.drawable.tottenham));
        clubModel.add(new Model(  "Real Madrid", "\n1902", "\nSpanyol", R.drawable.rm));
        clubModel.add(new Model(  "Barcelona", "\n1899", "\nSpanyol", R.drawable.barcelona));
        clubModel.add(new Model(  "AC Milan", "\n1990", "\nItaly", R.drawable.ac));
        clubModel.add(new Model(  "Inter Milan", "\n1990", "\nItaly", R.drawable.inter));
        clubModel.add(new Model(  "Chelsea", "\n1905", "\nEngland", R.drawable.chelsea));
        clubModel.add(new Model(  "Liverpool", "\n1892", "\nEngland", R.drawable.liverpool));
        clubModel.add(new Model(  "PSG", "\n1972", "\nParis", R.drawable.psg));
        clubModel.add(new Model(  "Borrusia Dortmund", "\n1909", "\nGermany", R.drawable.dortmund));
        clubModel.add(new Model(  "Bayern Munchen", "\n1900", "\nGermany", R.drawable.munchen));
        clubModel.add(new Model(  "Olympique Marsiele", "\n1899", "\nParis", R.drawable.om));
    }
}